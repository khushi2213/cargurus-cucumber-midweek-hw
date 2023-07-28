package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

public class NewAndUsedCarPage extends Utility {
    private static final Logger log = LogManager.getLogger(NewAndUsedCarPage.class.getName());
    public NewAndUsedCarPage() {
        PageFactory.initElements(driver, this);

    }

    @CacheLookup
    @FindBy(xpath = "//h1[text()='New & Used Car Search - carsguide']")
    WebElement newNused;

    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement anyMake;

    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement model;

    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement location;

    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement price;

    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'We did find these cars that almost match your criteria')]")
    WebElement r1;

    @CacheLookup
    @FindBy(className = "makeFilter")
    WebElement result;

    public String verifyTextSuccessfully() {
        return getTextFromElement(result);
    }

    public void verifyNewandUsedCarPage() {
        String expected = getTextFromElement(newNused);
        String actual = "New & Used Car Search - carsguide";
        AssertJUnit.assertEquals(expected, actual);
    }
    public void selectYourCar(String car) {
        selectByValueFromDropDown(anyMake, car);
        // selectByVisibleTextFromDropDown(anyMake,car);
    }
    public void selectModel(String variant) {
        selectByValueFromDropDown(model, variant);

    }
    public void chooseYourLocation(String area) {
        selectByValueFromDropDown(location, area);

    }
    public void selectYourRange$(String amount) {
        selectByValueFromDropDown(price, amount);

    }
    public void clickOnSearchButton() {
        clickOnElement(searchButton);

    }
}
