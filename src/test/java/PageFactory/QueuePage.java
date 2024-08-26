package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsAlgoProject.Hooks.dsAlgoHooks;



public class QueuePage extends BasePage {
	
	
	public QueuePage(WebDriver driver) {
		
		super(driver);
	}
	
//	public WebElement getLinkByText(String linkText) {
//        return driver.findElement(By.linkText(linkText));
//    }
//
//    public void clickLink(String linkText) {
//        getLinkByText(linkText).click();
//    }
	   
	
	@FindBy(xpath = "//a[@href=\"queue\"]")
	WebElement getStartedQueueBtn;
	
	@FindBy(xpath = "//a[@href=\"implementation-lists\"]")
	WebElement implQueuePython_Link;
	
	@FindBy(xpath = "//a[@href=\"/queue/implementation-collections/\"]")
	WebElement implCollectionDeque_Link;
	
	@FindBy(xpath = "//a[@href=\"/queue/Implementation-array/\"]")
	WebElement implUsingArray_Link;
	
	@FindBy(xpath = "//a[@href=\"/queue/QueueOp/\"]")
	WebElement queueOper_Link;
	
	@FindBy(xpath = "//a[@href=\"/queue/practice\"]")
	WebElement practiceQues_Link;
	
	
	//Try Editor
	@FindBy(xpath = "//a[@href=\"/tryEditor\"]")
	WebElement tryhereBtn;
	
//	@FindBy(xpath = "//textarea[@tabindex='0']")
//	WebElement typeEditorSpace;
	
	@FindBy(xpath = "//button[@type=\"button\"]")
	WebElement runBtn;
	
	@FindBy(xpath = "//pre[@id=\"output\"]")
	WebElement output;
	
	
	public void getStartedQueue() {
		
		System.out.println("im in this method ;) ;) :)");
		getStartedQueueBtn.click();
		
	}
	
//	public void implQueuePython() {
//		
//		implQueuePython_Link.click();
//	}
//	
//	public void implUsingCollectionDeque() {
//		
//		implCollectionDeque_Link.click();
//	}
//	
//	public void implUsingArray() {
//		
//		implUsingArray_Link.click();
//	}
//	
//	public void queueOperations() {
//		
//		queueOper_Link.click();
//	}
//	
//	public void practiceQuestions() {
//		
//		practiceQues_Link.click();
//	}
	
	public  void TryhereBtn() {
		
		tryhereBtn.click();
	}
	
//	public void TryEditorSpace() {
//		
//		String pythonCode = "print(\"something\")";
//		typeEditorSpace.sendKeys(pythonCode);
//		
//	}
	
	public void run() {
		
		runBtn.click();
	}
	
	public String result() {
		return output.getText();
		
	}
	
	public void clickingHyperLink(String linkName) throws Exception {
		
		switch(linkName) {
		
		case "Implementation of Queue in Python":
			
			implQueuePython_Link.click();
		    break;
		case "Implementation using collections.deque":
			
			implCollectionDeque_Link.click();
			break;
		case "Implementation using array":
			
			implUsingArray_Link.click();

			break;
			
		case "Queue Operations":
			
			queueOper_Link.click();
			
			break;
			
		case "Practice Questions":
			
			practiceQues_Link.click();
			
			break;
			
		default:
			throw new IllegalArgumentException ("you triggered wrong link" + linkName);
					
		}
		
	}

}
