package reusableTestSteps;

import credentials.Credentials;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PatientIdentificationPage;

import java.time.Duration;

import static core.Base.driver;

public class PatientIdentificationTest {
    WebDriverWait explicitWait;
    Credentials cred = new Credentials();
    public void identificationPageCase() throws InterruptedException {
        explicitWait = new WebDriverWait(driver, Duration.ofSeconds(60));
        explicitWait.until(ExpectedConditions.urlToBe(cred.identificationUrl()));
        System.out.println("Successfully landed on identification page");
        PatientIdentificationPage patientIdentificationPage = new PatientIdentificationPage();
        patientIdentificationPage.selectDVANumberRadioButton();
        Thread.sleep(1500);
        System.out.println("DVA Number radio button selected");
        patientIdentificationPage.putDummyText();
        Thread.sleep(1500);
        System.out.println("Inserted value as DVA Number");
//        patientIdentificationPage.clickOnVarifyButton();
//        System.out.println("Clicked on Varify button");
//        Thread.sleep(1500);
    }
}
