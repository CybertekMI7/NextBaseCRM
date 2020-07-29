package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.Pages.UploadFileIcon;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Upload_File_Icon_step_def {

    UploadFileIcon upload_file_icon = new UploadFileIcon();


    @Given("User is on homepage and MESSAGE is displayed under ACTIVITY STREAM")
    public void user_is_on_homepage() {
        upload_file_icon.UserIsOnHomePage();

    }


    @Then("User clicks on Messages tab under Activity Stream Module")
    public void user_clicks_on_messages_tab_under_activity_stream_module() {

        upload_file_icon.ClickingOnMessagesTab();
    }

    @When("User clicks on UPLOAD FILES icon")
    public void user_clicks_on_upload_files_icon() {

        upload_file_icon.ClickingOnUploadFiles();
    }

    @Then("User sees UPLOAD OPTIONS at the bottom of MESSAGE INPUT FIELD")
    public void user_sees_upload_options_at_the_bottom_of_message_input_field() {


        upload_file_icon.VisibilityOfUploadOptions();


    }


}
