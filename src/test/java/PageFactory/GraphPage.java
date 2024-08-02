package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

	public class GraphPage extends BasePage{
		NumpyNinjaPage numpyninjapage;
	   // private static WebDriverWait wait;
	   // private WebDriverWait wait;

		
		public GraphPage(WebDriver driver)
		{
			
			super(driver);
			if (this.driver == null) {
	            throw new IllegalArgumentException("hello WebDriver cannot be null");
	        }

		}
		@FindBy(xpath="//a[text()='Graph Representations']")
		private static WebElement graphrepresentationslink;
		
		public void clickongraphrepresentationslink()
		{
			graphrepresentationslink.click();
		}
		
		@FindBy(xpath="//a[text()='Try here>>>']")
		private static WebElement tryherebutton;
		
		public void clickontryherebutton()
		{
			tryherebutton.click();
		}
		
		/*public void navigateTo(String pagename) {
			String urlName = ConfigReader.geturl(pagename);
			driver.get(urlName);
		}*/
		

}
