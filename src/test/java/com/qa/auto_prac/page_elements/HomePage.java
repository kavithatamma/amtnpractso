package com.qa.auto_prac.page_elements;

import com.qa.auto_prac.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends DriverManager {
    @FindBy(className = "login")
    private WebElement loginlink;

    //driver.findElement(By.className("login")).click();
    public String getTitle()
    {
        return driver.getTitle();
    }
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    public AuthenticationPage siginIn(){
        loginlink.click();
        return new AuthenticationPage();

    }

}
