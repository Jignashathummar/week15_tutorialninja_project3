package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccount;

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopLink;

    @CacheLookup
    @FindBy(xpath = "//nav[@id='menu']//ul[@class='nav navbar-nav']/li")
    List<WebElement> topMenuList;

    @CacheLookup
    @FindBy(linkText = "Show AllDesktops")
    WebElement showAllDesktop;

    @CacheLookup
    @FindBy(linkText = "Show AllLaptops & Notebooks")
    WebElement showAllLaptopsAndNotebooks;

    @CacheLookup
    @FindBy(linkText = "Show AllComponents")
    WebElement showAllComponents;

    @CacheLookup
    @FindBy(linkText = "Show AllMP3Players")
    WebElement showAllMP3Players;

    @CacheLookup
    @FindBy(tagName = "h2")
    WebElement textVerified;
    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement register;

    public void setClickOnShowAll(String showAll) {
        switch (showAll) {
            case "Show AllDesktops":
                clickOnElement(showAllDesktop);
                break;
            case "Show AllLaptops & Notebooks":
                clickOnElement(showAllLaptopsAndNotebooks);
                break;
            case "Show AllComponents":
                clickOnElement(showAllComponents);
                break;
            case "Show AllMP3Players":
                clickOnElement(showAllMP3Players);
                break;
        }
    }

    public void getTopMenuList(String tab) {
        for (WebElement menu : topMenuList) {
            if (menu.getText().contains(tab)) {
                if (tab.equals("Desktops") || tab.equals("Laptops & Notebooks") || tab.equals("Components") || tab.equals("MP3 Players")) {
                    mouseHoverToElement(menu);
                } else {
                    clickOnElement(menu);
                    break;
                }
            }
        }
    }

    public String verifyTextMessage() {
        return getTextFromElement(textVerified);
    }

    public void clickOnMyAccount() {
        log.info("Click on MyAccount : " + myAccount.toString());
        clickOnElement(myAccount);
    }

    @CacheLookup
    @FindBy(xpath = "//li[@class='dropdown open']//ul/li")
    List<WebElement> dropDownMyAccountList;

    public void clickOnMyAccountDropDownList(String options) {
        try {
            for (WebElement list : dropDownMyAccountList) {
                if (list.getText().equalsIgnoreCase(options)) {
                    clickOnElement(list);
                    log.info("Click on DropDown Account List : " + dropDownMyAccountList.toString());
                }
            }
        } catch (StaleElementReferenceException e) {
            clickOnElement(register);
        }
    }

    public String getLogoutSuccessMsg() {
        log.info("Verify text of logout Success message : " + logoutSuccessMsg.toString());
        return getTextFromElement(logoutSuccessMsg);
    }


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement logoutSuccessMsg;

}

