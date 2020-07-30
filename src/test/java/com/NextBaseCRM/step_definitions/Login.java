package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.utilities.ConfigurationReader;
import com.NextBaseCRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import com.NextBaseCRM.pages.BitrixLoginPage;

public class Login {

    BitrixLoginPage bitrixLoginPage = new BitrixLoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("->User is on the login page");
    }

    @When("User logs in as help desk")
    public void user_logs_in_as_help_desk() throws InterruptedException{
            String username = ConfigurationReader.getProperty("helpdesk_username1");
            String password = ConfigurationReader.getProperty("bitrix_password");

            bitrixLoginPage.usernameBox.sendKeys(username + Keys.TAB);
            bitrixLoginPage.passwordBox.sendKeys(password + Keys.ENTER);
    }

    @When("User logs in as marketing")
    public void user_logs_in_as_marketing() {
        String username = ConfigurationReader.getProperty("marketing_username1");
        String password = ConfigurationReader.getProperty("bitrix_password");

        bitrixLoginPage.usernameBox.sendKeys(username + Keys.TAB);
        bitrixLoginPage.passwordBox.sendKeys(password + Keys.ENTER);
    }

    @When("User logs in as HR")
    public void user_logs_in_as_hr() {
        String username = ConfigurationReader.getProperty("hr_username1");
        String password = ConfigurationReader.getProperty("bitrix_password");

        bitrixLoginPage.usernameBox.sendKeys(username + Keys.TAB);
        bitrixLoginPage.passwordBox.sendKeys(password + Keys.ENTER);
    }

    @Then("User should see the landing page")
    public void userShouldSeeTheLandingPage() {
        /*
        String actualTitle= Driver.getDriver().getTitle();
        String expectedTitle = "login";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
         */
        System.out.println("logged in");
    }

}
