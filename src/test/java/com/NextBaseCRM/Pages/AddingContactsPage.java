package com.NextBaseCRM.Pages;

import com.NextBaseCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingContactsPage {

    public AddingContactsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(),'All employees')]")
    public WebElement ToInputBox;

    @FindBy(xpath = "(//*[@class='bx-finder-box-item-t7-name'])[1]")
    public WebElement RecentContacts;

    @FindBy(xpath = "(//*[@class='bx-finder-box-item-t7-name'])[2]")
    public WebElement AllEmployees;

    @FindBy(xpath = "//*[contains(@id,'destDepartmentTab_destination')]")
    public WebElement EmployeesAndDepartments;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department-employee-name'])[1]")
    public WebElement EmployeesAndDepartmentFirstContact;

    @FindBy(xpath = "//*[contains(@id,'destEmailTab_destination')]")
    public WebElement EmailUsers;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement CloseWindowIcon;

    @FindBy(xpath = "//span[@data-id='U495']")
    public WebElement AddedContact1;

    @FindBy(xpath = "//span[@data-id='U739']")
    public WebElement AddedContact2;

}
