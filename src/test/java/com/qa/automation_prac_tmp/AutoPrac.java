package com.qa.automation_prac_tmp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class AutoPrac {
    public static WebDriver driver;

    @Test
    public void openbrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.findElement(By.id("search_query_top")).sendKeys("dress");
        driver.findElement(By.name("submit_search")).click();
        List<WebElement> prodList = driver.findElements(By.xpath("//ul[@class='product_list grid row']/li"));
        System.out.println(prodList.size());
        for(int i=0;i<= prodList.size();i++)
        {
            Random rand = new Random();
            int randomProduct = rand.nextInt(prodList.size());
            prodList.get(randomProduct).click();
            //driver.get("http://automationpractice.com/index.php");
            //List<WebElement> prodList1= driver.findElements(By.xpath("//ul[@class='product_list grid row']/li"));
            //driver.findElement(By.xpath("//*[@id=\"product\"]")).click();



        }
        //Random rand = new Random();
        //int randomProduct = rand.nextInt(prodList.size());
        //prodList.get(randomProduct).click();

    }


}
