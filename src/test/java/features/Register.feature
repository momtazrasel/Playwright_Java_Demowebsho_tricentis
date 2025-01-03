Feature: Register Functionalities

  Scenario: Access the Register page
    When the user navigates to the register link
    And fill up all the register values
    And click on the register button
    Then verify that the registration is completed

  Scenario: Valid Login Functionalities
    Given the user navigates to the login page and click login link
    When the user enters valid credentials
    And clicks on the login button