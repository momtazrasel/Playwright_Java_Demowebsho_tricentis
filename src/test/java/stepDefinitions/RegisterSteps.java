package stepDefinitions;

import com.aventstack.extentreports.ExtentTest;
import com.microsoft.playwright.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objects.RegisterObject;
import pages.RegisterPage;
import utilities.BaseTest;
import utilities.ReusableMethod;


public class RegisterSteps extends BaseTest {
    RegisterPage registerPage;
//    private final Page page;
//    private final ExtentTest test;
//
//    public RegisterSteps(Page page, ExtentTest test) {
//        this.page = page;
//        this.test = test;
//    }

    @Given("the user navigates to the home page and click on the register link")
    public void theUserNavigatesToTheHomePageAndClickOnTheRegisterLink() {
        BaseTest.test.info("Step: Navigate to the register link");
        registerPage = new RegisterPage(page, test);
        registerPage.clickRegisterLink();
        BaseTest.logStepWithScreenshot(BaseTest.page, BaseTest.test, "Click Register Link");

    }

    @When("the user navigates to the register link")
    public void theUserNavigatesToTheRegisterLink() throws InterruptedException {
        registerPage = new RegisterPage(page, test);
        registerPage.clickRegisterLink();
        Thread.sleep(3000);
    }

    @And("fill up all the register values")
    public void fillUpAllTheRegisterValues() throws InterruptedException {
        registerPage.fillAllTheRegisterData();
        Thread.sleep(3000);
    }

    @And("click on the register button")
    public void clickOnTheRegisterButton() {
        ReusableMethod.clickElement(page, test, RegisterObject.REGISTER_BUTTON,"Click Login Button" );


    }

    @Then("verify that the registration is completed")
    public void verifyThatTheRegistrationIsCompleted() {
        String expectedText = "The specified email already exists";
        ReusableMethod.verifyTextIsDisplayed(page, test, RegisterObject.EXIST_EMAIL, expectedText, "Email Error Message");

    }
}
