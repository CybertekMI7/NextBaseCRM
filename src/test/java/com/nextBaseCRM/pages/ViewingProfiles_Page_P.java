package com.nextBaseCRM.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ViewingProfiles_Page_P extends Base_page {


    @FindBy(xpath = "//div [@id='pagetitle']")
    private WebElement activityStream_Text;

    @FindBy(xpath = "//a[@id='bp_520']")
    private WebElement reviewerName;

    @FindBy(xpath = "//span[@id='pagetitle-star']")
    private WebElement reviewerProfilePage;
    public void homePageConfirmation() {
        wait.until(ExpectedConditions.visibilityOf(activityStream_Text));
        Assert.assertTrue(activityStream_Text.isDisplayed());
    }


    public void reviewerNameButton (){
        wait.until(ExpectedConditions.visibilityOf(reviewerName)).click();
    }

    public void setReviewerProfilePage(){
        wait.until(ExpectedConditions.visibilityOf(reviewerProfilePage));
        Assert.assertTrue(reviewerProfilePage.isDisplayed());
    }




}
