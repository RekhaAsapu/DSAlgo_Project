package Stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.dsAlgoProject.Hooks.dsAlgoHooks;
import com.dsAlgoWebDriverManager.DriverManager;

import PageFactory.LinkedListPage;
import PageFactory.NumpyNinjaPage;
import PageFactory.TreePage;
import PageFactory.loginpage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import log4j.LoggerLoad;

public class LinkedListSteps {
	
	loginpage loginPage;
	dsAlgoHooks hooks = new dsAlgoHooks();
	 private WebDriver driver;
	 NumpyNinjaPage numpyninjapage ;
	 LinkedListPage linkedlistpage;
	 TreePage treepage;
	 String actual;
		String expected;
		
	
	public LinkedListSteps() {	    	
    	this.driver = DriverManager.getDriver();
    	  numpyninjapage =new NumpyNinjaPage(driver);
    	   linkedlistpage =new LinkedListPage(driver);
    }

	
	 @When("the user selects {string} button")
	    public void the_user_selects_button(String link) {
		 linkedlistpage.selectonlink(link);
			LoggerLoad.info("User clicked on the "+link);
	    }

	    @Then("the user should land on the {string} page")
	    public void the_user_should_land_on_the_page(String pagename) {
	    	expected=pagename;
			actual=linkedlistpage.getTitle();
			Assert.assertEquals(actual, expected,"They are not matching");
			LoggerLoad.info("assert passed for the "+ pagename);	 
	    }


}
