package com.nextBaseCRM.step_definitions;

import com.nextBaseCRM.pages.ViewingProfiles_Page_P;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewingProfiles_StepDefinition_SD {

    ViewingProfiles_Page_P viewingProfiles_page_p = new ViewingProfiles_Page_P();


    @Given("User sees the reviewers names")
    public void userSeesTheReviewersNames() {
        viewingProfiles_page_p.homePageConfirmation();
    }


    @When("User clicks on reviewers names")
    public void userClicksOnReviewersNames() {
        viewingProfiles_page_p.reviewerNameButton();
    }


    @Then("User is directed to the reviewer profile page")
    public void userIsDirectedToTheReviewerProfilePage() {

    }
}
