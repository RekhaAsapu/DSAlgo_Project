package Stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.dsAlgoWebDriverManager.DriverManager;

import PageFactory.DataStructurePage;
import PageFactory.GraphPage;
import PageFactory.NumpyNinjaPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import log4j.LoggerLoad;

public class DataStructureSteps {
	 private WebDriver driver;
	 DataStructurePage datastructurepage;
	 String expected;
	 String actual;

	 public DataStructureSteps() {	    	
	    	this.driver = DriverManager.getDriver();
	    	datastructurepage=new DataStructurePage(driver);
	    	
	    }
	

	@When("the user chooses {string} link")
	public void the_user_chooses_link(String linkText) {
		datastructurepage.selectonlink(linkText);
		LoggerLoad.info("The user clicked on the "+ linkText);
	}

	@Then("The user should land on the {string} page in datastructures section")
	public void the_user_should_land_on_page_in_datastructures_section(String expectedPage) {
		expected=expectedPage;
		actual=datastructurepage.getTitle();
		Assert.assertEquals(actual, expected,"They are not matching");
		LoggerLoad.info("assert passed for the "+ expectedPage);;


	}

}
