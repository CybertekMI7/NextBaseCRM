package com.NextBaseCRM.Pages;

import com.NextBaseCRM.utilities.ConfigurationReader;
import com.NextBaseCRM.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    private WebElement UsernameInput;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    private WebElement PasswordInput;

    @FindBy(xpath = "//input[@value='Log In']")
    private WebElement LoginButton;

    public void login(){
        String username = ConfigurationReader.getProperty("bitrixUsername");
        String password = ConfigurationReader.getProperty("bitrixPassword");
        UsernameInput.sendKeys(username + Keys.TAB + password+ Keys.ENTER);
       // PasswordInput.sendKeys(password);
      //  LoginButton.click();
    }
}

