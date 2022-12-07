package StepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidLoginStepDefs extends AbstractStepDefs {

    WebDriver Driver = homePage.driver;

    @When("^user enters (.*) and (.*)$")
    public void user_enters_email_and_password(String email, String password)
    {
        Driver.findElement(By.id("inputEmail")).sendKeys(email);
        Driver.findElement(By.id("inputPassword")).sendKeys(password);
    }

    @Then("user is navigated to the client page")
    public void user_navigated_to_client_page(){
        homePage.clientPage();
        //Driver.close();
       // Driver.quit();
    }
}









