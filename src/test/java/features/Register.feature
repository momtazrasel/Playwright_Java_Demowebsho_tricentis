Feature: Register Functionalities

  @Test_001
  Scenario: Access the Register page
    When the user navigates to the register link
    And fill up all the register values
    And click on the register button
    Then verify that the registration is completed

  @Test_002
  Scenario: Verify Successful Login with Valid Credentials
    Given the user navigates to the login page and click login link
    When the user enters valid credentials
    And clicks on the login button

  @Test_003
  Scenario: Verify Error Message for Invalid Login Credentials
    Given the user navigates to the login page and click login link
    When the user enters invalid credentials
    And clicks on the login button
    Then verify that the credentials are invalid

  @Test_004
  Scenario: Verify Product Search Functionality
    Given enter a product name in the search bar
    And clicks on the search button
    Then verify that the products is displayed

  @Test_005
  Scenario: Verify Adding a Product to the Cart
    Given enter a product name in the search bar
    And clicks on the search button
    Then verify that the products is displayed
    When Click Add to Cart

  @Test_006
  Scenario: Verify Updating Cart Quantity
    Given enter a product name in the search bar
    And clicks on the search button
    Then verify that the products is displayed
    When Click Add to Cart
    And CLick on shopping cart link
    And Update the product quantities

  @Test_007
  Scenario: Verify Removing a Product from the Cart
    Given enter a product name in the search bar
    And clicks on the search button
    Then verify that the products is displayed
    When Click Add to Cart
    And CLick on shopping cart link
    And Remove the product quantities

  @Test_008
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

  @Test_009
  Scenario: Verify Guest Checkout Functionality
    Given enter a product name in the search bar
    And clicks on the search button
    Then verify that the products is displayed
    When Click Add to Cart
    And CLick on shopping cart link
    And click on the agree checkbox and checkout button
    And click on the guest checkout button
    And enter guest billing address

  @Test_010
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

  @Test_011
  Scenario: Verify Newsletter Subscription
    Given enter email in newsletter text field
    And click on the subscribe button
    Then verify that the user successfully subscribe

  @Test_012
  Scenario: Verify Sorting Products by Price
    Given enter a product name in the search bar
    And clicks on the search button
    Then verify that the products is displayed
    And Select Price Low to High sorting option

  @Test_013
  Scenario: Verify Successful Logout Functionality
    Given the user navigates to the login page and click login link
    When the user enters valid credentials
    And clicks on the login button
    And click on the logout button

  @Test_014
  Scenario: Verify that product successfully send to your friend
    Given enter a product name in the search bar
    And clicks on the search button
    Then verify that the products is displayed
    When click on the displayed product
    And product share with your friends

  @Test_014
  Scenario: Verify that product add and remove from compare list
    Given enter a product name in the search bar
    And clicks on the search button
    Then verify that the products is displayed
    When click on the displayed product
    And product add and remove from compare list


