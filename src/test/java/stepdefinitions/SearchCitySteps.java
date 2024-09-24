package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.SearchCityPage;

import static io.qameta.allure.Allure.step;

public class SearchCitySteps {
    private final SearchCityPage searchCityPage = new SearchCityPage();

    @When("I input {string} in the search field on the search city page")
    public void inputSearchTermOnSearchCityPage(String searchTerm) {
        step("I input " + searchTerm + " in the search field on the search city page");
        searchCityPage.typeSearchTerm(searchTerm);
    }

    @Then("Search results list is displayed on the search city page")
    public void verifyCitySearchResultsDisplayedOnSearchCityPage() {
        step("Search results list is displayed on the search city page");
        Assert.assertTrue(searchCityPage.isSearchResultsListDisplayed(), "Search results list is not displayed");
    }

    @When("I click on the first search result on the search city page")
    public void clickFirstSearchResultOnSearchCityPage() {
        step("I click on the first search result on the search city page");
        searchCityPage.clickOnFirstSearchResult();
    }
    @Then("I verify city name is displayed on the search city page")
    public void verifyCityNameDisplayedOnSearchCityPage() {
        step("I verify city name is displayed on the search city page");
        String cityName = searchCityPage.getCityName();
        String expectedCityName = searchCityPage.getExpectedCityName();
        Assert.assertEquals(cityName, expectedCityName, "City weather page header does not contain the searched city name");
    }
}
