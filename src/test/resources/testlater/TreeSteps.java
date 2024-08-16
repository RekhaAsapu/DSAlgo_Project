package Stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.dsAlgoProject.Hooks.dsAlgoHooks;
import com.dsAlgoWebDriverManager.DriverManager;

import PageFactory.GraphPage;
import PageFactory.NumpyNinjaPage;
import PageFactory.TreePage;
import PageFactory.loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import log4j.LoggerLoad;

public class TreeSteps {
	loginpage loginPage;
	dsAlgoHooks hooks = new dsAlgoHooks();
	 private WebDriver driver;
	 NumpyNinjaPage numpyninjapage ;
	 TreePage treepage;
	 String actual;
		String expected;
		
	
	public TreeSteps() {	    	
    	this.driver = DriverManager.getDriver();
    	  numpyninjapage =new NumpyNinjaPage(driver);
    	  treepage=new TreePage(driver);
    	  
    }

	
	@When("the user clicks on the get started link for tree")
	public void the_user_clicks_on_the_get_started_link_for_tree() {
		numpyninjapage.clickongetstartedbuttonforTree();
		LoggerLoad.info("User clicked on the get started button for tree")
	}

	@When("the user hits {string} button")
	public void the_user_hits_button(String link) throws InterruptedException {
		treepage.clickonlink(link);
		LoggerLoad.info("User clicked on the "+link);
	}

	@Then("The user should land on the {string} page in treesection")
	public void the_user_should_land_on_the_page_in_treesection(String pagename) {
		expected=pagename;
		actual=treepage.getTitle();
		Assert.assertEquals(actual, expected,"They are not matching");
		LoggerLoad.info("assert passed for the "+ pagename);;
		
	
	 
	}


}
