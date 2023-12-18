package com.tutorialninja.demo.pages;

import com.tutorialninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class DesksTopPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h4/a")
    List<WebElement> productList;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement selectSortBy;

    public List<String> getProductList() {
        List<String> listOfProducts = new ArrayList<>();
        for (WebElement product : productList) {
            listOfProducts.add(product.getText());
           // log.info("Clicking on login link : " + listOfProducts.toString());
        }
//        System.out.println(listOfProducts);
        return listOfProducts;
    }

    public void selectSortByZToA(String sortBy) {
        selectByVisibleTextFromDropDown(selectSortBy, sortBy);
    }
}
