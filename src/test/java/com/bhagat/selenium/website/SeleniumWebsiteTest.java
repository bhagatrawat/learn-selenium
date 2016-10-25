package com.bhagat.selenium.website;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Aditya on 10/24/2016.
 */
public class SeleniumWebsiteTest {

    private static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("webdriver.gecko.driver", "webdrivers/firefoxdriver/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Test
    public void seleniumWebsiteTest() throws InterruptedException {
        driver.navigate().to("http://seleniumhq.org");
        System.out.println("Home::Title: " + driver.getTitle());
        Assert.assertTrue("Title is not matching.",
                driver.getTitle().startsWith("Selenium - Web Browser Automation"));
        Thread.sleep(1000);

        driver.navigate().to("http://www.seleniumhq.org/download/");
        System.out.println("Download::Title: " + driver.getTitle());
        Assert.assertTrue("Title is not matching.",
                driver.getTitle().startsWith("Downloads"));
        Thread.sleep(1000);

        driver.navigate().back();
        System.out.println("Back::Title: " + driver.getTitle());
        Assert.assertTrue("Title is not matching.",
                driver.getTitle().startsWith("Selenium - Web Browser Automation"));
        Thread.sleep(1000);

        driver.navigate().forward();
        Thread.sleep(1000);
        System.out.println("Forward::Title: " + driver.getTitle());
        Assert.assertTrue("Title is not matching.",
                driver.getTitle().startsWith("Downloads"));
        Thread.sleep(1000);

        driver.navigate().to("http://www.seleniumhq.org/support/");
        System.out.println("Support::Title: " + driver.getTitle());
        Assert.assertTrue("Title is not matching.",
                driver.getTitle().startsWith("Getting Help"));

        Thread.sleep(1000);
        driver.navigate().to("http://www.seleniumhq.org/docs/");
        System.out.println("Docs::Title: " + driver.getTitle());
        Assert.assertTrue("Title is not matching.",
                driver.getTitle().startsWith("Selenium Documentation"));

        Thread.sleep(100);

        driver.navigate().refresh();
        System.out.println("Refresh::Title: " + driver.getTitle());
        Assert.assertTrue("Title is not matching.",
                driver.getTitle().startsWith("Selenium Documentation"));
    }


    @AfterClass
    public static void afterClass() {
        if (driver != null) {
            driver.quit();
        }
    }

}
