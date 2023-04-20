package com.company;

import com.company2.LoginPage;
import com.company2.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;

import static com.company2.LoginPage.username;

public class Fd extends TestBase{
    @FindBy(how = How.XPATH, using = "(//div[@class='col icons']//button)[2]")
    public static WebElement my_account;
    @Test
    public void ret() throws InterruptedException {
        Fd fd = PageFactory.initElements(driver, Fd.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
        LoginPage.login(username,password);
        Fd.my_account.sendKeys(Keys.F5);
        //DRAG AND DROP
        Actions action = new Actions(driver);
        //action.dragAndDrop(Sourcelocator, Destinationlocator).build().perform();


        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        //switch to new tab
        driver.switchTo().window(newTab.get(1));

        //MOVE TO ELEMENT
        //Actions action = new Actions(driver);
        //action.moveToElement(element).click().perform();


        //ALERT HANDLING
        //Accept Alert :
        driver.switchTo().alert().accept();
        //Dismiss Alert:
        driver.switchTo().alert().dismiss();
        //Get Text:
        driver.switchTo().alert().getText();
        //Type Text:
        driver.switchTo().alert().sendKeys("Text");
        driver.switchTo().window(newTab.get(1));





        //How to automate Select Dropdown in Selenium?
                Select select =new Select(driver.findElement(By.id("cars")));

        select.selectByVisibleText("Honda");
            }
        }



