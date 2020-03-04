package com.qa.automation_prac_tmp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigProp {
    public static WebDriver driver;

    @Test
    public void  readConfig() throws IOException {
        //WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();

        Properties prop = new Properties();
        FileInputStream fs = new FileInputStream("C:\\Kavi\\automation_prac_tmp\\src\\test\\java\\com\\qa\\automation_prac_tmp\\config.properties");
        prop.load(fs);
        System.out.println(prop.getProperty("browser"));
        String browserName = prop.getProperty("browser");
        if(browserName.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(browserName.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else
        {
            //System.out.println("no browser value is given");
        }
        driver.get(prop.getProperty("url"));
        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email")).sendKeys(prop.getProperty("username"));
        driver.findElement(By.id("passwd")).sendKeys(prop.getProperty("psswd"));
        driver.findElement(By.id("SubmitLogin")).click();
        String name = driver.findElement(By.className("account")).getText();
        System.out.println("Welcome" +" " +name);


    }
}
