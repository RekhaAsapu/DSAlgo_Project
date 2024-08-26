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
	
	
	public   ArrayStepDefinitions() {
		
		 this.driver = DriverManager.getDriver();
		 numpyninjapage =new NumpyNinjaPage(driver);
		 arrayPage = new ArrayPage(driver); 
		
	}
		
	@Then("User will redirected to the Array over view  page")
	public void user_will_redirected_to_the_array_over_view_page() {
	    
		//System.out.println("im here in Then");
		assertEquals(driver.getTitle(), "Array");
		LoggerLoad.info("assert passed for the Array");
	}
    
	
	//***********common for all the links to be clicked************
	@When("User will click on {string} HyperLink for array")
	public void user_will_click_on_hyperlink_for_array(String linkName) throws Exception {
		
	   System.out.println("im here");
		arrayPage.clickingLink(linkName);
		LoggerLoad.info("The user clicked on the " + linkName);
	}
	
	//*************common for all the redirected pages*********************
		@Then("User will redirected to the page with title {string} in array")
		public void user_will_redirected_to_the_page_with_title_in_array(String pageTitle) {
			
			
           System.out.println("im here in then");
			assertEquals(driver.getTitle(), pageTitle);
			LoggerLoad.info("assert passed for the" + pageTitle);
			
		}
	
    //**************common for all the try here button********************
	@When("User will click on {string} button for array")
	public void user_will_click_on_button(String tryHere) {
		
		arrayPage.clickonTryEditor();
		
	}
	
	
	//*****************common for all the assessment page*******************
	@Then("User will redirected to {string} page with Run button for array")
	public void user_will_redirected_to_page_with_run_button_for_array(String string) {
	   
		assertEquals(driver.getTitle(), "Assessment");
		
	}
	
	//************common for all the python code******************************
//	@When("User will enter code and click on Run button for array")
//	public void user_will_enter_code_and_click_on_run_button_for_array() throws InterruptedException {
//		 
//		System.out.println("im here too");
//		arrayPage.clickonEditorSpace();
//		LoggerLoad.info("user entered python code in the text editor");
//		arrayPage.clickRun();
//		LoggerLoad.info("User clicked on run button");
//		//Thread.sleep(3000);
//	}
	
	//************common for all the output************************************
//	@Then("User should see {string} below the Run button for array")
//	public void user_should_see_below_the_run_button_for_array(String output) {
//		
//		
//	
//		assertEquals(arrayPage.result(),output ); 
//		LoggerLoad.info("assert passed for the test editor");
//	}
	
	
	
	@Then("User will redirected to {string} page for arrayQuestions")
	public void user_will_redirected_to_page_for_arrayquestions(String string) {
	    
		assertEquals(driver.getTitle(), "Practice Questions");
	}
	

}
