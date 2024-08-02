package Utilities;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/*public class ExtentReportManager {
   // private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

    private static ExtentReports extentReports;
    private static ExtentTest test;

    public static ExtentReports getExtentReports() {
        if (extentReports == null) {
            // Create ExtentSparkReporter instance
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extent-report.html");
            sparkReporter.config().setDocumentTitle("Test Report");
            sparkReporter.config().setReportName("Automation Test Report");
            sparkReporter.config().setTheme(Theme.STANDARD);

            // Initialize ExtentReports and attach SparkReporter
            extentReports = new ExtentReports();
            extentReports.attachReporter(sparkReporter);
        }
        return extentReports;
    }

    public static ExtentTest getTest() {
        return test;
    }
  
    public static void setTest(ExtentTest test) {
        ExtentReportManager.test = test;
    }

    public static void flushReports() {
        if (extentReports != null) {
            extentReports.flush();
        }
    }
}*/
public class ExtentReportManager {

    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();
    private static ExtentReports extentReports;

    // Static block to initialize ExtentReports
    static {
        ExtentSparkReporter spark = new ExtentSparkReporter("target/ExtentReport.html");
        spark.config().setReportName("Automation Test Report");
        extentReports = new ExtentReports();
        extentReports.attachReporter(spark);
        extentReports.setSystemInfo("OS", System.getProperty("os.name"));
        extentReports.setSystemInfo("Java Version", System.getProperty("java.version"));
        extentReports.setSystemInfo("Environment", "QA");
    }

    public static ExtentReports getExtentReports() {
        return extentReports;
    }

    public static void setTest(ExtentTest test) {
        extentTest.set(test);
    }

    public static ExtentTest getTest() {
        return extentTest.get();
    }

    public static void flushReports() {
        extentReports.flush();
    }
}
