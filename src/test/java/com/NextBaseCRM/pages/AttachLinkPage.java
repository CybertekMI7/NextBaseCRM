package com.NextBaseCRM.pages;

import com.NextBaseCRM.step_definitions.AttachLink;
import com.NextBaseCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AttachLinkPage {

    public AttachLinkPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"bx-b-link-blogPostForm\"]/span/i")
    public static WebElement insertLink;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public static WebElement enterText;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public static WebElement enterLink;

    @FindBy(id = "cancel")
    public static WebElement cancel;


}
