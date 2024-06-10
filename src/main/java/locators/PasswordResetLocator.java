package locators;

public class PasswordResetLocator {
    // it's rel cssSelector but the common method will take that as a class selector. If needed change accordingly
    public static String rememberMeCheckbox = ".chakra-checkbox__control.css-1ydjfm6";
    public static String forgetPasswordButton = "//div[contains(text(),'Forgot password?')]";
    public static String emailAddressForgetPasswordFlow = "//input[@placeholder='Email']";
    public static String resetButtonForgetPasswordFlow = "//button[contains(text(),'Reset')]";
    public static String newPassPlaceHolderForgetPasswordFlow = "//input[@placeholder='New password']";
    public static String confirmPassPlaceHolderForgetPasswordFlow = "//input[@placeholder='Confirm new password']";
    public static String changePassButtonForgetPasswordFlow = "//button[contains(text(),'Change Password')]";
}
