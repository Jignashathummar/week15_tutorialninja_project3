package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h1")
    WebElement registerPageWelcomeText;

    @CacheLookup
    @FindBy(name = "firstname")
    WebElement firestNameField;

    @CacheLookup
    @FindBy(name = "lastname")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(name = "email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "telephone")
    WebElement telephoneField;

    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(name = "confirm")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(xpath = "//label[@class='radio-inline']")
    List<WebElement> subscribeField;

    @CacheLookup
    @FindBy(name = "agree")
    WebElement policyCheckBox;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueBtn;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement registrationSuccessMsg;

    @CacheLookup
    @FindBy(linkText = "Continue")
    WebElement continueBtnAfterRegistration;

    public String getRegisterPageWelcomeText(){
        log.info("Verify text RegisterPAge Welcome Text: " + registerPageWelcomeText.toString());
        return getTextFromElement(registerPageWelcomeText);
    }

    public void enterFirstName(){
        sendTextToElement(firestNameField, "james");
        log.info("Enter FirstName: " + firestNameField.toString());
    }

    public void enterLastName(){
        sendTextToElement(lastNameField, "Bond");
        log.info("Enter Lastname: " + lastNameField.toString());
    }

    public void enterEmail(){
        String email = "prime" + getAlphaNumericString(4) + "@gmail.com";
        sendTextToElement(emailField, email);
        log.info("Enter Email : " + emailField.toString());
    }

    public void enterTelephone(){
        sendTextToElement(telephoneField, "07988112233");
        log.info("Enter Telephone: " + telephoneField.toString());
    }

    public void enterPassword(){
        sendTextToElement(passwordField, "test123");
        log.info("Enter Password: " + passwordField.toString());
    }

    public void enterConfirmPassword(){
        sendTextToElement(confirmPasswordField, "test123");
        log.info("Enter Confirm Password: " + confirmPasswordField.toString());
    }

    public void selectSubscribe(String text){
        for (WebElement element : subscribeField) {
            System.out.println(element.getText());
            if (element.getText().contains(text)) {
                element.click();
                log.info("select the field of subscribe: " + subscribeField.toString());
                break;
            }
        }
    }

    public void clickOnPolicyCheckBox(){
        clickOnElement(policyCheckBox);
        log.info("Click on Policy Checkbox " + policyCheckBox.toString());
    }

    public void clickOnContinueBtn(){
        clickOnElement(continueBtn);
        log.info("Click on Continue Button: " + continueBtn.toString());
    }
    public String getRegistrationSuccessMsg(){
        log.info("Verify text Register Success Message: " + registrationSuccessMsg.toString());
        return getTextFromElement(registrationSuccessMsg);
    }
    public void clickOnContinueBtnAfterRegistration(){
        clickOnElement(continueBtnAfterRegistration);
        log.info("click on Continue Button after Registration: " + continueBtnAfterRegistration.toString());
    }
}
