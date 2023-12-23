package com.stv.factory.factorytests;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorypages.MainFactoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.stv.framework.core.lib.WiggleURLs.WIGGLE_START_URL;
public class MainFactoryTest extends BasicFactoryTest {

    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    LoginPage loginPage = new LoginPage();

    @Test (description = "Assert the main page is loaded and account icon is visible")
    public void assertAccountIconIsDisplayed() {
        boolean actualResult = mainFactoryPage.isSignInLinkDisplayed();
        Assert.assertEquals(actualResult, true, "Account link isn't visible");
    }

    @Test (description = "Assert the login page is loaded", dependsOnMethods = "assertAccountIconIsDisplayed")
    public void assertLoginPageOpened() {
        mainFactoryPage.clickOnTrustButton();
        mainFactoryPage.clickOnSignIn();
        Assert.assertEquals(loginPage.isLoginContainerDisplayed(), true, "Login page isn't loaded properly");
    }

    @Test (description = "Assert the email input field is on the page", dependsOnMethods = "assertLoginPageOpened")
    public void assertEmailInputIsDisplayed() {
        Assert.assertEquals(loginPage.emailInputIsDisplayed(), true, "Login page isn't loaded properly");
    }

    @Test (description = "Assert the password input field is on the page", dependsOnMethods = "assertLoginPageOpened")
    public void assertPasswordInputIsDisplayed() {
        Assert.assertEquals(loginPage.passwordInputIsDisplayed(), true, "Login page isn't loaded properly");
    }

    protected String getUrl(){
        return WIGGLE_START_URL;
    }
}
