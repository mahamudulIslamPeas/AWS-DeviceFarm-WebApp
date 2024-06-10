package reusableTestSteps;


import credentials.Credentials;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.OtpPage;

import java.time.Duration;

import static core.Base.driver;

public class OtpTest {
    OtpPage otp = new OtpPage();
    Credentials cred = new Credentials();

    public void otpVerification() throws InterruptedException {
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(60));
        Thread.sleep(9000);
        otp.setUpOtpCode();
        Thread.sleep(7000);
        System.out.println("OTP code inserted");
        otp.clickOnVerify();
        Thread.sleep(5500);
        System.out.println("Verify button clicked");
        explicitWait.until(ExpectedConditions.urlToBe(cred.identificationUrl()));
        Assert.assertEquals(driver.getCurrentUrl(),cred.identificationUrl());
        System.out.println("OtpTest Last Check Point -> OK");
    }
}
