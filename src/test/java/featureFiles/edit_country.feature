Feature: Edit country feature test
  Scenario: Successful country edit in Basqar
    Given I navigate to Basqar
    When I enter username and password
    Then I am logged in
    Given I navigate to Country
    When I edit a Country
    Then country is successfully edited

  Scenario: Successful country deletion in Basqar
    Given I navigate to Basqar
    When I enter username and password
    Then I am logged in
    Given I navigate to Country
    When I delete a Country
    Then country is successfully deleted