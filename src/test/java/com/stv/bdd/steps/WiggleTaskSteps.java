package com.stv.bdd.steps;

import com.stv.design.designpages.WiggleMainPage;
import com.stv.design.designpages.WiggleSignInPage;
import com.stv.design.designpages.WiggleSignUpPage;
import com.stv.design.designtests.BasicTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static com.stv.framework.core.lib.WiggleURLs.WIGGLE_START_URL;

public class WiggleTaskSteps extends BasicTest {

    WiggleMainPage wiggleMainPage;
    WiggleSignInPage wiggleSignInPage;
    WiggleSignUpPage wiggleSignUpPage;

    @Given("^Wiggle start page opened by default$")
    public void wiggleSetupMainPage() throws Throwable {
        openWiggleMainPage();
        wiggleMainPage.acceptCookies();
    }

    private void openWiggleMainPage() {
        WebDriver driver = getDriver();
        driver.get(WIGGLE_START_URL);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        wiggleMainPage = new WiggleMainPage(getDriver());
    }

    @When("^The user click sign in$")
    public void pressSignIn() {
        wiggleMainPage.clickOnSignIn();
        wiggleSignInPage = new WiggleSignInPage(getDriver());
    }

    @Then("^Sign in page is opened$")
    public void signInPageIsDisplayed() {
        boolean actualResult = wiggleSignInPage.isSignInPageDisplayed();
        Assert.assertEquals(actualResult, true, "Sign in page isn't loaded");
    }

    @Given("^Sign in page opened$")
    public void wiggleSetupSignInPage() throws Throwable {
        openWiggleMainPage();
        pressSignIn();
        waiting(3);
    }

    @When("^The user click sign up$")
    public void pressSignUp() {
        wiggleSignInPage.clickOnSignUp();
        wiggleSignUpPage = new WiggleSignUpPage(getDriver());
    }

    @Then("^Sign up page is opened$")
    public void signUpPageIsDisplayed() {
        boolean actualResult = wiggleSignUpPage.isSignUpPageDisplayed();
        Assert.assertEquals(actualResult, true, "Sign up page isn't loaded");
    }

    @Given("^Sign up page opened$")
    public void wiggleSetupSignUpPage() throws Throwable {
        wiggleSetupSignInPage();
        pressSignUp();
        waiting(3);
    }

    @When("^User enter valid email$")
    public void enterValidEmail() {
        wiggleSignUpPage.enterValidEmail();
    }

    @And("^Press Continue button$")
    public void clickContinue() {
        wiggleSignUpPage.clickContinue();
    }

    @When("^The User enters \"([^\"]*)\" in Email address field$")
    public void enterNotValidEmail(String notValidEmail) {
        wiggleSignUpPage.enterNotValidEmail(notValidEmail);
    }

    @And("^The User enters valid password in Password field$")
    public void enterValidPassword() {
        wiggleSignUpPage.enterValidPassword();
    }

    @Then("^Validation message in Email address fiels appears$")
    public void emailValidationErrorMessageAppears() {
        String actualResult = wiggleSignUpPage.isEmailValidationErrorMessageDisplayed();
        Assert.assertEquals(actualResult, "Email is not valid.", "Email validation error message isn't displayed");
    }

    private void waiting(int seconds) {
        getDriver().manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }
}
