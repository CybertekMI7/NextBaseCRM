package com.NextBaseCRM.Pages;

import com.NextBaseCRM.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UploadFileIcon extends BasePage {

    public UploadFileIcon(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(),'Message')]")
    private WebElement MessageButton;

    @FindBy(xpath = "//*[@id='bx-b-uploadfile-blogPostForm']")
    private WebElement UploadFileIcon;

    @FindBy(xpath = "(//td[@class='diskuf-selector wd-fa-add-file-light-cell wd-fa-add-file-from-main'])[1]")
    private WebElement UploadFilesAndImages;

    @FindBy(xpath = "(//*[contains(text(),'Select document from Bitrix24')])[1]")
    private WebElement selectDocFromB24_text;

    @FindBy(xpath = "(//*[contains(text(),'Download from external drive')])")
    private WebElement DwnldFromExternalDrive_text;

    @FindBy(xpath = "(//*[@class ='wd-fa-add-file-light-title'])[2]")
    private WebElement CreateUsingGoogleDocs_text;

    public void UserIsOnHomePage(){
        Assert.assertTrue(MessageButton.isDisplayed());

    }

    public void ClickingOnMessagesTab(){
        wait.until(ExpectedConditions.visibilityOf(MessageButton));
        MessageButton.click();
    }

    public void ClickingOnUploadFiles(){
        wait.until(ExpectedConditions.visibilityOf(UploadFileIcon));
        UploadFileIcon.click();
    }

    public void VisibilityOfUploadOptions(){
        wait.until(ExpectedConditions.visibilityOf(UploadFilesAndImages));
        Assert.assertTrue(UploadFilesAndImages.isDisplayed());
        Assert.assertTrue(CreateUsingGoogleDocs_text.isDisplayed());
        Assert.assertTrue(DwnldFromExternalDrive_text.isDisplayed());
        Assert.assertTrue(selectDocFromB24_text.isDisplayed());
    }

}
