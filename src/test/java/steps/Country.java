package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
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


    @Then("^country is successfully created$")
    public void countryIsSuccessfullyCreated() {
        CountryPOM countryPage=new CountryPOM();
        String actual= countryPage.waitAndGetText(countryPage.alertDialog);
        Assert.assertEquals(actual,"Country successfully created");
    }

    @When("^I create \"([^\"]*)\" Country$")
    public void iCreateCountry(String countryName) {
        CountryPOM countryPage=new CountryPOM();
        countryPage.waitAndClick(countryPage.createButton);
        countryPage.waitAndSend(countryPage.nameInput,countryName);
        countryPage.waitAndClick(countryPage.saveButton);
    }

    @And("^\"([^\"]*)\" country does not exist$")
    public void countryDoesNotExist(String arg0) {

    }

}
