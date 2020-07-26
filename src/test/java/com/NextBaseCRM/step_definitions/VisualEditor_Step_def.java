package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.Pages.VisualEditorPage;
import com.NextBaseCRM.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VisualEditor_Step_def {

    VisualEditorPage visualEditorPage = new VisualEditorPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    @When("User clicks on Visual Editor Icon")
    public void user_clicks_on_visual_editor_icon() {
         wait.until(ExpectedConditions.visibilityOf(visualEditorPage.VisualEditorIcon));
        visualEditorPage.VisualEditorIcon.click();

    }




    @Then("User sees EDITOR TEXT bar on top of the messages")
    public void user_sees_editor_text_bar_on_top_of_the_messages() {

        wait.until(ExpectedConditions.visibilityOf(visualEditorPage.VisualEditorBox));
        Assert.assertTrue(visualEditorPage.VisualEditorBox.isDisplayed());

    }
}
