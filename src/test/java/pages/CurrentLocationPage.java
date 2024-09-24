package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import org.openqa.selenium.By;

public class CurrentLocationPage extends MainPage {

    private static final By SEARCH_FIELD = By.xpath("//input[@class='search-input']");
    private static final By SEARCH_RESULTS = By.xpath("//div[@class='search-results']");
    private static final By CURRENT_LOCATION_TEXT = By.xpath("//span[text()='Use your current location']");

    private final IButton searchFieldElement = getElementFactory().getButton(SEARCH_FIELD, "Search Field");
    private final ILabel searchResultsLabel = getElementFactory().getLabel(SEARCH_RESULTS, "Search Results");
    private final ILabel currentLocationLabel = getElementFactory().getLabel(CURRENT_LOCATION_TEXT, "Use Your Current Location Label");

    public CurrentLocationPage() {
        super();
    }

    public void clickSearchField() {
        searchFieldElement.click();
    }

    public void verifySearchResultsListIsDisplayed() {
        searchResultsLabel.state().waitForDisplayed();
    }

    public void verifyCurrentLocationLabelIsDisplayed() {
        currentLocationLabel.state().waitForDisplayed();
    }
}