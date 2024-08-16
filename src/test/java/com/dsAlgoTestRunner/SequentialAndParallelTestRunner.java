


package com.dsAlgoTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.dsAlgoWebDriverManager.DriverManager;

import Utilities.ConfigReader;
import Utilities.TestDataFromExcelSheet;

import java.util.List;



	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;
	import org.testng.annotations.DataProvider;
	
	@CucumberOptions(
	    features = "src/test/resources/Features", // Path to all feature files
	    glue = {"Stepdefinitions", "com.dsAlgoProject.Hooks"},
	    	    monochrome=true,
	   plugin = {
	    	"html:target/dsalgoproject.html"}
	  // plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
	    
	)
	public class SequentialAndParallelTestRunner  extends AbstractTestNGCucumberTests {
	   
		@BeforeTest
		@Parameters({"browser"})
		public void browsername(String browser) throws Throwable{
			ConfigReader.setBrowserType(browser);
		}
		
		@Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
		
	}
	//"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
//"pretty","html:target/dsalgoproject.html"
