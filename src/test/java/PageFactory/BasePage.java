package PageFactory;

import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
		
		public  WebDriver driver;
		public Properties prop;
		public Properties testdata;
		public InputStream input;

		public BasePage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
		}
		public String getPageTitle() {
	        return driver.getTitle();
	    }
		public String getErrorMessage(By locator) {
	        WebElement errorMessageElement = driver.findElement(locator);
	        return errorMessageElement.getText();
	    }

	    public String getErrorMessage(WebElement errorMessageElement) {
	        return errorMessageElement.getText();
	    }
	
	    public String getSucessfulMessage(WebElement sucessMessageElement) {
	        return sucessMessageElement.getText();
	    }
	    

}
