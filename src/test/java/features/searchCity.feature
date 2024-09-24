Feature: Search City Weather on AccuWeather

  Background:
    Given I go to AccuWeather on the Main Page

  Scenario: Search for a city weather
    When I consent to data usage
    And I input "New York" in the search field on the search city page
    Then Search results list is displayed on the search city page
    When I click on the first search result on the search city page
    Then I verify city name is displayed on the search city page
