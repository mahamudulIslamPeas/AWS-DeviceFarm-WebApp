package locators;

public class OtpLocator {
    public static String headertextOtp = "//h1[contains(text(),'Enter Your Code')]";
    // wrap it up with incase you want to access the loactor the index -> (locator)[index value]
    public static String otpInputBoxes = "//input[@placeholder='○']";
    public static String verifyButton = "//button[contains(text(),'Verify')]";
}
