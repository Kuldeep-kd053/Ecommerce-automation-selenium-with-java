package com.company2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class CartPage extends TestBase {
    public String USERNAME = "sss@malinator.com";
    public String PASSWORD = "#Malinator1";
    public String search_item = "oil";
    public static String scroll = "window.scrollBy(0, 850)";
    @FindBy(how = How.XPATH, using = "//div[@class='atc-btn']//button")
    public static WebElement addCart;
    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-sm btn-light-gray']")
    public static WebElement continueShopping;
    @FindBy(how = How.XPATH, using = "(//div[@class='text-right cart-btns px-0 col-12']//button)[2]")
    public static WebElement checkOut;
    @FindBy(how = How.XPATH, using = "//button[@class='notification p-2']//i[@class='fa fa-shopping-cart']")
    public static WebElement cartIcon;


    public static void  add_to_cart() throws InterruptedException {
        CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript(scroll);
        CartPage.addCart.click();

    }
}
