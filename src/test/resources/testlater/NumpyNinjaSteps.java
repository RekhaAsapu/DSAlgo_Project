package Stepdefinitions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.dsAlgoProject.Hooks.dsAlgoHooks;

import PageFactory.NumpyNinjaPage;
import PageFactory.loginpage;
import Utilities.ExtentReportManager;
import Utilities.TestDataFromExcelSheet;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NumpyNinjaSteps {
    WebDriver driver;

	TestDataFromExcelSheet excelreader = new TestDataFromExcelSheet();
	loginpage loginPage;
	TestDataFromExcelSheet reader;
	dsAlgoHooks hooks = new dsAlgoHooks();
    Properties prop;
    NumpyNinjaPage numpyninjapage;

    public NumpyNinjaSteps() {
        this.driver = dsAlgoHooks.getDriver();
    }

	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		ExtentTest test = ExtentReportManager.getTest();
		test.info("Navigating to login page");
		loginPage = new loginpage(driver);
	}

	 @When("I enter correct username and password")
	    public void i_enter_correct_username_and_password() {
		 loginpage.enterusername(prop.getProperty("username"));
			loginpage.enterpassword(prop.getProperty("password"));
			
	    }
	@Then("I click the login button")
	public void i_click_the_login_button() {
		ExtentTest test = ExtentReportManager.getTest();
		test.info("Verifying login");
		numpyninjapage =loginPage.clickonloginbutton();

	}

	@When("I select {string} from the dropdown")
	public void i_select_from_the_dropdown(String string) {
		numpyninjapage.selectFromDropdown(string);
		
	}

	@Then("I should be navigated to the {string} page")
	public void i_should_be_navigated_to_the_page(String string) {
	    
	}




}
