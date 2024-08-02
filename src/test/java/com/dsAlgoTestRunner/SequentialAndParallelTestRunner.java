package com.dsAlgoTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import Utilities.TestDataFromExcelSheet;

import java.util.List;



	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;
	import org.testng.annotations.DataProvider;

	@CucumberOptions(
	    features = "src/test/resources/Features", // Path to all feature files
	    glue = {"Stepdefinitions", "com.dsAlgoProject.Hooks"}, // Path to step definitions
	    plugin = {"pretty","html:target/dsalgoproject.html"}, 
	    monochrome=true
	)
	public class SequentialAndParallelTestRunner  extends AbstractTestNGCucumberTests {
	   
		/*@BeforeTest
		@Parameters({"Browser"})
		public void browsername(@Optional("chrome") String browser) throws Throwable{
			
		}*/
		
		@Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
		
	}

