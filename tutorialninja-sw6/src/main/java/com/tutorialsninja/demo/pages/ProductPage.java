package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h4/a")
    List<WebElement> productList;

    @CacheLookup
    @FindBy(css = "div[id='content'] h1")
    WebElement productWelcomeText;

    @CacheLookup
    @FindBy(linkText = "MacBook")
    WebElement productText;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(css = "body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible")
    WebElement successMessage;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCartLink;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//input[contains(@name, 'quantity')]")
    WebElement qtyField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(@data-original-title, 'Update')]")
    WebElement qtyUpdateBtn;

    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-cart']/div[1]")
    WebElement successModifiedMessage;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement total;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Checkout')]")
    WebElement checkoutLink;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Checkout')]")
    WebElement checkoutText;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'New Customer')]")
    WebElement newCustomerText;

    @CacheLookup
    @FindBy(xpath = "//input[@value='guest']")
    WebElement guestCheckoutButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-account']")
    WebElement continueLink;

    @CacheLookup
    @FindBy(xpath = "//p[@class ='price']")
    List<WebElement> priceList;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-firstname']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-lastname']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-telephone']")
    WebElement telephone;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-address-1']")
    WebElement address;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-city']")
    WebElement city;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-postcode']")
    WebElement postcode;
    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-country']")
    WebElement country;
    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-zone']")
    WebElement state;
    @CacheLookup
    @FindBy(xpath = "//input[@id='button-guest']")
    WebElement continueButtonguest;
    @CacheLookup
    @FindBy(name = "agree")
    WebElement termsandCondition;
    @CacheLookup
    @FindBy(xpath = "//input[@id='button-payment-method']")
    WebElement continueButtonpayment;
    @CacheLookup
    @FindBy(xpath = "//div[text()='Warning: Payment method required!']")
    WebElement warningMessageText;
    @CacheLookup
    @FindBy(tagName = "textarea")
    WebElement textArea;

    @CacheLookup
    @FindBy(id = "button-cart")
    WebElement addToCart;

    @CacheLookup
    @FindBy(id = "input-quantity")
    WebElement quantity;

    @CacheLookup
    @FindBy(css = ".alert.alert-success.alert-dismissible")
    WebElement alertSuccessMessage;


    @CacheLookup
    @FindBy(linkText = "shopping cart")
    WebElement shoppingCart;

    public void selectProductByName(String product) {
        //  List<WebElement> products = new ArrayList<>();
        for (WebElement e : productList) {
            if (e.getText().equals(product)) {
                e.click();
                log.info("Product by name:" + productList);
                break;
            }
        }
    }

    public void enterQuantity(String quantitySize){
        quantity.clear();
        sendTextToElement(quantity,quantitySize);
        log.info("Enter Quantity : " + quantity.toString());

    }

    public String getProductText() {
        log.info("Macbook Text verified:" + productText);
        return getTextFromElement(productText);
    }

    public void clickOnAddToCartButton(String addToCart) {
        log.info("Add to cart button:" + addToCartButton);
        clickOnElement(addToCartButton);
    }

    public String getProductAddedSuccessMessage(String addMsg) {
        log.info("product sucess msg:" + successMessage);
        return getTextFromElement(successMessage);
    }

    public String getProductWelcomeText(){
        log.info("Verify Product name : " + productWelcomeText.toString());
        return getTextFromElement(productWelcomeText);
    }

    public void clickOnShoppingCartLinkIntoMessage(String shoppingcartlink) {
        log.info("Shopping cart link click:" + shoppingCartLink);
        clickOnElement(shoppingCartLink);
    }

    public String getShoppingCartText(String shoppingcartText) {
        log.info("Shopping cart Text verified:" + shoppingCartLink);
        return getTextFromElement(shoppingCartText);
    }

    public void clickOnAddToCart(){
        clickOnElement(addToCart);
        log.info("Click on Add TO cart : " + addToCart.toString());

    }

    public void changeQuantity(String qty) {
        log.info("Quantity:" + qtyField);
        sendTextToElement(qtyField, qty);
    }

    public void clickOnQtyUpdateButton(String quantityButton) {
        log.info("Click Update btn" + qtyUpdateBtn);
        clickOnElement(qtyUpdateBtn);
    }

    public String getSuccessModifiedMessage() {
        log.info("Success modified msg:" + successModifiedMessage);
        return getTextFromElement(successModifiedMessage);
    }

    public String getTotal() {
        log.info("get Total:" + total);
        return getTextFromElement(total);
    }

    public void clickCheckout(String checkout) {
        log.info("Checkout button click:" + checkoutLink);
        clickOnElement(checkoutLink);
    }

    public String getCheckoutText() {
        log.info("Checkout Text verified" + checkoutText);
        return getTextFromElement(checkoutText);
    }

    public String getSuccessMessage(){
        log.info("Verify Success Message : " + alertSuccessMessage.toString());
        return getTextFromElement(alertSuccessMessage);
    }

    public String getNewCustomerText() {
        log.info("Checkout get new customer:" + newCustomerText);
        return getTextFromElement(newCustomerText);
    }

    public void clickOnGuestCheckoutButton() {
        log.info("guest :" + guestCheckoutButton);
        clickOnElement(guestCheckoutButton);
    }

    public void clickOnContinueButton() {
        log.info("Continue button:" + continueLink);
        clickOnElement(continueLink);
    }


    public void enterFirstname() {
        log.info("enter First Name:" + firstName);
        sendTextToElement(firstName, "William");
    }

    public void enterLastName() {
        log.info("enter lastname:" + lastName);
        sendTextToElement(lastName, "Brooks");
    }

    public void enterEmail() {
        log.info("enter emailid:" + email);
        sendTextToElement(email, "brooks123@gmail.com");
    }

    public void enterTelephone() {
        log.info("enter Telephone:" + lastName);
        sendTextToElement(telephone, "8765123098");
    }

    public void enterAddress() {
        log.info("enter Address:" + address);
        sendTextToElement(address, "Watford Road");
    }

    public void enterCity() {
        log.info("enter city:" + city);
        sendTextToElement(city, "London");
    }

    public void enterPostcode() {
        log.info("enter city:" + postcode);
        sendTextToElement(postcode, "Ha5tyu");
    }

    public void enterCountry() {
        log.info("enter city:" + country);
        sendTextToElement(country, "United Kingdom");
    }

    public void enterState() {
        log.info("enter city:" + state);
        sendTextToElement(state, "Harrow");
    }

    public void clickContinueButtonguest() {
        log.info("Click continue button:" + continueButtonguest);
        clickOnElement(continueButtonguest);
    }

    public void enterCommentInTextAea() {
        log.info("enter comment in Text Area:" + textArea);
        sendTextToElement(textArea, "Thank You!");
    }

    public void checkTermsAndCondtionCheckBox() {
        log.info("Condition checkbox:" + termsandCondition);
        clickOnElement(termsandCondition);
    }

    public void clickContinueButtonpayment() {
        log.info("Continue button payment" + continueButtonpayment);
        clickOnElement(continueButtonpayment);
    }

    public String GetWarningMessageText() {
        log.info("Warning Message Text:" + warningMessageText);
        return getTextFromElement(warningMessageText);
    }

    public void clickOnShoppingCart(){
        clickOnElement(shoppingCart);
        log.info("Click on Shopping cart : " + shoppingCart.toString());
    }
}
