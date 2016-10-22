package com.bhagat.selenium.webdriver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWebDriverTest {
    private WebDriver driver;

    @Before
    public void startChromeWebDriver() {
        System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver/chromedriver.exe");
        /**
         * Uncomment this line if your system is not able to locate chrome in your system.*/
        /**
         System.setProperty("webdriver.chrome.bin", "<<Chrome Exe Location>>\\chrome.exe");
         */
        driver = new ChromeDriver();
    }

    @After
    public void stopChromeWebDriver() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

    @Test
    public void chromeWebDriverTest() {
        driver.navigate().to("http://seleniumhq.org");
        Assert.assertTrue("Title is not matching.",
                driver.getTitle().startsWith("Selenium - Web Browser Automation"));
    }
}
