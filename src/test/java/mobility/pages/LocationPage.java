package mobility.pages;

import mobility.constants.AssertionConstants;
import mobility.constants.MessageConstants;
import mobility.globalmethods.Methods;
import org.openqa.selenium.By;

public class LocationPage extends SetupPage {
    Methods method = new Methods();

    public void validateLocationMenu() {
        click(By.name(AssertionConstants.Location.locationButton));
        method.verifyElement(MessageConstants.Location.titleText,driver.findElement(By.name(AssertionConstants.Location.titleElement)));
        method.verifyElement(MessageConstants.Location.bodyText,driver.findElement(By.name(AssertionConstants.Location.bodyElement)));
        method.verifyElement(MessageConstants.Location.contactText,driver.findElement(By.name(AssertionConstants.Location.contactElement)));
    }
}
