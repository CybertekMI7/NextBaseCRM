package com.NextBaseCRM.step_definitions;


import com.NextBaseCRM.Pages.LoginPage;
import com.NextBaseCRM.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.Ignore;

import java.util.concurrent.TimeUnit;

public class Hooks {

   LoginPage loginPage = new LoginPage();
  
    @Before
    public void setDriver () {
        Driver.getDriver().get("http://login2.nextbasecrm.com/");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       loginPage.login();
    }


    @After
    public void tearDownScenario(Scenario scenario){

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }

        Driver.closeDriver();

    }


}


