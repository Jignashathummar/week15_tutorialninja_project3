@regression
Feature: My Account Test

  @author_Jignasha @sanity
  Scenario: Verify User Should Navigate To Register Page Successfully
    Given User is on HomePage
    When Click on My Account Link.
    And Call the method selectMyAccountOptions method and pass the parameter "Register"
    Then Verify the text Account "Register Account"

  @author_Jignasha @smoke @sanity
  Scenario: Verify User Should Navigate To LoginPage Successfully
    Given User is on HomePage
    When Click on My Account Link.
    And Call the method selectMyAccountOptions method and pass the parameter "Login"
    Then Verify the text Account "Returning Customer"

  @author_Jignasha
  Scenario: Verify That User Register Account Successfully
    Given User is on HomePage
    When Click on My Account Link.
    And Call the method selectMyAccountOptions method and pass the parameter "Register"
    And User enter First Name
    And User enter Last Name
    And User enter Email
    And User enter Telephone
    And User enter Password
    And User enter Confirm Password
    And User select Subscribe "Yes" radio button
    And User click on Privacy Policy check box
    And User click on Continue button for registration
    And Verify "Your Account Has Been Created!" this text
    And User click on Continue button
    And User click on My Account Link.
    And Call the method selectMyAccountOptions method and pass the parameter "Logout"
    And Verify the text after logout "Account Logout"
    And User click on Continue button

  Scenario: Verify That User Should Login And Logout
    Given User is on HomePage
    When Click on My Account Link.
    And Call the method selectMyAccountOptions method and pass the parameter "Login"
    And User Enter Email address "primeXAOI@gmail.com"
    And User enter Password "test123"
    And User Click on Login button
    And Verify text "My Account"
    And User click on My Account Link.
    And Call the method selectMyAccountOptions method and pass the parameter "Logout"
    And Verify the text after logout "Account Logout"
    And User click on Continue button

