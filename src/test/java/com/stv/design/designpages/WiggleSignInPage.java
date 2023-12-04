package com.stv.design.designpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WiggleSignInPage extends Page {

    private final By SIGN_UP_LINK_LOCATOR = By.cssSelector("div.ulp-alternate-action p.c129646bd a.c334acb20.c71d13e70");

    private final By LOGIN_MESSAGE_LOCATOR = By.cssSelector("p.c129646bd.cd98a4fb9");

    public WiggleSignInPage(WebDriver driver) {
        super(driver);
    }


    public boolean isSignInPageDisplayed() {
        WebElement loginMessage = getDriver().findElement(LOGIN_MESSAGE_LOCATOR);
        return loginMessage.getText().equals("Please log in to Wiggle to continue");
    }

    public void clickOnSignUp() {
        WebElement signUpLink = getDriver().findElement(SIGN_UP_LINK_LOCATOR);
        signUpLink.click();
    }
}
