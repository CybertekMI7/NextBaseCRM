package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.Pages.AddingContactsPage;
import com.NextBaseCRM.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Adding_Contacts_Step_def {

    AddingContactsPage contactsPage = new AddingContactsPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
    Actions actions = new Actions(Driver.getDriver());

    @Then("User locates To box, clears it and clicks on Add persons, groups and department")
    public void user_locates_to_box_clears_it_and_clicks_on_add_persons_groups_and_department() {

        wait.until(ExpectedConditions.elementToBeClickable(contactsPage.ToInputBox));
        actions.moveToElement(contactsPage.ToInputBox).click().perform();
        wait.until(ExpectedConditions.visibilityOf(contactsPage.AllEmployees));
        contactsPage.AllEmployees.click();

    }

    @Then("From Recent Module user clicks on desired contacts")
    public void from_recent_module_user_clicks_on_desired_contacts() {

        wait.until(ExpectedConditions.visibilityOf(contactsPage.RecentContacts));
        actions.moveToElement(contactsPage.RecentContacts).click().perform();
    }
    @Then("User clicks on  Employees and Departments  module and chooses first contact")
    public void user_clicks_on_employees_and_departments_module_and_chooses_first_contact() {

        contactsPage.EmployeesAndDepartments.click();
        wait.until(ExpectedConditions.visibilityOf(contactsPage.EmployeesAndDepartmentFirstContact));
        contactsPage.EmployeesAndDepartmentFirstContact.click();

    }

    @Then("User clicks on Email users")
    public void userClicksOnEmailUsers() {

        contactsPage.EmailUsers.click();
        contactsPage.CloseWindowIcon.click();

    }
    @Then("User sees added contacts on  To  box")
    public void user_sees_added_contacts_on_to_box() {

        wait.until(ExpectedConditions.visibilityOf(contactsPage.AddedContact1 ));
        Assert.assertTrue(contactsPage.AddedContact1.isDisplayed());
        Assert.assertTrue(contactsPage.AddedContact2.isDisplayed());
    }



}
