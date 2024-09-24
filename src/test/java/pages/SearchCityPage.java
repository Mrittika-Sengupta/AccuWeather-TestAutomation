package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import pages.LocatorConstants;

public class SearchCityPage extends MainPage {

    private final ITextBox searchResultPageSearchInput = getElementFactory().getTextBox(LocatorConstants.SEARCH_RESULT_PAGE_SEARCH_INPUT, "Search Input");
    private final ILabel cityWeatherPageHeaderCityName = getElementFactory().getLabel(LocatorConstants.CITY_WEATHER_PAGE_HEADER_CITY_NAME, "City Name");
    private final IButton cityWeatherPageFirstSearchResultButton = getElementFactory().getButton(LocatorConstants.CITY_WEATHER_PAGE_FIRST_SEARCH_RESULT, "First Search Result");
    private final ILabel searchResultsLabel = getElementFactory().getLabel(LocatorConstants.SEARCH_RESULTS, LocatorConstants.SEARCH_RESULT_PAGE_NAME);

    private String searchTerm;
    private static final String SEARCH_TERM = "New York, NY";

    public SearchCityPage() {
        super();
        searchTerm = SEARCH_TERM;
    }
    public void typeSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
        searchResultPageSearchInput.clearAndType(searchTerm);
    }
    public boolean isSearchResultsListDisplayed() {
        return searchResultsLabel.state().waitForDisplayed();
    }
    public void clickOnFirstSearchResult() {
        cityWeatherPageFirstSearchResultButton.click();
    }
    public String getCityName() {
        return cityWeatherPageHeaderCityName.getText();
    }

    public String getExpectedCityName() {
        return searchTerm;
    }
}