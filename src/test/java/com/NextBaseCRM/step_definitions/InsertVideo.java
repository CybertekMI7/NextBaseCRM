package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.pages.InsertVideoPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InsertVideo {

    InsertVideoPage insertVideoPage = new InsertVideoPage();

    @When("User clicks insert video icon")
    public void user_clicks_insert_video_icon() {
        insertVideoPage.insertVideoIcon.click();
    }

    @Then("User is able to insert video")
    public void user_is_able_to_insert_video() {
        insertVideoPage.URLinputBox.click();
        insertVideoPage.cancelPopupWindow.click();
    }
}
