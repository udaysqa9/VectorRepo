@Smokes

Feature: AWS Investments

  @Smoke_001
  Scenario Outline: Verify The Request Credit
    Given User is already on Request Page
    Then Assign a name to the "<promotionName>"
    Then Enter customer AWS "<accountID>"
    Then Enter customer "<name>"
    Then Select customer "<industry>"
    Then Select customer geo "<location>"
    Then Click on the next button
    Then Add a "<usecase>"
    Then Click on the next button
    Then Add "<primarygoal>"
    And Enter the "<businessActivity>"
    And Enter "<competitor>"
    And Write down the "<businessJustification>"
    And Enter the incremental monthly "<recurringRevenue>"
    And Enter the "<months>" to achieve the goal
    Then Click on the next button
#    And Search in the "<typebox>"
    And Check on compute
#    Then Enter the value in "<machineLearning>"
#    Then Click on the next button
    Then Add the value "<amount>" of each credit code
    And Enter the "<code>" that will be needed
    Then Click on the next button
    Then Verify the AWS "<accountID>"



Examples:
  |promotionName|accountID|name|industry|location|usecase|primarygoal|businessActivity|competitor||businessJustification|recurringRevenue|months|machineLearning|amount|code|typebox|
  |InvestTest|971770194144|Joshee|Defense|Canada|Archiving|Goodwill  |Marketing       |Adobe     ||Testing Purpose      |10000             |20  |Amazon Forecast|1000|100|AWS Cost Management|



  @Smoke_002

  Scenario: Verify Element

    Given User is already on Request Page
    Then Check the account name




#  @SmokeTest_001
#  Scenario: Verify sign in button is getting clicked
#    Given User is already on Login Page
#    Then Verify signin button in signin page
#    Then User clicks on Hello to Sign in
#    Then Verify if we can navigate to SignIn Page
#
#
#  @SmokeTest_002
#    Scenario: Verify if Create Amazon account is present
#
#    Given User is already on Login Page
#    Then User clicks on Hello to Sign in
#    Then Create Amazon account is present
#
#
#
#  @AddToCart_001
#  Scenario Outline: Add a product to Cart
#    Given User is already on Login Page
#    Then User clicks on Hello to Sign in
#    Then The User enters the "<username>"
#    Then User clicks on Continue
#    Then User enters the "<password>"
#    And User clicks on Login button
#    When User types "<items>" on the search box
#    And press the search button
#    When User clicks on the first option in the results page
##    And User clicks on the Add to eBook Cart button
#
#    Examples:
#      |username|password|items|
#      |josheesaikia@gmail.com|Lovegoa1#|books|


