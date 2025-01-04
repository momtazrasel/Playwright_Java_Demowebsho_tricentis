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
    Then verify that the products is displayed

  Scenario: Verify Adding a Product to the Cart
    Given enter a product name in the search bar
    And clicks on the search button
    Then verify that the products is displayed
    When Click Add to Cart

  Scenario: Verify Updating Cart Quantity
    Given enter a product name in the search bar
    And clicks on the search button
    Then verify that the products is displayed
    When Click Add to Cart
    And CLick on shopping cart link
    And Update the product quantities

  Scenario: Verify Removing a Product from the Cart
    Given enter a product name in the search bar
    And clicks on the search button
    Then verify that the products is displayed
    When Click Add to Cart
    And CLick on shopping cart link
    And Remove the product quantities

  Scenario: Verify Successful Checkout Process
    Given enter a product name in the search bar
    And clicks on the search button
    Then verify that the products is displayed
    When Click Add to Cart
    And CLick on shopping cart link
    And click on the agree checkbox and checkout button
    And Login with valid credentials
    And click on the agree checkbox and checkout button
    And enter billing address

  Scenario: Verify Guest Checkout Functionality
    Given enter a product name in the search bar
    And clicks on the search button
    Then verify that the products is displayed
    When Click Add to Cart
    And CLick on shopping cart link
    And click on the agree checkbox and checkout button
    And click on the guest checkout button
    And enter guest billing address

  Scenario: Verify Applying Discount Coupon
    Given enter a product name in the search bar
    And clicks on the search button
    Then verify that the products is displayed
    When Click Add to Cart
    And CLick on shopping cart link
    And apply coupon code
    And click on the agree checkbox and checkout button
    And click on the guest checkout button
    And enter guest billing address

  Scenario: Verify Newsletter Subscription
    Given enter email in newsletter text field
    And click on the subscribe button
    Then verify that the user successfully subscribe

  Scenario: Verify Sorting Products by Price
    Given enter email in newsletter text field
    And click on the subscribe button
    Then verify that the user successfully subscribe

