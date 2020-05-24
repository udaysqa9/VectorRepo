package step_definition;
import baseclass.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pageObject.Product_Services;

public class ProductServices extends BaseClass{

    @Then("^Enter the value in \"([^\"]*)\"$")
    public void enter_the_value_in_machineLearning(String machineLearning){
        Product_Services.MachineLearning(machineLearning);
    }

    @And("^Check on compute$")
    public void check_on_compute(){

        Product_Services.CheckCompute();
    }

    @And("^Search in the \"([^\"]*)\"$")
    public void search_in_the_typebox(String typebox){
        System.out.println("Element is displayed============= "+driver.findElement(By.id("awsui-checkbox-179")).isDisplayed());
        ((JavascriptExecutor) driver).executeAsyncScript("window.scrollBy(0,-250)","");
        Product_Services.Typebox(typebox);
    }


}
