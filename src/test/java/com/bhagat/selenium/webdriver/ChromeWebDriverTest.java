package com.bhagat.selenium.webdriver;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWebDriverTest {
    private static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver/chromedriver.exe");
        /**
         * Uncomment this line if your system is not able to locate chrome in your system.*/
        /**
         System.setProperty("webdriver.chrome.bin", "<<Chrome Exe Location>>\\chrome.exe");
         */
        driver = new ChromeDriver();
    }

    @Test
    public void chromeWebDriverTest() {
        driver.navigate().to("http://seleniumhq.org");
        Assert.assertTrue("Title is not matching.",
                driver.getTitle().startsWith("Selenium - Web Browser Automation"));
    }

    @AfterClass
    public static void afterClass() {
        if (driver != null) {
            driver.quit();
        }
    }
}
