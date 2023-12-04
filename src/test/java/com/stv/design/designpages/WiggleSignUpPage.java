package com.stv.design.designpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WiggleSignUpPage extends Page {

    private final By SIGN_UP_MESSAGE_LOCATOR = By.cssSelector("p.c129646bd.cd98a4fb9");

    private final By CONTINUE_BUTTON_LOCATOR = By.cssSelector("button.c320322a4.c480bc568.c20af198f.ce9190a97.c944f10ec");

    private final By emailInputLocator = By.cssSelector("input.input.c4c02e117.ca1249877#email");


    public WiggleSignUpPage(WebDriver driver) {
        super(driver);
    }

    public boolean isSignUpPageDisplayed() {
        WebElement loginMessage = getDriver().findElement(SIGN_UP_MESSAGE_LOCATOR);
        return loginMessage.getText().equals("Create your account to continue");
    }

    public void enterValidEmail() {
        WebElement emailInput = driver.findElement(emailInputLocator);
        emailInput.sendKeys("example@email.com");
    }

    public void clickContinue() {
        WebElement continueButton = driver.findElement(CONTINUE_BUTTON_LOCATOR);
        continueButton.click();
    }
}
