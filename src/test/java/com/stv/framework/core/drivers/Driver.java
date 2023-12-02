package com.stv.framework.core.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {
    private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            setChromeDriver();
        }
        return driver;
    }

    private static void setChromeDriver()
    {
        String exePath = "/Users/livan/Downloads/wigglePrForStudents (2023)/wigglePrForStudents/chromedriver/chromedriver";
        System.setProperty("webdriver.chrome.driver", exePath);
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setJavascriptEnabled(true);
        driver = new ChromeDriver(capabilities);
    }

    /**
     * The method can be used to run tests in Fire fox
     */

    private static void setFireFox() {

        String exePath =  "C:\\drivers\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", exePath);
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        driver = new FirefoxDriver(capabilities);
//        capabilities.setJavascriptEnabled(true);
    }

    private static void setSafari() {
        DesiredCapabilities capabilities = DesiredCapabilities.safari();
        capabilities.setCapability("marionette", true);
        capabilities.setJavascriptEnabled(true);
        driver = new SafariDriver(capabilities);
    }
}
