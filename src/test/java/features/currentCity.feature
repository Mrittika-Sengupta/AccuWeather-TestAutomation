Feature: Current City Weather on AccuWeather

  Background:
    Given I go to AccuWeather on the Main Page

  Scenario: Verify search results list is displayed after clicking search field
    When I consent to data usage
    And I click the search field
    Then Search results list is displayed
    And Use your current location label is displayed

