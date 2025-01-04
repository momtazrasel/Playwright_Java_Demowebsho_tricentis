package pages;

import com.microsoft.playwright.Page;
import com.aventstack.extentreports.ExtentTest;
import objects.LoginObject;
import utilities.BaseTest;

public class LoginPage {
    private final Page page;
    private final ExtentTest test;

    public LoginPage(Page page, ExtentTest test) {
        this.page = page;
        this.test = test;
    }

    public void loginToApplication() {
        page.navigate("https://demowebshop.tricentis.com/");
    }

    public void clickLoginLink() {
        page.click(LoginObject.LOGIN_LINK);
    }

    public void loginWithValidCredentials() {
//        BaseTest.takeScreenshot(page, "login_success");
        page.fill(LoginObject.USERNAME_INPUT, "rasel.qups@gmail.com");
        page.fill(LoginObject.PASSWORD_INPUT, "123456");
//        page.click(LoginObject.LOGIN_BUTTON);
        test.pass("Login performed successfully.");
//        BaseTest.takeScreenshot(page, "login_success");
    }
    public void loginWithInValidCredentials() {
//        BaseTest.takeScreenshot(page, "login_success");
        page.fill(LoginObject.USERNAME_INPUT, "rasel.qups@gmail.com");
        page.fill(LoginObject.PASSWORD_INPUT, "12345");
//        page.click(LoginObject.LOGIN_BUTTON);
        test.pass("Login performed successfully.");
//        BaseTest.takeScreenshot(page, "login_success");
    }

    public void clickOnLoginButton() {
        page.click(LoginObject.LOGIN_BUTTON);
        test.pass("Login performed successfully.");
//        BaseTest.takeScreenshot(page, "login_success");
    }
}
