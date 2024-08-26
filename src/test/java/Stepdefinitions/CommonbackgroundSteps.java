package Stepdefinitions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.dsAlgoWebDriverManager.DriverManager;

import PageFactory.BasePage;
import PageFactory.NumpyNinjaPage;
import PageFactory.loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import log4j.LoggerLoad;

public class CommonbackgroundSteps {
	loginpage loginPage;
	 NumpyNinjaPage numpyninjapage ;
	 Properties prop;
	 private WebDriver driver;
	 BasePage basepage;
	 public CommonbackgroundSteps() {	
	    	this.driver = DriverManager.getDriver();
			  basepage=new BasePage(driver);
				 prop=DriverManager.get_Properties_from_configfile();
	    	
	    }
	 
	
		@Given("the user navigates to the login page")
	public void the_user_navigates_to_the_login_page() 
	{
		loginPage = new loginpage(driver);
		LoggerLoad.info("User landed on login page");
		
	}

	@When("the user enters a valid username and password")
	public void the_user_enters_a_valid_username_and_password() throws InterruptedException {
		loginPage.enterusername(prop.getProperty("username"));
		loginPage.enterpassword(prop.getProperty("password"));
	}

	@Then("clicks the login button")
	public void clicks_the_login_button() {
		 numpyninjapage =loginPage.clickonloginbutton();
			LoggerLoad.info("User logged in sucessfully");


	}
	@Given("the user is on {string}")
	public void the_user_is_on(String pagename) {
		basepage.navigateTo(pagename);
		LoggerLoad.info("User is on "+pagename+" page");
	}
}
