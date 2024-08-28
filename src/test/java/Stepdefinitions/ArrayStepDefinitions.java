package Stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.dsAlgoWebDriverManager.DriverManager;

import PageFactory.NumpyNinjaPage;
import PageFactory.ArrayPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import log4j.LoggerLoad;

public class ArrayStepDefinitions {
	
	private WebDriver driver;
	public  ArrayPage arrayPage;
	NumpyNinjaPage numpyninjapage;
	
	
	public ArrayStepDefinitions() {

		this.driver = DriverManager.getDriver();
		numpyninjapage = new NumpyNinjaPage(driver);
		arrayPage = new ArrayPage(driver);

	}

	@When("User will click on {string} HyperLink for array")
	public void user_will_click_on_hyperlink_for_array(String linkName) throws Exception {

		arrayPage.clickingLink(linkName);
		LoggerLoad.info("The user clicked on the " + linkName);
	}

	@Then("User will redirected to the page with title {string} in array")
	public void user_will_redirected_to_the_page_with_title_in_array(String pageTitle) {

		assertEquals(arrayPage.getTitle(), pageTitle);
		LoggerLoad.info("assert passed for the" + pageTitle);

	}

	@When("User will click on {string} button for array")
	public void user_will_click_on_button(String tryHere) {
		arrayPage.clickonTryEditor();
	}

	@Then("User will redirected to {string} page with Run button for array")
	public void user_will_redirected_to_page_with_run_button_for_array(String expectedPage) {

		assertEquals(arrayPage.getTitle(), expectedPage);
	}

	@Then("User will redirected to {string} page for arrayQuestions")
	public void user_will_redirected_to_page_for_arrayquestions(String expectedPage) {

		assertEquals(arrayPage.getTitle(), expectedPage);
	}
	
	@Then("User will redirected to the Array over view  page")
	public void user_will_redirected_to_the_array_over_view_page() {

		assertEquals(arrayPage.getTitle(), "Array");
		LoggerLoad.info("assert passed for the Array");
	}

}
