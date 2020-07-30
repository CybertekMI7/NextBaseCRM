package com.nextBaseCRM.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Like_button_page extends Base_page {

    @FindBy(xpath = "//div [@id='pagetitle']")
    private WebElement activityStream_Text;

    @FindBy(xpath = "(//a[@class='bx-ilike-text'])[1]")
    private WebElement likeButton;

    @FindBy(xpath = "//div[@class='feed-post-emoji-text-box feed-post-emoji-move-to-right']")
    private WebElement liked_Confirmation;



    public void homePage_Confirmation() {
        wait.until(ExpectedConditions.visibilityOf(activityStream_Text));
        Assert.assertTrue(activityStream_Text.isDisplayed());
    }



    public void clickingLikeButton() {
        wait.until(ExpectedConditions.visibilityOf(likeButton)).click();
    }



    public void Visibility_of_Liked() {
        wait.until(ExpectedConditions.visibilityOf(liked_Confirmation));
        Assert.assertTrue(liked_Confirmation.isDisplayed());
    }


}
