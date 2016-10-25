package com.bhagat.selenium.webdriver;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.junit.Assert.assertTrue;

public class HtmlUnitDriverTest {

    private static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        driver = new HtmlUnitDriver();
    }

    @Test
    public void htmlUnitDriverTest() {
        driver.get("http://seleniumhq.org");
        assertTrue("Title is not matching.",
                driver.getTitle().startsWith("Selenium - Web Browser Automation"));
    }

    @AfterClass
    public static void afterClass() {
        if (driver != null) {
            driver.quit();
        }
    }
}
