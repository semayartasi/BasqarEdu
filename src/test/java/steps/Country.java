package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.BaseDriver;

public class Country {
    private WebDriver driver;
    @Given("^I navigate to Country$")
    public void iNavigateToCountry() {
        driver= BaseDriver.getDriver();

        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Setup']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Setup']")));
        driver.findElement(By.xpath("//span[text()='Setup']")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Parameters']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Parameters']")));
        driver.findElement(By.xpath("//span[text()='Parameters']")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Countries']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Countries']")));
        driver.findElement(By.xpath("//span[text()='Countries']")).click();


    }

    @When("^I create a Country$")
    public void iCreateACountry() throws InterruptedException {
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("svg[data-icon='plus']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("svg[data-icon='plus']")));
        driver.findElement(By.cssSelector("svg[data-icon='plus']")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[formcontrolname=\"name\"]> input")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[formcontrolname=\"name\"]> input")));
        driver.findElement(By.cssSelector("[formcontrolname=\"name\"]> input")).sendKeys("countries");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("ms-save-button")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("ms-save-button")));
        driver.findElement(By.tagName("ms-save-button")).click();
    }

    @Then("^country is successfully created$")
    public void countryIsSuccessfullyCreated() {
        WebDriverWait wait=new WebDriverWait(driver,5);
         wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[role='alertdialog']")));
        WebElement alertDialog=driver.findElement(By.cssSelector("div[role='alertdialog']"));
        Assert.assertEquals(alertDialog.getText(),"Country successfully created");
        
    }
}
