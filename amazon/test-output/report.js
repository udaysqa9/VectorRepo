$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/login.feature");
formatter.feature({
  "line": 3,
  "name": "Amazon Add to Cart Feature",
  "description": "",
  "id": "amazon-add-to-cart-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TrialRun"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Add a product to Cart",
  "description": "",
  "id": "amazon-add-to-cart-feature;add-a-product-to-cart",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@AddToCart_001"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User clicks on Hello to Sign in",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "The User enters the \"\u003cusername\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User clicks on Continue",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User enters the \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User types \"\u003citems\u003e\" on the search box",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "press the search button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User clicks on the first option in the results page",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User clicks on the Add to eBook Cart button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "amazon-add-to-cart-feature;add-a-product-to-cart;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "items"
      ],
      "line": 20,
      "id": "amazon-add-to-cart-feature;add-a-product-to-cart;;1"
    },
    {
      "cells": [
        "josheesaikia@gmail.com",
        "Lovegoa1#",
        "books"
      ],
      "line": 21,
      "id": "amazon-add-to-cart-feature;add-a-product-to-cart;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 90709800,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Add a product to Cart",
  "description": "",
  "id": "amazon-add-to-cart-feature;add-a-product-to-cart;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@AddToCart_001"
    },
    {
      "line": 1,
      "name": "@TrialRun"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User clicks on Hello to Sign in",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "The User enters the \"josheesaikia@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User clicks on Continue",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User enters the \"Lovegoa1#\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User types \"books\" on the search box",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "press the search button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User clicks on the first option in the results page",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User clicks on the Add to eBook Cart button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 11178100800,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_clicks_on_hello_to_sign_in()"
});
formatter.result({
  "duration": 3037789300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "josheesaikia@gmail.com",
      "offset": 21
    }
  ],
  "location": "Login.the_user_enters_the_username(String)"
});
formatter.result({
  "duration": 284794700,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_clicks_on_continue()"
});
formatter.result({
  "duration": 661469800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lovegoa1#",
      "offset": 17
    }
  ],
  "location": "Login.user_enters_the_password(String)"
});
formatter.result({
  "duration": 169172700,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 1799693700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "books",
      "offset": 12
    }
  ],
  "location": "Homepage.user_types_items_on_the_search_box(String)"
});
formatter.result({
  "duration": 219125500,
  "status": "passed"
});
formatter.match({
  "location": "Homepage.press_press_the_search_button()"
});
formatter.result({
  "duration": 2545652600,
  "status": "passed"
});
formatter.match({
  "location": "ResultsPage.user_clicks_on_the_first_option_in_the_results_page()"
});
formatter.result({
  "duration": 335755600,
  "status": "passed"
});
formatter.match({
  "location": "ResultsPage.user_clicks_on_the_add_to_eBook_cart_button()"
});
formatter.result({
  "duration": 4535515500,
  "status": "passed"
});
formatter.match({
  "location": "Login.close_the_browser()"
});
formatter.result({
  "duration": 900261700,
  "status": "passed"
});
formatter.after({
  "duration": 2962000,
  "status": "passed"
});
});