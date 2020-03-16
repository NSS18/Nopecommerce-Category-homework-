package com.nopCommerce;

import org.openqa.selenium.By;

public class SubCategory extends Utils {

    public void verifyUserClickedOnSubCategorySuccessfully(String subCategory) {

        //To check we are on right sub category page
        assertTextMessage("You are not on Sub-category"+subCategory,subCategory,By.className("page-title"));


    }
}