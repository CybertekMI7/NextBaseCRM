package com.NextBaseCRM.Pages;

import com.NextBaseCRM.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {



    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    private WebElement UsernameInput;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    private WebElement PasswordInput;

    @FindBy(xpath = "//input[@value='Log In']")
    private WebElement LoginButton;

    public void login(){
        String username = ConfigurationReader.getProperty("bitrixUsername");
        String password = ConfigurationReader.getProperty("bitrixPassword");
        UsernameInput.sendKeys(username );
        PasswordInput.sendKeys(password);
        LoginButton.click();
    }
}

