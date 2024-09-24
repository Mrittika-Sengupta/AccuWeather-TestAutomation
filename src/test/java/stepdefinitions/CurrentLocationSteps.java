package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CurrentLocationPage;

import static io.qameta.allure.Allure.step;

public class CurrentLocationSteps {
    private final CurrentLocationPage currentLocationPage = new CurrentLocationPage();

    @And("I click the search field")
    public void iClickTheSearchField() {
        step("I click the search field");
        currentLocationPage.clickSearchField();
    }

    @Then("Search results list is displayed")
    public void searchResultsListIsDisplayed() {
        step("Search results list is displayed");
        currentLocationPage.verifySearchResultsListIsDisplayed();
    }

    @Then("Use your current location label is displayed")
    public void useYourCurrentLocationLabelIsDisplayed() {
        step("Use your current location label is displayed");
        currentLocationPage.verifyCurrentLocationLabelIsDisplayed();
    }
}
