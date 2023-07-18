package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SimpleFormDemoPage extends BasePage {
    public SimpleFormDemoPage(WebDriver driver){super(driver);}

        By clickOnTheSimpleFormDemo = By.linkText("Simple Form Demo");

        public void clickOnSimpleForm(){ driver.findElement(clickOnTheSimpleFormDemo).click();}

        By SingleInputField = By.id("user-message");

        public void clickOnTheMessageField(){ driver.findElement(SingleInputField).click();}

    By GetCheckedValue = By.id("showInput");
        public void clickOnTheGetCheckValue(){ driver.findElement(GetCheckedValue).click();}

    By yourMessage = By.xpath("//*[@id=\"user-message\"]/label");
        public void checkYourMessage(){ driver.findElement(yourMessage).getTagName();}

    }

