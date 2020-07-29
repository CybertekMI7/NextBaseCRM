package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.Pages.Link_Icon_Page;
import com.NextBaseCRM.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddingLink_Step_def  {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
    Link_Icon_Page linkIconPage = new Link_Icon_Page();

    @Then("User locates and clicks on LINK icon")
    public void user_locates_and_clicks_on_link_icon() {

       linkIconPage.ClickingOnLinkIcon();

    }


    @Then("User enters {string} and {string} and clicks save")
    public void userEntersAndAndClicksSave(String LinkText, String LinkURL) {

        wait.until(ExpectedConditions.visibilityOf(linkIconPage.LinkTextInput));
        linkIconPage.LinkTextInput.sendKeys(LinkText);
        linkIconPage.LunkURlInput.sendKeys(LinkURL+ Keys.ENTER);
    }


    @Then("User sees LINK TEXT {string} LIGHT BLUE in Message Console")
    public void userSeesLINKTEXTLIGHTBLUEInMessageConsole(String LinkText) {
        Driver.getDriver().switchTo().frame(linkIconPage.iFrame);
        WebElement ExpectedLink =Driver.getDriver().findElement(By.xpath("//*[contains(text(),'"+LinkText+"')]"));
        wait.until(ExpectedConditions.visibilityOf(ExpectedLink));
        Assert.assertTrue(ExpectedLink.isDisplayed());


    }
}
