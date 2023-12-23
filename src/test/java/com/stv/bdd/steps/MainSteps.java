package com.stv.bdd.steps;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static com.stv.framework.core.lib.TruedranikURLs.START_URL;

public class MainSteps extends BasicFactoryTest {
    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    LoginPage loginPage = new LoginPage();

    @Given("^Main page is loaded$")
    public void navigationPanelIsVisible() {
        WebDriver driver = getDriver();
        driver.get(START_URL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        mainFactoryPage.isSignInLinkDisplayed();
    }
}
