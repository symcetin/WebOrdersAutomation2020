package com.weborders.tests;

import com.weborders.pages.AybetulPage;
import com.weborders.pages.LoginPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class Aybetul extends AbstractBaseTest{
    /**
     * login Web orders
     * Go to View All orders
     * select random name
     * delete selected name
     * verify selected name deleted
     *
     */

    LoginPage loginPage = new LoginPage();
    AybetulPage page = new AybetulPage();
    @Test (description = "Verify selected name is deleted")
    public void test(){


     loginPage.login();
     loginPage.navigateTo("View all orders");
        List<WebElement>list = page.getCheckBoxList();
        List<WebElement> list2 = page.getNamesList();
        Random x = new Random();
        int y = x.nextInt(list.size());

        String name = list.get(y).getText();
        page.deleteSelected(y);
        Assert.assertFalse(list2.contains(list.get(y)));

    }
}
