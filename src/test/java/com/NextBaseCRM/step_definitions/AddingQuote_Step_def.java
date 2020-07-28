package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.Pages.AddingVideoPage;
import com.NextBaseCRM.Pages.QuotePages;
import com.NextBaseCRM.utilities.Driver;
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

        wait.until(ExpectedConditions.visibilityOf(quotePages.QuoteIcon));
        quotePages.QuoteIcon.click();
    }



    @Then("User sees QUOTE INPUT inside of Message Console")
    public void user_sees_quote_input_inside_of_message_console() {

        wait.until(ExpectedConditions.visibilityOf(quotePages.iFrame));
        Driver.getDriver().switchTo().frame(quotePages.iFrame);
        wait.until(ExpectedConditions.visibilityOf(quotePages.QuoteInput));
        Assert.assertTrue(quotePages.QuoteInput.isDisplayed());

    }

    @Then("User enters a {string} and presses SEND")
    public void user_enters_a_and_presses_send(String quote) {

        quotePages.QuoteInput.sendKeys(quote);
        Driver.getDriver().switchTo().defaultContent();
        actions.moveToElement(quotePages.SendButton).click().perform();
        Driver.getDriver().switchTo().defaultContent();
    }

    @Then("User sees entered {string} displayed on Activity Stream board")
    public void userSeesEnteredDisplayedOnActivityStreamBoard(String quote) {


        WebElement ExpectedQuote =Driver.getDriver().findElement(By.xpath("//*[contains(text(),'"+quote+"')]"));
        wait.until(ExpectedConditions.visibilityOf(ExpectedQuote));
        Assert.assertTrue(ExpectedQuote.isDisplayed());
    }


    }

