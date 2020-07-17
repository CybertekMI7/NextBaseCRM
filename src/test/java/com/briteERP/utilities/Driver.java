package com.briteERP.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private Driver(){

    }

    private static WebDriver driver;

    public static WebDriver getDriver (){
        if (driver==null){
            String browser = ConfigurationReader.getProperty("browser");
            switch (browser){
                case "chrome":
                case "Chrome":
                case "CHROME":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();

                break;

                case "firefox":
                case "Firefox":
                case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();

                break;

                default:
                    throw new RuntimeException("No such webBrowser is found");

            }

        }

        return driver;

    }

    public static void closeDriver (){
        if (driver!= null){
            driver.quit();
            driver = null;
        }

    }
}
