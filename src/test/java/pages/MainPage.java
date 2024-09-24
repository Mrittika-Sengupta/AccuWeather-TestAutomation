package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class MainPage extends Form {

    private static final String MAIN_PAGE_NAME = "Main Page";
    private static final By MAIN_PAGE_ACCUWEATHER_LOGO = By.xpath("//a[contains(@class,'header-logo')]");

    private final ILabel mainPageAccuWeatherLogo = getElementFactory().getLabel(MAIN_PAGE_ACCUWEATHER_LOGO, "AccuWeather Logo");

    private static final By CONSENT_PAGE_UNDERSTAND_BUTTON = By.cssSelector(".banner-button.policy-accept");
    private final IButton consentPageUnderstandButton = getElementFactory().getButton(CONSENT_PAGE_UNDERSTAND_BUTTON, "I Understand Button");


    public MainPage() {
        super(MAIN_PAGE_ACCUWEATHER_LOGO, MAIN_PAGE_NAME);
    }

    public void clickUnderstandButton() {
        consentPageUnderstandButton.click();
    }

    public boolean isMainPageDisplayed() {
        return mainPageAccuWeatherLogo.state().waitForDisplayed();
    }

}


