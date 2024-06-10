package core;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utils.Reporter;

import java.net.MalformedURLException;
import java.net.URL;

public class Base extends Reporter {
    public static AppiumDriver driver;
    public void setupEnv(String platform) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        if (platform.equalsIgnoreCase("local")){
//            Local Run config
            URL url = new URL("http://127.0.0.1:4723");
            capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome"); //The browser name should be exact
            capabilities.setCapability("chromedriverExecutableDir", "C:\\Users\\User\\Desktop\\Projects\\[AWS-DeviceFarm]WebUI-java-appium\\resources\\driver"); //mandatory
            capabilities.setCapability("automationName", "UiAutomator2"); //This value should be exact if you're runnning test on android
            capabilities.setCapability("platformName", "Android"); // mandatory
            driver = new AppiumDriver(url, capabilities);
        }
        else if (platform.equalsIgnoreCase("aws")){
//            Device Farm Run Config
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
            driver = new AppiumDriver(url, capabilities);
            System.out.println("Base Fired");
        }
        else {
            System.out.println("Invalid Platform");
        }
    }
    public static void driverTearDown() {
        // Quit the Appium driver
        if (driver != null) {
            driver.quit();
            System.out.println("Driver Terminated");
        }
    }
}