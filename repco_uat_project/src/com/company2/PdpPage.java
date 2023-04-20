package com.company2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PdpPage extends TestBase{

    @FindBy(how = How.XPATH, using = "(//div[@class='row no-margin']//div//a)[1]")
    public  WebElement clickProduct;

    public static void navigate_to_pdp(){
        PdpPage pdpPage = PageFactory.initElements(driver, PdpPage.class);
        pdpPage.clickProduct.click();
    }
}
