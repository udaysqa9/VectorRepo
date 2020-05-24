package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static baseclass.BaseClass.*;
import static org.openqa.selenium.By.id;

public class Login_Page {

    public static By helloButton = By.xpath("//div/div/a[@id='nav-link-accountList']");
    public static By Username = By.xpath("//*[@class='a-input-text a-span12 auth-autofocus auth-required-field']");
    public static By Password = By.xpath("//*[@class='a-input-text a-span12 auth-autofocus auth-required-field']");
    public static By ContinueButton = By.xpath("//*[@class='a-button-input']");
    public static By LoginButton = By.xpath("//*[@id='signInSubmit']");
    public static By CreateAccountButton = By.xpath("//span/a[@class='a-button-text']");
    public static By Promotion = By.xpath(".//*[@id='awsui-input-1']");
    public static By accountid = By.xpath(".//*[@id='awsui-input-2']");
    public static By CustName = By.xpath(".//*[@id='awsui-input-3']");
    public static By IndustryClick = By.xpath(".//*[@id='awsui-select-0-textbox']");
    public static By IndustryName = By.xpath(".//*[@id='awsui-input-4']");
    public static By dropdownClick = By.xpath(".//div[@class='awsui-select-option-label-content']");
    public static By locationClick = By.xpath(".//*[@id='awsui-select-1-textbox']");
    public static By locationName = By.xpath(".//*[@id='awsui-input-5']");
    public static By VerifyAccount = By.xpath("//*[@id='nav-bar-page']/awsui-app-layout/div/main/div[2]/div/span/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/h2");


    public static void clickOnHelloButton() {
        clickOnElement(driver.findElement(helloButton));
        log.info("Clicked on Hello button");
    }

    public static void EnterTheUsername(String username) {
        driver.findElement(Username).sendKeys(username);
        log.info("Username is Entered: " + username);
    }

    public static void EnterThePassword(String password) {
        driver.findElement(Password).sendKeys(password);
        log.info("Password is Entered");
    }

    public static void clickOnContinue() {
        driver.findElement(ContinueButton).click();
        log.info("Clicked on Continue button");
    }

    public static void clickOnLogin() {
        driver.findElement(LoginButton).click();
        log.info("Clicked on Login button");
    }

    public static void CheckSignIn() {
        if (driver.getPageSource().contains("Hello. Sign in")) {
            System.out.println("SignIn is present");
        } else {
            System.out.println("SignIn is absent");
        }
    }

        public static void VerifySignInPage () {
            String title = driver.getTitle();
            System.out.println(title);
            Assert.assertEquals("Amazon Sign", title);
            log.info("SignIn Page is Visible");
        }

    public static void VerifyRequestPage () {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Investments", title);
        log.info("Request Page is Visible");
    }


    public static void AssignPromotion(String promotionName) {
        driver.findElement(Promotion).sendKeys(promotionName);
        log.info("Promotion name is Entered: " + promotionName);
    }

    public static void AccountID(String accountID) {
        driver.findElement(accountid).sendKeys(accountID);
        log.info("Account ID is Entered: " + accountID);
    }

    public static void Name(String name) {
        driver.findElement(CustName).sendKeys(name);
        log.info("Customer name is Entered: " + name);
    }

    public static void Industry(String industry) {
        driver.findElement(IndustryClick).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(IndustryName).sendKeys(industry);
        driver.findElement(dropdownClick).click();
        log.info("Industry name is Selected: " + industry);
    }

    public static void Location(String location) {
        driver.findElement(locationClick).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(locationName).sendKeys(location);
        driver.findElement(dropdownClick).click();
        log.info("Geo Location is Selected: " + location);
    }




        public static boolean VerifyCreateAccount() {
            try {
                if (driver.findElement(CreateAccountButton).isDisplayed()) {
                    System.out.println("Element is Visible");
                    return true;
                } else {
                    System.out.println("Element is InVisible");
                    return false;
                }

            } catch (NoSuchElementException e) {
                {
                    return false;
                }
            }
        }

    public static void VerifyAccountName(String expectedResult) {
        WebElement AWSAccountName = driver.findElement(VerifyAccount);
        String AccountName = AWSAccountName.getText();
        Assert.assertEquals(AccountName, expectedResult);
    }



}

