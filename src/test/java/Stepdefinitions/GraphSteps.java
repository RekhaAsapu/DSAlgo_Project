package Stepdefinitions;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import log4j.LoggerLoad;

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
	    

		@When("the user clicks {string} link")
		public void the_user_clicks_link(String link) throws InterruptedException {
			graphpage.clickonlink(link);
		    
		}

		@Then("The user should land on the {string} page in graphsection")
		public void the_user_should_land_on_the_page_in_graphsection(String pagename) {
			expected=pagename;
			actual=graphpage.getTitle();
			Assert.assertEquals(actual, expected,"They are not matching");
			LoggerLoad.info("The user clicked on the "+ pagename);
		}

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

}
