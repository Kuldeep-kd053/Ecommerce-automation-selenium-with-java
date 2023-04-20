package com.company2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class WishListPage extends TestBase {
    PdpPage pdpPage = new PdpPage();


    String search_item = "wire";
    String scroll = "window.scrollBy(0, 950)";
    String saved = "Saved to Wish List";

                        // WISHLIST
    public String TESTUSER = "s@malinator.com";
    public String TESTPASSWORD = "#Malinator1";

    @FindBy(how = How.XPATH, using = "//i[@class='fa fa-clipboard-list']//parent::span")
    public WebElement wishlistIcon;
    @FindBy(how = How.XPATH, using = "(//div[@class='row']//a[@class='productName'])[1]")
    public static WebElement searchSuggestion;
    @FindBy(how = How.XPATH, using = "//span[@class='font-weight-bold']")
    public static WebElement plpCategory;
    @FindBy(how = How.XPATH, using = "//div[@class='mt-3 save-to-wishlist']//span")
    public static WebElement save_toWishlist;
    @FindBy(how = How.XPATH, using = "//div[@class='row confirm-row mt-3']")
    public List<WebElement> wishListItems;
    @FindBy(how = How.XPATH, using = "(//div[@class='col-5 pl-0 pr-3 text-right']//ul)[1]")
    public WebElement remove_wishlistItem;
    @FindBy(how = How.XPATH, using = "//span[@class='align-text-bottom saved-to-wishlist-text']")
    public WebElement savedToWishlist;

    @FindBy(how = How.XPATH, using = "(//span[@class='badge'])[1]")
    public WebElement wishListCounter;

    public void wish_list() throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Thread.sleep(7000);
        wishlistIcon.click();
        if
        (loginPage.returnigCustomer.isDisplayed())
            LoginPage.login(TESTUSER,TESTPASSWORD);
        else
            wishlistIcon.click();

    }
    public void save_to_wishlist() throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Thread.sleep(7000);
        PlpPage.navigate_plp();
        PdpPage.navigate_to_pdp();
        Thread.sleep(3000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript(scroll);
        Thread.sleep(3000);
        WishListPage.save_toWishlist.click();
        Thread.sleep(5000);
        String saved_to_wishlist_text = savedToWishlist.getText();
        assertEquals(saved_to_wishlist_text,saved);

    }

    public void remove_From_wishlist() throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        Thread.sleep(20000);
        wishlistIcon.click();
        remove_wishlistItem.click();
    }
}
