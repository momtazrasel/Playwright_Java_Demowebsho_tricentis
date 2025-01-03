package utilities;

import com.aventstack.extentreports.ExtentTest;
import com.microsoft.playwright.Page;

public class ReusableMethod {

    public static void verifyTextIsDisplayed(Page page, ExtentTest test, String locator, String expectedText, String elementName) {
        page.waitForLoadState(); // Ensure the page is fully loaded

        // Get the actual text from the locator
        String actualText = page.textContent(locator).trim();

        if (actualText.equals(expectedText)) {
            test.pass(elementName + " is displayed with the expected text: \"" + expectedText + "\"");
//            BaseTest.logStepWithScreenshot(page, test, elementName + " text verification passed");
        } else {
            test.fail(elementName + " text mismatch. Expected: \"" + expectedText + "\", Found: \"" + actualText + "\"");
//            BaseTest.logStepWithScreenshot(page, test, elementName + " text verification failed");
            throw new AssertionError(elementName + " text mismatch. Expected: \"" + expectedText + "\", Found: \"" + actualText + "\"");
        }
    }

    public static void clickElement(Page page, ExtentTest test, String elementLocator, String stepDescription) {
        try {
            // Wait for the element to be visible
            page.waitForSelector(elementLocator);

            // Click the element
            page.click(elementLocator);

            // Log success in Extent Report
            test.pass(stepDescription + " - Element clicked successfully.");
//            BaseTest.logStepWithScreenshot(page, test, stepDescription + " - Clicked successfully");

        } catch (Exception e) {
            // Log failure in Extent Report with screenshot
            test.fail(stepDescription + " - Failed to click the element.");
//            BaseTest.logStepWithScreenshot(page, test, stepDescription + " - Click action failed");
            throw new RuntimeException(stepDescription + " - Click action failed.", e);
        }
    }
}
