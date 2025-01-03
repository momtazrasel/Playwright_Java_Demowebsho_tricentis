package pages;

import com.aventstack.extentreports.ExtentTest;
import com.microsoft.playwright.Page;
import objects.LoginObject;
import utilities.BaseTest;

public class RegisterPage extends BaseTest {

    private final Page page;
    private final ExtentTest test;

    public RegisterPage(Page page, ExtentTest test) {
        this.page = page;
        this.test = test;
    }
    public void clickGegisterLink() {
        page.click(LoginObject.LOGIN_LINK);
    }


}
