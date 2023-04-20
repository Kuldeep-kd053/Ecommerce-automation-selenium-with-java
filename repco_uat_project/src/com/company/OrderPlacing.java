package com.company;

import com.company2.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static com.company2.LoginPage.username;

public class OrderPlacing extends TestBase {

    @Test
    public void place_order() throws InterruptedException {
        OrderPlacing orderPlacing = PageFactory.initElements(driver, OrderPlacing.class);
        LoginPage.login(username,password);
        driver.navigate().refresh();
        StoreSelectionPage.store_selection();
        PlpPage.navigate_plp();
        PdpPage.navigate_to_pdp();
        CartPage.add_to_cart();
        CartPage.checkOut.click();
        Thread.sleep(4000);
        CheckOutPage.order_now();
        Thread.sleep(3000);
        CheckOutPage.secure_checkout();

    }
}
