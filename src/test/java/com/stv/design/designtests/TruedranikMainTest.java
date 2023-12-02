package com.stv.design.designtests;

import com.stv.design.designpages.TruedranikMainPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TruedranikMainTest extends BasicTest {


    @Test(description = "Assert the main page is loaded and the main logo is visible")
    public void assertWiggleIconIsDisplayed() {
        TruedranikMainPage truedranikMainPage = new TruedranikMainPage(getDriver());
        Assert.assertEquals(truedranikMainPage.isPancakesLinkDisplayed(), true, "The main page isn't loaded properly");
    }

    @Test(description = "Assert that live review link is correct")
    public void assertLiveReviewLinkIsCorrect() {
        TruedranikMainPage truedranikMainPage = new TruedranikMainPage(getDriver());
        Assert.assertEquals(truedranikMainPage.reviewLinkPath(), true, "The main page isn't loaded properly");
    }
}
