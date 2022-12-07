package StepDefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InvalidLoginStepDefs extends AbstractStepDefs {

    WebDriver Driver = homePage.driver;

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        // hardcoded email and password to check
        homePage.inputEmail.sendKeys("Ankita@gmail.com");
        homePage.inputPassword.sendKeys("12345");
    }

    @Then("user is navigated to the same page")
    public void user_is_navigated_to_the_same_page() {
        // Write code here that turns the phrase above into concrete actions
        homePage.loginButton.isDisplayed();
        //Driver.close();
       // Driver.quit();
    }

}