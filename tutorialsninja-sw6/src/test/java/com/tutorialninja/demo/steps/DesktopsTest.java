package com.tutorialninja.demo.steps;

import com.tutorialninja.demo.pages.DesksTopPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class DesktopsTest {
    @Given("I am on Desktops page")
    public void iAmOnDesktopsPage() {
        System.out.println("hello");
    }

    @When("Mouse hover on {string} Tab and click")
    public void mouseHoverOnTabAndClick(String arg0) {
    }

    @And("Click on {string}")
    public void clickOn(String arg0) {
    }

    @And("Select Sort By position {string}")
    public void selectSortByPosition(String product) {
        List<String> defaultproduct= new DesksTopPage().getProductList();
        System.out.println(defaultproduct);
    }

    @Then("Verify the Product will arrange in Descending order")
    public void verifyTheProductWillArrangeInDescendingOrder() {
    }
}
