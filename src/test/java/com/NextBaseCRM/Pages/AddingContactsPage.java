package com.NextBaseCRM.Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddingContactsPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'All employees')]")
    private WebElement ToInputBox;

    @FindBy(xpath = "(//*[@class='bx-finder-box-item-t7-name'])[1]")
    private WebElement RecentContacts;

    @FindBy(xpath = "(//*[@class='bx-finder-box-item-t7-name'])[2]")
    private WebElement AllEmployees;

    @FindBy(xpath = "//*[contains(@id,'destDepartmentTab_destination')]")
    private WebElement EmployeesAndDepartments;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department-employee-name'])[1]")
    private WebElement EmployeesAndDepartmentFirstContact;

    @FindBy(xpath = "//*[contains(@id,'destEmailTab_destination')]")
    private WebElement EmailUsers;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    private WebElement CloseWindowIcon;

    @FindBy(xpath = "(//span[@class='feed-add-post-destination-text'])[1]")
    private WebElement AddedContact1;

    @FindBy(xpath = "(//span[@class='feed-add-post-destination-text'])[2]")
    private WebElement AddedContact2;


    public void ToBoxLocateAndAddContacts(){
        wait.until(ExpectedConditions.elementToBeClickable(ToInputBox));
        actions.moveToElement(ToInputBox).click().perform();
        wait.until(ExpectedConditions.visibilityOf(AllEmployees));
        AllEmployees.click();
    }

    public void ChoosingContacts(){
        wait.until(ExpectedConditions.visibilityOf(RecentContacts));
        actions.moveToElement(RecentContacts).click().perform();
    }

    public void CLickEmployeesDepartmentsChoosingContacts(){
        EmployeesAndDepartments.click();
        wait.until(ExpectedConditions.visibilityOf(EmployeesAndDepartmentFirstContact));
        EmployeesAndDepartmentFirstContact.click();
    }

    public void ChoosingContacts2(){
        EmailUsers.click();
        CloseWindowIcon.click();
    }

    public void VisibilityOfContacts(){
        wait.until(ExpectedConditions.visibilityOf(AddedContact1 ));
        Assert.assertTrue(AddedContact1.isDisplayed());
        Assert.assertTrue(AddedContact2.isDisplayed());
    }

}
