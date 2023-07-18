package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.DropDownDemoPage;
import pages.SimpleFormDemoPage;

public class DropDownDemoTest extends BasePage {

    private DropDownDemoPage dropDownDemoPage;

    @BeforeMethod
    public void setup(){
        super.setUp();
        dropDownDemoPage = new DropDownDemoPage(driver);
    }

    @Test

    public void clickDropDownPage() throws InterruptedException {
        dropDownDemoPage.clickOnDrop();
        dropDownDemoPage.clickOnBar();

        Assert.assertEquals("Success - Check box is Checked" , "Success - Check box is Checked");
    }
}
