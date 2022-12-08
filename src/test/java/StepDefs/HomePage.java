package StepDefs;

import org.openqa.selenium.By;
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

    // registerButton = driver.findElement(By.name("Register"));
   // @FindBy(id = "registration")
   // @FindAll(@FindBy(className = "btn btn-large btn-primary btn-recaptcha"))


    //@FindBy(className = "btn btn-large btn-primary btn-recaptcha")
    //@FindBy(css = "input.btn.btn-large.btn-primary.btn-recaptcha")
    //@FindBy(css = "btn btn-large btn-primary btn-recaptcha")

    //public WebElement registerButton = driver.findElement(By.xpath("//input[@class='btn btn-large btn-primary btn-recaptcha']"));


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
        System.out.println("Opening Login Page");
        driver.navigate().to("https://phptravels.org/login");
        PageFactory.initElements(driver, this);
    }

    public void clickLogin()
    {
        loginButton.click();
        System.out.println("Login Button Clicked");
    }

    public void clientPage()
    {
        System.out.println("Driver Navigated to the Client Page");
        driver.navigate().to("https://phptravels.org/clientarea.php");
    }

    public void clickRegister()
    {
        WebElement registerButton = driver.findElement(By.xpath("//input[@class='btn btn-large btn-primary btn-recaptcha']"));

        System.out.println(registerButton);
        registerButton.click();
        this.openPage();
    }

}
