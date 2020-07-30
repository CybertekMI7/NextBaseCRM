package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.Pages.AddingVideoPage;
import io.cucumber.java.en.Then;


public class AddingVideo_Step_def {

    AddingVideoPage videoPage = new AddingVideoPage();


    @Then("User locates Video icon and clicks")
    public void user_locates_video_icon_and_clicks() {
        videoPage.LocatingVideoIconAndClick();

    }

    @Then("User enters video URL and waits until video is loaded and clicks Save")
    public void userEntersVideoURLAndWaitsUntilVideoIsLoadedAndClicksSave() {
        videoPage.EnteringVideoURL();

    }


    @Then("User sees video is displayed on Message Console")
    public void user_sees_video_is_displayed_on_message_console() {

        videoPage.VisibilityOfUploadedVideo();
    }



}
