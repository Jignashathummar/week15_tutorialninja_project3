package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.LaptopAndNotebookPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Collections;
import java.util.List;

public class LaptopAndNotebookTest {
    List<Double> defaultPrice;

    @Given("Mouse hover {string} Tab and click")
    public void mouseHoverTabAndClick(String tab) {
        new HomePage().getTopMenuList(tab);
    }

    @When("Click on the {string}")
    public void clickOnThe(String showAll) {
        new HomePage().setClickOnShowAll(showAll);
    }

    @And("Select Sort By {string}")
    public void selectSortBy(String sortBy) {
        defaultPrice = new LaptopAndNotebookPage().getProductPrice();
        new LaptopAndNotebookPage().selectSortByHightoLow(sortBy);

    }

    @Then("Verify the Product price will arrange in High to Low order")
    public void verifyTheProductPriceWillArrangeInHighToLowOrder() {
        Collections.sort(defaultPrice,Collections.reverseOrder());
       List<Double> afterProductList = new LaptopAndNotebookPage().getProductPrice();
        Assert.assertEquals(afterProductList, defaultPrice);
    }


}
