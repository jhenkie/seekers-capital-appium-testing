package mobility.definesteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mobility.pages.LoginPage;

public class LoginSteps {
    LoginPage test = new LoginPage();

    @When("^I pressed the login button without filling in the username$")
    public void i_pressed_the_login_button_without_filling_in_the_username() {

    }

    @Then("^It should show error username$")
    public void it_should_show_error_username() throws Throwable {
        test.emptyUsername();
    }

    @When("^I pressed the login button without filling in the password$")
    public void i_pressed_the_login_button_without_filling_in_the_password() {

    }

    @Then("^It should show error password$")
    public void it_should_show_error_password() {
        test.emptyPassword();
    }

    @Given("^I fill in username and password with wrong credential$")
    public void i_fill_in_username_and_password_with_wrong_credential() {

    }

    @When("^I press login button$")
    public void i_press_login_button() {

    }

    @Then("^It should show error invalid login$")
    public void it_should_show_error_invalid_login() {
        test.wrongCredential();
    }

    @Given("^I fill in username and password with correct credential$")
    public void i_fill_in_username_and_password_with_correct_credential() {

    }

    @When("^I press button login$")
    public void i_press_button_login() {

    }

    @Then("^It should successfully login$")
    public void it_should_successfully_login() {
        test.correctCredential();
    }
}
