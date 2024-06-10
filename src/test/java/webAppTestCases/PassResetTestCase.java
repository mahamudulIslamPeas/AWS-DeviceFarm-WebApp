package webAppTestCases;

import org.testng.annotations.Test;
import pages.PasswordResetPage;
import reusableTestSteps.LandingTest;
import reusableTestSteps.OtpTest;

public class PassResetTestCase extends LandingTest {
    LoginTestCase loginTestCase = new LoginTestCase();
    PasswordResetPage passwordResetPage = new PasswordResetPage();
    OtpTest otpTest = new OtpTest();
    @Test(priority = 1)
    public void stepsBeforeResetFlow() throws InterruptedException {
        landingPageTestCase();
        System.out.println("PassResetTestCase-landingPageTestCase Last Check Point -> OK");
        loginTestCase.enterLoginFlow();
        System.out.println("PassResetTestCase-loginTestCase.enterLoginFlow Last Check Point -> OK");
    }
    @Test(priority = 3)
    public void enterResetFlow() throws InterruptedException {
        passwordResetPage.landingOnResetPassPage();
        System.out.println("Landed on Reset Password Page");
        passwordResetPage.insertEmailForgetPassFlow();
        System.out.println("Email Inserted");
        passwordResetPage.resetBtnForgetPassFlow();
        Thread.sleep(3000);
        System.out.println("PassResetTestCase-enterResetFlow Last Check Point -> OK");
    }
    @Test(priority = 4)
    public void otpVerificationPassResetFlow() throws InterruptedException {
        otpTest.otpVerification();
        System.out.println("PassResetTestCase-otpVerificationPassResetFlow Last Check Point -> OK");
    }
    @Test(priority = 5)
    public  void resettingPassword() throws  InterruptedException{
        passwordResetPage.insertNewPasswordForgetPassFlow();
        Thread.sleep(2000);
        passwordResetPage.confirmPasswordForgetPassFlow();
        Thread.sleep(2000);
        passwordResetPage.clickOnChangePassBtnForgetPassFlow();
        Thread.sleep(2000);
        System.out.println("PassResetTestCase-resettingPassword Last Check Point -> OK");
    }
}
