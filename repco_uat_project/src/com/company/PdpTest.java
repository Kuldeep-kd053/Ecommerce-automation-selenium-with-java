package com.company;

import com.company2.PdpPage;
import com.company2.PlpPage;
import com.company2.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PdpTest extends TestBase {
    @Test
    public void pdp_test(){
        PdpPage pdpPage = PageFactory.initElements(driver, PdpPage.class);
        PlpPage.navigate_plp();
        PdpPage.navigate_to_pdp();

    }
}
