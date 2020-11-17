package poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseDriver;

public class CountryPOM extends BasePOM{
    public By createButton= By.cssSelector("svg[data-icon='plus']");
    public By editButton=By.cssSelector("ms-edit-button>button");
    public By deleteButton=By.cssSelector("ms-delete-button>button");
    public By deleteButtonYes=By.cssSelector("[class=\"mat-focus-indicator mat-button mat-raised-button mat-button-base mat-accent\"]");
    public By nameInput=By.cssSelector("[formcontrolname=\"name\"]> input");
    public By saveButton=By.tagName("ms-save-button");
    public By alertDialog=By.cssSelector("div[role='alertdialog']");
    public By nameSearch=By.cssSelector("div[role='alertdialog']");


}
