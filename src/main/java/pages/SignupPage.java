package pages;

import commonMethods.CommonMethods;
import locators.SignupLocator;
import utils.TestDataGenerator;

public class SignupPage {
    TestDataGenerator testData = new TestDataGenerator();
    CommonMethods commonMethods = new CommonMethods();
    public void insertGivenName(){
        commonMethods.insertText(SignupLocator.givenName,testData.givenName());
    }
    public void insertSurName(){
        commonMethods.insertText(SignupLocator.surName,testData.surName());
    }
    public void insertDOB(){
        commonMethods.insertText(SignupLocator.dobCalenderDatePicker,"1999-02-01");
    }
    // should be unique
    public void insertPhoneNumber(){
        commonMethods.insertText(SignupLocator.PhoneNumber,testData.generateRandomPhoneNumber());
    } //0234783822
    // should be unique
    public void insertEmailAddress(){
        commonMethods.insertText(SignupLocator.email,testData.emailAddress());
    }
    public void insertPassword(){
        commonMethods.insertText(SignupLocator.password,"0poiuyYUIOP@");
    }
    public void viewPassword(){
        commonMethods.click(SignupLocator.viewPasswordBtn);
    }
    public void scrollToCheckBox(){
        commonMethods.scrollSmooth(SignupLocator.checkBoxTermsAndConditions);
    }
    public void checkTermsAndCondition(){
        commonMethods.click(SignupLocator.checkBoxTermsAndConditions);
    }
    // Use this methd in a if/else condition in the testCase class if required
    public void closeTermsAndConditionModal(){
        commonMethods.click(SignupLocator.closeBtnTermsAndConditionsModal);
    }
    public void checkHealthDataConsent(){
        commonMethods.click(SignupLocator.checkBoxHealthDataConsent);
    }
    public void scrollToCreateButton(){
        commonMethods.scrollSmooth(SignupLocator.createButton);
    }
    public void clickOnCreateUserBtn(){
        commonMethods.click(SignupLocator.createButton);
    }
}
