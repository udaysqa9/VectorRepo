package step_definition;
import baseclass.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObject.Credits_Page;

public class Credits {

    @Then("^Add the value \"([^\"]*)\" of each credit code$")
    public void add_the_value_amount_of_each_credit_code(String amount){
        Credits_Page.Amount(amount);
    }

    @And("^Enter the \"([^\"]*)\" that will be needed$")
    public void enter_the_code_that_will_be_needed(String code){
        Credits_Page.Code(code);
    }
}
