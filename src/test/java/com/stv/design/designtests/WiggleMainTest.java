package com.stv.design.designtests;

import com.stv.design.designpages.WiggleMainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.stv.framework.core.lib.WiggleURLs.WIGGLE_START_URL;

public class WiggleMainTest extends BasicTest {

    @Test(description = "Assert the main page is loaded and the main logo is visible")
    public void assertWiggleIconIsDisplayed() {
        WiggleMainPage wiggleMainPage = new WiggleMainPage(getDriver());
        wiggleMainPage.acceptCookies();
        Assert.assertEquals(wiggleMainPage.isMainLogoDisplayed(), true, "The main page isn't loaded properly");
    }

    protected String url() {
        return WIGGLE_START_URL;
    }
}
