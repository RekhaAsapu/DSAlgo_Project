package com.dsAlgoProject.Hooks;
import org.openqa.selenium.OutputType;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentTest;
import com.dsAlgoWebDriverManager.DriverManager;

import io.cucumber.java.Scenario;
import Utilities.ExtentReportManager;
import Utilities.Screenshots;
import Utilities.TestDataFromExcelSheet;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class dsAlgoHooks {
	public static Properties prop;
	//public static ThreadLocal<WebDriver> tlDriver ;
	//public static WebDriver driver;-->seq

	public  WebDriver driver;
	public static InputStream input;
	private static final Lock lock = new ReentrantLock();

	DriverManager drivermanager = new DriverManager();
	@Before
	public void setUp(Scenario scenario)
	{
	    //String uniqueTestId = UUID.randomUUID().toString();

		 ExtentTest test = ExtentReportManager.getExtentReports().createTest(scenario.getName());
       ExtentReportManager.setTest(test);
       // get_Properties_from_configfile();
		//initilizebrowser(prop.getProperty("browserName")); uncomment this line for sequential
        prop= DriverManager.getproperties();
        lock.lock();
        try {
        DriverManager.initilizedriver(prop.getProperty("browserName")); 
        }
        finally {
            lock.unlock();
        }
        driver=DriverManager.getDriver();
         driver.manage().window().maximize();
		//int Implicitwait=Integer.parseInt(prop.getProperty("implicitwait"));
		//int pageLoadTimeout=Integer.parseInt(prop.getProperty("pageLoadTimeout"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
        driver.get("https://dsportalapp.herokuapp.com/login");
		if(driver!=null)
		{
			System.out.println("driver in initilization is not null");
			
		}
         
         
         
       /* driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
		get_Properties_from_configfile();
		driver.get(prop.getProperty("url"));
		if(driver!=null)
		{
			System.out.println("driver in initilization is not null");
		}
		//initilizebrowser(prop.getProperty("browserName"));*/
        
	}
	@After
	public void tearDown(Scenario scenario) {
    
        ExtentTest test = ExtentReportManager.getTest();


        if (scenario.isFailed()) {
        	

			// take screenshot:
			String screenshotName = scenario.getName().replaceAll(" ", "_");
	        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	        String destFilePath = System.getProperty("user.dir")+
	        		"\\src\\test\\resources\\Screenshots\\" + screenshotName + "_" + timestamp + ".png";
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);
			   test.addScreenCaptureFromPath(destFilePath, "Screenshot on failure");


		}
        /*if (scenario.isFailed()) {
            test.fail("Test failed"+ scenario.getName());

            String dest =Screenshots.takeScreenshot(driver, scenario.getName().replaceAll(" ", "_"));
            test.addScreenCaptureFromPath(dest, "Screenshot on failure");
			scenario.attach(sourcePath, "image/png", scenario.getName().replaceAll(" ", "_"));

        }*/
      else {
         test.pass("Test passed"+ scenario.getName());
       }
        lock.lock();
        try {
        if(driver!=null)
        {
        	System.out.println("driver is quitting");
    		//driver.quit();
        	
        	DriverManager.quitDriver();
            TestDataFromExcelSheet.removeTestData();
             ExtentReportManager.flushReports();

        }

    	}
        finally {
            lock.unlock();
        }



  /*public static WebDriver getDriver() {
    	System.out.println("i;m in get driver method");
    	try {
			if(driver==null)
			{
				System.out.println("driver is null");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        return driver;
    	
    }
    */
   

/*	public static void initilizebrowser(String browserName) {
		if (browserName.equals("chrome")) {
			driver  = new ChromeDriver();

		} else if (browserName.equals("firefox")) {
			driver  = new FirefoxDriver();

		} else if (browserName.equals("edge")) {
			driver  = new EdgeDriver();

		}

		driver.manage().window().maximize();
		int implicitwait=Integer.parseInt(prop.getProperty("implicitwait"));
		int pageLoadTimeout=Integer.parseInt(prop.getProperty("pageLoadTimeout"));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitwait));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTimeout));
		get_Properties_from_configfile();
		driver.get(prop.getProperty("url"));
		if(driver!=null)
		{
			System.out.println("driver in initilization is not null");
		}

	}*/

	/*public static void get_Properties_from_configfile() {
		prop = new Properties();
		input = null;

		try {
			input = new FileInputStream(System.getProperty("user.dir")
					+ "\\src\\test\\resources\\config\\global.properties");
			prop.load(input);

			System.out.println(prop.getProperty("browserName"));

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					System.out.println("wrongpath");
					e.printStackTrace();
				}

			}
		}*/
	}
}

	


