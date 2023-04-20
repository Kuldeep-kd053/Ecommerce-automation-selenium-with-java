package com.company;

import com.company2.CreateAccountPage;
import com.company2.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.testng.Assert.assertEquals;


public class CreateAccountTest extends TestBase {
    String Password = "Kuldeep@54321";
    String confpass = "Kuldeep@54321";
    String Firstname = "deepa";
    String Lastname = "ganguli";
    String Mobnumber = "0000000000";
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyMMddHHmmss");
    LocalDateTime now = LocalDateTime.now();
    String mail = "a" + dtf.format(now) + "@gmail.com";
    String random_mail = "created_account_email_is" + " " + mail + " and " + " " + "password_is= Kuldeep@54321";

    @Test
    public void create_account_validation() throws InterruptedException {
        CreateAccountPage createAccountPage = PageFactory.initElements(driver, CreateAccountPage.class);
        createAccountPage.create_account("", "", "", "", "", "");
        assertEquals(CreateAccountPage.firstNameError.getText(),CreateAccountPage.fname_error);
        assertEquals(CreateAccountPage.lastNameError.getText(),CreateAccountPage.lname_error);
        assertEquals(CreateAccountPage.emailError.getText(),CreateAccountPage.email_error);
        assertEquals(CreateAccountPage.passError.getText(),CreateAccountPage.pass_error);
        assertEquals(CreateAccountPage.confpass_error,CreateAccountPage.confPassError.getText());
        assertEquals(CreateAccountPage.mobError.getText(),CreateAccountPage.mob_error);
        assertEquals(CreateAccountPage.alertMessage.getText(),CreateAccountPage.alert_message);

    }
}

