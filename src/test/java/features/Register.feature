Feature: Register Functionalities

  Background:
    Given the user navigates to the home page and click on the register link
    When the user enters valid credentials
    And clicks on the login button
    Then the user should be redirected to the dashboard

  Scenario: Access the Register page
    When the user navigates to the finance page
    Then the finance page should display correct information