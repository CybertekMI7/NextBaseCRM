package com.NextBaseCRM.Pages;

import com.NextBaseCRM.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class VisualEditorPage extends BasePage {

    public VisualEditorPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@id='lhe_button_editor_blogPostForm']")
    private WebElement VisualEditorIcon;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-wrap']")
    private WebElement VisualEditorBox;

    public void clickingOnVisualEditor(){
        wait.until(ExpectedConditions.visibilityOf(VisualEditorIcon));
        VisualEditorIcon.click();
    }

    public void VisibilityOfEditorBar(){
        wait.until(ExpectedConditions.visibilityOf(VisualEditorBox));
        Assert.assertTrue(VisualEditorBox.isDisplayed());
    }
}
