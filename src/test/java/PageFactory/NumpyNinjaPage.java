package PageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NumpyNinjaPage extends BasePage{
	
    WebDriver driver;
	
	public NumpyNinjaPage(WebDriver driver)
	{
		super(driver);

    }
	@FindBy(xpath="//div[@class='alert alert-primary']")
	public static WebElement sucessMessageElement;
	
	
	@FindBy(xpath="//*[text()='Data Structures']")
	private static WebElement dataStructuresDropdown;
	
	public void clickondataStructuresDropdown()
	{
		dataStructuresDropdown.click();
	}
	
	@FindBy(xpath="//div[@class='dropdown-menu show']/a")
	private static List<WebElement> dropDownmenu;
	
	
	   public void selectFromDropdown(String optionfromdropdown) {
		   clickondataStructuresDropdown();
	       for(int i=0;i<dropDownmenu.size();i++)
	       {
	    	   if (dropDownmenu.get(i).getText().equals(optionfromdropdown)) {
	    		   dropDownmenu.get(i).click();
	                break;
	            }
	       }
	    }
	   @FindBy(xpath="//h5[text()='Graph']/following-sibling::a[text()='Get Started']")
	   private static WebElement getstartedbutton;
	   
	   public void clickongetstartedbuttonforgraph()
	   {
		   getstartedbutton.click();
	   }
	   
}
	