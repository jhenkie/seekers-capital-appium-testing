@TeamTest
Feature: validate element at team page

  @RegressionTest
  Scenario: Make sure team page is loaded successfully
    When I press team button
    Then It will direct me to team page and show related information
