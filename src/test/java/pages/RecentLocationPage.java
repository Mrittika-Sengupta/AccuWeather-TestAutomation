package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class RecentLocationPage extends MainPage {

    private static final By SEARCH_RESULT_PAGE_SEARCH_INPUT = By.xpath(".//input[contains(@class,'search-input')]");

    private static final By CITY_WEATHER_PAGE_HEADER_CITY_NAME = By.xpath("//h1[@class='header-loc']");
    private static final By CITY_WEATHER_PAGE_FIRST_SEARCH_RESULT = By.xpath("//div[contains(@class,'results-container')]//div[contains(@class,'search-bar-result')][1]");
    private static final By FIRST_RECENT_LOCATION_BUTTON_SELECTOR = By.xpath("//a[contains(@class, 'recent-location-item')][1]");
    private final ITextBox searchResultPageSearchInput = getElementFactory().getTextBox(SEARCH_RESULT_PAGE_SEARCH_INPUT, "Search Input");
    private final ILabel cityWeatherPageHeaderCityName = getElementFactory().getLabel(CITY_WEATHER_PAGE_HEADER_CITY_NAME, "City Name");
    private final IButton cityWeatherPageFirstSearchResultButton = getElementFactory().getButton(CITY_WEATHER_PAGE_FIRST_SEARCH_RESULT, "First Search Result");
    private final IButton firstRecentLocationButton = getElementFactory().getButton(FIRST_RECENT_LOCATION_BUTTON_SELECTOR, "First Recent Location Button");

    private String searchTerm;
    private static final String SEARCH_TERM = "London, London";

    public RecentLocationPage() {
        super();
        searchTerm = SEARCH_TERM;
    }
    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
        searchResultPageSearchInput.clearAndType(searchTerm);
    }
    public void clickOnFirstSearchResult() {
        cityWeatherPageFirstSearchResultButton.click();
        cityWeatherPageHeaderCityName.state().waitForDisplayed();
    }

    public void navigateBack() {
        AqualityServices.getBrowser().goBack();
    }

    public void clickOnFirstRecentLocation() {
        firstRecentLocationButton.click();
        cityWeatherPageHeaderCityName.state().waitForDisplayed();
    }

    public String getCityName() {
        return cityWeatherPageHeaderCityName.getText();
    }

    public String getExpectedCityName() {
        return searchTerm;
    }
}
