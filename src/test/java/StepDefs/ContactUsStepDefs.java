package StepDefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsStepDefs extends AbstractStepDefs{

    WebDriver Driver = homePage.driver;

    @When("user clicks on contact us option")
    public void contactUsClick()
    {
        System.out.println("user clicked on Contact Us from the Menu Bar");
        Driver.findElement(By.id("Primary_Navbar-Contact_Us")).isDisplayed();

    }

    @Then("user is directed to contact details page")
    public void navigateContactPage()
    {
        Driver.navigate().to("https://phptravels.org/contact.php");
        Driver.findElement(By.xpath("//button[@class='btn btn-primary btn-recaptcha']")).isDisplayed();
        System.out.println("user is successfully navigated to contact us page");
    }
}
