package com.dsAlgoWebDriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DriverManager {
	
	 private static WebDriver driver ;
	 
	 static {
		    driver = createDriver("chrome");  // Added this static block
		}

	    private static WebDriver createDriver(String browser) {
	        switch (browser.toLowerCase()) {
	            case "firefox":
	                WebDriverManager.firefoxdriver().setup();
	                return new FirefoxDriver();
	            case "chrome":
	            default:
	                WebDriverManager.chromedriver().setup();
	                return new ChromeDriver();
	        }
	    }

	    public static WebDriver getDriver() {
	        return driver;
	    }
	    

	    public static void removeDriver() {
	        if (driver != null) {
	            driver.quit();
	            driver=null;
	        }
	    

  
    }
}


