package com.NextBaseCRM.Pages;

import com.NextBaseCRM.utilities.Driver;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class QuotePages extends BasePage {

    public QuotePages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    Faker faker = new Faker();

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

    public void enteringSendingVisibilityQuote(){
        String quote =faker.chuckNorris().fact();
        //Driver.getDriver().switchTo().frame(iFrame);
        QuoteInput.sendKeys(quote);
        Driver.getDriver().switchTo().defaultContent();
        actions.moveToElement(SendButton).click().perform();
        WebElement ExpectedQuote =Driver.getDriver().findElement(By.xpath("//*[contains(text(),'"+quote+"')]"));
        wait.until(ExpectedConditions.visibilityOf(ExpectedQuote));
        Assert.assertTrue(ExpectedQuote.isDisplayed());
    }

}
