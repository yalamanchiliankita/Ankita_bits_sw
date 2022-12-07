package StepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(id = "inputEmail")
    public WebElement inputEmail;

    @FindBy(id = "inputPassword")
    public WebElement inputPassword;

    @FindBy(id = "login")
    public WebElement loginButton;

    public WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void browserIsOpen()
    {
        System.out.println("Browser Opened Successfully");
    }

    public void openPage()
    {
        driver.navigate().to("https://phptravels.org/login");
        PageFactory.initElements(driver, this);
    }

    public void clickLogin()
    {
        loginButton.click();
    }

    public void clientPage()
    {
        driver.navigate().to("https://phptravels.org/clientarea.php");
    }

}
