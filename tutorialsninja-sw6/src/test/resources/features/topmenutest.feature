Feature: Top menu Test

  Scenario: verifyUserShouldNavigateToDesktopsPageSuccessfully
    Given Mouse hover on Tab and click "Desktops"
    When selectMenu method and pass the menu "Show AllDesktops"
    Then Verify the text "Desktops"

  Scenario: verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully
    Given Mouse hover on Tab and click "Laptops & Notebooks"
    When  selectMenu method and pass the menu "Show AllLaptops & Notebooks"
    Then Verify the text "Laptops & Notebooks"

  Scenario: verifyUserShouldNavigateToComponentsPageSuccessfully
    Given Mouse hover on Tab and click "Components"
    When selectMenu method and pass the menu "Show AllComponents"
    Then Verify the text "Components"
