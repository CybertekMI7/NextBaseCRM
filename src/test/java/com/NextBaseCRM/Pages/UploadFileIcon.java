package com.NextBaseCRM.Pages;

import com.NextBaseCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFileIcon {

    public UploadFileIcon(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(),'Message')]")
    public WebElement MessageButton;

    @FindBy(xpath = "//*[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement UploadFileIcon;

    @FindBy(xpath = "(//td[@class='diskuf-selector wd-fa-add-file-light-cell wd-fa-add-file-from-main'])[1]")
    public WebElement UploadFilesAndImages;

    @FindBy(xpath = "(//*[contains(text(),'Select document from Bitrix24')])[1]")
    public WebElement selectDocFromB24_text;

    @FindBy(xpath = "(//*[contains(text(),'Download from external drive')])")
    public WebElement DwnldFromExternalDrive_text;

    @FindBy(xpath = "(//*[@class ='wd-fa-add-file-light-title'])[2]")
    public WebElement CreateUsingGoogleDocs_text;


}
