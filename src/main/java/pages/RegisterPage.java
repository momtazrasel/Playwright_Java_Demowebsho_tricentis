package pages;

import com.aventstack.extentreports.ExtentTest;
import com.microsoft.playwright.Page;
import objects.RegisterObject;
import utilities.BaseTest;

public class RegisterPage extends BaseTest {

    private final Page page;
    private final ExtentTest test;

    public RegisterPage(Page page, ExtentTest test) {
        this.page = page;
        this.test = test;
    }
    public void clickRegisterLink() {
        page.click(RegisterObject.REGISTER_LINK);
    }
    public void fillAllTheRegisterData() {
        page.click(RegisterObject.GENDER);
        page.fill(RegisterObject.FIRST_NAME, "Momtaz");
        page.fill(RegisterObject.LAST_NAME, "Rasel");
        page.fill(RegisterObject.EMAIL, "rasel.qups@gmail.com");
        page.fill(RegisterObject.PASSWORD, "123456");
        page.fill(RegisterObject.CONFIRM_PASSWORD, "123456");
        page.click(RegisterObject.REGISTER_BUTTON);
    }


}
