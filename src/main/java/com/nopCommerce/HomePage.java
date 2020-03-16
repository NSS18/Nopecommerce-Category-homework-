package com.nopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class HomePage extends Utils {

    //Verify user is on Homepage
    public void verifyUserIsOnHomePage()
    {
        assertURL("https://demo.nopcommerce.com/");
    }
//To hover on main category
    public void hoverOverMainCategory(String mainCategory) {
        //locator for web element main category
        WebElement link_mainCategory = driver.findElement(By.linkText(mainCategory));
        //creating object of Action class
        Actions builder = new Actions(driver);
        Action mouseOverMainCategory = builder.moveToElement(link_mainCategory).build();
        mouseOverMainCategory.perform();

    }
//To click on sub category
    public void clickOnSubCategory(String subCategory)
    {
        clickOnElement(By.linkText(subCategory));
    }

}
