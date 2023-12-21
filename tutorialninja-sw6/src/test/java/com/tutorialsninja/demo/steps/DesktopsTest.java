package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.AddToCartPage;
import com.tutorialsninja.demo.pages.DeskTopsPage;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsTest {
    List<String> defaultproduct = new ArrayList<>();

    @Given("I am On Homepage")
    public void iAmOnHomepage() {
    }
    @When("Mouse hover on {string} Tab and click")
    public void mouseHoverOnTabAndClick(String menuTab) {
        new HomePage().getTopMenuList(menuTab);
    }

    @And("Click on {string}")
    public void clickOn(String shawAll) {
        new HomePage().setClickOnShowAll(shawAll);
    }

    @And("Select Sort By position {string}")
    public void selectSortByPosition(String sortBy) {
        defaultproduct = new DeskTopsPage().getProductList();
        new DeskTopsPage().selectSortByZToA(sortBy);
    }

    @Then("Verify the Product will arrange in Descending order")
    public void verifyTheProductWillArrangeInDescendingOrder() {
        Collections.reverse(defaultproduct);
        List<String> afterProductList = new DeskTopsPage().getProductList();
        Assert.assertEquals(afterProductList, defaultproduct);
    }

    @When("Mouse hover on Currency Dropdown and click")
    public void mouseHoverOnCurrencyDropdownAndClick() {
        new DeskTopsPage().clickOnCurrencyDropDown();

    }

    @And("Mouse hover on £Pound Sterling and click")
    public void mouseHoverOn£PoundSterlingAndClick() {
        new DeskTopsPage().clickOnPoundSterling();
    }

//    @And("Mouse hover on {string} Tab.")
//    public void mouseHoverOnTab(String tab) {
//        new HomePage().getTopMenuList(tab);
//    }

    @And("Select product {string}")
    public void selectProduct(String productName) {
        new DeskTopsPage().clickOnProduct(productName);
    }

    @And("Verify the product Text {string}")
    public void verifyTheText(String product) {
        Assert.assertEquals(new ProductPage().getProductWelcomeText(), product, "Verify ProductName");
    }

    @And("Enter Qty {string} using Select class.")
    public void enterQtyUsingSelectClass(String quantity) {
        new ProductPage().enterQuantity(quantity);
    }

    @And("Click on Add to Cart button")
    public void clickOnAddToCartButton() {
        new ProductPage().clickOnAddToCart();
    }

    @And("Verify the Message Success: You have added {string} to your shopping cart!")
    public void verifyTheMessageSuccessYouHaveAddedToYourShoppingCart(String successMessageForAddToCart) {
        String expectedSuccessMessage = "Success: You have added " + successMessageForAddToCart + " to your shopping cart!\n×";
        Assert.assertEquals(new ProductPage().getSuccessMessage(), expectedSuccessMessage, "Product not added to cart");

    }

    @And("Click on link shopping cart display into success message")
    public void clickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        new ProductPage().clickOnShoppingCart();
    }

    @And("Verify the text to {string}")
    public void verifyTheTextTo(String shoppingCart) {
        Assert.assertEquals(new AddToCartPage().getShoppingCartName().substring(0,shoppingCart.length()), shoppingCart, "Not Shopping Cart");
    }

    @And("Verify the Product name {string}")
    public void verifyTheProductName(String productName) {
        Assert.assertEquals(new AddToCartPage().getProductName(), productName, "Product Name not matched");
    }

    @And("Verify the Model {string}")
    public void verifyTheModel(String model) {
        Assert.assertEquals(new AddToCartPage().getModelName(), model, "Model not matched");
    }

    @Then("Verify the price Total {string}")
    public void verifyTheTotal(String totalPrice) {
        Assert.assertEquals(new AddToCartPage().getProductPrice(), totalPrice, "Total not matched");
    }


}