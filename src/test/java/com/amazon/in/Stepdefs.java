package com.amazon.in;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Stepdefs {

    HomePage home = new HomePage();
    SearchResultsPage resultsPage = new SearchResultsPage();
    ProductDetailsPage detailsPage = new ProductDetailsPage();
    BasketPage basketPage = new BasketPage();

    @Given("^I am on amezon home page$")
    public void i_am_in_amzon_home_page() throws Throwable {
        //home.openBrowser(); Before hook is handled to open browser with amazon url
    }

    @When("^I search for a product$")
    public void i_search_for_a_product() throws Throwable {
       home.searchForProduct();
    }

    @Then("^I should see the product in the search result$")
    public void i_should_see_the_product_in_the_search_result() throws Throwable {
        Assert.assertTrue("Search result page", resultsPage.searchResultPage());
    }

    @When("^I choose the first product$")
    public void i_choose_the_first_product() throws Throwable {
        resultsPage.selectFirstProduct();
    }

    @When("^I add product to basket$")
    public void i_add_product_to_basket() throws Throwable {
       detailsPage.addToBasket();
    }

    @Then("^basket is updated with an item count$")
    public void basket_is_updated_with_an_item_count() throws Throwable {
       Assert.assertEquals("1", basketPage.getBasketItems());
    }
}

