package com.stv.design.designpages;

import com.stv.framework.core.drivers.Driver;
import org.openqa.selenium.WebDriver;

public abstract class Page {

    protected final WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public static WebDriver getDriver() {
        return Driver.getDriver();
    }
}
