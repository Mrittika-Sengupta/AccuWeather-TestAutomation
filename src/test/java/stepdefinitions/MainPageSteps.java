package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

public class MainPageSteps {

    MainPage mainPage = new MainPage();

    @Given("I go to AccuWeather on the Main Page")
    public void goToMainPage() {
        // the setup hook already handles it
    }
    @When("I consent to data usage")
    public void consentToDataUsage() {
        step("I consent to data usage");
        mainPage.clickUnderstandButton();
    }
    @Then("Main page is displayed")
    public void verifyMainPageDisplayed() {
        step("Main page is displayed");
        boolean isMainPageDisplayed = mainPage.isMainPageDisplayed();
        Assert.assertTrue(isMainPageDisplayed, "Main page is not opened");
    }
    }

