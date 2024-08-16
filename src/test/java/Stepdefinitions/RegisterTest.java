package Stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.dsAlgoWebDriverManager.DriverManager;

import PageFactory.RegisterPage;
import PageFactory.loginpage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterTest {
	 private WebDriver driver;
	 RegisterPage registerpage;
	 String actual;
	 String expected;
		loginpage loginPage;
	int usernamelength;

	public RegisterTest()
	{
		this.driver = DriverManager.getDriver();
		registerpage=new RegisterPage(driver);
		loginPage=new loginpage(driver);
	}
	
	
	@When("the user enters {string} in the usernamefield and submits the form")
	public void the_user_enters_in_the_usernamefield_and_submits_the_form(String username) {
		registerpage.enterusername(username);
		registerpage.clickonRegisterbutton();		
	}
	@Then("the system should display a validation message indicating that {string} for {string}")
	public void the_system_should_display_a_validation_message_indicating_that_for(String validationmessage,String field) throws InterruptedException {
		
		if(registerpage.lengthofusername==0)
		{
		expected=validationmessage;
		actual=registerpage.getRequiredFieldErrorMessage(field);
		Assert.assertEquals(actual, expected, "They are not matching");		
		}
		else if(registerpage.lengthofusername>=150)
		{
			String enteredValue=registerpage.getvalueofusernamefield();
		    Assert.assertEquals(enteredValue.length(), 150, "The username field accepted more than 150 characters.");
		}
		else
		{
			expected=validationmessage;
			actual=registerpage.getalertmessage();
			Assert.assertEquals(actual, expected, "They are not matching");		
		}
	}

	@When("the user enters a username with allowed charcters {string} and password with {string}")
	public void the_user_enters_a_username_with_allowed_charcters_and_password_with(String specialChars, String password) {
		registerpage.sendcharacters(specialChars);	
		registerpage.enterpassword(password);
		registerpage.enterconfirmpassword(password);
		registerpage.clickonRegisterbutton();

	}
	
	@When("the user enters different passwords in the password {string} and password confirmation fields {string} and submits the form,")
	public void the_user_enters_different_passwords_in_the_password_and_password_confirmation_fields_and_submits_the_form(String password1, String password2) {
	    
		registerpage.enterusername(registerpage.prop.getProperty("username"));
		registerpage.enterpassword(password1);
		registerpage.enterconfirmpassword(password2);
		registerpage.clickonRegisterbutton();
	}
	@When("the user clicks on the {string} link")
	public void the_user_clicks_on_the_link(String string) {
		registerpage.clickonloginbutton();
	}
	@Then("the system should redirect the user to the {string}")
	public void the_system_should_redirect_the_user_to_the(String titleofthepage) {
		actual=registerpage.getTitle();
		expected=titleofthepage;
		Assert.assertEquals(actual, expected, "They are not matching");		
	}


}
