package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.pages.RecipientsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Recipients {

    RecipientsPage recipientsPage = new RecipientsPage();

    @When("User clicks add more")
    public void user_clicks_add_more() throws InterruptedException{
        recipientsPage.addMore.click();
        Thread.sleep(3000);
    }

    @Then("User is able to add recipients")
    public void user_is_able_to_add_recipients() {
        recipientsPage.recentItem.click();
        recipientsPage.EmployeesandDepartments.click();
        recipientsPage.EmployeesandDepartmentsItem.click();
        recipientsPage.emailUsers.click();
        recipientsPage.closePopupWindow.click();
    }

}
