@regression
Feature: verifyThatUserPlaceOrderSuccessfully

  @author_Jignasha @sanity @smoke
  Scenario: verifyThatUserPlaceOrderSuccessfully

    Given Mouse hover"Laptops & Notebooks" Tab and click
    When Click on the"Show AllLaptops & Notebooks"
    And select Sort By "Price (High > Low)"
    And Select Product "MacBook"
    And Verify the Text "MacBook"
    And Click on "Add To Cart" button
    And Verify message "Success: You have added MacBook to your shopping cart!"
    And Click on link "shopping cart" display into success message
    And Verify the "Shopping Cart"
    And Verify the Product-name "MacBook"
    And Change Quantity "2"
    And Click "Update" Tab
    And Verify the message "Success: You have modified your shopping cart!"
  #  And Verify the Total "£737.45"
    And Click "Checkout" button
    And Verify "Checkout" text
    And Verify the "New Customer" text for new customer
    And Click on "Guest Checkout" radio button
    And Click on "Continue" tab
    And Fill the mandatory fields
    And Click"Continue" Button field
    And Add Comments About your order into text area
    And Check the Terms & Conditions check box
    And Click "Continue" button fields and click
    Then Verify "Warning: Payment method required!"