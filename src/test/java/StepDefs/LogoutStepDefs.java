package StepDefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutStepDefs extends AbstractStepDefs{

    WebDriver Driver = homePage.driver;

    @And("user enters credentials with clicking login")
    public void credentials_entered()
    {
        System.out.println("Automation test bot enters hardcoded email and password");
        Driver.findElement(By.id("inputEmail")).sendKeys("y.ankita.rao@gmail.com");
        Driver.findElement(By.id("inputPassword")).sendKeys("123456");
        homePage.clickLogin();
    }

    @And("user is on client page")
    public void user_on_client_page()
    {
        homePage.clientPage();
    }

    @When("user clicks on logout")
    public void click_logout()
    {
        System.out.println("Logging out from the client page");
        // Driver.findElement(By.id("Secondary_Navbar-Account-Logout")).click();
        WebElement logoutButton = Driver.findElement(By.xpath("//a[@class = 'dropdown-item px-2 py-0']"));
        System.out.println(logoutButton);
        if(logoutButton != null)
        {
            System.out.println("Found logout button");
        }
    }

    @Then("user is navigated back to the home page")
    public void homePage()
    {
        homePage.openPage();
        homePage.loginButton.isDisplayed();
        //Driver.close();
        //Driver.quit();
    }
}
