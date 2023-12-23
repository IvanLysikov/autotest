package com.stv.design.designpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WiggleSignUpPage extends Page {

    private final By SIGN_UP_MESSAGE_LOCATOR = By.xpath("//main//p[contains(., 'Create your account to continue')]");
    private final By CONTINUE_BUTTON_LOCATOR = By.cssSelector("button[type='submit']");
    private final By EMAIL_INPUT_LOCATOR = By.id("email");
    private final By PASSWORD_INPUT_LOCATOR = By.id("password");
    private final By EMAIL_VALIDATION_MESSAGE = By.id("error-element-email");

    public WiggleSignUpPage(WebDriver driver) {
        super(driver);
    }

    public boolean isSignUpPageDisplayed() {
        WebElement loginMessage = getDriver().findElement(SIGN_UP_MESSAGE_LOCATOR);
        return loginMessage.getText().equals("Create your account to continue");
    }

    public void enterValidEmail() {
        WebElement emailInput = driver.findElement(EMAIL_INPUT_LOCATOR);
        emailInput.sendKeys("example@email.com");
    }

    public void clickContinue() {
        WebElement continueButton = driver.findElement(CONTINUE_BUTTON_LOCATOR);
        continueButton.click();
    }

    public void enterNotValidEmail(String notValidEmail) {
        WebElement emailInput = driver.findElement(EMAIL_INPUT_LOCATOR);
        emailInput.sendKeys(notValidEmail);
    }

    public void enterValidPassword() {
        WebElement passwordInput = driver.findElement(PASSWORD_INPUT_LOCATOR);
        passwordInput.sendKeys("validpassword");
    }

    public String isEmailValidationErrorMessageDisplayed() {
        WebElement vaildationErrorMessage = driver.findElement(EMAIL_VALIDATION_MESSAGE);

        return vaildationErrorMessage.getText();
    }
}
