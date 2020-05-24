package pageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static baseclass.BaseClass.*;

public class Review_page {

    public static By Verify = By.xpath("//*[@id=\"nav-bar-page\"]/awsui-app-layout/div/main/div[2]/div/span/div/div[2]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/div[2]");


        public static void VerifyValues(String expectedResult) {
            WebElement AWSAccountID = driver.findElement(Verify);
            String AccountID = AWSAccountID.getText();
            Assert.assertEquals(AccountID, expectedResult);
        }

}
