package Stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.dsAlgoWebDriverManager.DriverManager;

import PageFactory.BasePage;
import PageFactory.NumpyNinjaPage;
import PageFactory.loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonbackgroundSteps {
	loginpage loginPage;
	 NumpyNinjaPage numpyninjapage ;
	 private WebDriver driver;
	 BasePage basepage;
	 public CommonbackgroundSteps() {	
	    	this.driver = DriverManager.getDriver();
			  basepage=new BasePage(driver);

	    	
	    }
	 
	
		@Given("the user navigates to the login page")
	public void the_user_navigates_to_the_login_page() 
	{
		loginPage = new loginpage(driver);
		
	}

	@When("the user enters a valid username and password")
	public void the_user_enters_a_valid_username_and_password() throws InterruptedException {
		loginpage.enterusername("dsalgoteam");
		loginpage.enterpassword("Admin@1234");
	}

	/*@Then("clicks the login button")
	public void clicks_the_login_button() {
		 numpyninjapage =loginPage.clickonloginbutton();

	}*/
	@Given("The user is on {string}")
	public void the_user_is_on_page(String pagename) {
		String page_name = pagename.replaceAll("\\s+", "");
		basepage.navigateTo(page_name);
		//Loggerload.info("The user is on the " + pagename + " after logged in");
	}

}
