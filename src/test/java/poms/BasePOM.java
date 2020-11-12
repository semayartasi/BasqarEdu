package poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseDriver;

public class BasePOM {

    protected WebDriverWait wait;
    protected WebDriver driver;

    public BasePOM() {
        driver= BaseDriver.getDriver();
        wait=new WebDriverWait(driver,10);

    }
    public void waitAndClick(By locator){
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        driver.findElement(locator).click();
    }

    public void waitAndSend(By locator,String text){
        WebElement webElement = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        WebElement webElement1 = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        webElement.clear();
        webElement1.clear();
        webElement.sendKeys(text);

    }

    public String waitAndGetText(By locator){
       return wait.until(ExpectedConditions.presenceOfElementLocated(locator)).getText();
    }
}
