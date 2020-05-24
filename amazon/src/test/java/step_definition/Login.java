package step_definition;

import baseclass.BaseClass;
//import cucumber.api.java.en.Given;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.CucumberOptions;



//import cucumber.api.java.en.Then;
import pageObject.Login_Page;


public class Login extends BaseClass {


    @Given("^User is already on Login Page$")
    public void user_is_already_on_Login_Page() {
        System.out.println("=========Browser Session Started==========");
        BaseClass.openBrowser();
        System.out.println("==========Application Started=============");
    }

    @Given("^User is already on Request Page$")
    public void user_is_already_on_Request_Page() {
        System.out.println("=========Browser Session Started==========");
        BaseClass.openBrowser();
        Login_Page.VerifyRequestPage();
        System.out.println("==========Application Started=============");
    }

    @Then ("^Assign a name to the \"([^\"]*)\"$")
    public void assign_a_name_to_the_promotion(String promotionName) {
        Login_Page.AssignPromotion(promotionName);
    }

    @Then ("^Enter customer AWS \"([^\"]*)\"$")
    public void enter_customer_aws_accountid(String accountID){
        Login_Page.AccountID(accountID);
    }

    @Then ("^Enter customer \"([^\"]*)\"$")
    public void enter_customer_name(String name){
        Login_Page.Name(name);
    }

    @Then ("^Select customer \"([^\"]*)\"$")
    public void select_customer(String industry){
        Login_Page.Industry(industry);
    }

    @Then ("^Select customer geo \"([^\"]*)\"$")
    public void select_customer_geo_location(String location){
        Login_Page.Location(location);
    }




    @Then("^User clicks on Hello to Sign in$")
    public void user_clicks_on_hello_to_sign_in(){
        System.out.println("Hi");
        Login_Page.clickOnHelloButton();
    }

    @Then("^Verify signin button in signin page$")
    public void user_clicks_on_sign_in(){
        Login_Page.CheckSignIn();
    }

    @Then("^Verify if we can navigate to SignIn Page$")
    public void verify_if_the_login_page_is_visible(){
        Login_Page.VerifySignInPage();
    }

    @Then ("^Create Amazon account is present$")
        public void create_amazon_account_is_present(){
        Login_Page.VerifyCreateAccount();
        }

    @Then("^The User enters the \"([^\"]*)\"$")
    public void the_user_enters_the_username(String username) {
        Login_Page.EnterTheUsername(username);
    }

    @Then("^User enters the \"([^\"]*)\"$")
    public void user_enters_the_password(String password) {
        Login_Page.EnterThePassword(password);
    }

    @Then("^User clicks on Continue$")
    public void user_clicks_on_continue() {
        Login_Page.clickOnContinue();
    }

    @Then("^User clicks on Login button$")
    public void user_clicks_on_login_button() {
       Login_Page.clickOnLogin();
    }


    @Then("^Close the browser$")
    public void close_the_browser() {
//        BaseClass.quitBrowser();
    }

    @Then("^Check the account name$")
    public void check_the_account_name(){
        Login_Page.VerifyAccountName("Hello");

    }


}
