package com.stv.design.designpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TruedranikPancakeCategoryPage extends Page {

    private final By CARBANARA_PRODUCT_CARD = By.id("dish_6");

    public TruedranikPancakeCategoryPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPancakePageDisplayed() {
        WebElement carbanaraPancake = getDriver().findElement(CARBANARA_PRODUCT_CARD);
        return carbanaraPancake.isDisplayed();
    }
}
