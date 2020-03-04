package newRegistration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class NewRegistration {
    public static WebDriver driver;

    @Test
    public void newUser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email_create")).sendKeys("tmkvsa@gmail.com");
        driver.findElement(By.id("SubmitCreate")).click();
        driver.findElement(By.id("id_gender2")).click();
        driver.findElement((By.name("customer_firstname"))).sendKeys("Ramya");
        driver.findElement(By.id("customer_lastname")).sendKeys("kdhly");
       // driver.findElement(By.id("email")).sendKeys("tmkvsa@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("tmkvsarmky");
        Select drpDate = new Select(driver.findElement(By.id("days")));
        drpDate.selectByValue("12");
        Select drpMonth = new Select(driver.findElement(By.id("months")));
        drpMonth.selectByValue("3");
        Select drpYear = new Select(driver.findElement(By.id("years")));
        drpYear.selectByValue("1990");
        driver.findElement(By.id("address1")).sendKeys("102,erith road");
        driver.findElement(By.id("city")).sendKeys("Welling");
        Select drpState = new Select(driver.findElement(By.id("id_state")));
        drpState.selectByValue("1");
        driver.findElement(By.id("postcode")).sendKeys("85002");
        Select drpCountry = new Select(driver.findElement(By.id("id_country")));
        drpCountry.selectByVisibleText("United States");
        driver.findElement(By.name("phone_mobile")).sendKeys("07803502774");
        driver.findElement(By.id("alias")).sendKeys("20,okhamton,Welling");
        driver.findElement(By.id("submitAccount")).click();

    }
}
