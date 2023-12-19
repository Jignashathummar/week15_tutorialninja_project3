@regression
Feature:verifyProductsPriceDisplayHighToLowSuccessfully

  @author_Jignasha @sanity @smoke
  Scenario:verifyProductsPriceDisplayHighToLowSuccessfully
    Given Mouse hover "Laptops & Notebooks" Tab and click
    When Click on the "Show AllLaptops & Notebooks"
    And Select Sort By "Price (High > Low)"
    Then Verify the Product price will arrange in High to Low order





