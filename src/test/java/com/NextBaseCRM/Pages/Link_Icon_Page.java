package com.NextBaseCRM.Pages;

import com.NextBaseCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Link_Icon_Page {

    public Link_Icon_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@title='Link']")
    public WebElement Link_Icon;

    @FindBy(xpath = "//*[contains(@id,'linkidPostFormLHE_blogPostForm-text')]")
    public WebElement LinkTextInput;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement LunkURlInput;

    @FindBy(className = "bx-editor-iframe")
    public WebElement iFrame;


}
