package mobility.pages;

import com.cucumber.listener.Reporter;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import static java.lang.Thread.sleep;

public class SetupPage extends AbstractTestNGCucumberTests {
    public static IOSDriver driver;
    private static AppiumDriverLocalService service;

    //Setup device and make connection
    public IOSDriver initialisation() throws Exception {
        if(driver == null) {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability("platformName", "iOS");
            capabilities.setCapability("platformVersion", "11.4");
            capabilities.setCapability("deviceName", "iPhone 8");
            capabilities.setCapability("automationName", "XCUITest");
            capabilities.setCapability("app", "/Users/thenkie/Library/Developer/Xcode/DerivedData/SeekerCapital-bjkbvvmjrobwvdbbniluejgodlpl/Build/Products/Debug-iphonesimulator/SeekerCapital.app");
            capabilities.setCapability("udid","41EA291C-3047-41D9-9386-287410D5E9BA");
            capabilities.setCapability("noReset", true);
            capabilities.setCapability("connectHardwareKeyboard",true);
            capabilities.setCapability("usePrebuiltWDA",true);
            capabilities.setCapability("newCommandTimeout",20);

            driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        }
        return driver;
    }

    //Method to Fill in data by any selector
    public void fillInText(String text, By selector) {
        click(selector);
        driver.findElement(selector).sendKeys(text);
    }

    //Method to click element by any selector
    public void click(By selector) {
        int time=0;
        boolean found=false;
        while(time<5) {
            List<WebElement> ele=driver.findElements(selector);
            if(ele.size()>0) {
                found = true;
                break;
            }
            else {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                time = time + 1;
            }
        }

        if(found) {
            driver.findElement(selector).click();
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //Method to take screenshot failed case
    public void takeScreenshot (String filename) throws IOException {
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + filename + ".png");
        FileUtils.copyFile(source, destinationPath);

        Reporter.addScreenCaptureFromPath(destinationPath.toString());
    }

}
