package mobility.definesteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mobility.pages.LoginBottomMenu;

public class LoginBottomSteps {
    LoginBottomMenu test = new LoginBottomMenu();

    @When("^I see menu at bottom page$")
    public void i_see_menu_at_bottom_page() {

    }

    @Then("^It will show About, Location and Team menu$")
    public void it_will_show_About_Location_and_Team_menu() {
        test.validateMenu();
    }
}
