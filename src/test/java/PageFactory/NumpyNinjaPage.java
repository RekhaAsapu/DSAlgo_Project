package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NumpyNinjaPage extends BasePage{
	
    WebDriver driver;
	
	public NumpyNinjaPage(WebDriver driver)
	{
		super(driver);

    }
	@FindBy(xpath="//div[@class='alert alert-primary']")
	public static WebElement sucessMessageElement;
	
}
	