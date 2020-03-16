$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/Resources/Features/category.feature");
formatter.feature({
  "name": "category navigation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should able to hover over main category and should able to click on subcategory successfully",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@hover"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.nopCommerce.MyStepdefs.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User hover over \"Electronics\" and click on subcategory \"Camera \u0026 photo\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.nopCommerce.MyStepdefs.user_hover_over_and_click_on_subcategory(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should able to see subcategory \"Camera \u0026 photo\" products",
  "keyword": "Then "
});
formatter.match({
  "location": "com.nopCommerce.MyStepdefs.user_should_able_to_see_subcategory_products(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});