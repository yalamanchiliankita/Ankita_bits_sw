package StepDefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartButtonStepDefs extends AbstractStepDefs{

    WebDriver Driver = homePage.driver;

    @When("user clicks on cart button")
    public void cartButtonClicked()
    {
        WebElement cartButton = Driver.findElement(By.xpath("//a[@class = 'btn nav-link cart-btn']"));
        cartButton.click();
    }

    @Then("user is navigated to cart page")
    public void cartPage()
    {
        System.out.println("Successfully navigated to the Cart Page");
        Driver.findElement(By.id("checkout")).isDisplayed();
    }
}
