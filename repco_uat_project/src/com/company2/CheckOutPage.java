package com.company2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static com.company2.TestBase.driver;

public class CheckOutPage {

    public static String fname = "test";
    public static String  lname= "data";
    public static String address = "449 Camperdown-Cobden Rd";
    public static String city = "BOSTOCKS CREEK";
    public static String  mobilenummber = "0000000000";
    public static String  cardnumber = "4111 1111 1111 1111";
    public static String expiry = "12/24";
    public static String cvv = "123";

    @FindBy(how = How.XPATH,using = "//div[@class='row padding-top padding-bottom']//button")
    public static WebElement orderNow;
    @FindBy(how = How.ID,using = "id=address.firstName")
    public static WebElement fName;
    @FindBy(how = How.ID,using = "id=address.surname")
    public static WebElement lName;
    @FindBy(how = How.ID,using = "id=qasSearch")
    public static WebElement addRess;
    @FindBy(how = How.XPATH,using = "//div[@class='address-picklist']//div")
    public static WebElement addRessFromList;
    @FindBy(how = How.XPATH,using = "//div[@class='address-picklist']//div")
    public static WebElement mobNumber;
    @FindBy(how = How.ID,using = "id=saveBillingToAddressBook")
    public static WebElement addresCheckBox;
    @FindBy(how = How.ID,using = "id=cardNumber-container")
    public static WebElement cardNumber;
    @FindBy(how = How.ID,using = "id=card_expiration")
    public static WebElement expiryDate;
    @FindBy(how = How.ID,using = "id=card_cvNumber")
    public static WebElement cvV;
    @FindBy(how = How.ID,using = "id=pay-button")
    public static WebElement payNow;
    @FindBy(how = How.XPATH,using = "(//div[@class='col-2 magint-5'])[2]")
    public static WebElement scrollTo;
    @FindBy(how = How.XPATH,using = "//span[@class='field-link js-switch-to-manual']")
    public static WebElement manualEntry;
    @FindBy(how = How.ID,using = "id=address.townCity")
    public static WebElement citY;
    @FindBy(how = How.ID,using = "id=address.postcode")
    public static WebElement postCode;


    public static void order_now(){
        CheckOutPage checkOutPage = PageFactory.initElements(driver,CheckOutPage.class);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CheckOutPage.scrollTo);
        CheckOutPage.orderNow.click();
    }

    public static void secure_checkout(){
        CheckOutPage checkOutPage = PageFactory.initElements(driver,CheckOutPage.class);
        CheckOutPage.manualEntry.click();
        CheckOutPage.fName.sendKeys(fname);
        CheckOutPage.lName.sendKeys(lname);
        CheckOutPage.addRess.sendKeys(address);
        CheckOutPage.citY.sendKeys(city);
        CheckOutPage.postCode.sendKeys();
        //CheckOutPage.addRessFromList.click();
        //CheckOutPage.mobNumber.sendKeys(mobilenummber);
        CheckOutPage.cardNumber.sendKeys(cardnumber);
        CheckOutPage.expiryDate.sendKeys(expiry);
        CheckOutPage.cvV.sendKeys(cvv);
        CheckOutPage.payNow.click();
    }

}
