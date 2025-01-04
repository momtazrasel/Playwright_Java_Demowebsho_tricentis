package objects;

public class LoginObject {
    public static final String LOGIN_LINK = "(//a[normalize-space()='Log in'])[1]";
    public static final String USERNAME_INPUT = "(//input[@id='Email'])[1]";
    public static final String PASSWORD_INPUT = "(//input[@id='Password'])[1]";
    public static final String LOGIN_BUTTON = "(//input[@value='Log in'])[1]";
    public static final String LOGIN_ERROR = "(//div[@class='validation-summary-errors'])[1]";
}
