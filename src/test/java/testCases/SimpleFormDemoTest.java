package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SimpleFormDemoPage;

public class SimpleFormDemoTest extends BasePage {

    private SimpleFormDemoPage SimpleFormDemoPage;

    @BeforeMethod
    public void setup() {
        super.setUp();
        SimpleFormDemoPage = new SimpleFormDemoPage(driver);
    }

    @Test

    public void clickOnTheSingleCheckboxCheckMark() throws InterruptedException {
        SimpleFormDemoPage.clickOnSimpleForm();


        SimpleFormDemoPage.clickOnTheMessageField();

        Assert.assertEquals("Success - Check box is Checked", "Success - Check box is Checked");
    }
}