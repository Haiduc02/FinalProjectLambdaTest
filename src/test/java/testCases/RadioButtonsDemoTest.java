package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckboxDemoPage;
import pages.RadioButtonsDemoPage;

public class RadioButtonsDemoTest extends BasePage {

    private RadioButtonsDemoPage RadioButtonsDemoPage;

    @BeforeMethod
    public void setup(){
        super.setUp();
        RadioButtonsDemoPage = new RadioButtonsDemoPage(driver);
    }

    @Test


    public void RadioButton() throws InterruptedException {
        RadioButtonsDemoPage.clickOnRadioButton();
        RadioButtonsDemoPage.clickOnRadioButtonMale();
        RadioButtonsDemoPage.clickOnCheckbox2();
        RadioButtonsDemoPage.clickOnOther();

        Assert.assertEquals("Success - Check box is Checked" , "Success - Check box is Checked");
    }


}
