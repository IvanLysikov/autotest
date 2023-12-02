package com.stv.design.designpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WiggleMainPage extends Page {

    private final By REGISTER_LINK_LOCATOR = By.id("btnJoinLink");
    private final By ACCEPT_COOKIES_BUTTON = By.id("truste-consent-required");
    private final By SIGN_IN_LINK_LOCATOR = By.cssSelector("btnSignIn");
    private final By PANCAKES_LINK = By.linkText("Дранікі");
    private final By LOGO_LOCATOR = By.cssSelector("Header_logo__V9h3K");

    public WiggleMainPage(WebDriver driver) {
        super(driver);
    }


    public boolean isRegisterLinkDisplayed(){
        WebElement registerLink = getDriver().findElement(REGISTER_LINK_LOCATOR);
        return registerLink.isDisplayed();
    }

    public boolean isMainLogoDisplayed(){
        WebElement logoImage = getDriver().findElement(LOGO_LOCATOR);
        return logoImage.isDisplayed();
    }

    public boolean isSignInLinkDisplayed(){
        WebElement signInLink = getDriver().findElement(SIGN_IN_LINK_LOCATOR);
        return signInLink.isDisplayed();
    }

}
