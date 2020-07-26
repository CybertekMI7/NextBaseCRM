package com.NextBaseCRM.Pages;

import com.NextBaseCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TopicIconPage {

    public TopicIconPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='lhe_button_title_blogPostForm']")
    public WebElement TopicIcon;

    @FindBy(xpath = "//input[@id='POST_TITLE']")
    public WebElement TopicBoxInput;
}
