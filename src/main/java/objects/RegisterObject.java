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
    public static final String LOGIN_ERROR = "(//span[contains(text(),'Login was unsuccessful. Please correct the errors ')])[1]";
    public static final String SEARCH_BAR = "(//input[@id='small-searchterms'])[1]";
    public static final String SEARCH_BAR_BUTTON = "(//input[@class='button-1 search-box-button'])[1]";
    public static final String PRODUCT = "(//a[normalize-space()='14.1-inch Laptop'])[1]";
    public static final String ADD_TO_CART_BUTTON = "(//input[@value='Add to cart'])[1]";
    public static final String SHOPPING_CART = "(//a[@class='ico-cart'])[1]";
    public static final String PRODUCT_INPUT = "//input[@class = 'qty-input']";
    public static final String UPDATE_SHOPPING_CART_BUTTON = "(//input[@name='updatecart'])[1]";
    public static final String AGREE_CHECKBOX = "(//input[@id='termsofservice'])[1]";
    public static final String CHECKOUT_BUTTON = "(//button[normalize-space()='Checkout'])[1]";
    public static final String COUNTRY_DROPDOWN = "(//select[@id='BillingNewAddress_CountryId'])[1]";
    public static final String CITY = "(//input[@id='BillingNewAddress_City'])[1]";
    public static final String ADDRESS_ONE = "(//input[@id='BillingNewAddress_Address1'])[1]";
    public static final String ZIP_CODE = "(//input[@id='BillingNewAddress_ZipPostalCode'])[1]";
    public static final String PHONE_NUM = "(//input[@id='BillingNewAddress_PhoneNumber'])[1]";
    public static final String BILLING_CONTINUE_BUTTON = "(//input[@onclick='Billing.save()'])[1]";
    public static final String GUEST_CHECKOUT = "(//input[@value='Checkout as Guest'])[1]";
    public static final String BILLING_FIRST_NAME = "(//input[@id='BillingNewAddress_FirstName'])[1]";
    public static final String BILLING_LAST_NAME = "(//input[@id='BillingNewAddress_LastName'])[1]";
    public static final String BILLING_EMAIL = "(//input[@id='BillingNewAddress_Email'])[1]";
    public static final String SHIPPING_CONTINUE_BUTTON = "(//input[@onclick='Billing.save()'])[1]";
    public static final String SHIPPING_SAVE_CONTINUE_BUTTON = "(//input[@onclick='Shipping.save()'])[1]";
    public static final String SHIPPING_METHOD_CONTINUE_BUTTON = "(//input[@class='button-1 shipping-method-next-step-button'])[1]";
    public static final String PAYMENT_METHOD_CONTINUE_BUTTON = "(//input[@class='button-1 payment-method-next-step-button'])[1]";
    public static final String PAYMENT_INFO_CONTINUE_BUTTON = "(//input[@class='button-1 payment-info-next-step-button'])[1]";
    public static final String CONFIRM_BUTTON = "(//input[@value='Confirm'])[1]";
    public static final String COUPON_INPUT_FIELD = "(//input[@name='discountcouponcode'])[1]";
    public static final String APPLY_COUPON_BUTTON = "(//input[@name='applydiscountcouponcode'])[1]";
    public static final String NEWSLETTER_INPUT = "(//input[@id='newsletter-email'])[1]";
    public static final String SUBSCRIBE_BUTTON = "(//input[@id='newsletter-subscribe-button'])[1]";
    public static final String NEWSLETTER_SUCCESS_TEXT = "(//div[@id='newsletter-result-block'])[1]";
    public static final String COMPUTERS_TAB = "(//a[normalize-space()='Computers'])[1]";
    public static final String COMPUTERS_OPTION = "(//a[@class='hover'][normalize-space()='Desktops'])[1]";
    public static final String LOGOUT_LINK = "(//a[normalize-space()='Log out'])[1]";
    public static final String SORT_BY_DROPDOWN = "(//select[@id='products-orderby'])[1]";
    public static final String EMAIL_FRIEND_BUTTON = "(//input[@value='Email a friend'])[1]";
    public static final String FRIEND_EMAIL_TEXT_FIELD = "(//input[@id='FriendEmail'])[1]";
    public static final String YOUR_EMAIL_TEXT_FIELD = "(//input[@id='YourEmailAddress'])[1]";
    public static final String SEND_EMAIL_BUTTON = "(//input[@name='send-email'])[1]";
    public static final String ADD_TO_COMPARE_LIST_BUTTON = "(//input[@value='Add to compare list'])[1]";
    public static final String REMOVE_BUTTON = "(//input[@title='Remove'])[1]";
}
