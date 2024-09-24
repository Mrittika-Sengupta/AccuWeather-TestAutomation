Feature: Recent City Weather on AccuWeather

  Background:
    Given I go to AccuWeather on the Main Page

  Scenario: Selecting the first city from Recent locations
    When I consent to data usage
    And I input "London" in the search field on the recent locations page
    And I click on the first search result on the recent locations page
    And I go back to the Main page from recent locations page
    Then Main page is displayed
    When I choose the first city in Recent locations
    Then I verify recent city name is displayed
