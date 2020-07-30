package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.pages.BitrixLoginPage;
import com.NextBaseCRM.pages.UploadFilesPage;
import com.NextBaseCRM.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;

public class UploadFiles {

    BitrixLoginPage bitrixLoginPage = new BitrixLoginPage();
    UploadFilesPage uploadFilesPage = new UploadFilesPage();

@Given("User is logged in")
    public void user_is_logged_in() {
        String username = ConfigurationReader.getProperty("helpdesk_username1");
        String password = ConfigurationReader.getProperty("bitrix_password");

        bitrixLoginPage.usernameBox.sendKeys(username + Keys.TAB);
        bitrixLoginPage.passwordBox.sendKeys(password + Keys.ENTER);
    }

    @Given("User is on the Announcement subheadding")
    public void user_is_on_the_announcement_subheadding() throws InterruptedException{
        uploadFilesPage.moreDropdown.click();
        uploadFilesPage.announcement.click();
        Thread.sleep(2000);
    }

    @Given("User clicks on upload files icon")
    public void user_clicks_on_upload_files_icon() {
        uploadFilesPage.uploadFiles.click();
    }

    @Given("User can see the four options")
    public void user_can_see_the_four_options() {
        uploadFilesPage.uploadFilesandImages.isDisplayed();
        uploadFilesPage.selectDocumentFromBitrix24.isDisplayed();
        uploadFilesPage.downloadFromExternalDrive.isDisplayed();
        uploadFilesPage.createUsingGoogleDocs.isDisplayed();
    }

    @Then("User clicks one of the four options to upload\\/download various forms of files")
    public void user_clicks_one_of_the_four_options_to_upload_download_various_forms_of_files() {
        System.out.println("successful verification");
    }



}
