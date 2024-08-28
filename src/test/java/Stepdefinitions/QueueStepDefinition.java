package Stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.dsAlgoWebDriverManager.DriverManager;

import PageFactory.NumpyNinjaPage;
import PageFactory.QueuePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import log4j.LoggerLoad;

public class QueueStepDefinition {

	private WebDriver driver;
	public QueuePage queuePage;
	NumpyNinjaPage numpyninjapage;

	public QueueStepDefinition() {

		this.driver = DriverManager.getDriver();
		numpyninjapage = new NumpyNinjaPage(driver);
		queuePage = new QueuePage(driver);

	}

	@Then("User will redirected to the Queue over view  page")
	public void user_will_redirected_to_the_queue_over_view_page() {

		assertEquals(queuePage.getTitle(), "Queue");
		LoggerLoad.info("assert passed for the Queue");
	}

	@When("User will click on {string} HyperLink")
	public void user_will_click_on_hyperlink(String linkName) throws Exception {

		System.out.println("im here");
		queuePage.clickingHyperLink(linkName);
		LoggerLoad.info("The user clicked on the " + linkName);
	}

	@Then("User will redirected to the page with title {string}")
	public void user_will_redirected_to_the_page(String pageTitle) {

		System.out.println("im here in then");
		assertEquals(queuePage.getTitle(), pageTitle);
		LoggerLoad.info("assert passed for the" + pageTitle);

	}

	@When("User will click on {string} button")
	public void user_will_click_on_button(String tryHere) {
		queuePage.TryhereBtn();
	}

	@Then("User will redirected to {string} page with Run button")
	public void user_will_redirected_to_page_with_run_button(String expectedpageTitle) {

		assertEquals(queuePage.getTitle(), expectedpageTitle);

	}

	@Then("User will redirected to {string} page for queueQuestions")
	public void user_will_redirected_to_page_for_queuequestions(String expectedpageTitle) {

		assertEquals(queuePage.getTitle(), expectedpageTitle);
	}

}
