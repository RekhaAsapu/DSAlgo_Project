package com.dsAlgoProject.Hooks;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.manager.SeleniumManager;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentTest;
import com.dsAlgoWebDriverManager.DriverManager;

import io.cucumber.java.Scenario;
import Utilities.ConfigReader;
import Utilities.ExtentReportManager;
import Utilities.RetryforFailedScenarios;
import Utilities.Screenshots;
import Utilities.TestDataFromExcelSheet;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class dsAlgoHooks {

	public static Properties prop;
	public WebDriver driver;
	public static InputStream input;
	private static final Lock lock = new ReentrantLock();
	ExtentTest test;
	File sourcePath;
	TestDataFromExcelSheet TestDataFromExcelsheet = new TestDataFromExcelSheet();
	DriverManager drivermanager = new DriverManager();

	@Before
	public void setUp(Scenario scenario) throws Throwable {

		ExtentTest test = ExtentReportManager.getExtentReports().createTest(scenario.getName());
		ExtentReportManager.setTest(test);
		prop = DriverManager.getproperties();
		lock.lock();
		try {
			String browser = ConfigReader.getBrowserType();
			DriverManager.initilizedriver(browser);
		} finally {
			lock.unlock();
		}
		driver = DriverManager.getDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(240));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(240));
		driver.get(prop.getProperty("loginpage"));
		if (driver != null) {
			System.out.println("driver in initilization is not null");

		}

	}

	@AfterStep
	public void afterStep(Scenario scenario) throws IOException {
		test = ExtentReportManager.getTest();

		if (scenario.isFailed()) {
			RetryforFailedScenarios.retry(() -> {
				System.out.println("Retrying failed scenario: " + scenario.getName());
			});
		}
		captureScreenshotOnFailure(scenario);
	}

	@After
	public void tearDown(Scenario scenario) throws IOException {

		test = ExtentReportManager.getTest();

		if (scenario.isFailed()) {
			captureScreenshotOnFailure(scenario);
		}

		else {
			test.pass("Test passed" + scenario.getName());
		}
		lock.lock();
		try {
			if (driver != null) {
				System.out.println("driver is quitting");
				DriverManager.quitDriver();
				TestDataFromExcelsheet.removeTestData();
				ExtentReportManager.flushReports();

			}

		} finally {
			lock.unlock();
		}
	}

	private void captureScreenshotOnFailure(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {

			String screenshotName = scenario.getName().replaceAll(" ", "_");
			String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
			String destFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\Screenshots\\"
					+ screenshotName + "_" + timestamp + ".png";
			File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File destFile = new File(destFilePath);

			FileUtils.copyFile(sourcePath, destFile);

			scenario.attach(FileUtils.readFileToByteArray(sourcePath), "image/png", screenshotName);

			test.addScreenCaptureFromPath(destFilePath, "Screenshot on failure");
			test.fail("Test failed: " + scenario.getName());
		}
	}
}
