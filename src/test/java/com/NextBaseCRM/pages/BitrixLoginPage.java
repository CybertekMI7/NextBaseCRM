package com.NextBaseCRM.pages;

import com.NextBaseCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BitrixLoginPage {

    public BitrixLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public static WebElement usernameBox;

    @FindBy (name = "USER_PASSWORD")
    public static WebElement passwordBox;
}
