package com.company;

import com.company2.MyGaragePage;
import com.company2.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MyGarageTest extends TestBase {
    String  vehicle_name = "MERCEDES-BENZ C250 CDI";

    @Test
    public void garage_page_test() throws InterruptedException {
        MyGaragePage myGaragePage = PageFactory.initElements(driver, MyGaragePage.class);
        MyGaragePage.add_vehicle();
        String vehicle = MyGaragePage.vehicleName.getText();
        System.out.println(vehicle);
        assertEquals(vehicle_name,vehicle);

    }
    @Test
    public void select_vehicle_manually(){
        MyGaragePage myGaragePage = PageFactory.initElements(driver, MyGaragePage.class);



    }
}
