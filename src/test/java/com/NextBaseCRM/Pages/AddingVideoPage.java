package com.NextBaseCRM.Pages;

import com.NextBaseCRM.utilities.Driver;
import org.junit.Assert;
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

    @FindBy(xpath = "//*[@class='ytp-cued-thumbnail-overlay-image']")
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
        wait.until(ExpectedConditions.elementToBeClickable(VideoSourceInput));
        String URl ="https://youtu.be/hdPV6eOcRgo";

        //JavascriptExecutor jse =((JavascriptExecutor)Driver.getDriver());
       // jse.executeScript("https://youtu.be/BJ2es2vAnDQ",VideoSourceInput);

        actions.sendKeys(VideoSourceInput,URl).build().perform();
       // wait.until(ExpectedConditions.visibilityOf(VideoTitle));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        SaveButton.click();
    }

    public void VisibilityOfUploadedVideo(){
        Driver.getDriver().switchTo().frame(iFrame);
        wait.until(ExpectedConditions.visibilityOf(ConfirmationVideo));
        Assert.assertTrue(ConfirmationVideo.isDisplayed());
    }

}
