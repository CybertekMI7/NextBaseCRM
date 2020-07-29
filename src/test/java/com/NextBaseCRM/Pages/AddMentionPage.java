package com.NextBaseCRM.Pages;

import com.NextBaseCRM.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class AddMentionPage extends BasePage {

    public AddMentionPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='bx-b-mention-blogPostForm']")
    private WebElement AddMentionIcon;

    @FindBy(xpath = "(//*[@class='bx-finder-box-item-t7-name'])[1]")
    private WebElement MentionContact;

    @FindBy(xpath="//*[@class='bxhtmled-metion']")
    private WebElement DisplayedText;

    @FindBy(className = "bx-editor-iframe")
    private WebElement iFrame;

    public void AddMentionIconClick(){
        wait.until(ExpectedConditions.visibilityOf(AddMentionIcon));
        AddMentionIcon.click();
    }

    public void ChoosingContacts(){
        wait.until(ExpectedConditions.visibilityOf(MentionContact));
        MentionContact.click();
    }

    public void VisibilityOfMentionedContacts(){
        Driver.getDriver().switchTo().frame(iFrame);
        wait.until(ExpectedConditions.visibilityOf(DisplayedText));
        Assert.assertTrue(DisplayedText.isDisplayed());
    }

}
