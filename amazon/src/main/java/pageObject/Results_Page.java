package pageObject;

import org.openqa.selenium.By;

import static baseclass.BaseClass.*;

public class Results_Page {

    public static By ClickOnOption = By.xpath("//*[@alt='I Will Teach You Excel: Master Excel, Surpass Your Co-Workers, And Impress Your Boss!']");

    public static void clickOnOption() {
        driver.findElement(ClickOnOption).click();
        log.info("Clicked on Option");
    }


}
