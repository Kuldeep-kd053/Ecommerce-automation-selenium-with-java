package com.company;

import com.company2.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CartTest extends TestBase {
    @BeforeClass
    @Override
    public void set_browser()

    {
        super.set_browser();
}
 @Test
    public void cart_test() throws InterruptedException {
     CartPage cartPage= PageFactory.initElements(driver, CartPage.class);
     LoginPage.login(email,password);
     StoreSelectionPage.store_selection();
     PlpPage.navigate_plp();
     PdpPage.navigate_to_pdp();
     cartPage.add_to_cart();
     Thread.sleep(5000);

    }
}
