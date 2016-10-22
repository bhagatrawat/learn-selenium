package com.bhagat.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WikipediaTest {

    @Test
    public void searchTest() throws InterruptedException {

        WebDriver driver = null;
        try {
            System.setProperty("webdriver.gecko.driver", "webdrivers/firefoxdriver/geckodriver.exe");
            /**
             * Uncomment this line if your system is not able to locate firefox in your system.*/
            /**
             System.setProperty("webdriver.firefox.bin", "<<Firefox Exe Location>>\\firefox.exe");
             */

            driver = new FirefoxDriver();
            driver.get("http://www.wikipedia.org");

            final WebElement searchBox = driver.findElement(By.id("searchInput"));
            searchBox.sendKeys("Bhagat Singh");
            searchBox.submit();
            Thread.sleep(2000);
        } finally {
            if (driver != null) {
                driver.close();
                driver.quit();
            }
        }
    }
}
