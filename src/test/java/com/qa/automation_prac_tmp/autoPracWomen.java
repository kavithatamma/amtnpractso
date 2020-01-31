package com.qa.automation_prac_tmp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class autoPracWomen {
    public static WebDriver driver;

    @Test
    public void openbrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

       // driver.findElement(By.linkText("href=\"http://automationpractice.com/index.php?id_category=3&controller=category\"")).click();

        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email")).sendKeys("kavithatamma@hotmail.com");
        driver.findElement(By.id("passwd")).sendKeys("Govinda@0711");
        driver.findElement(By.id("SubmitLogin")).click();
        //driver.findElement(By.xpath("//ul[@class='footer_links clearfix']")).click();
        String name = driver.findElement(By.className("account")).getText();
        System.out.println("Welcome" +" " +name);
    }


    }
