package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.pages.TasksPage;
import com.NextBaseCRM.utilities.ConfigurationReader;
import com.NextBaseCRM.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


public class AssignTasks {

    TasksPage tasksPage;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("loginURL"));
        tasksPage = new TasksPage();
    }

    @Given("user logged in as {string}")
    public void user_logged_in_as(String string) {
        tasksPage.login(string);
    }

    @When("user is in Tasks submodule of Activity Stream")
    public void user_is_in_tasks_submodule_of_activity_stream() {
        tasksPage.tasksTab.click();
    }

    @When("user clicks on new task button")
    public void he_she_clicks_on_new_task_button() {
        tasksPage.actions.moveToElement(tasksPage.newTask).click().perform();
    }

    @When("clicks on High Priority checkbox")
    public void clicks_on_high_priority_checkbox() {
        tasksPage.switchToNewTaskIframe();
        tasksPage.wait.until(ExpectedConditions.elementToBeClickable(tasksPage.highPriorityCheckbox)).click();
    }

    @Then("High Priority checkbox should be marked checked")
    public void high_priority_checkbox_should_be_marked_checked() {
        Assert.assertTrue(tasksPage.highPriorityCheckbox.isSelected());
    }

    @When("clicks on Visual Text Editor")
    public void clicks_on_visual_text_editor() {
        tasksPage.switchToNewTaskIframe();
        tasksPage.wait.until(ExpectedConditions.elementToBeClickable(tasksPage.visualEditorIcon)).click();
    }
    @Then("the editor text-bar should display on top of the message box.")
    public void the_editor_text_bar_should_display_on_top_of_the_message_box() {
        Assert.assertTrue(tasksPage.editorTextbar.isDisplayed());
    }

    @When("clicks on upload files icon")
    public void clicks_on_upload_files_icon() {
        tasksPage.switchToNewTaskIframe();
        tasksPage.wait.until(ExpectedConditions.elementToBeClickable(tasksPage.uploadIcon)).click();
    }

    int index;
    @When("uploads files from {string}")
    public void string(String string) {
        switch (string.trim()){
            case ("local disks"):
                index = tasksPage.setStrStorage("1_P7-84.feature");
                String path = System.getProperty("user.dir") + File.separator +
                        "src" + File.separator + "test" + File.separator + "resources" +
                        File.separator + "features" + File.separator + tasksPage.getStrStorage(index);
                tasksPage.uploadFilesAndImages.sendKeys(path);
                break;
            case ("external drive"):
                tasksPage.uploadFromExternalDrive();
                break;
            case ("Bitrix24"):
                index = tasksPage.setStrStorage("Logo.gif");
                tasksPage.uploadFromBitrix();
                break;
            case ("Google Docs"):
                tasksPage.uploadByCreatingGoogleDocs();
                break;
            default:
                throw new RuntimeException("Error input for upload files");
        }
    }

    int indexB;
    @Then("the uploaded file's name should be displayed")
    public void the_uploaded_file_s_name_should_be_displayed() {
        indexB = tasksPage.setRandomString();
        tasksPage.finishTaskCreation(tasksPage.getStrStorage(indexB));
        Driver.getDriver().switchTo().defaultContent();
        Driver.getDriver().findElement(By.linkText(tasksPage.getStrStorage(indexB))).click();
        tasksPage.switchToNewTaskIframe();
        String actual =  tasksPage.wait.until(ExpectedConditions.
                visibilityOf(tasksPage.uploadedFileLocation)).getAttribute("alt");
        String expected = tasksPage.getStrStorage(index);
        Assert.assertTrue(actual.matches(expected.substring(0,expected.indexOf('.')) +
                "(.*)" + expected.substring(expected.indexOf(".")) + "(.*)"));
    }

    @When("clicks on Comma icon")
    public void clicks_on_comma_icon() {
        tasksPage.switchToNewTaskIframe();
        tasksPage.wait.until(ExpectedConditions.elementToBeClickable(tasksPage.quoteIcon)).click();
    }

    int index1;
    int index2;
    @When("inputs random text")
    public void input_random_text() {
        Driver.getDriver().switchTo().frame(tasksPage.messageBoxIframe);
        tasksPage.quoteInputBox.click();
        index1 = tasksPage.setRandomString();
        tasksPage.quoteInputBox.sendKeys(tasksPage.getStrStorage(index1));
        index2 = tasksPage.setRandomString();
        Driver.getDriver().switchTo().parentFrame();
        tasksPage.finishTaskCreation(tasksPage.getStrStorage(index2));
    }

    @Then("quote input box should display on top of the message box")
    public void quote_input_box_should_display_on_top_of_the_message_box() {
        Driver.getDriver().switchTo().defaultContent();
        Driver.getDriver().findElement(By.linkText(tasksPage.getStrStorage(index2))).click();
        tasksPage.switchToNewTaskIframe();
        String actual = tasksPage.quoteText.getText();
        Assert.assertEquals(actual,tasksPage.getStrStorage(index1));
    }

    @When("clicks on Add mention icon")
    public void clicks_on_add_mention_icon() {
        tasksPage.switchToNewTaskIframe();
        tasksPage.wait.until(ExpectedConditions.elementToBeClickable(tasksPage.addMentionIcon)).click();
    }

    int index3;
    @When("clicks {string} from the list provided in dropdown")
    public void clicks_from_the_list_provided_in_dropdown(String string) {
        switch (string){
            case "1":
                index3 = tasksPage.setStrStorage(tasksPage.addMentionEmail1.getText());
                tasksPage.addMentionEmail1.click();
                break;
            case "2":
                tasksPage.actions.moveToElement(tasksPage.
                        addMentionEmployeesAndDepartments).click().perform();
                index3 = tasksPage.setStrStorage(tasksPage.addMentionEmail2.getText());
                tasksPage.addMentionEmail2.click();
                break;
        }
    }

    @Then("selected contact should be displayed in the message box")
    public void selected_contact_should_be_displayed_in_the_message_box() {
        Driver.getDriver().switchTo().frame(tasksPage.messageBoxIframe);
        String expected = tasksPage.getStrStorage(index3);
        tasksPage.actions.moveToElement(tasksPage.addMentionTextboxMessage);
        Assert.assertEquals(expected,
                tasksPage.wait.until(ExpectedConditions.
                        visibilityOf(tasksPage.addMentionTextboxMessage)).getText());
    }

    @When("clicks on link icon")
    public void clicks_on_link_icon() {
        tasksPage.switchToNewTaskIframe();
        tasksPage.linkIcon.click();
    }

    @When("inputs {string} and {string}")
    public void inputs_and(String string, String string2) {
        tasksPage.linkInputBox.sendKeys(string + Keys.TAB + string2 + Keys.ENTER);
    }

    @Then("the {string} with linked {string} should be displayed in the message box")
    public void the_with_linked_shoul_be_displayed_in_the_message_box(String string, String string2) {
        Driver.getDriver().switchTo().frame(tasksPage.messageBoxIframe);
        Assert.assertEquals("Actual and Expected result do not match",string,tasksPage.linkTextboxMessage.getText());
        Assert.assertEquals("Actual and Expected result do not match",string2,tasksPage.linkTextboxMessage.getAttribute("href"));
    }

    @When("clicks on Checkist icon")
    public void clicks_on_checkist_icon() {
        tasksPage.switchToNewTaskIframe();
        tasksPage.wait.until(ExpectedConditions.elementToBeClickable(tasksPage.checklistIcon)).click();
    }

    @When("inputs {string} in the input box")
    public void inputs_in_the_input_box(String string) {
        tasksPage.checklistInputBox.sendKeys(string);
    }

    @When("clicks on add button")
    public void clicks_on_add_button() {
        tasksPage.checklistAddButton.click();
    }
    @When("clicks on separator button")
    public void clicks_on_separator_button() {
        tasksPage.setWait(0.3);
        tasksPage.checklistSeparator.click();
    }
    @When("clicks on check mark")
    public void clicks_on_check_mark() {
        tasksPage.checklistAddCheckMark.click();
    }

    @When("checklist items {string}, separator line, and {string} should be displayed")
    public void checklist_items_separator_line_and_should_be_displayed(String string, String string2) {
        String message1 = tasksPage.checklistFirstMessage.getText().trim();
        String message2 = tasksPage.checklistSecondMessage.getText().trim();
        Assert.assertEquals(message1, string);
        Assert.assertEquals(message2, string2);

    }
    @When("hovers over checklist item")
    public void user_hovers_over_checklist_item() {
        tasksPage.actions.moveToElement(tasksPage.checklistSecondMessage).perform();
    }

    @When("clicks on x mark")
    public void clicks_on_x_mark() {
        tasksPage.checklistDeleteIcon.click();
        tasksPage.setWait(0.5);
        tasksPage.actions.moveToElement(tasksPage.checklistSeparatorDelete).click().perform();
        tasksPage.setWait(0.5);
        tasksPage.checklistDeleteIcon.click();
    }

    @Then("checklist item should disappear.")
    public void checklist_item_should_disappear() {
        tasksPage.setWait(0.5);
        List<WebElement> list = Driver.getDriver().
                findElements(By.xpath("//div[starts-with(@data-item-value, 'n')]" +
                        "//span[@class='js-id-checklist-is-i-title ']"));
        Assert.assertEquals(0,list.size());
    }

    @When("clicks on Deadline input box")
    public void clicks_on_deadline_input_box() {
        tasksPage.switchToNewTaskIframe();
        tasksPage.wait.until(ExpectedConditions.elementToBeClickable(tasksPage.deadlineCalendar)).click();
    }

    int index4;
    @When("selects time {string}{string}{string}{string}{string}{string}")
    public void selects_time(String year, String month, String day, String hours, String minutes, String am_or_pm) {
        tasksPage.setCalendar("//div[contains(@id, 'popup-window-content-calendar_popup_')]", year,
                month, day, hours, minutes, am_or_pm);
        index4 = tasksPage.setStrStorage(month + "/" + day + "/" + year + " " + hours + ":" + minutes + " " + am_or_pm);
    }

    @When("clicks on Time planning")
    public void clicks_on_time_planning() {
        tasksPage.actions.moveToElement(tasksPage.deadlineTimePlanning).click().perform();
    }

    int index7;
    @When("selects time for start task on {string}{string}{string}{string}{string}{string}")
    public void selects_time_for_start_task_on(String string, String string2, String string3, String string4, String string5, String string6) {
        index7 = tasksPage.setStrStorage(string2 + "/" + string3 + "/" + string + " " + string4 +
                ":" + string5 + " " + string6);
        tasksPage.setWait(0.3);
        tasksPage.actions.moveToElement(tasksPage.deadlineTimePlanningCalendar).click().perform();
        tasksPage.setCalendar("//div[@id='task-tags-popup']/following-sibling::div", string,
                string2, string3, string4, string5, string6);
    }

    @When("clicks on {string} for Duration input")
    public void clicks_on_for_duration_input(String string) {
        Driver.getDriver().findElement(By.xpath("//span[@class='task-dashed-link-inner'][.='" +
                string + "']")).click();
    }


    @When("inputs {string}")
    public void inputs(String string) {
        tasksPage.durationInputBox.sendKeys(string);
    }

    int index5;
    int index6;
    @When("presses CTRL and ENTER")
    public void types_ctrl_enter() {
        String created = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a")).toLowerCase();
        index6 = tasksPage.setStrStorage(created);

        index5 = tasksPage.setRandomString();
        tasksPage.finishTaskCreation2(tasksPage.getStrStorage(index5));
    }

    @When("clicks on just created new task")
    public void clicks_on_just_created_new_task() {
        Driver.getDriver().switchTo().defaultContent();
        Driver.getDriver().findElement(By.linkText(tasksPage.getStrStorage(index5))).click();

    }
    @Then("deadline, created on, start date and time should be displayed")
    public void created_on_start_end_date_and_time_should_be_displayed() {
        tasksPage.switchToNewTaskIframe();
        Assert.assertEquals("'Deadline' assertion failed", tasksPage.getStrStorage(index4), tasksPage.deadlineInfo.getText());
        Assert.assertEquals("'Created on' assertion failed", tasksPage.getStrStorage(index6),
                tasksPage.deadlineCreatedOnInfo.getText().replaceFirst(":.. ", " "));
        Assert.assertEquals("'Started' assertion failed", tasksPage.getStrStorage(index7),
                tasksPage.deadlineStartInfo.getText());
    }

    @When("clicks on More button")
    public void clicks_on_More_button() {
        tasksPage.switchToNewTaskIframe();
        tasksPage.taskMoreButton.click();
    }

    @When("adds random project name")
    public void adds_random_project_name() {
        tasksPage.actions.moveToElement(tasksPage.addProjectInput).click().perform();
        Assert.assertEquals("There are recent projects", "There are no items",
                tasksPage.projectItems.getText());
    }

    @When("planned time {string} hours, and {string} minutes")
    public void planned_time_hours_and_minutes(String string, String string2) {
        tasksPage.wait.until(ExpectedConditions.elementToBeClickable(tasksPage.
                timeTrackingCheckbox)).click();
        tasksPage.wait.until(ExpectedConditions.elementToBeClickable(tasksPage.
                timeTrackingCheckbox)).sendKeys(Keys.TAB + string +Keys.TAB + string2);
    }

    @When("adds reminder for {string} to {string} by {string}")
    public void adds_reminder_for_to_by(String string, String string2, String string3) {
        tasksPage.actions.moveToElement(tasksPage.addReminder).click().perform();
        tasksPage.actions.moveToElement(tasksPage.addReminderInput).click().perform();
        tasksPage.setCalendar("//div[@id='reminder-bitrix_tasks_task_default_1-form']/following-sibling::div",
                string.substring(6,10), string.substring(0, 2), string.substring(3,5), string.substring(11,13),
                string.substring(14,16), string.substring(17));
        Select select = new Select(tasksPage.addReminderSelectOption);
        select.selectByVisibleText(string2);
        tasksPage.addReminderByEmail.click();
        tasksPage.addReminderSubmitButton.click();
    }

    @When("activates repeat task {string}")
    public void activates_repeat_task(String string) {
        String [] strs = string.split(" ");
        tasksPage.js.executeScript("window.scrollBy(0, 500)");
        tasksPage.repeatTaskActivate.click();
        if(string.contains(" day")){
            tasksPage.actions.moveToElement(Driver.getDriver().findElement(By.cssSelector("#bx-component-scope" +
                    "-replication-bitrix_tasks_task_default_1>div:first-child" +
                    ">span:nth-child(2)>span:nth-child(1)"))).click().perform();
        }else if(string.contains("week")){
            tasksPage.actions.moveToElement(Driver.getDriver().findElement(By.cssSelector("#bx-component-scope" +
                    "-replication-bitrix_tasks_task_default_1>div:first-child" +
                    ">span:nth-child(2)>span:nth-child(2)"))).click().perform();
            tasksPage.repeatEveryInput.clear();
            tasksPage.repeatEveryInput.sendKeys(string.substring(5, 7));
            Driver.getDriver().findElement(By.xpath("//div[@class='task-options-day-container']/label[contains" +
                    "(text(), '" + strs[4] +
                    "')]")).click();
            tasksPage.actions.moveToElement(tasksPage.moreTaskCreatedOn).click().perform();
            tasksPage.setWait(0.5);
            tasksPage.moreTaskCreatedOnHours.clear();
            tasksPage.actions.moveToElement(tasksPage.moreTaskCreatedOnHours).doubleClick().
                    sendKeys(strs[6].substring(0, 1) + Keys.TAB + strs[6].substring(2,4) +
                            Keys.ENTER).perform();
            tasksPage.setWait(0.5);
            if(!strs[6].substring(4).equalsIgnoreCase(tasksPage.moreTaskCreatedOnAM.getText())){
                tasksPage.moreTaskCreatedOnAM.click();
            }
            tasksPage.wait.until(ExpectedConditions.elementToBeClickable(tasksPage.moreTaskCreatedOnSetUpBtn)).
                    click();
            tasksPage.wait.until(ExpectedConditions.elementToBeClickable(tasksPage.moreMakeRecurringAfterCalendar)).
                    click();
            tasksPage.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bx-calendar-top-year")))
                    .click();
            tasksPage.waitTillPageLoaded();
            tasksPage.actions.moveToElement(Driver.getDriver().findElement(By.cssSelector(
                    "input[data-bx-year-input='Y']"))).doubleClick().sendKeys(strs[8].substring(5)+
                    Keys.ENTER).perform();
            tasksPage.wait.until(ExpectedConditions.elementToBeClickable(
                    By.cssSelector("a.bx-calendar-top-month"))).click();
            tasksPage.setWait(0.5);
            tasksPage.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[data-bx-month='" +
                    (Integer.parseInt(strs[8].substring(0,1)) - 1) + "']"))).click();
            tasksPage.setWait(1);
            tasksPage.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[.='" +
                    strs[8].substring(2,4) + "']"))).click();
        }else if(string.contains("month")) {
            System.out.println(string);
            tasksPage.actions.moveToElement(Driver.getDriver().findElement(By.cssSelector("#bx-component-scope" +
                    "-replication-bitrix_tasks_task_default_1>div:first-child" +
                    ">span:nth-child(2)>span:nth-child(3)"))).click().perform();
        }else if(string.contains("year")){
            System.out.println(string);
            tasksPage.actions.moveToElement(Driver.getDriver().findElement(By.cssSelector("#bx-component-scope" +
                    "-replication-bitrix_tasks_task_default_1>div:first-child" +
                    ">span:nth-child(2)>span:nth-child(4)"))).click().perform();

        }
        tasksPage.repeatUntilEndDate.click();
        tasksPage.repeatUntilCalendar.click();
        tasksPage.waitTillPageLoaded();
        tasksPage.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bx-calendar-top-year")))
                .click();
        tasksPage.setWait(0.5);
        tasksPage.actions.moveToElement(Driver.getDriver().findElement(By.cssSelector(
                "input[data-bx-year-input='Y']"))).doubleClick().sendKeys(strs[12].substring(5)+
                Keys.ENTER).perform();
        tasksPage.setWait(0.5);
        tasksPage.wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("a.bx-calendar-top-month"))).click();
        tasksPage.setWait(0.5);
        tasksPage.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[data-bx-month='" +
                (Integer.parseInt(strs[12].substring(0,1)) - 1) + "']"))).click();
        tasksPage.setWait(0.5);
        tasksPage.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[.='" +
                strs[12].substring(2,4) + "']"))).click();

    }

    @When("adds previous task {string}")
    public void adds_previous_task(String string) {
        tasksPage.js.executeScript("window.scrollBy(0, 500)");
        tasksPage.wait.until(ExpectedConditions.elementToBeClickable(tasksPage.addPreviousTask)).click();
        tasksPage.setWait(0.5);
        tasksPage.wait.until(ExpectedConditions.elementToBeClickable(tasksPage.popUpAccept)).click();
    }

    @When("adds subtask")
    public void adds_subtask() {
        tasksPage.wait.until(ExpectedConditions.elementToBeClickable(tasksPage.subtaskOf)).click();
        tasksPage.setWait(0.5);
        tasksPage.wait.until(ExpectedConditions.elementToBeClickable(tasksPage.popUpAccept2)).click();
    }

    int index9;
    @When("adds tag {string}")
    public void adds_tag(String string) {
        tasksPage.wait.until(ExpectedConditions.elementToBeClickable(tasksPage.tags)).click();
        tasksPage.setWait(0.5);
        index9 = tasksPage.setRandomString();
        tasksPage.tagsInput.sendKeys(tasksPage.getStrStorage(index9));
        tasksPage.wait.until(ExpectedConditions.elementToBeClickable(tasksPage.popUpAccept3)).click();
    }

    @When("adds dependent task")
    public void adds_dependent_task() {
        tasksPage.wait.until(ExpectedConditions.elementToBeClickable(tasksPage.dependentTasks)).click();
        tasksPage.setWait(0.5);
        tasksPage.wait.until(ExpectedConditions.elementToBeClickable(tasksPage.popUpAccept4)).click();
    }

    int index8;
    @When("clicks on ADD TASK")
    public void clicks_on_add_task() {
        index8 = tasksPage.setRandomString();
        tasksPage.finishTaskCreation(tasksPage.getStrStorage(index8));
    }

    @Then("created task should be on My tasks page")
    public void created_task_should_be_on_my_tasks_page() {
        Driver.getDriver().findElement(By.xpath("//*[.='" + tasksPage.getStrStorage(index8)
                + "']")).click();
        tasksPage.waitTillPageLoaded();
        Assert.assertEquals(tasksPage.getStrStorage(index8), tasksPage.newTaskPageTitle.getText());

    }

}
