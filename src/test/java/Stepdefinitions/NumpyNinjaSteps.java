package Stepdefinitions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.dsAlgoProject.Hooks.dsAlgoHooks;
import com.dsAlgoWebDriverManager.DriverManager;

import PageFactory.NumpyNinjaPage;
import PageFactory.loginpage;
import Utilities.ExtentReportManager;
import Utilities.TestDataFromExcelSheet;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class NumpyNinjaSteps {
	WebDriver driver;

	TestDataFromExcelSheet excelreader = new TestDataFromExcelSheet();
	loginpage loginPage;
	TestDataFromExcelSheet reader;
	dsAlgoHooks hooks = new dsAlgoHooks();
	Properties prop;
	NumpyNinjaPage numpyninjapage;
	String actual;
	String expected;

	public NumpyNinjaSteps() {
		this.driver = DriverManager.getDriver();
		numpyninjapage=new NumpyNinjaPage(driver);
	}


	@When("I select {string} from the dropdown")
	public void i_select_from_the_dropdown(String option) {
		numpyninjapage.selectFromDropdown(option);
	}

	@Then("I should be navigated to the {string} page")
	public void i_should_be_navigated_to_the_page(String expectedtitle) {
		actual = numpyninjapage.getTitle();
		expected = expectedtitle;
		Assert.assertEquals(actual, expected, "Title does not match");
	}

	@When("I select {string} from the subtitle")
	public void i_select_option_from_the_subtitle(String option) {
		numpyninjapage.clickonthegetstartedbutton(option);
	}

	@Then("I should be navigated to the {string}")
	public void i_should_be_navigated_to_the_expected_page_title(String expected) {
		actual=numpyninjapage.getTitle();
		Assert.assertEquals(actual, expected, "The page title does not match the expected title.");
	}

}
