@LoginTest
Feature: Validate login feature

  @RegressionTest
  Scenario: Failed to login error empty username
    When I pressed the login button without filling in the username
    Then It should show error username

  @RegressionTest
  Scenario: Failed to login error empty password
    When I pressed the login button without filling in the password
    Then It should show error password

  @RegressionTest
  Scenario: Failed to login error wrong Credential
    Given I fill in username and password with wrong credential
    When I press login button
    Then It should show error invalid login

  @SmokeTest @RegressionTest
  Scenario: Success to login
    Given I fill in username and password with correct credential
    When I press button login
    Then It should successfully login