Feature: Details page tests

  Background:

    Given User navigates to 'https://www.rightwayautosale.com/inventory' page
    When User clicks Details button

  Scenario: Navigate to View Details page and check that title and image are displayed
    Then title should be displayed
    And price should be displayed
    And image should be displayed

  Scenario: Navigate to View Details page and check that details below the image are displayed
    Then VIN number should be displayed
    And Stock should be displayed
    And Trim should be displayed
    And Condition should be displayed
    And Certification should be displayed

  Scenario: Navigate to View Details page and check Vehicle Overview section
    Then Odometer should be displayed
    And Exterior color should be displayed
    And Interior color should be displayed
    And Body Type should be displayed
    And Fuel Type should be displayed
    And Transmission should be displayed
    And Drive Train should be displayed
    And Engine data should be displayed
    And Fuel Economy should be displayed

  Scenario: Navigate to View Details page and check Vehicle Description section
    Then Finance should be displayed
    And Finance application should be displayed
    And Vehicle features should be displayed
    And Vehicle options should be displayed
    And Note should be displayed
    And Details should be displayed
    And Features and Options section should be displayed

#  Scenario Outline: Navigate to View Details page and check Request Information form - positive test
#    When User populates "<first name>" in the first name input box
#    And User populates "<last name>" in the last name input box
#    And User populates "<email>" in the email input box
#    And User populates "<phone>" in the phone input box
#    And User clicks Submit button
#    Then Success message should be displayed
#    Examples:
#
#      | first name             | last name               | email              | phone               |
#      | m                      | p                       | nmnm@gmail.com     | 1644444444444676776 |
#      | ^&&^&^%                | %$%$&^&                 | m.p@gmail.com      | 1                   |
#      | longnammeeeeeeeeeeeeee | longlaaaaaaaaaaaastname | m.perev2@gmail.com | 1                   |
#
  Scenario Outline: Navigate to View Details page and check Request Information form - negative test
    When User populates "<first name>" in the first name input box
    And User populates "<last name>" in the last name input box
    And User populates "<email>" in the email input box
    And User populates "<phone>" in the phone input box
    And User clicks Submit button
    Then Email Error message should be displayed
    And Success message should not be displayed
    Examples:

      | first name | last name | email     | phone      |
      | mar        | pere      | nmnm@     | 5456454654 |
      | 123#$%     | 123       | m.p@gmail | 1          |


  Scenario: Navigate to View Details page and click Apply for Financing button
    When User clicks Apply for Financing button
    Then Apply for Financing page should be displayed

  Scenario: Navigate to View details page and click Trade-in appraisal button
    When User clicks Trade-in appraisal button
    Then Trade-In Appraisal page should be displayed

  Scenario:Navigate to View details page and click Carfax button
    When User clicks Carfax button
    Then Vehicle History Report dialog should be displayed

  Scenario:Navigate to View details page and verify Estimate your monthly payment
    When User clicks Calculate button on Estimate your monthly payment form
    Then monthly payment input box should be populated

  Scenario Outline: Navigate to View Details page and populate the input boxes on Estimate payment form - positive test
    When User populates "<amount1>" in the less down payment input box
    And User populates "<amount2>" in the less trade-in input box
    And User clicks Calculate button
    Then monthly payment should be calculated
    Examples:

      | amount1 | amount2 |
      | 10      | 300     |
      | 2000    | 3       |

  Scenario: Navigate to View Details page and populate the input boxes on Estimate payment form - negative test
    When User populates "200" in the less down payment input box
    And User populates "-100" in the less trade-in input box
    And User clicks Calculate button
    Then Error dialog should be displayed
