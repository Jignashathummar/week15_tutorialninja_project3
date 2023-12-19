package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class DesksTopPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h4/a")
    List<WebElement> productList;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement selectSortBy;
    List<String> defaultproduct;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortBy;

    public List<String> getProductList() {
        List<String> listOfProducts = new ArrayList<>();
        for (WebElement product : productList) {
            listOfProducts.add(product.getText());
            log.info("List of ProductList: " + productList.toString());
        }
        return listOfProducts;
    }

    public void selectSortByZToA(String option) {
        selectByVisibleTextFromDropDown(sortBy, option);
    }
}
