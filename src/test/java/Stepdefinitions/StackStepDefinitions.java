package Stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.dsAlgoProject.Hooks.dsAlgoHooks;
import com.dsAlgoWebDriverManager.DriverManager;

import PageFactory.NumpyNinjaPage;
import PageFactory.StackPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import log4j.LoggerLoad;

public class StackStepDefinitions {

	private WebDriver driver;
	public StackPage stackPage;
	NumpyNinjaPage numpyninjapage;

	public StackStepDefinitions() {

		this.driver = DriverManager.getDriver();
		numpyninjapage = new NumpyNinjaPage(driver);
		stackPage = new StackPage(driver);

	}

	@Then("User will redirected to StackPage")
	public void user_will_redirected_to_stack_page() throws InterruptedException {

		assertEquals(stackPage.getTitle(), "Stack");
		LoggerLoad.info("assert passed for the Stack");
	}


	@When("User will click on {string} link")
	public void user_will_click_on_link(String linkName) throws Exception {

		stackPage.clickingLink(linkName);
		LoggerLoad.info("The user clicked on the " + linkName);
	}

	@Then("User will redirect to the {string} page title")
	public void user_will_redirect_to_the_page_title(String pageTitle) {

		assertEquals(stackPage.getTitle(), pageTitle);
		LoggerLoad.info("assert passed for the" + pageTitle);
	}

	@When("User will click on {string} button for stack")
	public void user_will_click_on_button_for_stack(String string) throws InterruptedException {

		stackPage.clickonTryEditor();
	}

	@Then("User will redirected to a page with TryEditor with Run button to Test")
	public void user_will_redirected_to_a_page_with_try_editor_with_run_button_to_test() {

		assertEquals(stackPage.getTitle(), "Assessment");
	}

	@Then("User will redirected to {string} page for stackQuestions")
	public void user_will_redirected_to_page_for_stackquestions(String string) {

		assertEquals(stackPage.getTitle(), "Practice Questions");
	}

}
