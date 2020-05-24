package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

import static baseclass.BaseClass.*;

public class Product_Services {

    public static By dropdownClick = By.xpath(".//div[@class='awsui-select-option-label-content']");
    public static By MLClick = By.xpath(".//*[@id='awsui-multiselect-105-textbox']");
    public static By MLName = By.xpath(".//*[@id='awsui-input-150']");
    public static By Check = By.xpath(".//*[@id='awsui-checkbox-82']");
    public static By typeBox = By.xpath(".//*[@id='awsui-input-113']");

    public static void MachineLearning(String machineLearning) {
        driver.findElement(MLClick).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(MLName).sendKeys(machineLearning);
        driver.findElement(dropdownClick).click();
        log.info("Business Activity is Selected: " + machineLearning);
    }

        public static void CheckCompute(){
        WebElement checkBox = driver.findElement(By.cssSelector("input[type=checkbox]"));
        WebElement next = driver.findElement(By.xpath("//*[@id=\"nav-bar-page\"]/awsui-app-layout/div/main/div[2]/div/span/div/div[2]/div[2]/div[2]/div[2]/awsui-button[5]/button"));
        Actions action = new Actions(driver);
        action.moveToElement(checkBox).click(checkBox).click(next).build().perform();
//            ((JavascriptExecutor) driver).executeAsyncScript("arguments[0].click():", driver.findElement(By.xpath("//*[@id='awsui-checkbox-179']")));
//            WebDriverWait wait = new WebDriverWait(driver,30);
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='awsui-checkbox-179']")));
//            System.out.println("Element is displayed============= "+driver.findElement(By.xpath("//*[@id='awsui-checkbox-179']")).isDisplayed());
//            driver.findElement(By.xpath("//*[@id='awsui-checkbox-179']")).click();
//        driver.findElement(Check).click();
//            JavascriptExecutor js=(JavascriptExecutor)driver;
//            js.executeScript("arguments[0].click();", Check);
            log.info("Compute is checked: " );
        }

    public static void Typebox(String typebox) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("awsui-checkbox-179")));
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        jse.executeScript("window.scrollBy(0,-250)");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(typeBox)).perform();
        driver.findElement(typeBox).sendKeys(typebox);
        log.info("Customer name is Entered: " + typebox);
    }

    }


