Feature: RightAwayAutoSale main page tests

  Background:
    Given User navigates to 'https://www.rightwayautosale.com/' page

  Scenario: Navigate to the main page and click About Us
    When User clicks About Us button
    Then About Us page should be displayed

  Scenario: Navigate to the main page and click Contact Us
    When User clicks Contact Us button
    Then Contact Us page should be displayed

  Scenario: Navigate to the main page and click Inventory
    When User clicks Inventory button
    Then Inventory page should be displayed
