package StepDefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutStepDefs extends AbstractStepDefs{

    WebDriver Driver = homePage.driver;

    @And("user is on client page")
    public void user_on_client_page()
    {
        homePage.clientPage();
    }

    @When("user clicks on logout")
    public void click_logout()
    {
        System.out.println("Logging out from the client page");
        Driver.findElement(By.id("Secondary_Sidebar-Client_Shortcuts-Logout")).click();
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
