package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.RegisterPage;
import utilities.BaseTest;


public class RegisterSteps extends BaseTest {
    RegisterPage registerPage;

    @Given("the user navigates to the home page and click on the register link")
    public void theUserNavigatesToTheHomePageAndClickOnTheRegisterLink() {
        registerPage = new RegisterPage(page, test);
        registerPage.clickRegisterLink();

    }

    @When("the user navigates to the register link")
    public void theUserNavigatesToTheRegisterLink() throws InterruptedException {
        registerPage = new RegisterPage(page, test);
        registerPage.clickRegisterLink();
        Thread.sleep(3000);
    }

    @And("fill up all the register values")
    public void fillUpAllTheRegisterValues() {

    }

    @And("click on the register button")
    public void clickOnTheRegisterButton() {

    }
}
