package com.weborders.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SumeyraPage extends AbstractBasePage {
    @FindBy(css = "[id='ctl00_MainContent_fmwOrder_ddlProduct']")
    protected WebElement screenSaver;

    @FindBy(xpath = "//input[@type='text'][1]")
    protected WebElement quantity;

    @FindBy(xpath = "//input[@type='text'][1]")
    protected WebElement pricePerUnit;

    @FindBy(xpath = "//input[@type='text'][1]")
    protected WebElement discount;

    public void putQuantity(){
        quantity.sendKeys("5");
    }

    public String defaultPrice(){
       return pricePerUnit.getAttribute("value");
    }

    public String getDiscount(){
        return discount.getAttribute("value");
    }

    public void getproduct(){
        Select product = new Select(screenSaver);
        product.selectByVisibleText("ScreenSaver");
    }


}
