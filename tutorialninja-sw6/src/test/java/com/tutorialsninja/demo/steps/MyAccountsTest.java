package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.AccountPage;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.LoginPage;
import com.tutorialsninja.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyAccountsTest {
    @Given("User is on HomePage")
    public void userIsOnHomePage() {
    }

    @When("Click on My Account Link.")
    public void clickOnMyAccountLink() {
        new HomePage().clickOnMyAccount();
    }

    @And("Call the method selectMyAccountOptions method and pass the parameter {string}")
    public void callTheMethodSelectMyAccountOptionsMethodAndPassTheParameter(String register) {
        new HomePage().clickOnMyAccountDropDownList(register);
    }

    @And("User enter First Name")
    public void userEnterFirstName() {
        new RegisterPage().enterFirstName();
    }

    @And("User enter Last Name")
    public void userEnterLastName() {
        new RegisterPage().enterLastName();
    }

    @And("User enter Email")
    public void userEnterEmail() {
        new RegisterPage().enterEmail();
    }

    @And("User enter Telephone")
    public void userEnterTelephone() {
        new RegisterPage().enterTelephone();
    }

    @And("User enter Password")
    public void userEnterPassword() {
        new RegisterPage().enterPassword();
    }

    @And("User enter Confirm Password")
    public void userEnterConfirmPassword() {
        new RegisterPage().enterConfirmPassword();
    }

    @And("User select Subscribe {string} radio button")
    public void userSelectSubscribeYesRadioButton(String text) {
        new RegisterPage().selectSubscribe(text);
    }

    @And("User click on Privacy Policy check box")
    public void userClickOnPrivacyPolicyCheckBox() {
        new RegisterPage().clickOnPolicyCheckBox();
    }
    @And("User click on Continue button for registration")
    public void userClickOnContinueButtonForRegistration() {
        new RegisterPage().clickOnContinueBtn();
    }

    @And("Verify {string} this text")
    public void verifyThisText(String expectedMsg) {
        Assert.assertEquals(new RegisterPage().getRegistrationSuccessMsg(), expectedMsg);
    }

    @And("User click on Continue button")
    public void userClickOnContinueButton() {
        new RegisterPage().clickOnContinueBtnAfterRegistration();
    }

    @And("User click on My Account Link.")
    public void userClickOnMyAccountLink() {
        new HomePage().clickOnMyAccount();
    }

    @And("Verify the text after logout {string}")
    public void verifyTheTextAfterLogout(String expectedText) {
        Assert.assertEquals(new HomePage().getLogoutSuccessMsg(), expectedText, "Not logged out");
    }

    @And("User Enter Email address {string}")
    public void userEnterEmailAddress(String email) {
        new LoginPage().enterEmail(email);
    }

    @And("User enter Password {string}")
    public void userEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("User Click on Login button")
    public void userClickOnLoginButton() {
        new LoginPage().clickOnLoginBtn();
    }

    @And("Verify text {string}")
    public void verifyText(String expectedText) {
        Assert.assertEquals(new AccountPage().getAccountWelcomeText(), expectedText, "User not logged in");
    }
    @Then("Verify the text Account {string}")
    public void verifyTheTextAccount(String expectedText) {
        if(expectedText.equals("Register Account")){
            Assert.assertEquals(new RegisterPage().getRegisterPageWelcomeText(), expectedText, "Register page not displayed");
        }else{
            Assert.assertEquals(new LoginPage().getLoginWelcomeText(), expectedText, "Login page not displayed");
        }
    }

}
