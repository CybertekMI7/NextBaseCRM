package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.Pages.LoginPage;
import com.NextBaseCRM.utilities.Driver;
import io.cucumber.java.Before;

public class Hooks {

    LoginPage loginPage = new LoginPage();


    @Before
    public void setUp(){
        Driver.getDriver().get("https://login2.nextbasecrm.com/");
        Driver.getDriver().manage().window().maximize();
        loginPage.login();
    }

}
