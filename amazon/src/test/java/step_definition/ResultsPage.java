package step_definition;

import baseclass.BaseClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import pageObject.Results_Page;

import java.util.ArrayList;

public class ResultsPage extends BaseClass{
    WebDriver driver = BaseClass.driver;

    @When("^User clicks on the first option in the results page$")
    public void user_clicks_on_the_first_option_in_the_results_page() {
        Results_Page.clickOnOption();
    }

//    @Then("^User lands on the results page$")
//    public void user_lands_on_the_results_page() {
//        String title= driver.getTitle();
//        System.out.println(title);
//        Assert.assertEquals(" Amazon.in : books", title);
//    }


//    @And("^User clicks on the Add to eBook Cart button$")
//    public void user_clicks_on_the_add_to_eBook_cart_button() {
//        String windowHandle = driver.getWindowHandle();
//        ArrayList tabs = new ArrayList (driver.getWindowHandles());
//        System.out.println(tabs.size());
//        driver.switchTo().window((String) tabs.get(1));
//        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
//        driver.findElement(By.xpath("//*[@id='add-to-ebooks-cart-button']")).click();
//    }

}
