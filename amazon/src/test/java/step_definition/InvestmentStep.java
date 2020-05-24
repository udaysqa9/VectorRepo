package step_definition;
import baseclass.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObject.Investment_Step;

public class InvestmentStep extends BaseClass{

    @Then("^Add a \"([^\"]*)\"$")
        public void add_a_usecase(String usecase){
        Investment_Step.UseCase(usecase);
    }

    @Then("^Add \"([^\"]*)\"$")
    public void add_primarygoal(String primarygoal){
        Investment_Step.PrimaryGoal(primarygoal);
    }

    @And("^Enter the \"([^\"]*)\"$")
    public void enter_the_business_activity(String businessActivity){
        Investment_Step.BusinessActivity(businessActivity);
    }

    @And("^Enter \"([^\"]*)\"$")
    public void enter_competitor(String competitor){
        Investment_Step.Competitor(competitor);
    }

    @And("^Write down the \"([^\"]*)\"$")
    public void write_down_the_business_justification(String businessJustification){
        Investment_Step.BusinessJustification(businessJustification);
    }

    @And("^Enter the incremental monthly \"([^\"]*)\"$")
    public void enter_the_incremental_monthly_recurring_revenue(String recurringRevenue){
        Investment_Step.RecurringRevenue(recurringRevenue);
    }

    @And("^Enter the \"([^\"]*)\" to achieve the goal$")
    public void enter_the_months_to_achieve_the_goal(String months){
        Investment_Step.Months(months);
    }

    @Then("^Click on the next button$")
    public void click_on_the_next_button(){
        Investment_Step.NextButton();
    }

}
