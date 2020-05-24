package baseclass;
import cucumber.api.Scenario;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;
    public static Properties config;
    public static Boolean isInitialized = false;
    public static Boolean isBrowserOpened = false;
    public static Logger log;

    /**
     * This method is used to initialize logging and property file
     * @throws IOException
     */

//     System.setProperty("webdriver.chrome.driver", "C:\\Users\\joshees\\Downloads\\amazon\\amazon\\src\\main\\resources\\drivers\\chromedriver.exe");
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();

    public static void initialize() throws IOException {
        if(!isInitialized){
            log = Logger.getLogger(BaseClass.class.getName());
            PropertyConfigurator.configure("log4j.properties");
            config = new Properties();
            FileInputStream ip = new FileInputStream(new File(System.getProperty("user.dir") + "/src/main/resources/config/config.properties"));
            config.load(ip);
            isInitialized = true;
        }
    }

    /**
     * This method reads the property file and opens he browser and navigate to the specified page
     */
    public static void openBrowser(){
        if(!isBrowserOpened){
            if(config.getProperty("Browser").equalsIgnoreCase("IE")){
                DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
                capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
                capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
//                capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
//                capabilities.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL,false);
                capabilities.setCapability(InternetExplorerDriver.UNEXPECTED_ALERT_BEHAVIOR, true);
                capabilities.setCapability(InternetExplorerDriver.NATIVE_EVENTS, true);
//                capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\IEDriverServer.exe");
                driver = new InternetExplorerDriver(capabilities);
            }else if(config.getProperty("Browser").equalsIgnoreCase("Chrome")){
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver");
                driver = new ChromeDriver();
            }else{
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
            }
        }
        driver.manage().window().maximize();
        driver.navigate().to(config.getProperty("URL"));
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        isBrowserOpened = true;
    }


    /**
     * This method takes the browser screen shot and embed to the scenario
     * @param scenario
     */
    public static void takeScreenShot(Scenario scenario){
        byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenShot, "image/png");
    }

    public static void clickOnElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", element);
    }

    public static void quitBrowser(){
        driver.quit();
        isBrowserOpened = false;
        log.info("Quit the Browser");
    }



}
