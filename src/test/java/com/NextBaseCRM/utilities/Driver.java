package com.NextBaseCRM.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

    private Driver(){

    }

    private static WebDriver driver;

    public static WebDriver getDriver (){
        if (driver==null){
            String browser = ConfigurationReader.getProperty("browser");
            switch (browser.toLowerCase()){
                case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

                case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
                case "chrome-remote":

                    try {
                        ChromeOptions chromeOptions = new ChromeOptions();
                        URL url = new URL("http://54.84.10.104:4444/wd/hub");
                        driver=new RemoteWebDriver(url,chromeOptions);

                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    throw new RuntimeException("Wrong browser name ::"+browser);


            }

        }

        return driver;

    }

    public static void closeDriver (){
        if (driver!= null){
            driver.close();
            driver.quit();
            driver = null;
        }

    }
}
