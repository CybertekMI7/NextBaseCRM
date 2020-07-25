package com.NextBaseCRM.Pages;

import com.NextBaseCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuotePages {

    public QuotePages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='bxhtmled-top-bar-btn bxhtmled-button-quote']")
    public WebElement QuoteIcon;

    @FindBy(xpath = "//*[@class='bxhtmled-quote']")
    public WebElement QuoteInput;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement SendButton;

    @FindBy(className = "bx-editor-iframe")
    public WebElement iFrame;


}
