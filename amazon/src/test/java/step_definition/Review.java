package step_definition;
import baseclass.BaseClass;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObject.Review_page;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Review extends BaseClass{

    @Then("^Verify the AWS \"([^\"]*)\"$")
    public void verify_the_AWS_accountid(String expectedResult) {
        Review_page.VerifyValues(expectedResult);

}
}
