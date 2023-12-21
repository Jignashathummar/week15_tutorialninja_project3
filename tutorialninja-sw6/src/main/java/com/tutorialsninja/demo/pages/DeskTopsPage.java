package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class DeskTopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h4/a")
    List<WebElement> productList;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement selectSortBy;
    @CacheLookup
    @FindBy(xpath = "(//button[@class='btn btn-link dropdown-toggle'])[1]")
    WebElement currencyDropdown;

    @CacheLookup
    @FindBy(name = "GBP")
    WebElement poundSterling;

    public List<String> getProductList() {
        List<String> listOfProducts = new ArrayList<>();
        for (WebElement product : productList) {
            listOfProducts.add(product.getText());
            log.info("List Of Products : " + listOfProducts.toString());
        }
        return listOfProducts;
    }

    public void selectSortByZToA(String sortBy) {
        selectByVisibleTextFromDropDown(selectSortBy, sortBy);
        log.info("Select sort by Z to A: " + selectSortBy.toString());

    }
    public void clickOnCurrencyDropDown(){
        clickOnElement(currencyDropdown);
        log.info("click On Currency DropDown : " + currencyDropdown.toString());

    }

    public void clickOnPoundSterling(){
        log.info("Click On Pound Sterling : " + poundSterling.toString());
        clickOnElement(poundSterling);
    }

    public void clickOnProduct(String productName){
        for (WebElement product: productList){
            if (product.getText().contains(productName)){
                clickOnElement(product);
                log.info("List Of Product : " + product.toString());
                break;
            }
        }
    }
}
