package com.company2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.time.Duration;

public class MyGaragePage extends TestBase {
    public static String regosearch = "ABC123";
    @FindBy(how = How.XPATH, using = "(//span[@class='vehicleName'])[1]")
    public static WebElement vehicleName;
    @FindBy(how = How.XPATH, using = "(//span[@class='vehicleName'])[1]")
    public static WebElement myGarage;
    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='regoModelText']")
    static WebElement yourRego;
    @FindBy(how = How.XPATH, using = "(//div//select[@formcontrolname='countryValueModal'])")
    public static WebElement selectState;
    @FindBy(how = How.XPATH, using = "(//div//select[@formcontrolname='countryValueModal']//option)[3]")
    public static WebElement selectFromList;
    @FindBy(how = How.XPATH, using = "//div[@class='form-group']//button")
    public static WebElement searchNow;
    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-success btn-block rounded-0 ng-star-inserted']")
    public static WebElement shopThisVehicle;
    @FindBy(how = How.XPATH, using = "//a[@class='text-secondary']")
    public static WebElement manualSearchForm;
    @FindBy(how = How.XPATH, using = "//select[@class='form-control rounded-0 ng-untouched ng-pristine ng-valid']")
    public static WebElement vehicleSelector;
    @FindBy(how = How.XPATH, using = "((//div[@class='form-group select-group']//select)[1]//option)[5]")
    public static WebElement vehicleFromList;
    @FindBy(how = How.XPATH, using = "(//div[@class='form-group select-group']//select)[2]")
    public static WebElement model;
    @FindBy(how = How.XPATH, using = "((//div[@class='form-group select-group']//select)[2]//option)[6]")
    public static WebElement modelFromList;
    @FindBy(how = How.XPATH, using = "(//div[@class='form-group select-group']//select)[3]")
    public static WebElement year;
    @FindBy(how = How.XPATH, using = "((//div[@class='form-group select-group']//select)[3]//option)[2]")
    public static WebElement yearFromList;
    @FindBy(how = How.XPATH, using = "(//div[@class='form-group select-group']//select)[4]")
    public static WebElement series;
    @FindBy(how = How.XPATH, using = "((//div[@class='form-group select-group']//select)[4]//option)[2]")
    public static WebElement seriesFromList;
    @FindBy(how = How.XPATH, using = "(//div[@class='form-group select-group']//select)[5]")
    public static WebElement engine;
    @FindBy(how = How.XPATH, using = "((//div[@class='form-group select-group']//select)[5]//option)[2]")
    public static WebElement engineFromList;
    @FindBy(how = How.XPATH, using = "(//div[@class='form-group select-group']//select)[6]")
    public static WebElement variant;
    @FindBy(how = How.XPATH, using = "((//div[@class='form-group select-group']//select)[6]//option)[2]")
    public static WebElement variantFromList;

    public static void add_vehicle() throws InterruptedException {
        MyGaragePage myGaragePage = PageFactory.initElements(driver, MyGaragePage.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
        MyGaragePage.myGarage.click();
        MyGaragePage.yourRego.sendKeys(regosearch);
        MyGaragePage.selectState.click();
        MyGaragePage.selectFromList.click();
        MyGaragePage.searchNow.click();
        MyGaragePage.shopThisVehicle.click();
        Thread.sleep(3000);
    }

    @Test
    public void manual_veh_selection() throws InterruptedException {
        MyGaragePage myGaragePage = PageFactory.initElements(driver, MyGaragePage.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
        MyGaragePage.myGarage.click();
        Thread.sleep(2000);
        MyGaragePage.manualSearchForm.click();
        Thread.sleep(5000);
        MyGaragePage.vehicleSelector.click();
        Thread.sleep(5000);
        MyGaragePage.vehicleFromList.click();
        Thread.sleep(5000);
        MyGaragePage.model.click();
        Thread.sleep(5000);
        MyGaragePage.modelFromList.click();
        Thread.sleep(5000);
        MyGaragePage.year.click();
        Thread.sleep(5000);
        MyGaragePage.yearFromList.click();
        Thread.sleep(5000);
        MyGaragePage.series.click();
        Thread.sleep(5000);
        MyGaragePage.seriesFromList.click();
        Thread.sleep(5000);
        MyGaragePage.engine.click();
        MyGaragePage.engineFromList.click();
        Thread.sleep(5000);
        MyGaragePage.variant.click();
        MyGaragePage.variantFromList.click();
        Thread.sleep(5000);
        MyGaragePage.shopThisVehicle.click();
        Thread.sleep(2000);

    }
}

