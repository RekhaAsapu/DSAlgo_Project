package PageFactory;

import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dsAlgoWebDriverManager.DriverManager;

public class BasePage {
	
		
		public  WebDriver driver;
		public Properties prop;
		public Properties testdata;
		public InputStream input;
	    protected static WebDriverWait wait;
	 //  public  Properties prop=DriverManager.get_Properties_from_configfile();
	//	WebDriver driver=DriverManager.getDriver();
		  public void navigateTo(String pagename) {
				String urlName = prop.getProperty(pagename);
				driver.get(urlName);
			}
		  public void navigateTotryEditor() {

				//driver.get(tryEditorURL);

			}

		public BasePage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(80));
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
