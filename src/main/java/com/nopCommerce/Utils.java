package com.nopCommerce;

import org.junit.Assert;
import org.openqa.selenium.By;

//class for all reusable methods----------------------------------------------------

public class Utils extends BasePage {


    //To click
    public void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }

    //To enter text
    public void enterText(By by,String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    //To get text
    public static String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }

    //To match actual and expected text message
    public static void assertTextMessage(String message,String expected,By by)
    {
        String actual=getTextFromElement(by);
        //Assert.assertEquals(message,expected,actual);
        Assert.assertEquals(message,expected,actual);
    }

    //To check current url
    public static void assertURL(String text)
    {
        Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }

    }
