package StepDefs;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AbstractStepDefs {

    private static final int WAIT_TIME = 10;

    static WebDriver driver;

    protected static HomePage homePage;

    static {

        /*
        System.out.println("Inside Step - browser is open");

        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is:" + projectPath);

        System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");

        Driver = new ChromeDriver();

        Driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        Driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
         */

//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
//        homePage = new HomePage(driver);
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
//        options.setHeadless(true);
//        options.addArguments("--no-sandbox");
        driver = new ChromeDriver(options);
      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WAIT_TIME));

        //driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
        homePage = new HomePage(driver);
    }

}
