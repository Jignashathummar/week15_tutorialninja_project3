@regression
Feature: verifyProductArrangeInAlphabeticalOrder

  @author_Jignasha @sanity @smoke
  Scenario: verify Product Arrange In Alphabetical Order
    Given I am On Homepage
    When Mouse hover on "Desktops" Tab and click
    And Click on "Show AllDesktops"
    And Select Sort By position "Name (Z - A)"
    Then Verify the Product will arrange in Descending order

  @author_Jignasha @sanity
  Scenario Outline: Verify Product Added To Shopping Cart SuccessFully
    Given I am On Homepage
    When Mouse hover on Currency Dropdown and click
    And Mouse hover on £Pound Sterling and click
    And Mouse hover on "Desktops" Tab and click
    And Click on "Show AllDesktops"
    And Select Sort By position "Name (A - Z)"
    And Select product "<product>"
    And Verify the product Text "<product>"
    And Enter Qty "1" using Select class.
    And Click on Add to Cart button
    And Verify the Message Success: You have added "<product>" to your shopping cart!
    And Click on link shopping cart display into success message
    And Verify the text to "Shopping Cart"
    And Verify the Product name "<product>"
    And Verify the Model "<model>"
    Then Verify the price Total "<price>"
    Examples:
      | product      | model     | price  |
      | HTC Touch HD | Product 1 | £74.73 |
#      | iPhone       | Product 11 | £75.46  |
#      | iPod Classic | Product 20 | £74.73  |
#      | MacBook      | Product 16 | £368.73 |
#      | MacBook Air  | Product 17 | £736.23 |
#      | Sony VAIO    | Product 19 | £736.23 |
