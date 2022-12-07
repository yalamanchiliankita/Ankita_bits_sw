package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class CommonStepDefs extends AbstractStepDefs {

    @Given("browser is open")
    public void browser_is_open() {
        homePage.browserIsOpen();
    }

    @And("user is on login page")
    public void user_is_on_login_page()
    {
        homePage.openPage();
    }

    @And("user clicks on login")
    public void click_login()
    {
        homePage.clickLogin();
    }


}
