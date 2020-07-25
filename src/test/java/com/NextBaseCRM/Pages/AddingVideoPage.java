package com.NextBaseCRM.Pages;

import com.NextBaseCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddingVideoPage {

    public AddingVideoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='bxhtmled-top-bar-btn bxhtmled-button-video']")
    public WebElement AddVideoIcon;

    @FindBy(xpath = "//input[@id='video_idPostFormLHE_blogPostForm-source']")
    public WebElement VideoSourceInput;

    @FindBy(xpath = "//*[contains(text(),'Video title:')]")
    public WebElement VideoTitle;

    @FindBy(xpath = "//input[@value='Save']")
    public WebElement SaveButton;

    @FindBy(xpath = "//img[@title='Video']")
    public WebElement ConfirmationVideo;

    @FindBy(className = "bx-editor-iframe")
    public WebElement iFrame;



}
