package com.stv.factory.factorypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends FactoryPage {
    @FindBy(xpath = "//*[contains(text(),'Please log in')]")
    private WebElement loginContainer;

    @FindBy(id = "username")
    private WebElement emailInputLocator;

    @FindBy(id = "password")
    private WebElement passwordInputLocator;

    public boolean isLoginContainerDisplayed() {
        return loginContainer.isDisplayed();
    }

    public boolean emailInputIsDisplayed() {
        return emailInputLocator.isDisplayed();
    }

    public boolean passwordInputIsDisplayed() {
        return passwordInputLocator.isDisplayed();
    }
}
