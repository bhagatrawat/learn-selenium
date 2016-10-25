package com.bhagat.selenium;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WikipediaTest {

    private static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("webdriver.gecko.driver", "webdrivers/firefoxdriver/geckodriver.exe");
        /**
         * Uncomment this line if your system is not able to locate firefox in your system.*/
        /**
         System.setProperty("webdriver.firefox.bin", "<<Firefox Exe Location>>\\firefox.exe");
         */
        driver = new FirefoxDriver();
    }

    @Test
    public void searchTest() throws InterruptedException {
        driver.get("http://www.wikipedia.org");
        final WebElement searchBox = driver.findElement(By.id("searchInput"));
        searchBox.sendKeys("Bhagat Singh");
        searchBox.submit();
        Thread.sleep(2000);
    }

    @AfterClass
    public static void afterClass() {

        if (driver != null) {
            driver.quit();
        }
    }
}