package com.company;

import com.company2.LDPage;
import com.company2.LoginPage;
import com.company2.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.company2.LoginPage.username;
import static org.testng.Assert.assertEquals;

//import jdk.jpackage.internal.Log;

public class LoyaltyAndDiscount extends TestBase {



    @FindBy(how = How.XPATH, using = "(//*[@text-anchor='middle'])[2]")
    public static WebElement addedCard;
    @FindBy(how = How.XPATH, using = "//div[@class='col-xs-12 col-sm-12 m-1']//p")
    public static WebElement duplicateCardNumber;


    @Test(priority = 1)
    public void add_loyalty_card() throws InterruptedException {
        LoyaltyAndDiscount loyaltyAndDiscount = PageFactory.initElements(driver, LoyaltyAndDiscount.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
        Thread.sleep(8000);
        LoginPage.login(username,password);
        Thread.sleep(3000);
        LDPage.add_card();
        assertEquals(LDPage.Cardnumber,LoyaltyAndDiscount.addedCard.getText());

    }

    @Test(priority = 2)
    public static void add_duplicate_card() throws InterruptedException {
        LDPage.add_card();
        assertEquals(LoyaltyAndDiscount.duplicateCardNumber.getText(),"The member/card number entered is invalid. Please check and re-submit");

    }
    @Test(priority = 3)
    public static void delete_loyalty_card(){


    }
}

