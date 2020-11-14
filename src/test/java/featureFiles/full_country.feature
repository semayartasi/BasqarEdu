Feature: Create full country feature test
  Scenario: Successful country creating in Basqar
    Given I navigate to Basqar
    When I enter username and password
    Then I am logged in
    Given I navigate to Country
    And "Country-USA" country does not exist
    When I create "Country-USA" Country
    Then country is successfully created

  Scenario: Successful country edit in Basqar
    Given I navigate to Basqar
    When I enter username and password
    Then I am logged in
    And "Country edited-USA" country does not exist
    When I edit "Country-USA" to "Country edited-USA" Country
    Then country is successfully edited

  Scenario: Successful country deletion in Basqar
    Given I navigate to Basqar
    When I enter username and password
    Then I am logged in
    Given I navigate to Country
    When I delete a Country
    Then country is successfully deleted