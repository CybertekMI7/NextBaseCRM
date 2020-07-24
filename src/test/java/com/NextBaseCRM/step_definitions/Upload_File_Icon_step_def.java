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
    public void user_sees_upload_options_at_the_bottom_of_message_input_field() {
        wait.until(ExpectedConditions.visibilityOf(upload_file_icon.UploadFilesAndImages));
        Assert.assertTrue(upload_file_icon.UploadFilesAndImages.isDisplayed());

    }

    @Then("User clicks on UPLOAD FILES AND IMAGES user given options to choose from his computer")
    public void user_clicks_on_upload_files_and_images_user_given_options_to_choose_from_his_computer() {

        // wait.until(ExpectedConditions.visibilityOf(upload_file_icon.UploadFilesAndImages));
        String path ="/Users/firuzkhalimov/Desktop/GuyFawksCode.jpg";
       // upload_file_icon.UploadFilesAndImages.click();
       // upload_file_icon.UploadFilesAndImages.sendKeys(path);
        actions.moveToElement(upload_file_icon.UploadFilesAndImages).click().sendKeys(path);
    }

    @Then("User chooses desired file we see chosen file under ATTACHED FILES AND IMAGES TEXT")
    public void user_chooses_desired_file_we_see_chosen_file_under_attached_files_and_images_text() {

    }

    @When("User drags and drops desired file in to the UPLOAD FILES AND IMAGES")
    public void user_drags_and_drops_desired_file_in_to_the_upload_files_and_images() {

    }

    @Then("User sees dragged and dropped file under UPLOAD FILES AND IMAGES")
    public void user_sees_dragged_and_dropped_file_under_upload_files_and_images() {

    }
    @When("User clicks SEND button")
    public void user_clicks_send_button() {

    }
    @Then("A new message is displayed on board under ACTIVITY STREAM")
    public void a_new_message_is_displayed_on_board_under_activity_stream() {

    }


}
