package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class LaptopAndNotebookPage extends Utility {
   private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//p[@class ='price']")
    List<WebElement> productsPrices;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortBy;

    public List<Double> getProductPrice() {
        List<Double> listOfProducts = new ArrayList<>();
        for (WebElement product : productsPrices) {
            String[] arr =product.getText().split("Ex Tax:");
            listOfProducts.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
            log.info("List of product:"+productsPrices.toString());
        }
        return listOfProducts;
    }
    public void selectSortByHightoLow(String option) {
        log.info("sorting High to low"+sortBy.toString());
        selectByVisibleTextFromDropDown(sortBy, option);
    }

}
