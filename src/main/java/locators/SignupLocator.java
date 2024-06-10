package locators;

public class SignupLocator {
    public static String givenName = "input[placeholder='Given Name']";
    public static String surName = "input[placeholder='Surname']";
    public static String dobCalenderDatePicker = "input[placeholder='Date of Birth']";
    public static String PhoneNumber = "input[placeholder='Phone number']";
    public static String email = "input[placeholder='Email']";
    public static String password = "input[placeholder='Create a Password']";
    public static String viewPasswordBtn = "//button[contains(text(),'Show')]";
    public static String checkBoxTermsAndConditions = "//label[1]//span[1]";  ////input[@value='tc']
    public static String checkBoxHealthDataConsent = "//label[2]//span[1]";  ////input[@value='health']
    public static String closeBtnTermsAndConditionsModal = "//button[@aria-label='Close']";
    public static String createButton = "//button[contains(text(),'Create')]";
    public static String duplicatePhoneNumberErrorMessage = "//div[contains(text(),'an account is already registered with this phone number')]";
}
