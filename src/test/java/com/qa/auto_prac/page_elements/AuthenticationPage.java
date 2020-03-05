package com.qa.auto_prac.page_elements;

import com.qa.auto_prac.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage extends DriverManager {

    /** page factory
     *
     */
    @FindBy(id = "email")
    private WebElement emailId;
    @FindBy(id = "passwd")
    private WebElement password;
    @FindBy(id = "SubmitLogin")
    private WebElement submitBtn;



    public AuthenticationPage(){
        PageFactory.initElements(driver,this);
    }
    public MyAccountPage loginCredentials(String uname,String pwd){

        emailId.sendKeys(uname);
        password.sendKeys(pwd);
        submitBtn.click();
        return new MyAccountPage();
    }
    public String getTitle()
    {
        return driver.getTitle();
    }

}
