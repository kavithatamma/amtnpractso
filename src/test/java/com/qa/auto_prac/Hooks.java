package com.qa.auto_prac;

import com.qa.auto_prac.driver.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends DriverManager {
    private DriverManager driverManager=new DriverManager();


    @Before
    public void setUp() {
        driverManager.openBrowser();
    }

    @After
    public void tearDown() {
        //driverManager.closeBrowser();
    }
}
