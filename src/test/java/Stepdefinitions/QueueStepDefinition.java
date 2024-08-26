package Stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.dsAlgoProject.Hooks.dsAlgoHooks;
import com.dsAlgoWebDriverManager.DriverManager;

import PageFactory.NumpyNinjaPage;
import PageFactory.QueuePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import log4j.LoggerLoad;



public class QueueStepDefinition {
	
	private WebDriver driver;
	public  QueuePage queuePage;
	NumpyNinjaPage numpyninjapage;
	
	
	public   QueueStepDefinition() {
		
		 this.driver = DriverManager.getDriver();
		 numpyninjapage =new NumpyNinjaPage(driver);
		 queuePage = new QueuePage(driver); 
		
	}
	
	//Ts01  Get Started button on home Page for Queue
//	@When("User will click on Queue {string} button")
//	public void user_will_click_on_queue_button(String link) throws InterruptedException {
//	    
//		//System.out.println(" im here ");
//		queuePage.getStartedQueue();
//		//LoggerLoad.info("The user clicked on the getStartedQueue()");	
//		
//	}
//	
	@Then("User will redirected to the Queue over view  page")
	public void user_will_redirected_to_the_queue_over_view_page() {
	    
		//System.out.println("im here in Then");
		assertEquals(driver.getTitle(), "Queue");
		LoggerLoad.info("assert passed for the Queue");
	}
    
	
	//***********common for all the links to be clicked************
	@When("User will click on {string} HyperLink")
	public void user_will_click_on_hyperlink(String linkName) throws Exception {
		
	   System.out.println("im here");
		queuePage.clickingHyperLink(linkName);
		LoggerLoad.info("The user clicked on the " + linkName);
	}
	
	//*************common for all the redirected pages*********************
		@Then("User will redirected to the page with title {string}")
		public void user_will_redirected_to_the_page(String pageTitle) {
			
			
           System.out.println("im here in then");
			assertEquals(driver.getTitle(), pageTitle);
			LoggerLoad.info("assert passed for the" + pageTitle);
			
		}
	
    //**************common for all the try here button********************
	@When("User will click on {string} button")
	public void user_will_click_on_button(String tryHere) {
		
		queuePage.TryhereBtn();
		
	}
	
	
	//*****************common for all the assessment page*******************
	@Then("User will redirected to {string} page with Run button")
	public void user_will_redirected_to_page_with_run_button(String string) {
	   
		assertEquals(driver.getTitle(), "Assessment");
		
	}
	
	//************common for all the python code******************************
//	@When("User will enter code and click on Run button")
//	public void user_will_enter_code_and_click_on_run_button() throws InterruptedException {
//		 
//		
//		queuePage.TryEditorSpace();
//		LoggerLoad.info("user entered python code in the text editor");
//		queuePage.run();
//		LoggerLoad.info("User clicked on run button");
//		//Thread.sleep(3000);
//	}
	
	//************common for all the output************************************
//	@Then("User should see {string} below the Run button")
//	public void user_should_see_below_the_run_button(String output) {
//		
//		
//	
//		assertEquals(queuePage.result(),output );
//		LoggerLoad.info("assert passed for the test editor");
//	}
//	
	
	
	@Then("User will redirected to {string} page for queueQuestions")
	public void user_will_redirected_to_page_for_queuequestions(String string) {
	    
		assertEquals(driver.getTitle(), "Practice Questions");
	}

}
