@smoke
Feature: WishList

  Scenario: User Add A Product To WishList
    Given User Open Browser And Go To HomePage
    When User Clicks On HTC One M8 Android Product
    And User Clicks On Wishlist Button
    Then Success Message With Green Background Color Is Displayed

  Scenario: User Make Sure Product Added To WishList
    When User Waits UnTill Success Message becomes invisible
    Then User should get Qty value and verify it is bigger than zero
