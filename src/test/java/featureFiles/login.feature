Feature: Login feature test
  Scenario: Login into Basqar
    Given I navigate to Basqar
    When I enter username and password
    Then I am logged in

