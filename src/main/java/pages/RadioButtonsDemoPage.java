package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonsDemoPage  extends BasePage{

    public RadioButtonsDemoPage(WebDriver driver){super(driver);}

    By clickOnTheRadioButtons = By.linkText("Radio Buttons Demo");
    public void clickOnRadioButton(){ driver.findElement(clickOnTheRadioButtons).click();}

    By clickOnTheSingleButtonRadio = By.className("\"mr-10");
    public void clickOnRadioButtonMale(){ driver.findElement(clickOnTheSingleButtonRadio).click();}

    By DisabledCheckbox = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[2]/div/div/div/div[2]/label/input");
    public void clickOnCheckbox2(){ driver.findElement(DisabledCheckbox).click(); }

By genderAndAge = By.tagName("gender");
    public void clickOnOther(){ driver.findElement(genderAndAge).click(); }

    By age = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[2]/input");
    public void secodbox(){ driver.findElement(age).click(); }
}
