package com.stv.design.designpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TruedranikMainPage extends Page {

    private final By PANCAKE_LINK = By.linkText("Дранікі");
    private final By REVIEW_LINK = By.linkText("Пакінуць водгук");

    public TruedranikMainPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPancakesLinkDisplayed(){
        WebElement pancakeLink = getDriver().findElement(PANCAKE_LINK);
        return pancakeLink.isDisplayed();
    }

    public String reviewLinkPath() {
        WebElement reviewLink = getDriver().findElement(REVIEW_LINK);
        return reviewLink.getAttribute("href");
    }

    public void clickOnPancakeCategory() {
        WebElement registerLink = getDriver().findElement(PANCAKE_LINK);
        registerLink.click();
    }
}

