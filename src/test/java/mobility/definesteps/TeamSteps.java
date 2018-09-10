package mobility.definesteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mobility.pages.TeamPage;

public class TeamSteps {
    TeamPage test = new TeamPage();

    @When("^I press team button$")
    public void i_press_team_button() {

    }

    @Then("^It will direct me to team page and show related information$")
    public void it_will_direct_me_to_team_page_and_show_related_information() {
        test.validateTeamMenu();
    }
}
