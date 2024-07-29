package com.dsAlgoTestRunner;
import org.junit.runner.RunWith;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.testng.annotations.DataProvider;

	@CucumberOptions(
			plugin = {"pretty",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					"timeline:test-output-thread/"
					}, 
			monochrome = true,
			glue = { "Stepdefinitions" },
			features = { "src/test/resources/parallel" }
	)

	public class ParallelRun extends AbstractTestNGCucumberTests {
		@Override
		@DataProvider(parallel = true)
		public Object[][] scenarios() {
			return super.scenarios();
		}
	}
