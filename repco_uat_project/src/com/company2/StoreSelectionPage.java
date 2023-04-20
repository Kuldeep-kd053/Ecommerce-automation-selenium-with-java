package com.company2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class StoreSelectionPage extends TestBase {
    public static String postcode = "Camperdown";

    @BeforeClass
    @Override
    public void set_browser()

    {
        super.set_browser();
    }
    @FindBy(how = How.XPATH, using = "(//div[@class='col-3'])[3]")
    public static WebElement selectStore;
    @FindBy(how = How.XPATH, using = "//*[@placeholder='Enter Suburb or Postcode']")
    public static WebElement postCode;
    @FindBy(how = How.XPATH, using = "(//i[@class='fa fa-search'])[2]")
    public static WebElement postCodeSearch;
    @FindBy(how = How.XPATH, using = "(//div[@class='modal-body store']//div)[8]")
    public static WebElement storeFromList;


    public static void store_selection() throws InterruptedException {
        StoreSelectionPage storeSelectionPage = PageFactory.initElements(driver, StoreSelectionPage.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        selectStore.click();
        postCode.sendKeys(postcode);
        postCodeSearch.click();
        Thread.sleep(2000);
        storeFromList.click();
    }
}
