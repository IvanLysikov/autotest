package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainFactoryPage extends FactoryPage {

    @FindBy(css = "[aria-label='Sign in']")
    private WebElement signInLink;

    @FindBy(xpath = "//button[contains(text(),'Accept all')]")
    private WebElement trustButton;

    public boolean isSignInLinkDisplayed() {
        return signInLink.isDisplayed();
    }

    public void clickOnSignIn() {
        signInLink.click();
    }

    public void clickOnTrustButton() {
        trustButton.click();
    }
}
