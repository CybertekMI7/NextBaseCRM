package com.NextBaseCRM.utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class BrowserUtils {
    public static void takeScreenshot(){
        TakesScreenshot screenshot = (TakesScreenshot)Driver.getDriver();
        byte [] file = screenshot.getScreenshotAs(OutputType.BYTES);
        String path = System.getProperty("user.dir") + File.separator + "screenshots" +
                File.separator + new Date() + "_image.png";
        try (FileOutputStream stream = new FileOutputStream(path)) {
            stream.write(file);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
