package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.Pages.UploadFileIcon;
import com.NextBaseCRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

import java.awt.event.KeyEvent;



public class Upload_File_Icon_step_def {

    UploadFileIcon upload_file_icon = new UploadFileIcon();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
    Actions actions = new Actions(Driver.getDriver());



    @Given("User is on homepage and MESSAGE is displayed under ACTIVITY STREAM")
    public void user_is_on_homepage() {

        Assert.assertTrue(upload_file_icon.MessageButton.isDisplayed());

    }


    @Then("User clicks on Messages tab under Activity Stream Module")
    public void user_clicks_on_messages_tab_under_activity_stream_module() {

        wait.until(ExpectedConditions.visibilityOf(upload_file_icon.MessageButton));
        upload_file_icon.MessageButton.click();
    }

    @When("User clicks on UPLOAD FILES icon")
    public void user_clicks_on_upload_files_icon() {
        wait.until(ExpectedConditions.visibilityOf(upload_file_icon.UploadFileIcon));
        upload_file_icon.UploadFileIcon.click();

    }

    @Then("User sees UPLOAD OPTIONS at the bottom of MESSAGE INPUT FIELD")
    public void user_sees_upload_options_at_the_bottom_of_message_input_field() throws AWTException, InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(upload_file_icon.UploadFilesAndImages));
        Assert.assertTrue(upload_file_icon.UploadFilesAndImages.isDisplayed());
        Assert.assertTrue(upload_file_icon.CreateUsingGoogleDocs_text.isDisplayed());
        Assert.assertTrue(upload_file_icon.DwnldFromExternalDrive_text.isDisplayed());
        Assert.assertTrue(upload_file_icon.selectDocFromB24_text.isDisplayed());

    }


}
