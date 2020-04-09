package com.weborders.pages;

import com.weborders.tests.AbstractBaseTest;
import com.weborders.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AybetulPage extends AbstractBasePage {

    @FindBy(css="[type='checkbox']")
    protected List<WebElement> checkboxList;

    @FindBy(xpath = "//table[@class='SampleTable']//td[2]")
    protected List<WebElement> nameList;

    @FindBy(xpath = "//input[@type='submit']")
    protected WebElement delete;

    public List<WebElement> getCheckBoxList(){
     return checkboxList;
    }

    public List<WebElement> getNamesList(){
        return nameList;
    }

    public void deleteSelected(int x){
        checkboxList.get(x).click();
        delete.click();

    }

}
