package com.company;

import com.company2.StoreSelectionPage;
import com.company2.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StoreSelectionTest extends TestBase {
    String postcode ="3010";
    String store_name = "Repco Camperdown";
    @BeforeClass
    @Override
    public void set_browser()

    {
        super.set_browser();
    }
    @Test
    public void store_validation() throws InterruptedException {
        StoreSelectionPage storeSelectionPage = PageFactory.initElements(driver, StoreSelectionPage.class);
        StoreSelectionPage.store_selection();
        Thread.sleep(3000);
        String selected_store = StoreSelectionPage.selectStore.getText();
        System.out.println(selected_store);
        assertEquals(selected_store,store_name);
    }
}
