package com.NextBaseCRM.Pages;

import com.NextBaseCRM.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddingVideoPage extends BasePage {

    public AddingVideoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='bxhtmled-top-bar-btn bxhtmled-button-video']")
    private WebElement AddVideoIcon;

    @FindBy(xpath = "//input[@id='video_idPostFormLHE_blogPostForm-source']")
    private WebElement VideoSourceInput;

    @FindBy(xpath = "//*[contains(text(),'Video title:')]")
    private WebElement VideoTitle;

    @FindBy(xpath = "//input[@value='Save']")
    private WebElement SaveButton;

    @FindBy(xpath = "//img[@title='Video']")
    private WebElement ConfirmationVideo;

    @FindBy(className = "bx-editor-iframe")
    private WebElement iFrame;


    public void LocatingVideoIconAndClick(){
        wait.until(ExpectedConditions.visibilityOf(AddVideoIcon));
        AddVideoIcon.click();
    }

    public void EnteringVideoURL(){
        wait.until(ExpectedConditions.visibilityOf(VideoSourceInput));
        String URl ="https://youtu.be/BJ2es2vAnDQ";
        VideoSourceInput.sendKeys(URl);
        wait.until(ExpectedConditions.visibilityOf(VideoTitle));
        SaveButton.click();
    }

    public void VisibilityOfUploadedVideo(){
        Driver.getDriver().switchTo().frame(iFrame);
        wait.until(ExpectedConditions.visibilityOf(ConfirmationVideo));
        Assert.assertTrue(ConfirmationVideo.isDisplayed());
    }

}
