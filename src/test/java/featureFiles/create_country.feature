Feature: Create country feature test
  Scenario: Successful country creating in Basqar
    Given I navigate to Basqar
    When I enter username and password
    Then I am logged in
    Given I navigate to Country
    When I create a Country
    Then country is successfully created

