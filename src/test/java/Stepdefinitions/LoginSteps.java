package Stepdefinitions;

import PageFactory.NumpyNinjaPage;
import Utilities.ExtentReportManager;
import Utilities.Screenshots;
import Utilities.TestDataFromExcelSheet;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import log4j.LoggerLoad;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.dsAlgoProject.Hooks.dsAlgoHooks;
import com.dsAlgoWebDriverManager.DriverManager;
import PageFactory.loginpage;

public class LoginSteps {

	TestDataFromExcelSheet excelreader = new TestDataFromExcelSheet();
	loginpage loginPage;
	dsAlgoHooks hooks = new dsAlgoHooks();
	String expectedMessage;
	private Map<String, String> data;
	String actualMessage;
	NumpyNinjaPage numpyninjapage;
	private WebDriver driver;

	public LoginSteps() {
		this.driver = DriverManager.getDriver();
		loginPage = new loginpage(driver);
		numpyninjapage = new NumpyNinjaPage(driver);
	}

	@When("User clicks on getstarted button in getstarted page")
	public void User_clicks_on_getstarted_button_in_getstarted_page() {
		loginPage.clickonGetStartedbutton();
	}

	@Then("User will be navigated to {string} page")
	public void user_will_be_navigated_to_page(String expectedPage) {
		String actualPage = loginPage.getTitle();
		Assert.assertTrue(actualPage.contains(expectedPage));
	}

	@When("User clicks on getstarted button in numpyninja page for {string}")
	public void User_clicks_on_getstarted_button_in_numpyninja_page_for(String option) {
		numpyninjapage.clickonthegetstartedbutton(option);
	}

	@Then("user should get error message saying {string}")
	public void user_should_get_error_message_saying(String expectedMessage) {
		actualMessage = numpyninjapage.getloginerrormessage();
		Assert.assertTrue(actualMessage.contains(expectedMessage));
	}

	@When("User  enters a invalid and valid inputs from {string} and  {int}")
	public void user_enters_a_invalid_and_valid_inputs_from_and(String sheetName, Integer rowNumber)
			throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {

		data = TestDataFromExcelSheet.getTestData("LoginUsernamePassword", rowNumber);
		loginPage.enterusername(data.get("Username"));
		loginPage.enterpassword(data.get("Password"));
		expectedMessage = data.get("Message");
		LoggerLoad.info("User entered Username: " + data.get("Username"));
		LoggerLoad.info("User entered Password: " + data.get("Password"));

	}

	@Then("click on login button")
	public void click_on_login_button() throws InterruptedException {
		NumpyNinjaPage numpyninjapage = loginPage.clickonloginbutton();
		try {
			if (expectedMessage.equals(numpyninjapage.getTitle())) {
				actualMessage = numpyninjapage.getTitle();

				Assert.assertTrue(actualMessage.contains(expectedMessage));
				LoggerLoad.info("User logged in sucessfully");

			} else {
				actualMessage = loginPage.getLoginErrorMessage();
				Assert.assertTrue(actualMessage.contains(expectedMessage));
				LoggerLoad.info("User entered username or password incorrectly");
			}
		} finally {
			LoggerLoad.info("Completed login attempt.");

		}
	}

	@Then("the user should see {string} message for {string}")
	public void the_user_should_see_message_for(String expectedMessage, String field) throws InterruptedException {

		String actualMessage;
		actualMessage = loginPage.getRequiredFieldErrorMessage(field);

		LoggerLoad.info("User did not enter fields " + field);
		System.out.println( actualMessage.trim());
		System.out.println(expectedMessage.trim());
		// Thread.sleep(99);

		Assert.assertEquals(actualMessage, expectedMessage, "Error messsages did not match");

	}

}

