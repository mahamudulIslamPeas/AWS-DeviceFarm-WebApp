package reusableTestSteps;

import core.Base;
import credentials.Credentials;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.LandingPage;
import java.net.MalformedURLException;
import java.time.Duration;

public class LandingTest extends Base {
    LandingPage landingPage = new LandingPage();
    public Credentials cred = new Credentials();

    @BeforeTest
    public void setUp() throws MalformedURLException {
        setupEnv("local");
    }
    @AfterTest
    public static void tearDown(){
        driverTearDown();
    }
    public void landingPageTestCase() throws InterruptedException {
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(60));
        landingPage.landOnBaseUrl(cred.baseUrl());
        Thread.sleep(2000);
        test.pass("Landed on Base url");
        landingPage.scrollToLetsStartButton();
        Thread.sleep(2000);
        landingPage.clickOnLetsStartBtn();
        Thread.sleep(2000);
        explicitWait.until(ExpectedConditions.urlToBe(cred.signUpUrl()));
        Assert.assertEquals(driver.getCurrentUrl(),cred.signUpUrl());
        System.out.println("LandingTest Last Check Point -> OK");
    }
}
