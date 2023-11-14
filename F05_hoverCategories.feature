@smoke
Feature: Hover

  Scenario: User Could Hover on Categories
    Given user need to select random one of the three main categories
    When user should hover on the selected category
    And user need to select random one of the three sub categories
    Then the subcategory title is equal or contains the one user get it while selecting random subcategory