package mobility.definesteps;

import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.ios.IOSDriver;
import mobility.pages.SetupPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Hooks extends SetupPage {
    //
//    SetupPage testContext;
//
//    public Hooks(SetupPage context) {
//        testContext = context;
//    }
    @Before
    public void beforeScenario(Scenario scenario) throws Exception {
        Reporter.assignAuthor("Johannes Henkie");
        //initialisation();
        if(driver != null) {
            driver.launchApp();
        }else {
            initialisation();
        }
    }

    @After(order = 1)
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            try {
                takeScreenshot(screenshotName);
            } catch (IOException e) {
                System.out.println(e.getStackTrace());

            }
        }
    }

    @After(order = 0)
    public void AfterSteps() {
        driver.closeApp();
    }
}
