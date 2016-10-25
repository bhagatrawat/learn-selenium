package com.bhagat.selenium.webdriver;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxWebDriverTest {

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
    public void fireFoxWebDriverTest() {
        driver.navigate().to("http://seleniumhq.org");
        Assert.assertTrue("Title is not matching.",
                driver.getTitle().startsWith("Selenium - Web Browser Automation"));
    }

    @AfterClass
    public static void afterClasss() {
        if (driver != null) {
            driver.quit();
        }
    }

}
