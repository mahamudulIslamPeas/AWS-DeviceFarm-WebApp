package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Reporter {
    ExtentReports extent;
    ExtentSparkReporter spark;
    public ExtentTest test;
    @BeforeSuite
    public void reporterSetup() {
        spark = new ExtentSparkReporter("resources/TestReports/ExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
        test = extent.createTest("MyFirstTest");
    }
    @AfterSuite
    public void reportTearDown(){
        extent.flush();
    }

}
