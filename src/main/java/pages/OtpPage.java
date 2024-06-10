package pages;

import commonMethods.CommonMethods;
import locators.OtpLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static core.Base.driver;

public class OtpPage {
    CommonMethods action = new CommonMethods();
    public void setUpOtpCode(){
        List<WebElement> allOptions = driver.findElements(By.xpath(OtpLocator.otpInputBoxes));
        Integer i = 1;
        for(WebElement we: allOptions){
            we.sendKeys(Integer.toString(i));
            i++;
        }
    }
    public void clickOnVerify(){
        action.click(OtpLocator.verifyButton);
    }
}
