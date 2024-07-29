package PageFactory;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;


	public class loginpage extends BasePage{
		NumpyNinjaPage numpyninjapage;
		
		public loginpage(WebDriver driver)
		{
			
			super(driver);
			if (this.driver == null) {
	            throw new IllegalArgumentException("hello WebDriver cannot be null");
	        }
		}
		
		@FindBy(xpath="//input[@name='username']")
		private static WebElement userName;
		
		@FindBy(xpath="//input[@name='password']")
		private static WebElement passWord;
		
		@FindBy(xpath="//input[@value='Login']")
		private static WebElement login;
		
		@FindBy(xpath="//div[contains(text(), 'Invalid Username')]")
		private static WebElement errorMessageElement;
		
		public static void enterusername(String username)
		{
			userName.clear();
			userName.sendKeys(username);
		}
		public static void enterpassword(String password)
		{
			passWord.clear();
			passWord.sendKeys(password);
		}
	
		public  NumpyNinjaPage clickonloginbutton()
		{
			login.click();
			return new NumpyNinjaPage(driver);
		}
		public String getLoginErrorMessage() {
	        return getErrorMessage(errorMessageElement);
	    }
		

		
	}


