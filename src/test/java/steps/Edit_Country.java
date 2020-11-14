package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import poms.CountryPOM;
import utils.BaseDriver;

public class Edit_Country {
    CountryPOM countryPage=new CountryPOM();

    @When("^I edit a Country$")
    public void iEditACountry() {
        countryPage.waitAndClick(countryPage.editButton);
        countryPage.waitAndSend(countryPage.nameInput,"country edited");
        countryPage.waitAndClick(countryPage.saveButton);
    }

    @Then("^country is successfully edited$")
    public void countryIsSuccessfullyEdited() {
        CountryPOM countryPage=new CountryPOM();
        String actual= countryPage.waitAndGetText(countryPage.alertDialog);
        Assert.assertEquals(actual,"Country successfully updated");
    }

    @When("^I delete a Country$")
    public void iDeleteACountry() {
        countryPage.waitAndClick(countryPage.deleteButton);
        countryPage.waitAndClick(countryPage.deleteButtonYes);
    }

    @Then("^country is successfully deleted$")
    public void countryIsSuccessfullyDeleted() {
        CountryPOM countryPage=new CountryPOM();
        String actual= countryPage.waitAndGetText(countryPage.alertDialog);
        Assert.assertEquals(actual,"Country successfully deleted");
    }

    @When("^I edit \"([^\"]*)\" to \"([^\"]*)\" Country$")
    public void iEditToCountry(String arg0, String arg1)  {
       
    }
}
