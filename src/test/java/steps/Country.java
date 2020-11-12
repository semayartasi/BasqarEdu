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
import poms.CountryPOM;
import poms.MenuPOM;
import utils.BaseDriver;

public class Country {
    private WebDriver driver;
    @Given("^I navigate to Country$")
    public void iNavigateToCountry() {
        driver= BaseDriver.getDriver();
        MenuPOM menu=new MenuPOM();
        menu.waitAndClick(menu.setupMenu);
        menu.waitAndClick(menu.parametersMenu);
        menu.waitAndClick(menu.countriesMenu);

    }

    @When("^I create a Country$")
    public void iCreateACountry() throws InterruptedException {
        CountryPOM countryPage=new CountryPOM();

        countryPage.waitAndClick(countryPage.createButton);
        countryPage.waitAndSend(countryPage.nameInput,"country name");
        countryPage.waitAndClick(countryPage.saveButton);

    }

    @Then("^country is successfully created$")
    public void countryIsSuccessfullyCreated() {

        CountryPOM countryPage=new CountryPOM();
        String actual= countryPage.waitAndGetText(countryPage.alertDialog);
        Assert.assertEquals(actual,"Country successfully created");

    }
}
