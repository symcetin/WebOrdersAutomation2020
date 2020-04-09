package com.weborders.tests;

import com.weborders.pages.LoginPage;
import com.weborders.pages.SumeyraPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sumeyra extends AbstractBaseTest {
/*
 * Go to WebOrders website and login
 * Select Order page
 * Under product information :
 *Select Screensaver as a product
 *Type 5 for Quantity
 *Verify price per unit is 20
 *Verify no discount
 */
    LoginPage loginPage = new LoginPage();
    SumeyraPage page = new SumeyraPage();
    @Test
    public void test(){
        loginPage.login();
        loginPage.navigateTo("Order");
        page.getproduct();
        page.putQuantity();
        Assert.assertEquals(page.defaultPrice(), "20");
        Assert.assertEquals(page.getDiscount(), "0");


    }
}
