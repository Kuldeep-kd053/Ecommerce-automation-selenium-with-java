package com.company;
import com.company2.PlpPage;
import com.company2.StoreSelectionPage;
import com.company2.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;


public class PlpTest extends TestBase {

    public static String result = "engine oil";

    @Test
    public static void search_result_test() throws InterruptedException {
        PlpPage plpPage = PageFactory.initElements(driver, PlpPage.class);
        PlpPage.navigate_plp();
        Thread.sleep(3000);
        assertEquals(PlpPage.plpCategory.getText(), result);
    }

    @Test
    public void totalElement() {
        String str = PlpPage.noOFElements.getText();
        List<String> myList = new ArrayList<String>(Arrays.asList(str.split(" ")));
        String a = myList.get(3);
        int number = Integer.parseInt(a);
        System.out.println(number);
        int siz = PlpPage.pageNumber.size();
        System.out.println(siz);
        assertEquals(number, siz);

    }

    @Test
    public void short_by_option() throws InterruptedException {
        StoreSelectionPage.store_selection();
        Thread.sleep(5000);

        String str = PlpPage.sortBy.getText();
        String b [];
        System.out.println(str);

        }
    }
