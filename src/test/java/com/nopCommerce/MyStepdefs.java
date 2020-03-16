package com.nopCommerce;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class MyStepdefs {

    //creating object of homepage
    HomePage homePage=new HomePage();
    SubCategory subcategory=new SubCategory();
    @Given("User is on home page")
    public void user_is_on_home_page() {
        homePage.verifyUserIsOnHomePage();
    }

    @When("User hover over {string} and click on subcategory {string}")
    public void user_hover_over_and_click_on_subcategory(String category, String subCategory ) {
        homePage.hoverOverMainCategory(category);
        homePage.clickOnSubCategory(subCategory);

    }

    @Then("User should able to see subcategory {string} products")
    public void user_should_able_to_see_subcategory_products(String subCategory) {
        subcategory.verifyUserClickedOnSubCategorySuccessfully(subCategory);

    }








}
