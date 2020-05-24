package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static baseclass.BaseClass.*;

public class Home_page {

    public static By SearchBox = By.xpath("//*[@id='twotabsearchtextbox']");

    public static void TypeInSearchBox(String items) {
        driver.findElement(SearchBox).sendKeys(items);
        log.info("Item is Entered");
    }

    public static void EnterSearchBox() {
        driver.findElement(SearchBox).sendKeys(Keys.ENTER);
        log.info("Enter the search");
    }


}
