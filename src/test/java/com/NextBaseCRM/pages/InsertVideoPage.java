package com.NextBaseCRM.pages;

import com.NextBaseCRM.step_definitions.InsertVideo;
import com.NextBaseCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsertVideoPage {

    public InsertVideoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "///*[@id=\"bx-b-video-blogPostForm\"]/span/i)")
    public static WebElement insertVideoIcon;

    @FindBy(id = "video_idPostFormLHE_blogPostForm-source")
    public static WebElement URLinputBox;

    @FindBy(xpath = "//*[@id=\"cancel\"]")
    public static WebElement cancelPopupWindow;
}
