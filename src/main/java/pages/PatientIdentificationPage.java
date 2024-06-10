package pages;

import commonMethods.CommonMethods;
import core.Base;
import locators.IdentificationLocator;

public class PatientIdentificationPage extends Base {
    CommonMethods action = new CommonMethods();

    public void scrollToRadioButton(){
        action.scrollSmooth(IdentificationLocator.dvaRadioButton);
    }
    public void selectDVANumberRadioButton(){
        action.click(IdentificationLocator.dvaRadioButton);
    }
    // public void scrollToTextBox(){
    //     action.scrollSmooth(IdentificationLocator.dvaNumberInputBox_DVANumberOption);
    // }
    public void putDummyText(){
        action.insertText(IdentificationLocator.dvaNumberInputBox_DVANumberOption, "123456");
    }
    public void clickOnVarifyButton(){
        action.click(IdentificationLocator.verifyButton);
    }
}
