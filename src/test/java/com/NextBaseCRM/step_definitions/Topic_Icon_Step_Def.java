package com.NextBaseCRM.step_definitions;
import com.NextBaseCRM.Pages.TopicIconPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Topic_Icon_Step_Def {

    TopicIconPage topicIconPage = new TopicIconPage();


    @When("User locates Topic Icon and clicks it")
    public void user_locates_topic_icon_and_clicks_it() {

        topicIconPage.ClickingOnTopicIcon();
    }

    @Then("User sees Topic Text box on top of messages")
    public void user_sees_topic_text_box_on_top_of_messages() {
        topicIconPage.VisibilityOfTopicTextBox();
    }

}
