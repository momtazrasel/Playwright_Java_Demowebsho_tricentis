package utilities;

import io.cucumber.java.*;
import utilities.BaseTest;

public class Hooks {

    @Before
    public void setup() {
        BaseTest.initializePlaywrightAndReports();
        BaseTest.login();
    }

    @After
    public void teardown() {
        BaseTest.tearDown();
    }

    @BeforeStep
    public void logStepBefore(Scenario scenario) {
        // Log the step name
        String stepName = scenario.getName(); // Gets the scenario name
        BaseTest.test.info("Executing Step: " + stepName);
    }

    @AfterStep
    public void logStepAfter(Scenario scenario) {
        // Attach a screenshot after each step
        String stepName = scenario.getName(); // Gets the scenario name
        String screenshotPath = BaseTest.takeScreenshot(BaseTest.page, stepName.replace(" ", "_").toLowerCase());
        try {
            BaseTest.test.addScreenCaptureFromPath(screenshotPath, "Screenshot for Step: " + stepName);
        } catch (Exception e) {
            e.printStackTrace();
            BaseTest.test.fail("Failed to attach screenshot for step: " + stepName);
        }
    }
}
