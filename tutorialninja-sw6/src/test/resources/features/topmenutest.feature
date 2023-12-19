@regression
Feature: Top menu Test

  @author_Jignasha @sanity
  Scenario: verifyUserShouldNavigateToDesktopsPageSuccessfully
    Given Mouse hover on Tab and click "Desktops"
    When selectMenu method and pass the menu "Show AllDesktops"
    Then Verify the text "Desktops"

  @author_Jignasha @smoke @sanity
  Scenario: verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully
    Given Mouse hover on Tab and click "Laptops & Notebooks"
    When  selectMenu method and pass the menu "Show AllLaptops & Notebooks"
    Then Verify the text "Laptops & Notebooks"

  @author_Jignasha
  Scenario: verifyUserShouldNavigateToComponentsPageSuccessfully
    Given Mouse hover on Tab and click "Components"
    When selectMenu method and pass the menu "Show AllComponents"
    Then Verify the text "Components"
