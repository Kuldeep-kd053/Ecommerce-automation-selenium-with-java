package com.company2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;

public class LoginPage extends TestBase {
    String search_item = "oil";
    String scroll = "window.scrollBy(0, 850)";
    // login page filed
    String wrongMail                 = "abcd";
    String wrongPassword             = "qwertyuiop";
    public static String username    = "s@malinator.com";
    public static String password    = "#Malinator1";
    String blankMail                 = "";
    String blankPassword             = "";


    //   login page  ERROR MESSAGE FIELD
    public String PASS_IS_REQUIRED      = "Password is required";
    public String MAIL_IS_REQUIRED      = "Email Address is required";
    public String INVALID_PASSWORD      = "Your username or password was incorrect.";
    public String INVALID_MAIL          = "Invalid Email address";
    public String WRONG_MAIL            = "abcd";
    public String WRONG_PASSWORD        = "qwertyuiop";
    public String USERNAME              = "sss@malinator.com";
    public String PASSWORD              = "#Malinator1";



                    // home page navigation

    @FindBy(how = How.XPATH, using = "//div[@class='col py-2']//img")
    public static WebElement repcoLogo;
    @FindBy(how = How.XPATH, using = "//img[@class='img-fluid logo']")
    public WebElement homePage_navigation;

                         //  login  webElement

    @FindBy(how = How.XPATH, using = "(//div[@class='col icons']//button)[2]")
    public static WebElement my_account;
    @FindBy(how = How.XPATH, using = "(//input[@formcontrolname='email'])[1]")
    public WebElement usernameBox;
    @FindBy(how = How.XPATH, using = "(//h4[@class='ret-customer'])[1]")
    public WebElement scrollTo;
    @FindBy(how = How.XPATH, using = "//*[@formcontrolname='password']")
    public WebElement passwordBox;
    @FindBy(how = How.XPATH, using = "//div[@class='form-group text-center']//button")
    public WebElement loginButton;
    @FindBy(how = How.XPATH, using = "//div[@class='col-6 p-2 text-right']//span")
    public static WebElement logOut;
    @FindBy(how = How.XPATH,using = "(//div[@class='row no-margin']//span)[1]")
    public static WebElement loggedUserName;


                         // footer  element

    String HOMEPAGE_URL = "https://mau.uat.repco.odxc.info/en";

    // ERROR MESSAGE

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='email']//following-sibling::div//div")
    public WebElement INVALID_MAIL_ERROR;
    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='email']//following-sibling::div//div")
    public WebElement mailRequired;
    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='password']//following-sibling::div//div")
    public WebElement passRequired;
    @FindBy(how = How.XPATH, using = "//span[@class='alert-message']")
    public WebElement invalid_Pass_Error;
    @FindBy(how = How.XPATH, using = "(//h4[@class='ret-customer'])[1]")
    public static WebElement returnigCustomer;

                            //PRODUCT SEARCH

    public LoginPage() {
    }

    public static void login(String email, String pass) throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        LoginPage.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(5000);
        LoginPage.my_account.click();
        loginPage.usernameBox.clear();
        loginPage.usernameBox.sendKeys(email);
        loginPage.passwordBox.clear();
        loginPage.passwordBox.sendKeys(pass);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loginPage.scrollTo);
        loginPage.loginButton.click();
        Thread.sleep(5000);
        PageFactory.initElements(driver, LandingPage.class);

        }
        public void logout() throws InterruptedException {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            Thread.sleep(5000);
            my_account.click();
            logOut.click();
            Thread.sleep(5000);

    }
}