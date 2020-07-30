package com.nextBaseCRM.pages;

import com.nextBaseCRM.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends Base_page {

    @FindBy(xpath = "//*[@name='USER_LOGIN']")
    private WebElement userNameInput;

    @FindBy (xpath = "//*[@name='USER_PASSWORD']")
    private WebElement userPasswordInput;

    public void login(){
        userNameInput.sendKeys(ConfigurationReader.getProperty("helpdesk_username1"));
        userPasswordInput.sendKeys(ConfigurationReader.getProperty("password")+ Keys.ENTER);
    }


}
