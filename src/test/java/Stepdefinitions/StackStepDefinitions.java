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
	
	private  WebDriver driver;
	public  StackPage stackPage;
	NumpyNinjaPage numpyninjapage;
	
	
	public  StackStepDefinitions() {
		
	 	
		 this.driver = DriverManager.getDriver();
     	 numpyninjapage =new NumpyNinjaPage(driver);
  	     stackPage = new StackPage(driver);
	
	}
	
//	//Ts1
//	@When("User will click on {string} button for StackPage")
//	public void user_will_click_on_button_for_stack_page(String string) throws InterruptedException {
//		
//		stackPage.clickOnGetStarted();
//		LoggerLoad.info("The user clicked on the clickOnGetStarted()");
//		Thread.sleep(3000);
//	}

	@Then("User will redirected to StackPage")
	public void user_will_redirected_to_stack_page() throws InterruptedException {
	    	
	    assertEquals(driver.getTitle(),"Stack"); 
	    LoggerLoad.info("assert passed for the Stack");
		//Thread.sleep(3000);
	}
	
	//Ts02******** common for all the links to be clicked****************************
	@When("User will click on {string} link")
	public void user_will_click_on_link(String linkName) throws Exception {
		
		stackPage.clickingLink(linkName);
		LoggerLoad.info("The user clicked on the " + linkName);
	}


    //**********************common for all the redirected page*************	
	@Then("User will redirect to the {string} page title")
	public void user_will_redirect_to_the_page_title(String pageTitle) {
	    
		assertEquals(driver.getTitle(), pageTitle);
		 LoggerLoad.info("assert passed for the" + pageTitle);
	}
	
	//Ts03***********common for all the try here button*******************************
	@When("User will click on {string} button for stack")
	public void user_will_click_on_button_for_stack(String string) throws InterruptedException {
	  
        stackPage.clickonTryEditor();
       // Thread.sleep(3000);
	}
	
	
    //*********************coomon foe all the assessment page***************
	@Then("User will redirected to a page with TryEditor with Run button to Test")
	public void user_will_redirected_to_a_page_with_try_editor_with_run_button_to_test() {
	    
		assertEquals(driver.getTitle(), "Assessment");
	}
	
    //Ts04***************common for all the python code*************************************
//	@When("User will enter code and click on run button")
//	public void user_will_enter_code_and_click_on_run_button() throws InterruptedException {
//	    
//		stackPage = new StackPage(driver);
//		stackPage.clickonEditorSpace(); 
//		LoggerLoad.info("user entered python code in the text editor");
//		stackPage.clickRun();
//		LoggerLoad.info("User clicked on run button");
//		//Thread.sleep(3000);
//	}

   //*********************common for all the output********************************
//	@Then("User will see {string} below the run button")
//	public void user_will_see_below_the_run_button(String output) {
//	    
//		
//		assertEquals(stackPage.result(), output);
//		LoggerLoad.info("assert passed for the test editor");
//	}
	
	

	@Then("User will redirected to {string} page for stackQuestions")
	public void user_will_redirected_to_page_for_stackquestions(String string) {
	    
		assertEquals(driver.getTitle(), "Practice Questions");
	}
	
	
} 
