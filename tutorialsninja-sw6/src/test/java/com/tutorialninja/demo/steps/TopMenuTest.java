package com.tutorialninja.demo.steps;

import com.tutorialninja.demo.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TopMenuTest {
    @Given("Mouse hover on Tab and click {string}")
    public void mouseHoverOnTabAndClick(String tab) {
        new HomePage().getTopMenuList(tab);
    }

    @When("selectMenu method and pass the menu {string}")
    public void selectmenuMethodAndPassTheMenu(String showAll) {
        new HomePage().setClickOnShowAll(showAll);
    }

    @Then("Verify the text {string}")
    public void verifyTheText(String text) {
        Assert.assertEquals(new HomePage().verifyTextMessage(),text,"error msg");
    }


}
