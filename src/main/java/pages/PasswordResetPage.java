package pages;

import commonMethods.CommonMethods;
import locators.PasswordResetLocator;

public class PasswordResetPage {
    CommonMethods commonMethods = new CommonMethods();
    public void landingOnResetPassPage(){
        commonMethods.click(PasswordResetLocator.forgetPasswordButton);
    }
    public void insertEmailForgetPassFlow(){
        commonMethods.insertText(PasswordResetLocator.emailAddressForgetPasswordFlow,"mahamudu.islam@inivosglobal.com");
    }
    public void resetBtnForgetPassFlow(){
        commonMethods.click(PasswordResetLocator.resetButtonForgetPasswordFlow);
    }
    public void insertNewPasswordForgetPassFlow(){
        commonMethods.insertText(PasswordResetLocator.newPassPlaceHolderForgetPasswordFlow,"0poiuyYUIOP2");
    }
    public void confirmPasswordForgetPassFlow(){
        commonMethods.insertText(PasswordResetLocator.confirmPassPlaceHolderForgetPasswordFlow,"0poiuyYUIOP2");
    }
    public void clickOnChangePassBtnForgetPassFlow(){
        commonMethods.click(PasswordResetLocator.changePassButtonForgetPasswordFlow);
    }
}
