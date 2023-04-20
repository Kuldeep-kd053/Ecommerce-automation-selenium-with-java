package com.company2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class CreateAccountPage extends TestBase {
    public static String fname_error = "Please enter a valid first name";
    public static String lname_error = "Please enter a valid last name";
    public static String email_error = "Please enter a valid email";
    public static String pass_error  =
            "Your password needs to be between 6 to 20 characters. It will also need to contain at least one (1) number, one (1) upper case letter and one (1) lower case letter.";
    public static String confpass_error =
            "Your password needs to be between 6 to 20 characters. It will also need to contain at least one (1) number, one (1) upper case letter and one (1) lower case letter.\n" +
                    "Mandatory field can not be empty.";
    public static String  mob_error = "Please enter a valid mobile number";
    public static String alert_message = "Please correct the errors below.";

    @FindBy(how = How.XPATH,using = "//input[@formcontrolname='firstName']//parent::div//child::div")
    public static WebElement firstNameError;
    @FindBy(how = How.XPATH,using = "//input[@formcontrolname='lastName']//parent::div//child::div")
    public static WebElement lastNameError;
    @FindBy(how = How.XPATH,using = "//input[@formcontrolname='email']//parent::div//child::div")
    public static WebElement emailError;
    @FindBy(how = How.XPATH,using = "(//input[@formcontrolname='password']//parent::div//child::div)[1]")
    public static WebElement passError;
    @FindBy(how = How.XPATH,using = "(//input[@formcontrolname='confirmPassword']//parent::div//child::div)[1]")
    public static WebElement confPassError;
    @FindBy(how = How.XPATH,using = "(//input[@formcontrolname='mobileNumber']//parent::div//child::div)[1]")
    public static WebElement mobError;
    //span[@class='alert-message']
    @FindBy(how = How.XPATH,using = "//span[@class='alert-message']")
    public static WebElement alertMessage;

    @FindBy(how = How.XPATH, using = "(//div[@class='col icons']//button)[2]")
    public static WebElement my_account;
    @FindBy(how = How.XPATH,using = "//input[@formcontrolname='firstName']")
    public WebElement firstName;
    @FindBy(how = How.XPATH,using = "//*[@formcontrolname='lastName']")
    public WebElement lastNAME;
    @FindBy(how = How.XPATH,using = "(//input[@formcontrolname='email'])[2]")
    public WebElement email;
    @FindBy(how = How.XPATH,using = "(//input[@formcontrolname='password'])[2]")
    public WebElement password;
    @FindBy(how = How.XPATH,using = "//input[@formcontrolname='confirmPassword']")
    public WebElement confirmpass;
    @FindBy(how = How.XPATH,using = "//*[@formcontrolname='mobileNumber']")
    public WebElement mobileNumber;
    @FindBy(how = How.XPATH,using = "//button[contains(text(),' Register ')]")
    public WebElement clickOnRegister;

    public void create_account(String firstname,String lastname,String mail,String password, String confpass,String mobno) throws IllegalArgumentException, InterruptedException {
        CreateAccountPage createAccountPage = PageFactory.initElements(driver, CreateAccountPage.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(10000);
        createAccountPage.my_account.click();
        JavascriptExecutor jjs = (JavascriptExecutor) driver;
        jjs.executeScript("window.scrollBy(0,250)");
        createAccountPage.firstName.sendKeys(firstname);
        createAccountPage.lastNAME.sendKeys(lastname);
        createAccountPage.email.sendKeys(mail);
        createAccountPage.password.clear();
        createAccountPage.password.sendKeys(password);
        createAccountPage.confirmpass.sendKeys(confpass);
        createAccountPage.mobileNumber.sendKeys(mobno);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        createAccountPage.clickOnRegister.click();
        Thread.sleep(20000);

    }

}
