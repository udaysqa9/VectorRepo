/**
 * This is the runner class used to run scripts by providing feature and step defination file path
 * and to generate Cucumber html and extent report
 * @Author: Harisha M
 * @version 1.0
 * @Date
 */

package test_runner;

import baseclass.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.nio.file.Files;
import java.sql.Date;
import java.sql.Timestamp;
import org.joda.time.DateTime;


import java.io.File;
import java.text.SimpleDateFormat;

import static baseclass.BaseClass.*;

@RunWith(Cucumber.class)


@CucumberOptions( plugin = {"html:target/report/cucumber-html-report",
        "json:target/report/cucumber.json", "pretty:target/report/cucumber-pretty.txt",
        "usage:target/report/cucumber-usage.json", "junit:target/report/cucumber-results.xml"},
//        "com.cucumber.listener.ExtentCucumberFormatter:target/report/Extent-report.html"},
        features = {"src/test/resources/login.feature"},
        glue = {"step_definition"},
//        format= {"pretty","html:test-output"},
        dryRun = false,
        tags = {"@Smokes"}
        )

public class RunnerTest {
      /*  @BeforeClass
        public void createDirectory(){
                Timestamp timestamp= Timestamp.valueOf(str);
                String time=timestamp.toString();
                File file = new File("html:target/report/cucumber-html-report/"+"time");
        }*/
        @AfterClass

        public static void teardown(){
                copyReports();
                if(driver != null){
                        driver.quit();
                }
                isBrowserOpened = false;
        }
        public static void copyReports(){

           // String fileName = new SimpleDateFormat("yyyyMMddHHmm'.txt'").format(new Date());
            String time = DateTime.now().toString("yyyyMMddHHmmss");
            String path= "/Users/udaykumarh/Downloads/amazon/amazon/ReportsHistory/report-tag_Smokes.html"+time;
                File cucReportsOg = new File("/Users/udaykumarh/Downloads/amazon/amazon/target/cucumber-html-reports/report-tag_Smokes.html");
                File backupReports = new File(path);
                try{
                        Files.copy(cucReportsOg.toPath(),backupReports.toPath());
                }
                catch (Exception e){
                        System.out.println(e);
                }

        }
}

