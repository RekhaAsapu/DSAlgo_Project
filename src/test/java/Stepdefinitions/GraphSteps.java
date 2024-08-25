package Stepdefinitions;

//import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.dsAlgoProject.Hooks.dsAlgoHooks;
import com.dsAlgoWebDriverManager.DriverManager;

import PageFactory.GraphPage;
import PageFactory.NumpyNinjaPage;
import PageFactory.TreePage;
import PageFactory.loginpage;
import Utilities.TestDataFromExcelSheet;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import log4j.LoggerLoad;

public class GraphSteps {
	TestDataFromExcelSheet excelreader = new TestDataFromExcelSheet();
	loginpage loginPage;
	dsAlgoHooks hooks = new dsAlgoHooks();
	 private WebDriver driver;
	 NumpyNinjaPage numpyninjapage ;
	GraphPage graphpage;
	String actual;
	String expected;
	
	    public GraphSteps() {	    	
	    	this.driver = DriverManager.getDriver();
	        numpyninjapage =new NumpyNinjaPage(driver);
	  		graphpage=new GraphPage(driver);
	    	
	    }
	    

//		@When("the user clicks on the get started link for graph")
//		public void the_user_clicks_on_the_get_started_link_for_graph() {
//			//numpyninjapage.clickongetstartedbuttonforgraph();
//			LoggerLoad.info("User clicked on the get started button for graph");
//
//		}

		@When("the user clicks {string} link")
		public void the_user_clicks_link(String link) throws InterruptedException {
			graphpage.clickonlink(link);
			LoggerLoad.info("The user clicked on the "+ link);
		    
		}

		@Then("The user should land on the {string} page in graphsection")
		public void the_user_should_land_on_the_page_in_graphsection(String pagename) {
			expected=pagename;
			actual=graphpage.getTitle();
			Assert.assertEquals(actual, expected,"They are not matching");
			LoggerLoad.info("assert passed for the "+ pagename);

		}

//
//
//	@When("the user clicks on the get started link")
//	public void the_user_clicks_on_the_get_started_link() throws InterruptedException {
//
//		numpyninjapage.clickongetstartedbuttonforgraph();
//	}
//
//	@Then("the user should be redirected to the graph page")
//	public void the_user_should_be_redirected_to_the_graph_page() {
//		   actual=graphpage.getgraphpageTitle();
//		   expected="Graph";
//			Assert.assertEquals(actual, expected,"They are not matching");
//	}
//
//
//	
//	@When("user clicks Graph link")
//	public void user_clicks_graph_link() throws InterruptedException {
//		graphpage.clickongraphlink();
//	}
//	
//	@Then("user should be navigated to graphgraph page")
//	public void user_should_be_navigated_to_graphgraph_page() {
//		actual=graphpage.getgraphpageTitle();
//		   expected="Graph";
//		   System.out.println(actual+expected+"cccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
//			Assert.assertEquals(actual, expected,"They are not matching");
//	    
//	}
//	
//	@When("user clicks Tryhere button")
//	public void user_clicks_tryhere_button() throws InterruptedException {
//		graphpage.clickontryherebutton();
//	}
//	@Then("user should be navigated to Assessment page")
//	public void user_should_be_navigated_to_assessment_page() throws InterruptedException {
//		  actual=graphpage.getgraphpageTitle();
//		  expected="Assessment";
//			Assert.assertEquals(actual, expected,"They are not matching");
//	}
//	
//	@When("user clicks Graph representations")
//	public void user_clicks_graph_representations() {
//		graphpage.clickongraphrepresentationslink();
//	}
//	
//
//	@Then("user should be navigated to Graph Representations page")
//	public void user_should_be_navigated_to_graph_representations_page() {
//		  actual=graphpage.getgraphpageTitle();
//		   expected="Graph Representations";
//			Assert.assertEquals(actual, expected,"They are not matching");
//	}
//			
//			
//
	@When("user enters some code in editor")
	public void user_enters_some_code_in_editor() throws InterruptedException {
	    graphpage.entertextintextEditor("print(\"I'm working fine\")");
		LoggerLoad.info("user entered python code in the text editor");

	}
	@When("clicks Run button")
	public void clicks_run_button() {
		graphpage.clickonrunbutton();
		LoggerLoad.info("User clicked on run button");
	}

	@Then("user should see output in graphsection")
	public void user_should_see_output_in_graphsection() {
		 actual=graphpage.getactualvalue();
		 expected=graphpage.getexpectedvalue().replace('"', ' ').trim();
		Assert.assertEquals(actual, expected,"They are not matching");
		LoggerLoad.info("assert passed for the test editor");

	}
//
//	@When("user clicks practice")
//	public void user_clicks_practice() {
//		graphpage.clickonpracticelink();
//	}
//
////	@Then("user should be navigated to practice page")
////	public void user_should_be_navigated_to_practice_page() {
////		actual=graphpage.getgraphpageTitle();
////		System.out.println("aaaaaaaaaaaaaaaaaa"+actual);
////		   expected="Practice Questions";
////			Assert.assertEquals(actual, expected,"They are not matching");
////	}
//	
//	@When("user clicks signout link")
//	public void user_clicks_signout_link() {
//		graphpage.clickonsignout(); 
//	}
//	
//	@Then("user should be navigated to practice page")
//	public void user_should_be_navigated_to_practice_page() {
//		actual=graphpage.getgraphpageTitle();
//		 expected="Practice Questions";
//			Assert.assertEquals(actual, expected,"They are not matching");
//	
//		
//	}
//	
//	@Then("user should be navigated to home page")
//	public void user_should_be_navigated_to_home_page() {
//		actual=graphpage.getgraphpageTitle();
//		   expected="NumpyNinja";
//			Assert.assertEquals(actual, expected,"They are not matching");
//	}
//	


}
