package Stepdefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	public  WebDriver driver;
	public Properties prop;
	public Properties testdata;
	public InputStream input;
	public BaseTest()
	{
		get_Properties_from_configfile();
		initilizebrowser(prop.getProperty("browserName"));
	}

	public WebDriver initilizebrowser(String browserName) {
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();

		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(90));
		get_Properties_from_configfile();
		driver.get(prop.getProperty("url"));
		return driver;

	}

	public void get_Properties_from_configfile() {
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
		}
	}
}


