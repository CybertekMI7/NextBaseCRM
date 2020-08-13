package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.Pages.LoginPage;
import com.NextBaseCRM.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Hooks {

    LoginPage loginPage = new LoginPage();


    @Before
    public void setUp() {
        Driver.getDriver().get("https://login2.nextbasecrm.com/");
        Driver.getDriver().manage().window().maximize();
        loginPage.login();
    }

    /*
    @After()
    public void takingScreenShot(Scenario scenario) {
        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }


    }
/*

     */

@After
    public void teradown(){
        Driver.closeDriver();
    }

}
