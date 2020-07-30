package com.NextBaseCRM.pages;

import com.NextBaseCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFilesPage {

    public UploadFilesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "feed-add-post-form-link-text")
    public static WebElement moreDropdown;

    @FindBy (xpath = "//div[@id='menu-popup-feed-add-post-form-popup']/div[1]/div[1]/div[1]/span[3]/span[2]")
    public static WebElement announcement;

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public static WebElement uploadFiles;

    @FindBy (className = "wd-fa-add-file-light")
    public static WebElement uploadFilesandImages;

    @FindBy (className = "wd-fa-add-file-light-title-text diskuf-selector-link")
    public static WebElement selectDocumentFromBitrix24;

    @FindBy (className = "wd-fa-add-file-light-title-text")
    public static WebElement downloadFromExternalDrive;

    @FindBy (className = "wd-fa-add-file-editor")
    public static WebElement createUsingGoogleDocs;




}
