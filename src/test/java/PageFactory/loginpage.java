package PageFactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginpage extends BasePage {
	NumpyNinjaPage numpyninjapage;
	// private static WebDriverWait wait;
	// private WebDriverWait wait;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public loginpage(WebDriver driver) {

		super(driver);
		if (this.driver == null) {
			throw new IllegalArgumentException("hello WebDriver cannot be null");
		}

	}

	@FindBy(xpath = "//input[@name='username']")
	private static WebElement userName;

	@FindBy(xpath = "//input[@name='password']")
	private static WebElement passWord;

	@FindBy(xpath = "//input[@type='submit']")
	private static WebElement login;

	@FindBy(xpath = "//div[contains(text(), 'Invalid Username')]")
	private static WebElement errorMessageElement;

	@FindBy(xpath = "//button[contains(text(),'Get Started')]")
	private static WebElement GetStartedbutton;

	public String getrequiredfielderrormessage(WebElement activeElement) {
		activeElement = driver.switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		return messageStr;

	}

	public String getRequiredFieldErrorMessage(String fieldElement) {
		String messageStr = "";
		if ((fieldElement.contains("username") && fieldElement.contains("password"))) {
			userName.click();
			messageStr = userName.getAttribute("validationMessage");

		} else if(fieldElement.contains("username"))
		{
			userName.click();
			messageStr = userName.getAttribute("validationMessage");
		}
		else if(fieldElement.contains("password"))		{
			passWord.click();
			messageStr = passWord.getAttribute("validationMessage");
		}
			return messageStr;
	}

	public static void clickonGetStartedbutton() {
		GetStartedbutton.click();
	}

	public static void enterusername(String username) throws InterruptedException {
		userName.click();
		Thread.sleep(90);
		wait.until(ExpectedConditions.visibilityOf(userName));

		userName.sendKeys(username);
		userName.sendKeys(Keys.TAB);
		Thread.sleep(99);
	}

	public static void enterpassword(String password) throws InterruptedException {
		passWord.clear();
		Thread.sleep(90);
		wait.until(ExpectedConditions.visibilityOf(passWord));
		passWord.sendKeys(password);
	}

	public NumpyNinjaPage clickonloginbutton() {
		// login.click();
		clickSomeElement(login);
		return new NumpyNinjaPage(driver);
	}

	public String getLoginErrorMessage() {
		return getErrorMessage(errorMessageElement);
	}

	public WebElement getSomeElement(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void clickSomeElement(WebElement element) {
		getSomeElement(element);
		int attempts = 0;
		while (attempts < 4) {
			try {
				element.click();
				break;
			} catch (StaleElementReferenceException e) {
				element = getSomeElement(element);
				attempts++;
			}
		}
	}
}
/*
 * public void clickSomeElement(WebElement element) { getSomeElement(element);
 * int attempts = 0; while (attempts < 3) { try { element.click(); break; }
 * catch (StaleElementReferenceException e) { element = getSomeElement();
 * attempts++; } }
 */
