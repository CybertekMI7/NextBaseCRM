package com.nextBaseCRM.step_definitions;

import com.nextBaseCRM.pages.Login;
import com.nextBaseCRM.utilities.ConfigurationReader;
import com.nextBaseCRM.utilities.Driver;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.java.*;

public class Hooks {

    Login login = new Login();



    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
    }


    @Before
    public void setup(){
        Driver.getDriver().get(ConfigurationReader.getProperty("loginURL"));
        Driver.getDriver().manage().window().maximize();
        login.login();
    }


}

