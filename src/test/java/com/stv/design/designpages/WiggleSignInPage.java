package com.stv.design.designpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WiggleSignInPage extends Page {

    private final By SIGN_UP_LINK_LOCATOR = By.cssSelector("div.ulp-alternate-action p a");

    private final By LOGIN_MESSAGE_LOCATOR = By.xpath("//main//p[contains(., 'Please log in to Wiggle to continue')]");

    public WiggleSignInPage(WebDriver driver) {
        super(driver);
    }


    public boolean isSignInPageDisplayed() {
        WebElement loginMessage = getDriver().findElement(LOGIN_MESSAGE_LOCATOR);
        String loginMessageText = loginMessage.getText();
        return loginMessageText.equals("Please log in to Wiggle to continue");
    }

    public void clickOnSignUp() {
        WebElement signUpLink = getDriver().findElement(SIGN_UP_LINK_LOCATOR);
        signUpLink.click();
    }
}
