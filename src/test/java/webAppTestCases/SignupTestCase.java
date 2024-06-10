package webAppTestCases;

import org.testng.annotations.Test;
import pages.SignupPage;
import reusableTestSteps.LandingTest;
import reusableTestSteps.OtpTest;
import reusableTestSteps.PatientIdentificationTest;

public class SignupTestCase extends LandingTest {
    SignupPage signupPage = new SignupPage();
    OtpTest otpTest = new OtpTest();
    PatientIdentificationTest identificationTest = new PatientIdentificationTest();
    @Test(priority = 1)
    public void landingPageTestRunForSignupFlow() throws InterruptedException {
        landingPageTestCase();
        System.out.println("SignupTestCase-landingPageTestCase-landingPageTestRunForSignupFlow Last Check Point -> OK");
    }
    @Test(priority = 2)
    public void signupFormFillupTest() throws InterruptedException{
        Thread.sleep(1000);
        signupPage.insertGivenName();
        Thread.sleep(1500);
        System.out.println("Given Name inserted");
        signupPage.insertSurName();
        Thread.sleep(1500);
        System.out.println("SurName inserted");
//        signupPage.insertDOB();
//        Thread.sleep(1500);
//        System.out.println("DOB inserted");
        signupPage.insertPhoneNumber();
        Thread.sleep(1500);
        System.out.println("Phone number inserted");
        signupPage.insertEmailAddress();
        Thread.sleep(1500);
        System.out.println("Email Address inserted");
        signupPage.insertPassword();
        Thread.sleep(1500);
        System.out.println("Password inserted");
        signupPage.viewPassword();
        Thread.sleep(1500);
        System.out.println("View Password button clicked");
        signupPage.scrollToCheckBox();
        System.out.println("Scrolled to T&C checkbox");
        signupPage.checkTermsAndCondition();
        Thread.sleep(1500);
        System.out.println("T&C checkbox checked");
        signupPage.checkHealthDataConsent();
        Thread.sleep(1500);
        System.out.println("Health Data Consent checkbox checked");
        signupPage.scrollToCreateButton();
        Thread.sleep(1500);
        System.out.println("Scrolled to Create Button");
        signupPage.clickOnCreateUserBtn();
        System.out.println("Clicked on Create User button");
    }
    @Test(enabled = false)
    public void otpVerificationSignupFlow() throws InterruptedException {
        otpTest.otpVerification();
        System.out.println("SignupTestCase-otpVerificationSignupFlow Last Check Point -> OK");
    }
    @Test(enabled = false)
    public void patientVerificationSignupFlow() throws InterruptedException {
        identificationTest.identificationPageCase();
        System.out.println("SignupTestCase-otpVerificationSignupFlow Last Check Point -> OK");
    }
}
