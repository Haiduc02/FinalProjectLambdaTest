package testCases;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckboxDemoPage;

public class CheckboxDemoTest extends BasePage {

    private CheckboxDemoPage checkboxDemoPage;

    @BeforeMethod
    public void setup(){
        super.setUp();
        checkboxDemoPage = new CheckboxDemoPage(driver);
    }


  /*  @Test
    public void clickOnTheSingleCheckboxCheckMark() throws InterruptedException {
        checkboxDemoPage.clickOnCheckboxPage();
        checkboxDemoPage.clickOnSingleCheckbox();
        checkboxDemoPage.clickOnTheFirstCheckboxoption();
        Assert.assertEquals("Success - Check box is Checked" , "Success - Check box is Checked");
    }*/

   @Test

    public void clickOnTheFirstTwoOptionAndCheckThatTheyAreSelected() throws InterruptedException {
       checkboxDemoPage.clickOnCheckboxPage();
       checkboxDemoPage.clickOnTheFirstCheckboxoption();
       checkboxDemoPage.clickOnTheSecondCheckboxoption();
       WebElement firstOptionCheckbox = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div[1]/input"));
       WebElement secondOptionCheckbox = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div[1]/input"));
       Assert.assertTrue(firstOptionCheckbox.isSelected(), "Search button is not enable");
       Assert.assertTrue(secondOptionCheckbox.isSelected(), "Search button is not enabled");
   }
       @Test
       public void clickOnTheThirdAndForthOptionsAndCheckThatTheyAreDisable() throws InterruptedException{
           checkboxDemoPage.clickOnCheckboxPage();
           checkboxDemoPage.clickOnTheThirdCheckboxoption();
           checkboxDemoPage.clickOnTheForthCheckboxoption();
           WebElement thirdOptionCheckbox = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[2]/div[2]/div[3]/input"));
           WebElement forthOptionCheckbox = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[2]/div[2]/div[4]/input"));
           Assert.assertTrue(!thirdOptionCheckbox.isEnabled(),"Search button is not enabled");
       Assert.assertFalse(forthOptionCheckbox.isEnabled(),"Search button is not enabled");
   }
}

