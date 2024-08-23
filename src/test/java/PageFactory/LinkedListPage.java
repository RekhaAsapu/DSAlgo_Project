package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkedListPage extends BasePage {

	public LinkedListPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[text()='Introduction']")
	private static WebElement Introductionlink;

	@FindBy(xpath = "//a[text()='Creating Linked LIst']")
	private static WebElement CreatingLinkedLIstlink;

	@FindBy(xpath = "//a[text()='Types of Linked List']")
	private static WebElement TypesofLinkedListlink;

	@FindBy(xpath = "//a[text()='Implement Linked List in Python']")
	private static WebElement ImplementLinkedListinPythonlink;

	@FindBy(xpath = "//a[text()='Traversal']")
	private static WebElement Traversallink;

	@FindBy(xpath = "//a[text()='Insertion']")
	private static WebElement Insertionlink;

	@FindBy(xpath = "//a[text()='Deletion']")
	private static WebElement Deletionlink;

	@FindBy(xpath = "//textarea[@tabindex='0']") //// div[@class='input']/textarea try with this later
	private WebElement textEditor;

	@FindBy(xpath = "//button[text()='Run']")
	private WebElement runButton;

	@FindBy(xpath = "//*[@id='output']")
	private WebElement actualValue;

	@FindBy(xpath = "//a[text()='Practice Questions']")
	private static WebElement practicelink;

	@FindBy(xpath="//a[contains(text(),'Try here')]")
	private static WebElement tryherebutton;
	
	public void selectonlink(String nameoflink) {
		switch (nameoflink) {
		case "Introduction":
			Introductionlink.click();
			break;
		case "Creating Linked LIst":
			CreatingLinkedLIstlink.click();
			break;
		case "Types of Linked List":
			TypesofLinkedListlink.click();
			break;
		case "Implement Linked List in Python":
			ImplementLinkedListinPythonlink.click();
			break;
		case "Traversal":
			Traversallink.click();
			break;
		case "Insertion":
			Insertionlink.click();
			break;
		case "Deletion":
			Deletionlink.click();
			break;
		case "Practice Questions":
			practicelink.click();
			break;
		 case "Try Here":
         	tryherebutton.click();
         	break;
		default:
			throw new IllegalArgumentException("No such link: " + nameoflink);
		}

	}
}
