package com.dsAlgoWebDriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DriverManager {
	
	
	public static Properties prop;
	
	public static InputStream input;
	
	
	 
	static {
    	prop=get_Properties_from_configfile();

		
	}

	 
	private static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();

    public static synchronized WebDriver getDriver() {
        return tldriver.get();
    }

    public static void initilizedriver(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
        	tldriver.set(new ChromeDriver());
        } else if (browser.equalsIgnoreCase("firefox")) {
        	tldriver.set(new FirefoxDriver());
        } else {
            throw new IllegalArgumentException("Browser type not supported");
        }
    }

    public static void quitDriver() {
        if (tldriver.get() != null) {
        	tldriver.get().quit();
        	tldriver.remove();
        }
    }
	    public static Properties getproperties() {
	        if (prop == null) {
	            prop = get_Properties_from_configfile();
	            System.out.println("i'm in grt proprties++++++++++++++++++++++++++++++++++++++++");// Ensure properties are loaded
	        }
	        return prop;
	    }
	    
	    
	    
	    public static  Properties get_Properties_from_configfile() {
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
			return prop;
	}
}



