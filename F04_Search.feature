@smoke
Feature: Search Feature

  Scenario Outline: user could search using product name
    Given user search using product name <product name>
    When user clicks on search button
    Then url search shows relevant results contains <product name>
    Examples:
      | product name |
      | book         |
      | laptop       |
      | nike         |

  Scenario Outline 2: user could search for product using sku
    Given user search a product with SKU <SKU>
    When user clicks on search button
    And user click on the product in search result
    Then SKU in product page contains <SKU> in search box

    Examples:
      | SKU       |
      | SCI_FAITH |
      | APPLE_CAM |
      | SF_PRO_11 |


