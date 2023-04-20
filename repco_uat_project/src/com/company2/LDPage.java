package com.company2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LDPage extends TestBase {
    public static LoginPage loginPage = new LoginPage();
    public static String Cardnumber = "1236474634701236";
    public static String invalidCard = "The member/card number entered is invalid. Please check and re-submit";


    @FindBy(how = How.XPATH, using = "(//h4[@class='ret-customer'])[1]")
    public static WebElement returnigCustomer;
    @FindBy(how = How.XPATH, using = "//i[@class='fa fa-credit-card']")
    public static WebElement loyaltyDiscount;
    @FindBy(how = How.XPATH, using = "//button[@routerlink='/loyalty-addcard']")
    public static WebElement addCard;
    @FindBy(how = How.XPATH, using = "//div[@class='col-xs-12 col-sm-12 m-1']//select")
    public static WebElement selectCard;
    @FindBy(how = How.XPATH, using = "(//div[@class='col-xs-12 col-sm-12 m-1']//option)[2]")
    public static WebElement NRMA;
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Enter barcode number']")
    public static WebElement enterBarCode;
    @FindBy(how = How.XPATH, using = "(//div[@class='col-xs-12 col-sm-12 m-2 text-center']//button)[1]")
    public static WebElement add;
    @FindBy(how = How.XPATH, using = "(//div[@class='col-xs-12 col-sm-12 m-2 text-center']//button)[2]")
    public static WebElement cancel;
    @FindBy(how = How.XPATH, using = "//div[@class='col-6 p-2 text-right']//span")
    public static WebElement logOut;
    @FindBy(how = How.XPATH, using = "(//*[@text-anchor='middle'])[2]")
    public static WebElement addedCard;
    @FindBy(how = How.XPATH, using = "//button[@class='edit-btn']")
    public static WebElement editButton;

    @FindBy(how = How.XPATH,using = "//div[@class='col-xs-12 col-sm-12 m-1']//p")
    public static WebElement duplicateCardNumber;
    @FindBy(how = How.XPATH,using = "//button[@class='btn btn-secondary w-25 m-1 rounded-0']")
    public static WebElement deleteCard;

    public static void add_card() throws InterruptedException {
        LDPage ldPage = PageFactory.initElements(driver, LDPage.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        LDPage.loyaltyDiscount.click();
        Thread.sleep(8000);
        LDPage.addCard.click();
        Thread.sleep(3000);
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", add);
        LDPage.selectCard.click();
        LDPage.NRMA.click();
        LDPage.enterBarCode.sendKeys(Cardnumber);
        LDPage.add.click();
        Thread.sleep(4000);
    }
    public void delete_card() throws InterruptedException {
        LDPage ldPage = PageFactory.initElements(driver, LDPage.class);
        LDPage.addedCard.click();
        LDPage.editButton.click();
        LDPage.deleteCard.click();

}
}
