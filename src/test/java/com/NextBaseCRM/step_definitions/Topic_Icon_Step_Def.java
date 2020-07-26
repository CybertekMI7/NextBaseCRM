package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.Pages.TopicIconPage;
import com.NextBaseCRM.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Topic_Icon_Step_Def {

    TopicIconPage topicIconPage = new TopicIconPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    Actions actions = new Actions(Driver. getDriver());

    @When("User locates Topic Icon and clicks it")
    public void user_locates_topic_icon_and_clicks_it() {

        wait.until(ExpectedConditions.visibilityOf(topicIconPage.TopicIcon));
        actions.moveToElement(topicIconPage.TopicIcon).click().perform();


    }



    @Then("User sees Topic Text box on top of messages")
    public void user_sees_topic_text_box_on_top_of_messages() {

        wait.until(ExpectedConditions.visibilityOf(topicIconPage.TopicBoxInput));
        Assert.assertTrue(topicIconPage.TopicBoxInput.isDisplayed());
    }

}
