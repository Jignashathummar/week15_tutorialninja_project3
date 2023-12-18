Feature: verifyProductArrangeInAlphaBaticalOrder

  Scenario: verify Product Arrange In AlphaBatical Order
    Given I am on Desktops page
    When Mouse hover on "Desktops" Tab and click
    And Click on "Show AllDesktops"
    And Select Sort By position "Name (Z - A)"
    Then Verify the Product will arrange in Descending order