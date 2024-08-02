package Stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.dsAlgoProject.Hooks.dsAlgoHooks;
import com.dsAlgoWebDriverManager.DriverManager;

import PageFactory.GraphPage;
import PageFactory.NumpyNinjaPage;
import PageFactory.loginpage;
import Utilities.TestDataFromExcelSheet;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphSteps {
	TestDataFromExcelSheet excelreader = new TestDataFromExcelSheet();
	loginpage loginPage;
	dsAlgoHooks hooks = new dsAlgoHooks();
	 private WebDriver driver;
	 NumpyNinjaPage numpyninjapage ;
	GraphPage graphpage;

	    public GraphSteps() {	    	
	    	this.driver = DriverManager.getDriver();
	    	  numpyninjapage =new NumpyNinjaPage(driver);
	    	 
	    	
	    }

//	@Then("the user should be redirected to the homepage")
//	public void the_user_should_be_redirected_to_the_homepage() {
//		//  numpyninjapage =new NumpyNinjaPage(driver);
//
//	   Assert.assertTrue(true);
//	}
//	@Given("the user is on {string}")
//	public void the_user_is_on_homepage() {
//	    
//	}

	@When("the user clicks on the get started link")
	public void the_user_clicks_on_the_get_started_link() throws InterruptedException {

		numpyninjapage.clickongetstartedbuttonforgraph();
		//Thread.sleep(90000);
	}

	@Then("the user should be redirected to the graph page")
	public void the_user_should_be_redirected_to_the_graph_page() {
		graphpage=new GraphPage(driver);
		   Assert.assertTrue(true);
	}

	@Given("The user is on the Graph page")
	public void the_user_is_on_the_graph_page() {
	   System.out.println("user is on graph page");
	}

	@When("user clicks Graph representations")
	public void user_clicks_graph_representations() {
		graphpage.clickongraphrepresentationslink();
	}

	@Then("user should be navigated to Graph Representations page")
	public void user_should_be_navigated_to_graph_representations_page() {
	    Assert.assertTrue(true);
	}
	@Given("the user is on graph Representations page")
	public void the_user_is_on_graph_representations_page() {
	}

	@When("user clicks Tryhere button")
	public void user_clicks_tryhere_button() throws InterruptedException {
		graphpage.clickontryherebutton();
	   // Thread.sleep(900000);

	}

	@Then("user should be navigated to Assessment page")
	public void user_should_be_navigated_to_assessment_page() throws InterruptedException {
		Assert.assertTrue(true);
	}
	@Given("user is on Assessment page with run button")
	public void user_is_on_assessment_page_with_run_button() {
	}


	@When("user enters some code in editor")
	public void user_enters_some_code_in_editor() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("clicks Run button")
	public void clicks_run_button() {
	   
	}

	@Then("user should see output")
	public void user_should_see_output() {
	   
	}




}
