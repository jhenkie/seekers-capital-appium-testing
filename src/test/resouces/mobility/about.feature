@AboutTest
Feature: validate element at about page

  @RegressionTest
  Scenario: Make sure about page is loaded successfully
    When I press about button
    Then It will direct me to about page and show related information
