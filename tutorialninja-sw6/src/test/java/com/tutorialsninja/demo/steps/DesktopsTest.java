package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.DesksTopPage;
import com.tutorialsninja.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Collections;
import java.util.List;

public class DesktopsTest {
    List<String> defaultproduct;
    @Given("I am on Desktops page")
    public void iAmOnDesktopsPage() {
    }

    @When("Mouse hover on {string} Tab and click")
    public void mouseHoverOnTabAndClick(String tab) {
        new HomePage().getTopMenuList(tab);
    }

    @And("Click on {string}")
    public void clickOn(String showAll) {
        new HomePage().setClickOnShowAll(showAll);

    }

    @And("Select Sort By position {string}")
    public void selectSortByPosition(String sortBy) {
        defaultproduct = new DesksTopPage().getProductList();
        new DesksTopPage().selectSortByZToA(sortBy);

    }

    @Then("Verify the Product will arrange in Descending order")
    public void verifyTheProductWillArrangeInDescendingOrder() {
        Collections.reverse(defaultproduct);
        List<String> afterProductList = new DesksTopPage().getProductList();
        Assert.assertEquals(afterProductList, defaultproduct);
    }

}
