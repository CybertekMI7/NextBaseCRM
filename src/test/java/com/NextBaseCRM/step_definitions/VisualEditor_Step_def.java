package com.NextBaseCRM.step_definitions;
import com.NextBaseCRM.Pages.VisualEditorPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VisualEditor_Step_def {

    VisualEditorPage visualEditorPage = new VisualEditorPage();

    @When("User clicks on Visual Editor Icon")
    public void user_clicks_on_visual_editor_icon() {

        visualEditorPage.clickingOnVisualEditor();
    }


    @Then("User sees EDITOR TEXT bar on top of the messages")
    public void user_sees_editor_text_bar_on_top_of_the_messages() {

        visualEditorPage.VisibilityOfEditorBar();

    }
}
