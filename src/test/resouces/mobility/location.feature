@LocationTest
  Feature: validate element at location page

  @RegressionTest
  Scenario: Make sure location page is loaded successfully
    When I press location button
    Then It will direct me to location page and show related information
