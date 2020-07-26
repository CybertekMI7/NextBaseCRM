package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.Pages.AddMentionPage;
import com.NextBaseCRM.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddMention_Step_def {

    AddMentionPage mentionPage = new AddMentionPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Then("User locates the Add mention icon and clicks")
    public void user_locates_the_add_mention_icon_and_clicks() {

        wait.until(ExpectedConditions.visibilityOf(mentionPage.AddMentionIcon));
        mentionPage.AddMentionIcon.click();
    }


    @Then("User chooses a contact from dropdown menu")
    public void user_chooses_a_contact_from_dropdown_menu() {


        wait.until(ExpectedConditions.visibilityOf(mentionPage.MentionContact));
        mentionPage.MentionContact.click();
    }

    @Then("User sees selected contact displayed on Page")
    public void user_sees_selected_contact_displayed_on_page() {

        Driver.getDriver().switchTo().frame(mentionPage.iFrame);
        wait.until(ExpectedConditions.visibilityOf(mentionPage.DisplayedText));
        Assert.assertTrue(mentionPage.DisplayedText.isDisplayed());

    }


}
