package com.qa.auto_prac.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    public static WebDriver driver;
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    public void closeBrowser() {
        driver.quit();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
