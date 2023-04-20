package com.company2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.HashMap;

public class TestBase {

    public static String wrongMail            = "abcd";
    public  static String wrongPassword       = "qwertyuiop";
    public static String email                = "s@malinator.com";
    public static String password             = "#Malinator1";
    public static String blankMail            = "";
    public static String blankPassword        = "";


    //   login page  ERROR MESSAGE FIELD
    public static String PASS_IS_REQUIRED      = "Password is required";
    public static String MAIL_IS_REQUIRED      = "Email Address is required";
    public static String INVALID_PASSWORD      = "Your username or password was incorrect.";
    public static String INVALID_MAIL          = "Invalid Email address";




    public static WebDriver driver;
    public String BASE_PAGE_URL = "https://mau.uat.repco.odxc.info";
    String driver_path = "D:\\automation\\chromedriver_win32\\chromedriver.exe";
    String webdriver   = "webdriver.chrome.driver";

    @BeforeClass //Before each test case, use BeforeClass for before each test class
    public void set_browser() {
        WebDriverManager.chromedriver().setup();
//        System.setProperty(webdriver,driver_path);
//        ChromeOptions options = new ChromeOptions();
//        HashMap<String, Object> prefs = new HashMap<String, Object>();
//        prefs.put("profile.default_content_setting_values.media_stream_mic", 2);
//        prefs.put("profile.default_content_setting_values.media_stream_camera", 2);
//        prefs.put("profile.default_content_setting_values.geolocation", 2);
//        prefs.put("profile.default_content_setting_values.notifications", 2);
//        options.setExperimentalOption("prefs", prefs);
//        options.addArguments("--incognito");
//        driver = new ChromeDriver(options);
//        Dimension dm = new Dimension(320, 640);
//        driver.manage().window().setSize(dm);
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("resolution", "320x640");
        driver.get("https://mau.uat.repco.odxc.info");
    }

    @AfterClass
    public  void tearDownAfterTestCase() {
        driver.quit(); //driver.Close() closes the window, but doesn't properly dispose of the driver
    }
}