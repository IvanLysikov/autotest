package com.stv.design.designtests;

import com.stv.design.designpages.WiggleMainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WiggleMainTest extends BasicTest {

    @Test(description = "Assert the main page is loaded and the main logo is visible")
    public void assertWiggleIconIsDisplayed() {
        WiggleMainPage wiggleMainPage = new WiggleMainPage(getDriver());
        Assert.assertEquals(wiggleMainPage.isMainLogoDisplayed(), true, "The main page isn't loaded properly");
    }
}
