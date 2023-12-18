package com.tutorialninja.demo.pages;

import com.tutorialninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

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
            System.out.println(menu.getText());
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


}

