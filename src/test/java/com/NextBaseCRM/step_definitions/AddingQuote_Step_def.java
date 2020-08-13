package com.NextBaseCRM.step_definitions;
import com.NextBaseCRM.Pages.QuotePages;
import com.NextBaseCRM.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddingQuote_Step_def {

    QuotePages quotePages = new QuotePages();
    WebDriverWait wait= new WebDriverWait(Driver.getDriver(), 10);
    Actions actions = new Actions(Driver.getDriver());


    @When("User clicks on COMMA icon")
    public void user_clicks_on_comma_icon() {

        quotePages.ClickingOnCommaIcon();
    }



    @Then("User sees QUOTE INPUT inside of Message Console")
    public void user_sees_quote_input_inside_of_message_console() {

        quotePages.visibilityOfQuoteInputBox();


    }

    @Then("User enters a quote and presses SEND and sees the quote displayed")
    public void userEntersAQuoteAndPressesSENDAndSeesTheQuoteDisplayed() {

       quotePages.enteringSendingVisibilityQuote();
    }
}

