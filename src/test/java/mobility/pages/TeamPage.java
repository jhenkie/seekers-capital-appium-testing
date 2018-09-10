package mobility.pages;

import mobility.constants.AssertionConstants;
import mobility.constants.MessageConstants;
import mobility.globalmethods.Methods;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class TeamPage extends SetupPage {
    Methods method = new Methods();

    public void validateTeamMenu() {
        click(By.name(AssertionConstants.Team.teamButton));
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        method.verifyElement(MessageConstants.Team.idText,driver.findElement(By.name(AssertionConstants.Team.idElement)));
        method.verifyElement(MessageConstants.Team.userNameText,driver.findElement(By.name(AssertionConstants.Team.userNameElement)));
        method.verifyElement(MessageConstants.Team.userLastNameText,driver.findElement(By.name(AssertionConstants.Team.userLastNameElement)));
    }
}
