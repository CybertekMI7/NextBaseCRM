package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.pages.AttachLinkPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AttachLink {

AttachLinkPage attachLinkPage = new AttachLinkPage();

    @When("User clicks link icon")
    public void user_clicks_link_icon() {
        attachLinkPage.insertLink.click();
    }

    @Then("User is able to attach link")
    public void user_is_able_to_attach_link() {
        attachLinkPage.enterText.click();
        attachLinkPage.enterLink.click();
        attachLinkPage.cancel.click();
    }
}
