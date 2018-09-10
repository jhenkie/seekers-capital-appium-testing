package mobility.pages;

import mobility.constants.AssertionConstants;
import mobility.constants.MessageConstants;
import mobility.globalmethods.Methods;
import org.openqa.selenium.By;

public class LoginBottomMenu extends SetupPage {
    Methods method = new Methods();
    public void validateMenu() {
        method.verifyElement(MessageConstants.Login.BottomMessage.about,driver.findElement(By.name(AssertionConstants.Login.BottomElement.about)));
        method.verifyElement(MessageConstants.Login.BottomMessage.location,driver.findElement(By.name(AssertionConstants.Login.BottomElement.location)));
        method.verifyElement(MessageConstants.Login.BottomMessage.team,driver.findElement(By.name(AssertionConstants.Login.BottomElement.team)));
    }

}
