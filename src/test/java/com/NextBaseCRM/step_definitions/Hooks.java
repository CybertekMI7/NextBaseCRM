package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.utilities.BrowserUtils;
import com.NextBaseCRM.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks {

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            BrowserUtils.takeScreenshot();
        }
        Driver.closeDriver();
    }
}
