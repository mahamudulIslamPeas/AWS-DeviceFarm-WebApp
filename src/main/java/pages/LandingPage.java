package pages;

import commonMethods.CommonMethods;
import core.Base;
import locators.LandingPageLocator;

import java.net.MalformedURLException;

public class LandingPage extends Base {
    CommonMethods action = new CommonMethods();
    public void landOnBaseUrl(String baseUrl){
        action.hitUrl(baseUrl);
    }
    public void scrollToLetsStartButton(){
        action.scrollSmooth(LandingPageLocator.landingPageButton);
    }
    public void clickOnLetsStartBtn(){
        action.click(LandingPageLocator.landingPageButton);
    }

}
