Feature: Register Functionalities

  Scenario: Access the Register page
    When the user navigates to the register link
    And fill up all the register values
    And click on the register button
    Then verify that the registration is completed

  Scenario: Verify Successful Login with Valid Credentials
    Given the user navigates to the login page and click login link
    When the user enters valid credentials
    And clicks on the login button

  Scenario: Verify Error Message for Invalid Login Credentials
    Given the user navigates to the login page and click login link
    When the user enters invalid credentials
    And clicks on the login button
    Then verify that the credentials are invalid

  Scenario: Verify Product Search Functionality
    Given enter a product name in the search bar
    And clicks on the search button
    Then verify that the credentials are invalid

