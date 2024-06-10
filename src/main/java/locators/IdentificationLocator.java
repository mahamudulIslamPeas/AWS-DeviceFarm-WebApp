package locators;

import org.openqa.selenium.By;

public class IdentificationLocator {
    // Header Text
    public static String identificationHeader = "//h1[contains(text(),'Identification')]";
    public static By identificationHeader2  = By.xpath(identificationHeader);
    // Radio Button
    public static String medicareRadioButton = "//label[1]//span[1]";
    public static String dvaRadioButton = "//label[2]//span[1]";
    public static String safetyNetNumberRadioButton = "//label[3]//span[1]";
    public static String pensionRadioButton = "//label[4]//span[1]";

    // Input Boxes
    public static String medicareNumberInputBox_MedCareOption = "//input[@placeholder='Enter Medicare number']";
    public static String irnInputBox_MediCarenumberOption = "//input[@placeholder='IRN']";
    public static String dvaNumberInputBox_DVANumberOption = "//input[@placeholder='Enter DVA number']";
    public static String safetyNetNumberInputBox_SafetyNetNumberOption = "//input[@placeholder='Enter Safety net number']";
    public static String pensionConcessionInputBox_Pension_concession = "//input[@placeholder='Enter Pension concession']";
    // Verify Button
    public static String verifyButton = "//button[contains(text(),'Verify')]";
}
