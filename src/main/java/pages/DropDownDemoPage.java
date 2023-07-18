package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDownDemoPage extends BasePage {

    public DropDownDemoPage(WebDriver driver) {
        super(driver);
    }

    By clickDropDownPage = By.linkText("Select Dropdown List");
    public void clickOnDrop() {driver.findElement(clickDropDownPage).click();}

    By dropDownBar = By.id("select-demo");
    public void clickOnBar(){driver.findElement(dropDownBar).click(); }

    By secondChoice = By.xpath("//*[@id=\"select-demo\"]/option[3]");
    public void monday(){driver.findElement(secondChoice).click();}

    By clickOnFlorida = By.xpath("//*[@id=\"multi-select\"]/option[2]");
    public void florida(){driver.findElement(clickOnFlorida).click();}

    By clickOnFistSelected = By.id("printMe");
    public void getFirstResult(){driver.findElement(clickOnFistSelected).click();}

    By clickOnOhio = By.xpath("//*[@id=\"multi-select\"]/option[5]");
    public void ohio(){driver.findElement(clickOnOhio).click();}

    By clickOnSecondSelect = By.id("printAll");
    public void getAllTheResult(){driver.findElement(clickOnSecondSelect).click();}

}