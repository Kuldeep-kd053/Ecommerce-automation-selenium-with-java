package com.company;


import java.io.File;
import java.util.HashMap;

import com.company2.LoginPage;
import com.company2.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import static com.company2.TestBase.*;

public class TakeScreenShot extends TestBase {
    @Test
            public void take_screen_shot() throws InterruptedException {
            LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
            LoginPage.login(email, password);
    }
        public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

            TakesScreenshot scrShot =((TakesScreenshot)webdriver);
            LoginPage.login(email,password);

            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
            File DestFile=new File(fileWithPath);
            FileUtils.copyFile(SrcFile, DestFile);

        }

    }
