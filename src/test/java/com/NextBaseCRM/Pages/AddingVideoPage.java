package com.NextBaseCRM.Pages;

import com.NextBaseCRM.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddingVideoPage extends BasePage {

    Actions actions = new Actions(Driver.getDriver());

    public AddingVideoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='bxhtmled-top-bar-btn bxhtmled-button-video']")
    private WebElement AddVideoIcon;

    @FindBy(xpath = "//input[@id='video_idPostFormLHE_blogPostForm-source']")
    private WebElement VideoSourceInput;

    @FindBy(xpath = "//*[@id='video_idPostFormLHE_blogPostForm-title']")
    private WebElement VideoTitle;

    @FindBy(xpath = "//input[@value='Save']")
    private WebElement SaveButton;

    @FindBy(xpath = "//*[@class='ui-btn ui-btn-lg ui-btn-primary']")
    private WebElement SendButton;

    @FindBy(xpath = "//img[@title='Video']")
    private WebElement ConfirmationVideo;

    @FindBy(className = "bx-editor-iframe")
    private WebElement iFrame;


    public void LocatingVideoIconAndClick(){
        wait.until(ExpectedConditions.visibilityOf(AddVideoIcon));
        AddVideoIcon.click();
    }

    public void EnteringVideoURL(){
        wait.until(ExpectedConditions.elementToBeClickable(VideoSourceInput));
        String URL ="https://youtu.be/hdPV6eOcRgo";
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        VideoSourceInput.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), URL);
        //actions.sendKeys(VideoSourceInput,URl).build().perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        wait.until(ExpectedConditions.visibilityOf(VideoTitle));
        wait.until(ExpectedConditions.visibilityOf(SaveButton)).click();
        wait.until(ExpectedConditions.visibilityOf(SendButton)).click();
    }

    public void VisibilityOfUploadedVideo(){
        wait.until(ExpectedConditions.visibilityOf(ConfirmationVideo));
        Assert.assertTrue(ConfirmationVideo.isDisplayed());
    }

}
