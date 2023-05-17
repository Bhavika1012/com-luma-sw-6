@sanity @regression
Feature: Login Test
  As user I want to login into saucedemo website

  Scenario: User should login successfully

    Given I am on homepage
    When I enter username "standard_user"
    And I enter password "secret_sauce"
    And I click on login button
    Then I should login successfully




