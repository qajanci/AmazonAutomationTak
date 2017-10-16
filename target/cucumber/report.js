$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/addItemToBasket.feature");
formatter.feature({
  "line": 2,
  "name": "Search Feature- Amazon",
  "description": "As an user\r\nI want to search for a product\r\nSo that I can choose and add to basket",
  "id": "search-feature--amazon",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@search"
    }
  ]
});
formatter.before({
  "duration": 15026945060,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Search product",
  "description": "",
  "id": "search-feature--amazon;search-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I am on amezon home page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I search for a product",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should see the product in the search result",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I choose the first product",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I add product to basket",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "basket is updated with an item count",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.i_am_in_amzon_home_page()"
});
formatter.result({
  "duration": 420722557,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefs.i_search_for_a_product()"
});
formatter.result({
  "duration": 7632713128,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefs.i_should_see_the_product_in_the_search_result()"
});
formatter.result({
  "duration": 235848670,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefs.i_choose_the_first_product()"
});
formatter.result({
  "duration": 9089392460,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefs.i_add_product_to_basket()"
});
formatter.result({
  "duration": 11706185556,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefs.basket_is_updated_with_an_item_count()"
});
formatter.result({
  "duration": 980481552,
  "status": "passed"
});
formatter.after({
  "duration": 1846649728,
  "status": "passed"
});
});