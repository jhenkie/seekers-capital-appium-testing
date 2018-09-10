package mobility.pages;

import mobility.constants.AssertionConstants;
import mobility.constants.MessageConstants;
import mobility.globalmethods.Methods;
import org.openqa.selenium.By;

public class AboutPage extends SetupPage {
    Methods method = new Methods();

    public void validateAboutMenu() {
        click(By.name(AssertionConstants.About.aboutButton));
        method.verifyElement(MessageConstants.About.headerText,driver.findElement(By.name(AssertionConstants.About.headerElement)));
        method.verifyElement(MessageConstants.About.bodyText,driver.findElement(By.name(AssertionConstants.About.bodyElement)));
    }
}
