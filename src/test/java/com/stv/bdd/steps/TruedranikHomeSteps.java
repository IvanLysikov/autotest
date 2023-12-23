package com.stv.bdd.steps;

import com.stv.design.designpages.TruedranikMainPage;
import com.stv.design.designpages.TruedranikPancakeCategoryPage;
import com.stv.design.designtests.BasicTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static com.stv.framework.core.lib.TruedranikURLs.START_URL;

public class TruedranikHomeSteps extends BasicTest {

    TruedranikMainPage truedranikMainPage;
    TruedranikPancakeCategoryPage truedranikPancakeCategoryPage;

    @Given("^Start page open by default$")
    public void setup() throws Throwable {
        WebDriver driver = getDriver();
        driver.get(START_URL);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        truedranikMainPage = new TruedranikMainPage(getDriver());
    }

    @When("^The user click pancake category$")
    public void pressLiveReviewLink() {
        truedranikMainPage.clickOnPancakeCategory();
        truedranikPancakeCategoryPage = new TruedranikPancakeCategoryPage(getDriver());
    }

    @Then("^Truedranik pancake category is opened$")
    public void truedranikLiveReviewLinkOpened() {
        boolean actualResult = truedranikPancakeCategoryPage.isPancakePageDisplayed();
        Assert.assertEquals(actualResult, true, "There is no pancake on page");
    }
}
