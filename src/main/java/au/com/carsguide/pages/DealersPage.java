package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DealersPage extends Utility {

    private static final Logger log = LogManager.getLogger(DealersPage.class.getName());

    public DealersPage () {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Find a Car Dealership Near You')]")
    WebElement verifyDealersPage;

    @CacheLookup
    @FindBy(className = "dealerListing--name")
    List<WebElement> dealersname;

    public void verifyDealersNamesDisplayed(boolean list) {
        for (WebElement name : dealersname) {
            if (list = name.isDisplayed()) {
                break;
            } else {
                System.out.println("Dealers name not in the list");
            }
        }
    }

    public String verifycardealer() {
        return getTextFromElement(verifyDealersPage);

    }
}