package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[3]")
    WebElement modelName;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement totalPrice;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping Cart')]")
    WebElement shoppingCartHeading;

    public String getShoppingCartName(){
        log.info("Shopping cart heading" + shoppingCartHeading.toString());
        return getTextFromElement(shoppingCartHeading);
    }
    public String getProductName(){
        log.info("Product name : " + productName.toString());
        return getTextFromElement(productName);
    }
    public String getModelName(){
        log.info("Model name: " + modelName.toString());
        return getTextFromElement(modelName);
    }
    public String getProductPrice(){
        log.info("Total Price: " + totalPrice.toString());
        return getTextFromElement(totalPrice);
    }
}
