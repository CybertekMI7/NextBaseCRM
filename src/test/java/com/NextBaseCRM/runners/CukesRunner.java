package com.NextBaseCRM.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions( plugin = {"pretty","html:target/cucumber-report.html",
        "json:target/cucumber.json",
        "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com/NextBaseCRM/step_definitions",
        dryRun = false,
        tags ="@upload"
)

public class CukesRunner {
}
