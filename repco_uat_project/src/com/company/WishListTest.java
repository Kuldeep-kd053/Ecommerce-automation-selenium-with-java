package com.company;

import com.company2.LoginPage;
import com.company2.StoreSelectionPage;
import com.company2.TestBase;
import com.company2.WishListPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public  class WishListTest extends TestBase {
    @BeforeClass
    @Override
    public void set_browser()
    {
        super.set_browser();
    }

    @Test(priority = 1)
    public void wish_list_test() throws InterruptedException {
        WishListPage wishListPage = PageFactory.initElements(driver, WishListPage.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        wishListPage.wish_list();
        Thread.sleep(6000);
        wishListPage.wishlistIcon.click();
        int SIZE = wishListPage.wishListItems.size();
        System.out.println(SIZE);
    }
    @Test(priority = 2)
    public void save_to_wishlist_Test() throws InterruptedException {
        WishListPage wishListPage = PageFactory.initElements(driver, WishListPage.class);
        LoginPage.login(LoginPage.username,LoginPage.password);
        StoreSelectionPage.store_selection();
        wishListPage.save_to_wishlist();
        Thread.sleep(3000);
        LoginPage.repcoLogo.click();
        wishListPage.wishlistIcon.click();
        int SIZE = wishListPage.wishListItems.size();
        String SIZE2 = wishListPage.wishListCounter.getText();
        int number = Integer.parseInt(SIZE2);
        assertEquals(SIZE, number);
    }
    @Test(priority = 3)
    public void remove_from_wishlist_test() throws InterruptedException {
        WishListPage wishListPage = PageFactory.initElements(driver, WishListPage.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wishListPage.remove_From_wishlist();
        Thread.sleep(3000);
        int list = wishListPage.wishListItems.size();
        System.out.println(list);
        String number = wishListPage.wishListCounter.getText();
        int counter = Integer.parseInt(number);
        assertEquals(list, counter);
    }
}
