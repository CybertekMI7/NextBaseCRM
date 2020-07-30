package com.NextBaseCRM.Pages;

import com.NextBaseCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Link_Icon_Page extends BasePage {

    public Link_Icon_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@title='Link']")
    private WebElement Link_Icon;

    @FindBy(xpath = "//*[contains(@id,'linkidPostFormLHE_blogPostForm-text')]")
    public WebElement LinkTextInput;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement LunkURlInput;

    @FindBy(className = "bx-editor-iframe")
    public WebElement iFrame;

    public void ClickingOnLinkIcon(){
        wait.until(ExpectedConditions.visibilityOf(Link_Icon));
        Link_Icon.click();
    }





}
