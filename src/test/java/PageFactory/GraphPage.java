package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

	public class GraphPage extends BasePage{
	
		public GraphPage(WebDriver driver)
		{
			
			super(driver);
//			if (this.driver == null) {
//	            throw new IllegalArgumentException("hello WebDriver cannot be null");
//	        }

		}
		@FindBy(xpath="//a[text()='Graph Representations']")
		private static WebElement graphrepresentationslink;
		
		@FindBy(xpath="//textarea[@tabindex='0']")////div[@class='input']/textarea try with this later
		private WebElement textEditor;
		
		@FindBy(xpath="//button[text()='Run']")
		private WebElement runButton;
		
		@FindBy(xpath="//span[@class='cm-string']")
		private WebElement expectedValue;
		
		@FindBy(xpath="//*[@id='output']")
		private WebElement actualValue;
		
		@FindBy(xpath="//*[@href='graph']")
		private static WebElement graphlink;
		
		@FindBy(xpath="//a[text()='Practice Questions']")
		private static WebElement practicelink;
		
//		public void clickonpracticelink()
//		{
//			practicelink.click();
//		}

//		public void clickongraphlink() throws InterruptedException
//		{
//			System.out.println("click on graph link");
//			Thread.sleep(90);
//			graphlink.click();
//		}
//		
//		public void clickongraphrepresentationslink()
//		{
//			graphrepresentationslink.click();
//		}
		
		@FindBy(xpath="//a[contains(text(),'Try here')]")
		private static WebElement tryherebutton;
		
		@FindBy(xpath="//a[text()='Sign out']")
		private static WebElement signout;
		
		@FindBy(xpath="//div[@class='alert alert-primary']")
		private  static WebElement logoutmessage;
		
		public void getlogoutmessage()
		{
			logoutmessage.getText();
		}
		
		public void clickonsignout() {
			signout.click();
		}
		
		public void clickontryherebutton() throws InterruptedException
		{
			Thread.sleep(90);
			tryherebutton.click();
		}
		public void entertextintextEditor(String pythoncode) throws InterruptedException
		{
			Thread.sleep(90);
			textEditor.sendKeys(pythoncode);
			Thread.sleep(90);

		}
		
		public void clickonrunbutton()
		{
			runButton.click();
		}
	    public String getexpectedvalue()
	    {
	    	return expectedValue.getText();
	    }
	    public String getactualvalue()
	    {
	    	return actualValue.getText();
	    }
	    public String getgraphpageTitle() {
	        return driver.getTitle();
	    }
		
		/*public void navigateTo(String pagename) {
			String urlName = ConfigReader.geturl(pagename);
			driver.get(urlName);
		}*/
	    
	    public void clickonlink(String nameoflink) {
	        switch (nameoflink) {
	            case "Graphgraph":
	            	graphlink.click();
	                break;
	            case "Graph representations":
	            	graphrepresentationslink.click();
	                break;
	            case "Try Here":
	            	tryherebutton.click();
	                break;
	            case "Practice Questions":
	                practicelink.click();
	                break;
	            case "signout":
	            	signout.click();
	            	break;
	                
	                    
	            // Add more cases as needed
	            default:
	                throw new IllegalArgumentException("No such link: " + nameoflink);
	        }
		

}
	}
