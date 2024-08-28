package com.dsAlgoTestRunner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import Utilities.ConfigReader;
import Utilities.RetryListner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
	
	@CucumberOptions(
	    features = "@target/rerun.txt", 
	    glue = {"Stepdefinitions", "com.dsAlgoProject.Hooks"},
	    	    monochrome=true,
	   plugin = {
	    	"html:target/dsalgoproject.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			"timeline:test-output-thread/","rerun:target/rerun.txt",
			"json:target/cucumber.json", "html:target/report/cucumber.html"}
	)
	public class TestRunnerForFailed  extends AbstractTestNGCucumberTests {
	   
		
		@Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }		
	}

