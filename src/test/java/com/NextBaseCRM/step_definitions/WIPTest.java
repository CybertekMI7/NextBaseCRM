package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.pages.TasksPage;
import com.NextBaseCRM.utilities.ConfigurationReader;
import com.NextBaseCRM.utilities.Driver;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;

public class WIPTest {
    @Test
    public void test() throws AWTException, InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("loginURL"));
        TasksPage tasksPage = new TasksPage();
        tasksPage.login("helpdesk_username1");
        tasksPage.createTask();
        tasksPage.switchToNewTaskIframe();
        tasksPage.wait.until(ExpectedConditions.elementToBeClickable(tasksPage.uploadIcon)).click();
        Driver.getDriver().findElement(By.name(("bxu_files[]"))).
                sendKeys("/home/ss/IdeaProjects/NextBaseCRM/src/test/resources/features/1_P7-84.feature");


    }
}
