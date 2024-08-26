package PageFactory;
	
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public  class StackPage extends BasePage {			

	//	private WebDriver driver;

		public  StackPage(WebDriver driver) {
			
		    super(driver);

		}
		
//		public WebElement getLinkByText(String linkText) {
//			
//	        return driver.findElement(By.linkText(linkText));
//	    }
//
//	    public void clickLink(String linkText) {
//	        getLinkByText(linkText).click();
//	    }
		
		//Stack Page links
		@FindBy(xpath = "//a[@href='data-structures-introduction']")
		WebElement getStarted_dataStructure;
		
		@FindBy(xpath = "//a[@href='stack']")
		WebElement getStarted_stack;
		
		@FindBy(xpath="//a[@href='operations-in-stack']")
		WebElement operation_Lnk;
		
		@FindBy(xpath="//a[@href='/stack/implementation/']")
		WebElement implemen_Lnk;
		
		@FindBy(xpath="//a[@href=\"/stack/stack-applications/\"]")
		WebElement applic_Lnk;
		
		@FindBy(xpath="//a[@href='/stack/practice']")
		WebElement practiceQues_Lnk;
		
		
		
		//TryEditor
		@FindBy(xpath= "//a[@href='/tryEditor']")
		WebElement TryEdt_btn;
		
//		@FindBy(xpath="//textarea[@tabindex='0']")
//		WebElement typeeditor_space;
		
		@FindBy(xpath="//button[contains(text(),'Run')]")
		WebElement run_btn;
		
		@FindBy(id="output")
		WebElement output;
		
		
		public void clickOnGetStarted() {
			getStarted_stack.click();
		}
		
//		public void clickonOperationOfStack() {
//			
//			operation_Lnk.click();
//			
//		}
		
//		public void clickonImplementation() {
//			implemen_Lnk.click();
//		}
//		
//		
//		
//		public void clickonApplication() {
//			applic_Lnk.click();
//		}
//		
//		
//		public void clickonPracticeQuestion() {
//			practiceQues_Lnk.click();
//		}
		
		public void clickonTryEditor() {
			TryEdt_btn.click();
		}
	
//		public void clickonEditorSpace() {
//			
//			String pythonCode = "print(\"something\")";
//			typeeditor_space.sendKeys(pythonCode);
//			
//		}
		
		public void clickRun() {
			 run_btn.click();
		}
		
		public String result() {
			return output.getText();
			
		}
		
		public void clickingLink(String linkName) throws Exception {
			
			switch(linkName) {
		
			case "Operations in Stack":
				
				operation_Lnk.click();
				
			   break;
			   
			case "Implementation":
				
				implemen_Lnk.click();
				
				break;
				
			case "Applications":
				
				applic_Lnk.click();
				
				break;
				
			case "Practice Questions":
				
				practiceQues_Lnk.click();
				
				break;
				
			default:
				throw new IllegalArgumentException("you hit the wrong link" + linkName);
			
			}
            

		
		}
	

}
