package com.NextBaseCRM.Pages;

import com.NextBaseCRM.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TopicIconPage extends BasePage {

    public TopicIconPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='lhe_button_title_blogPostForm']")
    private WebElement TopicIcon;

    @FindBy(xpath = "//input[@id='POST_TITLE']")
    private WebElement TopicBoxInput;

    public void ClickingOnTopicIcon(){
        wait.until(ExpectedConditions.visibilityOf(TopicIcon));
        actions.moveToElement(TopicIcon).click().perform();
    }

    public void VisibilityOfTopicTextBox(){
        wait.until(ExpectedConditions.visibilityOf(TopicBoxInput));
        Assert.assertTrue(TopicBoxInput.isDisplayed());
    }
}
