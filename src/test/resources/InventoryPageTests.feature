Feature: RightAwayAutoSale Inventory page tests

  Background:

    Given User navigates to 'https://www.rightwayautosale.com/inventory' page

  Scenario: Navigate to Inventory page and filter the list by Year
    When User clicks year filter button
    Then list should be filtered by selected year

  Scenario: Navigate to Inventory page and filter the list by Body Type
    When User clicks Body Type filter
    Then list should be filtered by selected body type

  Scenario: Navigate to Inventory page and filter the list by Make
    When User clicks Make filter
    Then list should be filtered by selected Make type

  Scenario: Navigate to Inventory page and filter the list by Engine
    When User clicks Engine filter
    Then list should be filtered by selected Engine type

  Scenario: Navigate to Inventory page and click Year Sort button
    When User clicks Year sort button
    Then list should be sorted by Year

  Scenario: Navigate to Inventory page and double click Price Sort button (descending sorting)
    When User clicks Price sort button
    Then list should be sorted by Price

  Scenario: Navigate to Inventory page and sort the list ascending by Make
    When User clicks Make sort button
    Then list should be sorted by Make

  Scenario: Navigate to Inventory page and sort the list ascending by Mileage
    When User clicks Mileage sort button
    Then list should be sorted by Mileage