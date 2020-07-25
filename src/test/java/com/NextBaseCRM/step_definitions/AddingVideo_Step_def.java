package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.Pages.AddingVideoPage;
import com.NextBaseCRM.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddingVideo_Step_def {

    AddingVideoPage videoPage = new AddingVideoPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
    Actions actions = new Actions(Driver.getDriver());

    @Then("User locates Video icon and clicks")
    public void user_locates_video_icon_and_clicks() {
        wait.until(ExpectedConditions.visibilityOf(videoPage.AddVideoIcon));
        videoPage.AddVideoIcon.click();

    }

    @Then("User enters video URL and waits until video is loaded and clicks Save")
    public void userEntersVideoURLAndWaitsUntilVideoIsLoadedAndClicksSave() {
        wait.until(ExpectedConditions.visibilityOf(videoPage.VideoSourceInput));
        videoPage.VideoSourceInput.sendKeys("https://youtu.be/BJ2es2vAnDQ");
        wait.until(ExpectedConditions.visibilityOf(videoPage.VideoTitle));
        videoPage.SaveButton.click();

    }


    @Then("User sees video is displayed on Message Console")
    public void user_sees_video_is_displayed_on_message_console() {

        Driver.getDriver().switchTo().frame(videoPage.iFrame);
        wait.until(ExpectedConditions.visibilityOf(videoPage.ConfirmationVideo));
        Assert.assertTrue(videoPage.ConfirmationVideo.isDisplayed());

    }



}
