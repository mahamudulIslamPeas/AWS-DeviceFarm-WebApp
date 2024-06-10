package pages;

import commonMethods.CommonMethods;
import locators.LoginLocator;
import locators.OtpLocator;

public class LoginPage {
    CommonMethods action = new CommonMethods();
    public void navigateToLoginPage(){
        action.click(LoginLocator.loginPageNavigationButton);
    }
    public void setEmailAddress(String enterEmailAddress){
        action.insertText(LoginLocator.emailAdress,enterEmailAddress);
    }
    public void setPassword(String enterPassword){
        action.insertText(LoginLocator.password,enterPassword);
    }
    public void clickOnLoginButton(){
        action.click(LoginLocator.loginButton);
    }
    public String assertionOtpPage(){
        return action.getElementText(OtpLocator.headertextOtp);
    }
}
