package com.NextBaseCRM.pages;

import com.NextBaseCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecipientsPage {

    public RecipientsPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='feed-add-post-destination-input']")
    public static WebElement addMore;

    @FindBy(className = "bx-finder-box-item-t7-name")
    public static WebElement recentItem;

    @FindBy(className = "bx-finder-box-tab bx-lm-tab-department")
    public static WebElement EmployeesandDepartments;

    @FindBy(className = "bx-finder-company-department-employee-name")
    public static WebElement EmployeesandDepartmentsItem;

    @FindBy(className = "bx-finder-box-tab bx-lm-tab-email")
    public static WebElement emailUsers;

    @FindBy(className = "popup-window-close-icon")
    public static WebElement closePopupWindow;
}
