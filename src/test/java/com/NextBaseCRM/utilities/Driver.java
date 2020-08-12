package com.NextBaseCRM.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver() {
    }

    public static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            String browser = ConfigurationReader.getProperty("browser");
            switch (browser.toLowerCase()) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Long.parseLong(ConfigurationReader.getProperty("implicitWait")), TimeUnit.SECONDS);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "chrome-remote":
                    try {
//                        same thing as ChromeOptions
//                        To request Selenium Grid to run tests on Chrome
                        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                        desiredCapabilities.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
                        desiredCapabilities.setPlatform(Platform.WINDOWS);
//                        ChromeOptions chromeOptions = new ChromeOptions();
                        URL url = new URL("http://100.25.144.252:4444/wd/hub");
                        driver = new RemoteWebDriver(url, desiredCapabilities);
                        driver.manage().window().maximize();
                        driver.manage().timeouts().implicitlyWait(Long.parseLong(ConfigurationReader.getProperty("implicitWait")), TimeUnit.SECONDS);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;
                case "firefox-remote":
                    try {
                        //to request grid to run tests on firefox
                        FirefoxOptions firefoxOptions = new FirefoxOptions();
                        URL url = new URL("http://100.25.144.252:4444/wd/hub");
                        driver = new RemoteWebDriver(url, firefoxOptions);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }

                default:
                    throw new RuntimeException("No such webBrowser is found");
            }
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            for (String s : driver.getWindowHandles()) {
                driver.switchTo().window(s).quit();
            }
            driver = null;
        }

    }
}
