package com.NextBaseCRM.step_definitions;
import com.NextBaseCRM.Pages.AddingContactsPage;
import io.cucumber.java.en.Then;


public class Adding_Contacts_Step_def {

    AddingContactsPage contactsPage = new AddingContactsPage();


    @Then("User locates To box, clears it and clicks on Add persons, groups and department")
    public void user_locates_to_box_clears_it_and_clicks_on_add_persons_groups_and_department() {

        contactsPage.ToBoxLocateAndAddContacts();


    }

    @Then("From Recent Module user clicks on desired contacts")
    public void from_recent_module_user_clicks_on_desired_contacts() {

        contactsPage.ChoosingContacts();
    }
    @Then("User clicks on  Employees and Departments  module and chooses first contact")
    public void user_clicks_on_employees_and_departments_module_and_chooses_first_contact() {

        contactsPage.CLickEmployeesDepartmentsChoosingContacts();

    }

    @Then("User clicks on Email users")
    public void userClicksOnEmailUsers() {

        contactsPage.ChoosingContacts2();

    }
    @Then("User sees added contacts on  To  box")
    public void user_sees_added_contacts_on_to_box() {

        contactsPage.VisibilityOfContacts();
    }



}
