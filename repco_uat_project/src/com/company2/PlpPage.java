package com.company2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

public class PlpPage extends TestBase{

    public static String search_item = "oil";

    @FindBy(how = How.XPATH, using = "//div[@class='search-box']//input")
    public  static WebElement searchProduct;
    @FindBy(how = How.XPATH, using = "(//div[@class='row']//a[@class='productName'])[1]")
    public static WebElement firstSuggestion;
    @FindBy(how = How.XPATH,using = "//span[@class='search-result-text']//span")
    public static WebElement plpCategory;
    @FindBy(how = How.XPATH,using = "//p[@class='showing']")
    public static WebElement noOFElements;
    @FindBy(how = How.XPATH,using = "(//div[@class='product-section']//section)[1]")
    public static WebElement sortBy;
    @FindBy(how = How.XPATH,using = "//div[@class='p-0 mb-3 prod-card col-6']")
    public static List<WebElement> pageNumber;

    public static void navigate_plp()  {
        PlpPage plpPage = PageFactory.initElements(driver, PlpPage.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        PlpPage.searchProduct.sendKeys(search_item);
        PlpPage.firstSuggestion.click();
    }
}


