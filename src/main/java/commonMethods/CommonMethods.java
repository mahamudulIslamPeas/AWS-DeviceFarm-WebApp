package commonMethods;

import core.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class CommonMethods extends Base {
    JavascriptExecutor js = (JavascriptExecutor)driver;
    //    Actions actions = new Actions(driver);
    public static WebElement GetElement(String locator) {
        if (locator.startsWith("//") || locator.startsWith("(//"))
            return driver.findElement(By.xpath(locator));
        if (locator.startsWith("#")){
            return driver.findElement(By.id(locator));
        }
        if (locator.startsWith(".")){
            return driver.findElement(By.className(locator));
        }
        else
            return driver.findElement(By.cssSelector(locator));
    }
    public void hitUrl(String url) {
        driver.get(url);
    }
    public void insertText(String locator, String inputText) {
        GetElement(locator).sendKeys(inputText);
    }
    public void click(String locator) {
        GetElement(locator).click();
    }
    public void scrollSmooth(String locator){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest',behavior: 'smooth'});", GetElement(locator));
    }
        public void keyPressEnter(String locator){
//        actions.send(Keys.ENTER).perform();

    }
//    public void keyPressDownArrow(){
//        actions.sendKeys(Keys.ARROW_DOWN).perform();
//    }
    public String getElementText(String locator){
        String VisibleText = GetElement(locator).getText();
        System.out.println("Visible text found by Test Script: "+VisibleText);
        return VisibleText;
    }
}
