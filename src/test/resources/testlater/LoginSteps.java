package Stepdefinitions;

import PageFactory.NumpyNinjaPage;
import PageFactory.loginpage;
import Utilities.ExtentReportManager;
import Utilities.Screenshots;
import Utilities.TestDataFromExcelSheet;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.dsAlgoProject.Hooks.dsAlgoHooks;
import com.dsAlgoWebDriverManager.DriverManager;

public class LoginSteps {

	TestDataFromExcelSheet excelreader = new TestDataFromExcelSheet();
	loginpage loginPage;
	dsAlgoHooks hooks = new dsAlgoHooks();
	String expectedMessage;
	 private Map<String, String> data;

	//WebDriver driver = dsAlgoHooks.getDriver();
		//DriverManager drivermanager = new DriverManager();

	
	 private WebDriver driver;

	    // Constructor to initialize WebDriver
	    public LoginSteps() {
	       // this.driver = DriverManager.getThreadLocalDriver(); 
	    	
	    	this.driver = DriverManager.getDriver();// Get WebDriver based on config properties
	    	
	    }
	    
	/*
	 * @Given("user is on DsAlgoAppliction") public void
	 * user_is_on_DsAlgoApplication() { loginPage=new loginpage(driver);
	 * 
	 * }
	 * 
	 * 
	 * @When("user enters a valid username and valid password from Excel") public
	 * void user_enters_a_valid_username_and_valid_password_from_Excel() throws
	 * InvalidFormatException, IOException,
	 * org.apache.poi.openxml4j.exceptions.InvalidFormatException {
	 * 
	 * String filePath = System.getProperty("user.dir")
	 * +"\\src\\test\\resources\\testdata\\DsAlgoTestData.xlsx";
	 * excelreader.getData(filePath, "LoginUsernamePassword"); String username =
	 * excelreader.getCellData(1, 0); String password = excelreader.getCellData(1,
	 * 1);
	 * 
	 * loginpage.enterusername(username); loginpage.enterpassword(password); }
	 * 
	 * 
	 * 
	 * @Then("clicks on login button") public void clicks_on_login_button() {
	 * 
	 * loginPage.clickonloginbutton(); System.out.println("clicked login"); }
	 * 
	 * 
	 * @Given("User is on the Login Page") public void user_is_on_the_login_page() {
	 * 
	 * }
	 * 
	 * @When("user enters a invalid and valid inputs from {String} and {int} ")
	 * public void user_enters_a_invalid_and_valid_inputs_from_and(String sheetname,
	 * int rownumber) { System.out.println("xgdets"); }
	 * 
	 * @Then("click on login button") public void click_on_login_button() {
	 * 
	 * }
	 * 
	 * 
	 */

	/*
	 * @Given("user is on DsAlgoAppliction") public void
	 * user_is_on_ds_algo_appliction() { loginPage=new loginpage(driver);
	 * 
	 * }
	 * 
	 * @When("user enters valid username and valid password from Excel") public void
	 * user_enters_valid_username_and_valid_password_from_excel() throws
	 * org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException {
	 * /*String filePath = System.getProperty("user.dir")
	 * +"\\src\\test\\resources\\testdata\\DsAlgoTestData.xlsx";
	 */
	/*
	 * excelreader.printData();
	 * 
	 * String username = (String) data[1][0]; String password = (String) data[1][1];
	 */

	/*
	 * loginpage.enterusername("dsalgoteam"); loginpage.enterpassword("Admin@1234");
	 * 
	 * }
	 * 
	 * @When("clicks on login button") public void clicks_on_login_button() {
	 * loginPage.clickonloginbutton(); System.out.println("clicked login"); }
	 */

	/*
	 * @Then("user is navigated to home page") public void
	 * user_is_navigated_to_home_page() { }
	 */

	/*
	 * public LoginSteps() { this.driver = hooks.getDriver();
	 * System.out.println("Login steps constructor");// Get the WebDriver instance
	 * from Hooks }
	 */

	@Given("User is on the Login Page")
	public void user_is_on_the_login_page() {
		//u ExtentTest test = ExtentReportManager.getTest();
		//u test.info("Navigating to login page");
		loginPage = new loginpage(driver);

	}

	@When("User  enters a invalid and valid inputs from {string} and  {int}")
	public void user_enters_a_invalid_and_valid_inputs_from_and(String sheetName, Integer rowNumber)
			throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException 
	{
		//uExtentTest test = ExtentReportManager.getTest();
		//utest.info("Entering username and password");
	data = TestDataFromExcelSheet.getTestData("LoginUsernamePassword", rowNumber);
  

        // Thread.sleep(1000);
		loginpage.enterusername(data.get("Username"));
      //  Thread.sleep(1000);
		loginpage.enterpassword(data.get("Password"));
		expectedMessage=data.get("Message");
	System.out.println("message froom excel msg:::::::::::::::::::::::"+expectedMessage);
		//Assert.assertTrue(true);
	System.out.println("message froom excel sheet:::::::::::::::::::::::"+data.get("Username"));

	System.out.println("message froom excel sheet:::::::::::::::::::::::"+data.get("Password"));


	}

	@Then("click on login button")
	public void click_on_login_button() throws InterruptedException {
		System.out.println("i'm in click method");
		//uExtentTest test = ExtentReportManager.getTest();
		//utest.info("Verifying login");
		if (driver != null) {
			System.out.println("in click driver is not null");
			NumpyNinjaPage numpyninjapage =loginPage.clickonloginbutton();
			//Thread.sleep(80);
			 String actualMessage;
			// System.out.println("???????????????????/????????????"+expectedMessage);
		        try {
		            if (expectedMessage.equals(numpyninjapage.getPageTitle()) ){
		            	//numpyninjapage.selectFromDropdown("Arrays");
		            	//Thread.sleep(9000);
		               actualMessage = numpyninjapage.getPageTitle();
		  			 System.out.println("////////////////////////////////////////////////////////////////////////////////////////////"+actualMessage);
		  			 System.out.println("////////////////////////////////////////////////////////////////////////////////////////////"+expectedMessage);

		               // Assert.assertEquals(actualMessage,expectedMessage , "Page title does not match!");
		  	        Assert.assertTrue(actualMessage.contains(expectedMessage));

		            
		            } else {
		                actualMessage = loginPage.getLoginErrorMessage();
			  			 System.out.println("//////////////////////////////////////////////////////////////////////////////"+actualMessage);
			  			 System.out.println("////////////////////////////////////////////////////////////////////////////////////////////"+expectedMessage);

				  	        Assert.assertTrue(actualMessage.contains(expectedMessage));
		            }
		        }
		        finally {
		        	
		        }
		}
	}
}

