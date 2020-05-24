package pageObject;
import org.openqa.selenium.By;

import static baseclass.BaseClass.*;

public class Investment_Step {

    public static By useCaseClick = By.xpath(".//*[@id='awsui-select-2-textbox']");
    public static By usecaseName = By.xpath(".//*[@id='awsui-input-7']");
    public static By dropdownClick = By.xpath(".//div[@class='awsui-select-option-label-content']");
    public static By primaryGoalClick = By.xpath(".//*[@id='awsui-select-3-textbox']");
    public static By primarygoalName = By.xpath(".//*[@id='awsui-input-8']");
    public static By businessActivityClick = By.xpath(".//*[@id='awsui-select-4-textbox']");
    public static By businessActivityName = By.xpath(".//*[@id='awsui-input-10']");
    public static By competitorClick = By.xpath(".//*[@id='awsui-multiselect-1-textbox']");
    public static By competitorName = By.xpath(".//*[@id='awsui-input-11']");
    public static By businessJustificationName = By.xpath(".//*[@id='awsui-textarea-0']");
    public static By Revenue = By.xpath(".//*[@id='awsui-input-17']");
    public static By Month = By.xpath(".//*[@id='awsui-input-22']");
    public static By Next = By.xpath(".//span[contains(text(),'Next')]");



    public static void UseCase(String usecase) {
        driver.findElement(useCaseClick).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(usecaseName).sendKeys(usecase);
        driver.findElement(dropdownClick).click();
        log.info("Usecase is Selected: " + usecase);
    }

    public static void PrimaryGoal(String primarygoal) {
        driver.findElement(primaryGoalClick).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(primarygoalName).sendKeys(primarygoal);
        driver.findElement(dropdownClick).click();
        log.info("Primary Goal is Selected: " + primarygoal);
    }

    public static void BusinessActivity(String businessActivity) {
        driver.findElement(businessActivityClick).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(businessActivityName).sendKeys(businessActivity);
        driver.findElement(dropdownClick).click();
        log.info("Business Activity is Selected: " + businessActivity);
    }

    public static void Competitor(String competitor) {
        driver.findElement(competitorClick).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(competitorName).sendKeys(competitor);
        driver.findElement(dropdownClick).click();
        log.info("Competitor is Selected: " + competitor);
    }

    public static void BusinessJustification(String businessJustification) {
        driver.findElement(businessJustificationName).sendKeys(businessJustification);
        log.info("Business Justification is given: " + businessJustification);
    }

    public static void RecurringRevenue(String recurringRevenue) {
        driver.findElement(Revenue).sendKeys(recurringRevenue);
        log.info("Recurring Revenue is entered: " + recurringRevenue);
    }

    public static void Months(String months) {
        driver.findElement(Month).sendKeys(months);
        log.info("Recurring Revenue is entered: " + months);
    }

    public static void NextButton() {

        driver.findElement(Next).click();
        log.info("Next button is clicked ");
    }



}
