package com.qa.auto_prac.page_elements;

import com.qa.auto_prac.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class MyAccountPage extends DriverManager {
    @FindBy(className = "account")
    private WebElement accountName;

    public String getTitle(){
        return driver.getTitle();
    }
    public MyAccountPage(){
        PageFactory.initElements(driver,this);
    }
    public void loginSuccessfully(){
        String name = accountName.getText();
        System.out.println("Welcome "+name);
    }
}
