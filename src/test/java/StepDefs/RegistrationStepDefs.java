package StepDefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class RegistrationStepDefs extends AbstractStepDefs {

    WebDriver Driver = homePage.driver;
    @And("user is on registration page")
    public void registrationPage(){
        System.out.println("The user is at registration page");
        Driver.navigate().to("https://phptravels.org/register.php");
    }

    @And("user enters the details")
    public void enterDetails()
    {
        System.out.println("User enters details");
    }

    @When("user clicks on register")
    public void clickRegistration()
    {
        homePage.clickRegister();
    }

    @Then("the browser is navigated to login page")
    public void loginPage()
    {
        homePage.loginButton.isDisplayed();
    }
}
