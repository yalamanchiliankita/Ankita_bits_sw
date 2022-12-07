package StepDefs;

import io.cucumber.java.en.*;

public class CommonStepDefs extends AbstractStepDefs {

    @Given("browser is open")
    public void browser_is_open() {
        homePage.browserIsOpen();
    }

    @And("user is on login page")
    public void user_is_on_login_page()
    {
        homePage.openPage();
    }

    @And("user clicks on login")
    public void click_login()
    {
        homePage.clickLogin();
    }


}
