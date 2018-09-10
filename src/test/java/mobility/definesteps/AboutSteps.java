package mobility.definesteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mobility.pages.AboutPage;

public class AboutSteps {
    AboutPage test = new AboutPage();

    @When("^I press about button$")
    public void i_press_about_button() {

    }

    @Then("^It will direct me to about page and show related information$")
    public void it_will_direct_me_to_about_page_and_show_related_information() {
        test.validateAboutMenu();
    }
}
