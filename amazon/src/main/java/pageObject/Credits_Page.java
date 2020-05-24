package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static baseclass.BaseClass.*;

public class Credits_Page {

    public static By ValueAmount = By.xpath("/html/body/div/div/awsui-app-layout/div/main/div[2]/div/span/div/div[2]/div[2]/div[2]/div[1]/div[3]/awsui-form-field/div/div[2]/div/div[1]/span/div/awsui-input/div/input");
    public static By CodeValue = By.xpath("/html/body/div/div/awsui-app-layout/div/main/div[2]/div/span/div/div[2]/div[2]/div[2]/div[1]/div[4]/awsui-form-field/div/div/div/div/span/div/awsui-input/div/input");

    public static void Amount(String amount) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        driver.findElement(By.cssSelector("input[type=checkbox]"));
        driver.findElement(ValueAmount).sendKeys(amount);
        log.info("Amount is Entered: " + amount);
    }

    public static void Code(String code) {
        driver.findElement(CodeValue).sendKeys(code);
        log.info("Code Value is added: " + code);
    }
}
