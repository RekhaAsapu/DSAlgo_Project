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
	
	@FindBy(xpath="//div[@class='alert alert-primary']")
	private static WebElement loginerrormessage;
	
	public String getloginerrormessage()
	{
		return loginerrormessage.getText();
	}
	
	
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
	   @FindBy(xpath="//h5[text()='Data Structures-Introduction']/following-sibling::a[text()='Get Started']")
	   private static WebElement getstartedbuttonforDataStructuresIntroduction;
	 
	   @FindBy(xpath="//h5[text()='Array']/following-sibling::a[text()='Get Started']")
	   private static WebElement getstartedbuttonforArray;
	   
	   @FindBy(xpath="//h5[text()='Linked List']/following-sibling::a[text()='Get Started']")
	   private static WebElement getstartedbuttonforLinkedList;
	 
	   @FindBy(xpath="//h5[text()='Stack']/following-sibling::a[text()='Get Started']")
	   private static WebElement getstartedbuttonforStack;
	  
	   @FindBy(xpath="//h5[text()='Queue']/following-sibling::a[text()='Get Started']")
	   private static WebElement getstartedbuttonforQueue;
	 
	   @FindBy(xpath="//h5[text()='Tree']/following-sibling::a[text()='Get Started']")
	   private static WebElement getstartedbuttonforTree;
	  
	   @FindBy(xpath="//h5[text()='Graph']/following-sibling::a[text()='Get Started']")
	   private static WebElement getstartedbuttonforGraph;
	   
	   public void clickonthegetstartedbutton(String option)
	   {
		   switch (option) {
		     case "Arrays": getstartedbuttonforArray.click();
		    	         break;
		     case "Linked List": getstartedbuttonforLinkedList.click();
	                     break;
		     case "Stack": getstartedbuttonforStack.click();
	                     break;
		     case "Queue": getstartedbuttonforQueue.click();
	                     break;
		     case "Tree": getstartedbuttonforTree.click();
	                     break;
		     case "Graph": getstartedbuttonforGraph.click();
	                     break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + option);
		}
	   }
	  
	  
	   
}
	