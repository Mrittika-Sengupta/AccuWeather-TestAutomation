package pages;

import org.openqa.selenium.By;

public class LocatorConstants {

    public static final String SEARCH_RESULT_PAGE_NAME = "Search Result Page";
    static final By SEARCH_RESULT_PAGE_SEARCH_INPUT = By.xpath(".//input[contains(@class,'search-input')]");
    static final By CITY_WEATHER_PAGE_HEADER_CITY_NAME = By.xpath("//h1[@class='header-loc']");
    static final By CITY_WEATHER_PAGE_FIRST_SEARCH_RESULT = By.xpath("//div[contains(@class,'results-container')]//div[contains(@class,'search-bar-result')][1]");
    static final By SEARCH_RESULTS = By.xpath("//div[@class='search-results']");

}
