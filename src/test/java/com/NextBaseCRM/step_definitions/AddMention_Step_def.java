package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.Pages.AddMentionPage;
import io.cucumber.java.en.Then;


public class AddMention_Step_def {

    AddMentionPage mentionPage = new AddMentionPage();

    @Then("User locates the Add mention icon and clicks")
    public void user_locates_the_add_mention_icon_and_clicks() {

        mentionPage.AddMentionIconClick();

    }


    @Then("User chooses a contact from dropdown menu")
    public void user_chooses_a_contact_from_dropdown_menu() {

      mentionPage.ChoosingContacts();

    }

    @Then("User sees selected contact displayed on Page")
    public void user_sees_selected_contact_displayed_on_page() {
        mentionPage.VisibilityOfMentionedContacts();

    }


}
