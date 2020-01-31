package com.qa.auto_prac.step_def;

import com.qa.auto_prac.driver.DriverManager;
import com.qa.auto_prac.page_elements.AuthenticationPage;
import com.qa.auto_prac.page_elements.HomePage;
import com.qa.auto_prac.page_elements.MyAccountPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends DriverManager {
    HomePage homePage = new HomePage();
    AuthenticationPage authenpage = new AuthenticationPage();
    MyAccountPage myAccountPage = new MyAccountPage();

    @Given("^I am on homepage$")
    public void i_am_on_homepage()  {
        homePage.getTitle();
    }

    @When("^I click on Sign in link$")
    public void i_click_on_Sign_in_link()  {
         homePage.siginIn();
    }

    @Then("^AUTHENTICATION page should be loaded$")
    public void authentication_page_should_be_loaded()  {
        authenpage .getTitle();
    }

    @Then("^I enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_valid_and(String uname, String pwd) throws Throwable {
        authenpage.loginCredentials( uname,pwd);
}

    @Then("^I should  login successfully$")
    public void i_should_login_successfully()  {
        myAccountPage.getTitle();
        myAccountPage.loginSuccessfully();

    }


}

