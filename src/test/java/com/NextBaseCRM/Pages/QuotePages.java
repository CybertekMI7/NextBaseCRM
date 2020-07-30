package com.NextBaseCRM.Pages;

import com.NextBaseCRM.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class QuotePages extends BasePage {

    public QuotePages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='bxhtmled-top-bar-btn bxhtmled-button-quote']")
    private WebElement QuoteIcon;

    @FindBy(xpath = "//*[@class='bxhtmled-quote']")
    public WebElement QuoteInput;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement SendButton;

    @FindBy(className = "bx-editor-iframe")
    private WebElement iFrame;

    public void ClickingOnCommaIcon(){
        wait.until(ExpectedConditions.visibilityOf(QuoteIcon));
        QuoteIcon.click();
    }

    public void visibilityOfQuoteInputBox(){
        wait.until(ExpectedConditions.visibilityOf(iFrame));
        Driver.getDriver().switchTo().frame(iFrame);
        wait.until(ExpectedConditions.visibilityOf(QuoteInput));
        Assert.assertTrue(QuoteInput.isDisplayed());
    }

}
