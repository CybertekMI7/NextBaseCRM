package com.nextBaseCRM.step_definitions;

import com.nextBaseCRM.pages.Like_button_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Like_button_StepDefinitions {

    Like_button_page like_button_pages = new Like_button_page();

    @Given("User is on the homepage")
    public void user_is_on_the_homepage() {
        like_button_pages.homePage_Confirmation();
    }


    @When("User clicks on the like")
    public void user_clicks_on_the_like() {

        like_button_pages.clickingLikeButton();
    }


    @Then("user sees the like button and a thumbs up should appear")
    public void user_sees_the_like_button_and_a_thumbs_up_should_appear() {
        like_button_pages.Visibility_of_Liked();

    }
}
