package com.NextBaseCRM.pages;

import com.NextBaseCRM.utilities.ConfigurationReader;
import com.NextBaseCRM.utilities.Driver;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Vector;

public abstract class BasePage {
    public BasePage(){
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(Driver.getDriver(),500);
        PageFactory.initElements(factory,this);
    }

    public WebDriverWait wait = new WebDriverWait(Driver.driver,Long.parseLong(ConfigurationReader.getProperty("explicitWait")));
    public Actions actions = new Actions(Driver.driver);
    public JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
    Vector<String> strStorage = new Vector<>();

    public void login(String userName){
        Driver.getDriver().findElement(By.name("USER_LOGIN")).
                sendKeys(ConfigurationReader.getProperty(userName));
        Driver.getDriver().findElement(By.name("USER_PASSWORD")).
                sendKeys(ConfigurationReader.getProperty("bitrix_password") + Keys.ENTER);
    }

    public void setWait(double seconds){
        try {
            Thread.sleep((long)(seconds*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void waitTillPageLoaded(){
        wait.until(p -> js.executeScript("return document.readyState === 'complete'"));
    }

    //by default length is 8
    //returns index number in randomString Vector as int
    public int setRandomString(){
        return setRandomString(8);
    }

    //returns index number in randomString Vector as int
    public int setRandomString(int length){
        setStrStorage(RandomStringUtils.randomAlphabetic(length));
        return strStorage.size() - 1;
    }

    public int setStrStorage(String str){
        strStorage.add(str);
        return strStorage.size() - 1;
    }

    public String getStrStorage(int index){
        return strStorage.get(index);
    }


}
