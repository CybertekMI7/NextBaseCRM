package com.nextBaseCRM.pages;

import com.nextBaseCRM.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Base_page {

    public Base_page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

    Actions actions = new Actions(Driver.getDriver());
}
