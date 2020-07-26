package com.NextBaseCRM.Pages;

import com.NextBaseCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddMentionPage {

    public AddMentionPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='bx-b-mention-blogPostForm']")
    public WebElement AddMentionIcon;

    @FindBy(xpath = "(//*[@class='bx-finder-box-item-t7-name'])[1]")
    public WebElement MentionContact;

    @FindBy(xpath="//*[@class='bxhtmled-metion']")
    public WebElement DisplayedText;

    @FindBy(className = "bx-editor-iframe")
    public WebElement iFrame;

}
