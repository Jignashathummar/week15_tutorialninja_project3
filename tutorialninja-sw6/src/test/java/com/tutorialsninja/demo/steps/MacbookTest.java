package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.LaptopAndNotebookPage;
import com.tutorialsninja.demo.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class MacbookTest {
    List<Double> defaultPrice;
    SoftAssert softAssert = new SoftAssert();

    @Given("Mouse hover{string} Tab and click")
    public void mouseHoverTabAndClick(String tab) {
        new HomePage().getTopMenuList(tab);
    }

    @When("Click on the{string}")
    public void clickOnThe(String showAll) {
        new HomePage().setClickOnShowAll(showAll);
    }

    @And("select Sort By {string}")
    public void selectSortBy(String sortBy) {
        defaultPrice = new LaptopAndNotebookPage().getProductPrice();
        new LaptopAndNotebookPage().selectSortByHightoLow(sortBy);
    }


    @And("Select Product {string}")
    public void selectProduct(String product) {
        new ProductPage().selectProductByName(product);
    }
    @And("Verify the Text {string}")
    public void verifyTheText(String macbookText) {
        Assert.assertEquals(new ProductPage().getProductText(),macbookText,"Product mackbook is not found.");
    }

    @And("Click on {string} button")
    public void clickOnButton(String addToCart) {
        new ProductPage().clickOnAddToCartButton(addToCart);
    }

    @And("Verify message {string}")
    public void verifyMessage(String addMsg) {
        new ProductPage().getProductAddedSuccessMessage(addMsg);
    }
    @And("Click on link {string} display into success message")
    public void clickOnLinkDisplayIntoSuccessMessage(String shoppingcartlink) {
        new ProductPage().clickOnShoppingCartLinkIntoMessage(shoppingcartlink);
    }

    @And("Verify the {string}")
    public void verifyThe(String shoppingcartText) {
        new ProductPage().getShoppingCartText(shoppingcartText);
    }

    @And("Verify the Product-name {string}")
    public void verifyTheProductName(String macbookText) {
        Assert.assertEquals(new ProductPage().getProductText(),macbookText,"Product mackbook is not found.");
    }

    @And("Change Quantity {string}")
    public void changeQuantity(String qty) {
        new ProductPage().changeQuantity(qty);
    }

    @And("Click {string} Tab")
    public void clickTab(String quantityButton) {
        new ProductPage().clickOnQtyUpdateButton(quantityButton);
    }

    @And("Verify the message {string}")
    public void verifyTheMessage(String successModified) {
        Assert.assertEquals(new ProductPage().getSuccessModifiedMessage().substring(0,successModified.length()),successModified,"Success Modified is not dispayed");
    }

    @And("Verify the Total {string}")
    public void verifyTheTotal(String totalVerify) {
        Assert.assertEquals(new ProductPage().getTotal().substring(0,totalVerify.length()),totalVerify,"Total not matched");
        //softAssert.assertAll();
    }
    @And("Click {string} button")
    public void clickButton(String checkout) {
        new ProductPage().clickCheckout(checkout);
    }
    @And("Verify {string} text")
    public void verifyText(String checkoutTex) {
        Assert.assertEquals(new ProductPage().getCheckoutText(),checkoutTex,"Checkout text not match");
    }
    @And("Verify the {string} text for new customer")
    public void verifyTheTextForNewCustomer(String newCustomer) {
        Assert.assertEquals(new ProductPage().getNewCustomerText(),newCustomer,"error msg");
    }
    @And("Click on {string} radio button")
    public void clickOnRadioButton(String guest) {
        new ProductPage().clickOnGuestCheckoutButton();
    }

    @And("Click on {string} tab")
    public void clickOnTab(String btn) {
        new ProductPage().clickOnContinueButton();
    }

    @And("Fill the mandatory fields")
    public void fillTheMandatoryFields() {
        new ProductPage().enterFirstname();
        new ProductPage().enterLastName();
        new ProductPage().enterEmail();
        new ProductPage().enterTelephone();
        new ProductPage().enterAddress();
        new ProductPage().enterCity();
        new ProductPage().enterPostcode();
        new ProductPage().enterCountry();
        new ProductPage().enterState();
    }

    @And("Click{string} Button field")
    public void clickButtonField(String btn) {
        new ProductPage().clickContinueButtonguest();
    }

    @And("Add Comments About your order into text area")
    public void addCommentsAboutYourOrderIntoTextArea() {
        new ProductPage().enterCommentInTextAea();
    }

    @And("Check the Terms & Conditions check box")
    public void checkTheTermsConditionsCheckBox() {
        new ProductPage().checkTermsAndCondtionCheckBox();
    }

    @And("Click {string} button fields and click")
    public void clickButtonFieldsAndClick(String continues) {
        new ProductPage().clickContinueButtonpayment();
    }

    @Then("Verify {string}")
    public void verify(String warning) {
        Assert.assertEquals(new ProductPage().GetWarningMessageText().substring(0,warning.length()),warning, "not verified");
    }
}