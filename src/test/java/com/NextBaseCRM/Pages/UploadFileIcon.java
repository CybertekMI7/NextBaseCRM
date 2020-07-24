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


}
