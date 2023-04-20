package com.company;

import com.company2.LoginPage;
import com.company2.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import java.time.Duration;
import static org.testng.Assert.assertEquals;

public class LoginTestsErrors extends TestBase {
    public static String name = "Hi D";

    @Test(priority = 4)
    public void login_invalid_mail() throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.repcoLogo.click();
        LoginPage.login(wrongMail ,password);
        assertEquals(loginPage.INVALID_MAIL_ERROR.getText(),loginPage.INVALID_MAIL);

    }

    @Test(priority = 5)
    public void login_invalid_password() throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        LoginPage.login(email,wrongPassword);
        assertEquals(loginPage.invalid_Pass_Error.getText(),INVALID_PASSWORD);

    }

    @Test(priority = 2)
    public void login_blank_mail() throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        loginPage.repcoLogo.click();
        LoginPage.login(blankMail,wrongPassword);
        assertEquals(loginPage.mailRequired.getText(),MAIL_IS_REQUIRED);
    }

    @Test(priority = 3)
    public void login_blank_password() throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.repcoLogo.click();
        LoginPage.login(email,blankPassword);
        assertEquals(loginPage.passRequired.getText(),PASS_IS_REQUIRED);

    }

    @Test(priority = 1)
    public void login_empty_mail_password() throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        Thread.sleep(10000);
        LoginPage.login(blankMail,blankPassword);

    }
@Test(priority = 6)
    public void success_login() throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
        loginPage.repcoLogo.click();
        LoginPage.login(email,password);
        Thread.sleep(4000);
        if(LoginPage.loggedUserName.isDisplayed());
        loginPage.repcoLogo.click();
    }
}
