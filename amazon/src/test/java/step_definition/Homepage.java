package step_definition;

import baseclass.BaseClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;
import pageObject.Home_page;


public class Homepage extends BaseClass {


    @Then("^User types \"([^\"]*)\" on the search box$")
    public void user_types_items_on_the_search_box(String items) {
        Home_page.TypeInSearchBox(items);
    }


    @Then("^press the search button$")
    public void press_press_the_search_button() {
        Home_page.EnterSearchBox();
    }

    //    @Then("^User lands on the Homepage$")
//    public void user_lands_on_the_homepage() {
//        String title= driver.getTitle();
//        System.out.println(title);
//        Assert.assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", title);
//    }


}
