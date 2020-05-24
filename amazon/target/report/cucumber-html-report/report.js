$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/login.feature");
formatter.feature({
  "name": "AWS Investments",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Smokes"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Verify The Request Credit",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke_001"
    }
  ]
});
formatter.step({
  "name": "User is already on Request Page",
  "keyword": "Given "
});
formatter.step({
  "name": "Assign a name to the \"\u003cpromotionName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter customer AWS \"\u003caccountID\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter customer \"\u003cname\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Select customer \"\u003cindustry\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Select customer geo \"\u003clocation\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Click on the next button",
  "keyword": "Then "
});
formatter.step({
  "name": "Add a \"\u003cusecase\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Click on the next button",
  "keyword": "Then "
});
formatter.step({
  "name": "Add \"\u003cprimarygoal\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter the \"\u003cbusinessActivity\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Enter \"\u003ccompetitor\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Write down the \"\u003cbusinessJustification\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the incremental monthly \"\u003crecurringRevenue\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the \"\u003cmonths\u003e\" to achieve the goal",
  "keyword": "And "
});
formatter.step({
  "name": "Click on the next button",
  "keyword": "Then "
});
formatter.step({
  "name": "Check on compute",
  "keyword": "And "
});
formatter.step({
  "name": "Add the value \"\u003camount\u003e\" of each credit code",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter the \"\u003ccode\u003e\" that will be needed",
  "keyword": "And "
});
formatter.step({
  "name": "Click on the next button",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify the AWS \"\u003caccountID\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "promotionName",
        "accountID",
        "name",
        "industry",
        "location",
        "usecase",
        "primarygoal",
        "businessActivity",
        "competitor",
        "",
        "businessJustification",
        "recurringRevenue",
        "months",
        "machineLearning",
        "amount",
        "code",
        "typebox"
      ]
    },
    {
      "cells": [
        "InvestTest",
        "971770194144",
        "Joshee",
        "Defense",
        "Canada",
        "Archiving",
        "Goodwill",
        "Marketing",
        "Adobe",
        "",
        "Testing Purpose",
        "10000",
        "20",
        "Amazon Forecast",
        "1000",
        "100",
        "AWS Cost Management"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify The Request Credit",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smokes"
    },
    {
      "name": "@Smoke_001"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is already on Request Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_is_already_on_Request_Page()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Investments]\u003e but was:\u003c[Google]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat pageObject.Login_Page.VerifyRequestPage(Login_Page.java:74)\n\tat step_definition.Login.user_is_already_on_Request_Page(Login.java:23)\n\tat ✽.User is already on Request Page(file:src/test/resources/login.feature:7)\n",
  "status": "failed"
});
formatter.step({
  "name": "Assign a name to the \"InvestTest\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.assign_a_name_to_the_promotion(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter customer AWS \"971770194144\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.enter_customer_aws_accountid(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter customer \"Joshee\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.enter_customer_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select customer \"Defense\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.select_customer(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select customer geo \"Canada\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.select_customer_geo_location(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on the next button",
  "keyword": "Then "
});
formatter.match({
  "location": "InvestmentStep.click_on_the_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Add a \"Archiving\"",
  "keyword": "Then "
});
formatter.match({
  "location": "InvestmentStep.add_a_usecase(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on the next button",
  "keyword": "Then "
});
formatter.match({
  "location": "InvestmentStep.click_on_the_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Add \"Goodwill\"",
  "keyword": "Then "
});
formatter.match({
  "location": "InvestmentStep.add_primarygoal(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the \"Marketing\"",
  "keyword": "And "
});
formatter.match({
  "location": "InvestmentStep.enter_the_business_activity(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter \"Adobe\"",
  "keyword": "And "
});
formatter.match({
  "location": "InvestmentStep.enter_competitor(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Write down the \"Testing Purpose\"",
  "keyword": "And "
});
formatter.match({
  "location": "InvestmentStep.write_down_the_business_justification(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the incremental monthly \"10000\"",
  "keyword": "And "
});
formatter.match({
  "location": "InvestmentStep.enter_the_incremental_monthly_recurring_revenue(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the \"20\" to achieve the goal",
  "keyword": "And "
});
formatter.match({
  "location": "InvestmentStep.enter_the_months_to_achieve_the_goal(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on the next button",
  "keyword": "Then "
});
formatter.match({
  "location": "InvestmentStep.click_on_the_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Check on compute",
  "keyword": "And "
});
formatter.match({
  "location": "ProductServices.check_on_compute()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Add the value \"1000\" of each credit code",
  "keyword": "Then "
});
formatter.match({
  "location": "Credits.add_the_value_amount_of_each_credit_code(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the \"100\" that will be needed",
  "keyword": "And "
});
formatter.match({
  "location": "Credits.enter_the_code_that_will_be_needed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on the next button",
  "keyword": "Then "
});
formatter.match({
  "location": "InvestmentStep.click_on_the_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify the AWS \"971770194144\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Review.verify_the_AWS_accountid(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Element",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smokes"
    },
    {
      "name": "@Smoke_002"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is already on Request Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_is_already_on_Request_Page()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Investments]\u003e but was:\u003c[Google]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat pageObject.Login_Page.VerifyRequestPage(Login_Page.java:74)\n\tat step_definition.Login.user_is_already_on_Request_Page(Login.java:23)\n\tat ✽.User is already on Request Page(file:src/test/resources/login.feature:44)\n",
  "status": "failed"
});
formatter.step({
  "name": "Check the account name",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.check_the_account_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
});