package com.dsAlgoTestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

    @RunWith(Cucumber.class)
	@CucumberOptions(
	    features = "src/test/resources/parallel/", // Path to your feature files
	    glue = {"Stepdefinitions", "com.dsAlgoProject.Hooks"}, // Packages containing step definitions and hooks
	    plugin = {
	        "pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	    },
	    		monochrome = true, // Makes the console output more readable
	    	    publish = true // Publishes the report to an external server (if needed)
	    	    )
	
	public class TestRunner {
	}

