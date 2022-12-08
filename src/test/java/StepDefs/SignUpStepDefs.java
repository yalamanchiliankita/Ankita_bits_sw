package StepDefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpStepDefs extends AbstractStepDefs{

    WebDriver Driver = homePage.driver;

    @Given("user is on Main page")
    public void onMainPage()
    {
        Driver.navigate().to("https://phptravels.com/");
    }

    @When("user clicks on sign up button")
    public void signUp()
    {
        //WebElement signUpButton = Driver.findElement(By.linkText("Sign Up"));
        //WebElement signUpButton = Driver.findElement(By.xpath("//input[@class = 'jfHeader-menuListLink jfHeader-dynamicLink jfHeader-signup-action']"));
        Driver.findElement(By.xpath("//a[@href='https://phptravels.org/register.php']")).isDisplayed();
    }

    @Then("user is directed to registeration page")
    public void navigateToRegistration()
    {
        System.out.println("The user is navigated to registration page");
        Driver.navigate().to("https://phptravels.org/register.php");
        WebElement registerButton = driver.findElement(By.xpath("//input[@class='btn btn-large btn-primary btn-recaptcha']"));
        registerButton.isDisplayed();
    }
}
