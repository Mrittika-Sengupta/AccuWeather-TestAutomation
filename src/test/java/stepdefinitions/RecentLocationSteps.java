package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.RecentLocationPage;

import static io.qameta.allure.Allure.step;

public class RecentLocationSteps {
    private final RecentLocationPage recentLocationPage = new RecentLocationPage();

    @And("I input {string} in the search field on the recent locations page")
    public void inputSearchTerm(String searchTerm) {
        step("I input " + searchTerm + " in the search field on the recent locations page");
        recentLocationPage.setSearchTerm(searchTerm);
    }

    @And("I click on the first search result on the recent locations page")
    public void clickOnFirstSearchResult() {
        step("I click on the first search result on the recent locations page");
        recentLocationPage.clickOnFirstSearchResult();
    }

    @And("I go back to the Main page from recent locations page")
    public void goBackToMainPage() {
        step("I go back to the Main page from recent locations page");
        recentLocationPage.navigateBack();
    }

    @When("I choose the first city in Recent locations")
    public void chooseFirstCityInRecentLocations() {
        step("I choose the first city in Recent locations");
        recentLocationPage.clickOnFirstRecentLocation();
    }

    @Then("I verify recent city name is displayed")
    public void verifyRecentCityNameDisplayed() {
        step("I verify recent city name is displayed");
        String expectedCityName = recentLocationPage.getExpectedCityName();
        String actualCityName = recentLocationPage.getCityName();
        Assert.assertTrue(actualCityName.contains(expectedCityName), "City weather page header does not contain the expected city name");
    }
}