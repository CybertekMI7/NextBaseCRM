package com.NextBaseCRM.Pages;

import com.NextBaseCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VisualEditorPage {

    public VisualEditorPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@id='lhe_button_editor_blogPostForm']")
    public WebElement VisualEditorIcon;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-wrap']")
    public WebElement VisualEditorBox;

}
