package mobility.pages;

import mobility.constants.AssertionConstants;
import mobility.constants.MessageConstants;
import mobility.globalmethods.Methods;
import org.openqa.selenium.By;

public class LoginPage extends SetupPage {
    Methods method = new Methods();
    public void emptyUsername() {
        click(By.name(AssertionConstants.Login.loginButton));
        method.verifyElement(MessageConstants.Login.errorUsername,driver.findElement(By.name(AssertionConstants.Login.errorMessageElement)));
    }

    public void emptyPassword() {
        fillInText(MessageConstants.Login.username,By.name(AssertionConstants.Login.usernameElement));
        click(By.name(AssertionConstants.Login.loginButton));
        method.verifyElement(MessageConstants.Login.errorPassword,driver.findElement(By.name(AssertionConstants.Login.errorMessageElement)));
    }

    public void wrongCredential() {
        fillInText(MessageConstants.Login.username,By.name(AssertionConstants.Login.usernameElement));
        fillInText(MessageConstants.Login.dummyPassword,By.name(AssertionConstants.Login.passwordElement));
        click(By.name(AssertionConstants.Login.loginButton));
        method.verifyElement(MessageConstants.Login.errorInvalid,driver.findElement(By.name(AssertionConstants.Login.errorMessageElement)));
    }

    public void correctCredential() {
        fillInText(MessageConstants.Login.username,By.name(AssertionConstants.Login.usernameElement));
        fillInText(MessageConstants.Login.password,By.name(AssertionConstants.Login.passwordElement));
        click(By.name(AssertionConstants.Login.loginButton));
        method.verifyElement(MessageConstants.Profile.Message,driver.findElement(By.name(AssertionConstants.Profile.messageElement)));
    }
}
