package objects;

public class RegisterObject {
    public static final String REGISTER_LINK = "(//a[normalize-space()='Register'])[1]";
    public static final String REGISTER_FORM = "(//div[@class='center-2'])[1]";
    public static final String GENDER = "(//label[normalize-space()='Male'])[1]";
    public static final String FIRST_NAME = "(//input[@id='FirstName'])[1]";
    public static final String LAST_NAME = "(//input[@id='LastName'])[1]";
    public static final String EMAIL = "(//input[@id='Email'])[1]";
    public static final String PASSWORD = "(//input[@id='Password'])[1]";
    public static final String CONFIRM_PASSWORD = "(//input[@id='ConfirmPassword'])[1]";
    public static final String REGISTER_BUTTON = "(//input[@id='register-button'])[1]";
    public static final String REGISTER_COMPLETE_TEXT = "(//div[@class='result'])[1]";
    public static final String EXIST_EMAIL = "(//li[normalize-space()='The specified email already exists'])[1]";
}
