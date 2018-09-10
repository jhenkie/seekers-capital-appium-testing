package mobility.definesteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mobility.pages.LocationPage;

public class LocationSteps {
    LocationPage test = new LocationPage();

    @When("^I press location button$")
    public void i_press_location_button() throws Throwable {

    }

    @Then("^It will direct me to location page and show related information$")
    public void it_will_direct_me_to_location_page_and_show_related_information() {
        test.validateLocationMenu();
    }
}
