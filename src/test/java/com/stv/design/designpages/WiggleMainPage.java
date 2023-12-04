package com.stv.design.designpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WiggleMainPage extends Page {

    private final By ACCEPT_COOKIES_BUTTON = By.id("truste-consent-required");
    private final By SIGN_IN_LINK_LOCATOR = By.cssSelector("button[aria-label='Sign in']");
    private final By LOGO_LOCATOR = By.cssSelector("Header_logo__V9h3K");

    public WiggleMainPage(WebDriver driver) {
        super(driver);
    }

    public boolean isMainLogoDisplayed(){
        WebElement logoImage = getDriver().findElement(LOGO_LOCATOR);
        return logoImage.isDisplayed();
    }

    public void clickOnSignIn() {
        WebElement signInLink = getDriver().findElement(SIGN_IN_LINK_LOCATOR);
        signInLink.click();
    }

    public void acceptCookies() {
        WebElement cookiesButton = getDriver().findElement(ACCEPT_COOKIES_BUTTON);
        cookiesButton.click();
    }
}
