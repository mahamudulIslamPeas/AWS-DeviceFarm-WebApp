package webAppTestCases;

import reusableTestSteps.LandingTest;
import reusableTestSteps.OtpTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import reusableTestSteps.PatientIdentificationTest;

public class LoginTestCase extends LandingTest {
    LoginPage loginPage = new LoginPage();
    OtpTest otpTestCase = new OtpTest();
    PatientIdentificationTest identificationTest = new PatientIdentificationTest();
    @Test(priority = 1)
    public void landingPageTestRunForLoginFlow() throws InterruptedException {
        landingPageTestCase();
        System.out.println("LoginTestCase-landingPageTestCase-landingPageTestRunForLoginFlow Last Check Point -> OK");
    }
    @Test(priority = 2)
    public void enterLoginFlow() throws InterruptedException {
        loginPage.navigateToLoginPage();
        Thread.sleep(3000);
        System.out.println("LoginTestCase-enterLoginFlow Last Check Point -> OK");
    }
    @Test(priority = 3)
    public void setupCredential() throws InterruptedException{
        loginPage.setEmailAddress(cred.setUserName());
        Thread.sleep(3000);
        loginPage.setPassword(cred.setPassword());
        Thread.sleep(3000);
        loginPage.clickOnLoginButton();
        Thread.sleep(3000);
        System.out.println("LoginTestCase-setupCredential Last Check Point -> OK");
        test.fail("Failed");
    }
    @Test(priority = 4)
    public void otpVerificationLoginFlow() throws InterruptedException {
        otpTestCase.otpVerification();
        System.out.println("LoginTestCase-otpVerificationLoginFlow Last Check Point -> OK");
    }
    @Test(priority = 5)
    public void patientIdentificationLoginFlow() throws InterruptedException {
        identificationTest.identificationPageCase();
        System.out.println("LoginTestCase-patientIdentificationLoginFlow Last Check Point -> OK");
    }
}
