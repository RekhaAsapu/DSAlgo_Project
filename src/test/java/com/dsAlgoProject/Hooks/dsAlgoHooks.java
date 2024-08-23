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
import org.openqa.selenium.manager.SeleniumManager;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentTest;
import com.dsAlgoWebDriverManager.DriverManager;

import io.cucumber.java.Scenario;
import Utilities.ConfigReader;
import Utilities.ExtentReportManager;
import Utilities.Screenshots;
import Utilities.TestDataFromExcelSheet;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
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
	public void setUp(Scenario scenario) throws Throwable
	{
	    //String uniqueTestId = UUID.randomUUID().toString();

		 ExtentTest test = ExtentReportManager.getExtentReports().createTest(scenario.getName());
       ExtentReportManager.setTest(test);
        prop= DriverManager.getproperties();
       lock.lock();
        try {
    		String browser = ConfigReader.getBrowserType();
    		//System.out.println("ccccccccccccccccccccccccccccc"+
    		//SeleniumManager.getInstance().getDriverPath("msedgedriver"));
        DriverManager.initilizedriver(browser); 
        }
        finally {
            lock.unlock();
        }
        driver=DriverManager.getDriver();
         driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
        driver.get(prop.getProperty("loginpage"));
		if(driver!=null)
		{
			System.out.println("driver in initilization is not null");
			
		}
 
        
	}
	@AfterStep
    public void afterStep(Scenario scenario) {
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
	        
	      else {
	         test.pass("Test passed"+ scenario.getName());
	       }
	       
		}
    
	@After
	public void tearDown(Scenario scenario) {
    
//        ExtentTest test = ExtentReportManager.getTest();
//
//
//        if (scenario.isFailed()) {
//        	
//
//			// take screenshot:
//			String screenshotName = scenario.getName().replaceAll(" ", "_");
//	        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
//	        String destFilePath = System.getProperty("user.dir")+
//	        		"\\src\\test\\resources\\Screenshots\\" + screenshotName + "_" + timestamp + ".png";
//			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//			scenario.attach(sourcePath, "image/png", screenshotName);
//			   test.addScreenCaptureFromPath(destFilePath, "Screenshot on failure");
//
//
//		}
//        
//      else {
//         test.pass("Test passed"+ scenario.getName());
//       }
        lock.lock();
        try {
        if(driver!=null)
        {
        	System.out.println("driver is quitting");        	
        	DriverManager.quitDriver();
            TestDataFromExcelSheet.removeTestData();
             ExtentReportManager.flushReports();

        }

    	}
        finally {
            lock.unlock();
        }
	}
}

	


