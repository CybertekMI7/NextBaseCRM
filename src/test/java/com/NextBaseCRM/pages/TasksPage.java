package com.NextBaseCRM.pages;

import com.NextBaseCRM.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class TasksPage extends BasePage {

    @FindBy(css = "a[title='Tasks']")
    public WebElement tasksTab;

    @FindBy(className = "menu-item-plus")
    private WebElement newTaskPlus;

    @FindBy(id = "tasks-buttonAdd")
    public WebElement newTask;

    @FindBy(css = "input[data-bx-id=task-edit-title]")
    public WebElement thingsToDoInputBox;

    @FindBy(id = "tasks-task-priority-cb")
    public WebElement highPriorityCheckbox;

    @FindBy(id = "lhe_button_editor_task-form-bitrix_tasks_task_default_1")
    public WebElement visualEditorIcon;

    @FindBy(css = ".tasks-task-mpf-link[data-bx-id='task-edit-toggler']")
    public WebElement checklistIcon;

    @FindBy(id = "bx-b-mention-task-form-bitrix_tasks_task_default_1")
    public WebElement addMentionIcon;

    @FindBy(id = "bx-b-link-task-form-bitrix_tasks_task_default_1")
    public WebElement linkIcon;

    @FindBy(id = "bx-b-uploadfile-task-form-bitrix_tasks_task_default_1")
    public WebElement uploadIcon;

    @FindBy(name = "bxu_files[]")
    public WebElement uploadFilesAndImages;

    @FindBy(css = "a:contains('Add more')")
    public WebElement addMoreIcon;

    @FindBy(id = "bx-html-editor-tlbr-cnt-bitrix_tasks_task_default_1")
    public WebElement editorTextbar;

    @FindBy(css = "span[data-bx-id='task-edit-cmd']")
    private WebElement addTaskButton;

    @FindBy(xpath = "//span[starts-with(@class,'feed-com-file')]/*[1]")
    public WebElement uploadedFileLocation;

    @FindBy(css = "span.wd-fa-add-file-light-title.diskuf-selector-link-cloud")
    private WebElement uploadFromExternalDriveButton;

    @FindBy(css = ".bx-file-dialog-tab-item-link-text[title='Box']")
    private WebElement uploadFromBoxTab;

    @FindBy(css = ".bx-file-dialog-tab-item-link-text[title='Dropbox']")
    private WebElement uploadFromDropboxTab;

    @FindBy(css = ".bx-file-dialog-tab-item-link-text[title='Google Drive']")
    private WebElement uploadFromGoogleDriveTab;

    @FindBy(css = ".bx-file-dialog-tab-item-link-text[title='Office 365']")
    private WebElement uploadFromOffice365Tab;

    @FindBy(css = ".bx-file-dialog-tab-item-link-text[title='OneDrive']")
    private WebElement uploadFromOneDriveTab;

    @FindBy(css = ".bx-file-dialog-tab-item-link-text[title='Yandex.Disk']")
    private WebElement uploadFromYandexDiskTab;

    @FindBy(className = "ui-notification-balloon-message")
    private WebElement uploadPopUpMessage;

    @FindBy(className = "ui-notification-balloon-close-btn")
    private WebElement getUploadPopUpMessageCloseButton;

    @FindBy(xpath = "//span[.='Select document from Bitrix24']")
    private WebElement uploadFromBitrix;

    @FindBy(css = "span.bx-file-dialog-tab-item-link-text[title='Sales and marketing']")
    private WebElement uploadFromSalesAndMarketing;

    @FindBy(linkText = "Marketing and advertising")
    private WebElement uploadFromMarketingAndAdvertising;

    @FindBy(linkText = "Logo.gif")
    private WebElement logoGifFileInSalesAndMarketing;

    @FindBy(css = "#DiskFileDialog> .popup-window-buttons")
    private WebElement selectDocumentButton;

    @FindBy(className = "wd-fa-add-file-editor-text")
    private WebElement uploadByCreatingDoc;

    @FindBy(xpath = "//a[.='Desktop applications']")
    private WebElement createWithDesktopApp;

    @FindBy(xpath = "//a[.='Google Docs']")
    private WebElement createWithGoogleDocs;

    @FindBy(xpath = "//a[.='Office 365']")
    private WebElement createWithOffice365;

    @FindBy(xpath = "//a[.='MS Office Online']")
    private WebElement createWithMSOfficeOnline;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    private WebElement downloadDesctopApp;

    @FindBy(css = ".wd-fa-add-file-editor-link-block[onclick='return DiskCreateDocument(\\'docx\\')']")
    private WebElement createDocument;

    @FindBy(css = ".wd-fa-add-file-editor-link-block[onclick='return DiskCreateDocument(\\'xlsx\\');']")
    private WebElement createSpreadsheet;

    @FindBy(css = ".wd-fa-add-file-editor-link-block[onclick='return DiskCreateDocument(\\'pptx\\');']")
    private WebElement createPresentation;

    @FindBy(id = "error-text")
    private WebElement errorText;

    @FindBy(css = "span[title='Quote text']")
    public WebElement quoteIcon;

    @FindBy(className = "bx-editor-iframe")
    public WebElement messageBoxIframe;

    @FindBy(className = "bxhtmled-quote")
    public WebElement quoteInputBox;

    @FindBy(className = "forum-quote")
    public WebElement quoteTable;

    @FindBy(css = "table.forum-quote>tbody>tr>td")
    public WebElement quoteText;

    @FindBy(css = "#bx-lm-box-last-content a:nth-child(1) div.bx-finder-box-item-t7-info > div")
    public WebElement addMentionEmail1;

    @FindBy(linkText = "Employees and departments")
    public WebElement addMentionEmployeesAndDepartments;

    @FindBy(css = "#bx-lm-box-last-content a:first-child .bx-finder-company-department-employee-name:first-child")
    public WebElement addMentionEmail2;

    @FindBy(className = "bxhtmled-metion")
    public WebElement addMentionTextboxMessage;

    @FindBy(id = "linkbitrix_tasks_task_default_1-text")
    public WebElement linkInputBox;

    @FindBy(css = "body > a")
    public WebElement linkTextboxMessage;

    @FindBy(css = "span.task-checklist-form-vpadding>input")
    public WebElement checklistInputBox;

    @FindBy(xpath = "//span[.='add'][@class='js-id-checklist-is-open-form task-dashed-link-inner']")
    public WebElement checklistAddButton;

    @FindBy(xpath = "//span[.='separator'][@class='js-id-checklist-is-add-separator task-dashed-link-inner']")
    public WebElement checklistSeparator;

    @FindBy(xpath = "//*[@class='js-id-checklist-is-form-submit block-edit tasks-btn-apply task-field-title-ok']")
    public WebElement checklistAddCheckMark;

    @FindBy(xpath = "//div[starts-with(@data-item-value, 'n')][1]//span[@class='js-id-checklist-is-i-title ']")
    public WebElement checklistFirstMessage;

    @FindBy(xpath = "//div[starts-with(@data-item-value, 'n')][last()]//span[@class='js-id-checklist-is-i-title ']")
    public WebElement checklistSecondMessage;

    @FindBy(xpath = "//span[@class='js-id-checklist-is-i-delete task-field-title-del tasks-btn-delete']")
    public WebElement checklistDeleteIcon;

    @FindBy(xpath = "//div[@class='js-id-checklist-is-i-delete task-field-divider-close']")
    public WebElement checklistSeparatorDelete;

    @FindBy(css = "span[data-bx-id='dateplanmanager-deadline']>input:nth-child(1)")
    public WebElement deadlineCalendar;

    @FindBy(xpath = "//span[.='Time planning']")
    public WebElement deadlineTimePlanning;

    @FindBy(xpath = "//span[@data-bx-id='dateplanmanager-start-date-plan']/input[@data-bx-id='datepicker-display']")
    public WebElement deadlineTimePlanningCalendar;

    @FindBy(css = "input[data-bx-id='dateplanmanager-duration']")
    public WebElement durationInputBox;

    @FindBy(id = "task-detail-deadline")
    public WebElement deadlineInfo;

    @FindBy(xpath = "//div[.='Created on:']/following-sibling::div")
    public WebElement deadlineCreatedOnInfo;

    @FindBy(xpath = "//div[.='Start:']/following-sibling::div")
    public WebElement deadlineStartInfo;

    @FindBy(className = "task-additional-alt-more")
    public WebElement taskMoreButton;

    @FindBy(xpath = "//div[@id='bx-component-scope-bitrix_tasks_task_default_1-project']//a[contains(text(), 'Add')]")
    public WebElement addProjectInput;

    @FindBy(id = "bx-lm-box-waiter-content-text")
    public WebElement projectItems;

    @FindBy(xpath = "//label[.='Task planned time']/input")
    public WebElement timeTrackingCheckbox;

    @FindBy(css = "span[data-bx-id='reminder-open-form']")
    public WebElement addReminder;

    @FindBy(css = ".task-popup-inp[data-bx-id='datepicker-display']")
    public WebElement addReminderInput;

    @FindBy(css = "[data-bx-id='form-change-recipient']")
    public WebElement addReminderSelectOption;

    @FindBy(css = "a[title='Send e-mail message']")
    public WebElement addReminderByEmail;

    @FindBy(css = "button[data-bx-id='form-submit']")
    public WebElement addReminderSubmitButton;

    @FindBy(css = "input[data-bx-id='task-edit-flag task-edit-flag-replication']")
    public WebElement repeatTaskActivate;

    @FindBy(name = "ACTION[0][ARGUMENTS][data][SE_TEMPLATE][REPLICATE_PARAMS][EVERY_WEEK]")
    public WebElement repeatEveryInput;

    @FindBy(css = ".js-id-timepicker-display.task-options-inp")
    public WebElement moreTaskCreatedOn;

    @FindBy(css = ".bxc-controls-cont  input[title='Hours']")
    public WebElement moreTaskCreatedOnHours;

    @FindBy(className = "bxc-am-pm")
    public WebElement moreTaskCreatedOnAM;

    @FindBy(css = "input[value='Set Time']")
    public WebElement moreTaskCreatedOnSetUpBtn;

    @FindBy(css = "div[class='js-id-replication-panel task-replication-panel'] +div " +
            "input[class='js-id-datepicker-display task-options-inp']")
    public WebElement moreMakeRecurringAfterCalendar;

    @FindBy(id = "replication-repeat-constraint-date")
    public WebElement repeatUntilEndDate;

    @FindBy(css = ".js-id-replication-end-date-datepicker.task-options-inp-container.task-options-date.t-empty>" +
            "input:nth-child(1)")
    public WebElement repeatUntilCalendar;

    @FindBy(xpath = "//span[.='Add previous task']")
    public WebElement addPreviousTask;

    @FindBy(css = "#bx-component-scope-parenttask-bitrix_tasks_task_default_1 a")
    public WebElement subtaskOf;

    @FindBy(css = ".js-id-tag-sel-open-form.task-form-field-link.add")
    public WebElement tags;

    @FindBy(css = "#bx-component-scope-dependson-bitrix_tasks_task_default_1 a")
    public WebElement dependentTasks;

    @FindBy(css = ".popup-window-button.popup-window-button-accept")
    public WebElement popUpAccept;

    @FindBy(css = "#task-item-set-popupparenttask .popup-window-button.popup-window-button-accept")
    public WebElement popUpAccept2;

    @FindBy(css = ".popup-tags-textbox>input")
    public WebElement tagsInput;

    @FindBy(css = "#popup-window-content-task-tags-popup + div>span:nth-child(1)")
    public WebElement popUpAccept3;

    @FindBy(css = "#popup-window-content-task-item-set-popupdependson + div >span:nth-child(1)")
    public WebElement popUpAccept4;

    @FindBy(id = "pagetitle")
    public WebElement newTaskPageTitle;


    public void createTask(){
        tasksTab.click();
        newTask.click();
    }

    public void createTask2() {
        wait.until(ExpectedConditions.elementToBeClickable(tasksTab));
        actions.moveToElement(tasksTab).moveToElement(newTaskPlus).click().perform();
    }

    public void finishTaskCreation(String title){
        thingsToDoInputBox.sendKeys(title);
        addTaskButton.click();
    }

    public void finishTaskCreation2(String title){
        thingsToDoInputBox.sendKeys(title +
                Keys.chord(Keys.CONTROL, Keys.ENTER));
    }

    public void switchToNewTaskIframe(){
        setWait(3);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("side-panel-iframe")));
    }

    public void uploadFromExternalDrive(){
        wait.until(ExpectedConditions.elementToBeClickable(uploadFromExternalDriveButton)).click();
        setWait(1);
        List<WebElement> messages = Driver.getDriver().findElements(By.className("ui-notification-balloon-close-btn"));
        for (WebElement message : messages) {
            message.click();
        }
        wait.until(ExpectedConditions.visibilityOf(uploadFromBoxTab)).click();
        uploadFromDropboxTab.click();
        uploadFromGoogleDriveTab.click();
        setWait(1);
        uploadFromOffice365Tab.click();
        uploadFromOneDriveTab.click();
        uploadFromYandexDiskTab.click();
        setWait(1);
        messages = Driver.getDriver().findElements(By.className("ui-notification-balloon-message"));
        String error = "";
        for (WebElement each : messages){
            error += each.getText() + "\n";
        }
        if (error.equals("")){
            throw new RuntimeException("@P7-89 Social networking services are configured\n" +
                    "It's time to proceed with tests");
        }else {
            throw new RuntimeException("@P7-89 upload from external drives failed\n" + error);
        }
    }

    public void uploadFromBitrix(){
        wait.until(ExpectedConditions.elementToBeClickable(uploadFromBitrix)).click();
        wait.until(ExpectedConditions.elementToBeClickable(uploadFromSalesAndMarketing)).click();
        wait.until(ExpectedConditions.elementToBeClickable(uploadFromMarketingAndAdvertising)).click();
        wait.until((ExpectedConditions.elementToBeClickable(logoGifFileInSalesAndMarketing))).click();
        selectDocumentButton.click();
    }

    public void uploadByCreatingGoogleDocs(){
        wait.until(ExpectedConditions.visibilityOf(uploadByCreatingDoc)).click();
        wait.until(ExpectedConditions.visibilityOf(createWithDesktopApp)).click();
        wait.until(ExpectedConditions.visibilityOf(downloadDesctopApp)).click();
        String message = "";
        if(Driver.getDriver().findElement(By.id("popup-window-overlay-bx-gedit-convert-confirm")).isDisplayed()){
            message += "@P7-89 Could not download Desktop App\n";
        }else {
            message += "@P7-89 Download Desktop App is set up, time to proceed with tests\n";
        }
        Driver.getDriver().findElement(By.xpath("//*[@class='popup-window-button']")).click();

        wait.until(ExpectedConditions.visibilityOf(uploadByCreatingDoc)).click();
        createWithGoogleDocs.click();
        String parentWindow = Driver.getDriver().getWindowHandle();
        createDocument.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        for (String s : Driver.getDriver().getWindowHandles()){
            Driver.getDriver().switchTo().window(s);
            setWait(2);
        }
        message += errorText.getText().replace("is", "or Document are") + "\n";
        Driver.getDriver().close();
        Driver.getDriver().switchTo().window(parentWindow);
        switchToNewTaskIframe();
        uploadByCreatingDoc.click();
        createWithOffice365.click();
        createSpreadsheet.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        for (String s : Driver.getDriver().getWindowHandles()){
            Driver.getDriver().switchTo().window(s);
            setWait(2);
        }
        message += errorText.getText().replace("is","or Spreadsheet are") + "\n";
        Driver.getDriver().close();
        Driver.getDriver().switchTo().window(parentWindow);
        switchToNewTaskIframe();
        uploadByCreatingDoc.click();
        createWithMSOfficeOnline.click();
        createPresentation.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        for (String s : Driver.getDriver().getWindowHandles()){
            Driver.getDriver().switchTo().window(s);
            setWait(2);
        }
        message += errorText.getText().replace("is","or Presentation are") + "\n";
        Driver.getDriver().close();
        Driver.getDriver().switchTo().window(parentWindow);
        System.out.println(message);
        throw new RuntimeException(message);
    }

    public void setCalendar(String xpath, String year, String month, String day, String hours, String minutes, String am_or_pm){
        setWait(0.3);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath + "//a[.='" +
                day + "']"))).click();
        setWait(0.3);
        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("a.bx-calendar-top-month"))).click();
        setWait(.3);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath + "//span[@data-bx-month='" +
                (Integer.parseInt(month) - 1) + "']"))).click();
        setWait(0.3);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bx-calendar-top-year")))
                .click();
        setWait(0.3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[data-bx-year-input='Y']"))).
                sendKeys(year + Keys.ENTER);
        String amOrPm = wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.className("bx-calendar-AM-PM-text"))).getText();
        if (!am_or_pm.equalsIgnoreCase(amOrPm)){
            wait.until(ExpectedConditions.
                    visibilityOfElementLocated(By.className("bx-calendar-AM-PM-text"))).click();
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("bx-calendar-form-input"))).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("bx-calendar-form-input"))).
                sendKeys(hours + Keys.TAB + minutes);
        actions.moveToElement(Driver.getDriver().
                findElement(By.xpath("//a[@class='bx-calendar-button bx-calendar-button-select']"))).click().perform();








    }


}