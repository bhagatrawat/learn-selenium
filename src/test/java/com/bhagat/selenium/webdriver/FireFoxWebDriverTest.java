package com.bhagat.selenium.webdriver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxWebDriverTest {

    private WebDriver driver;

    @Before
    public void startFireFoxWebDriver() {
        System.setProperty("webdriver.gecko.driver", "webdrivers/firefoxdriver/geckodriver.exe");
        /**
         * Uncomment this line if your system is not able to locate firefox in your system.*/
        /**
         System.setProperty("webdriver.firefox.bin", "<<Firefox Exe Location>>\\firefox.exe");
         */
        driver = new FirefoxDriver();
    }

    @After
    public void stopFireFoxWebDriver() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

    @Test
    public void fireFoxWebDriverTest() {
        driver.navigate().to("http://seleniumhq.org");
        Assert.assertTrue("Title is not matching.",
                driver.getTitle().startsWith("Selenium - Web Browser Automation"));
    }
}
