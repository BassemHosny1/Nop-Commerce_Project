@smoke
Feature: users could open followUs links

  Scenario: user opens facebook link
    Given user opens Home Page
    When user clicks on facebook link
    Then The FaceBook Link is opened in new tab With Url "https://www.facebook.com/nopCommerce"

  Scenario: user opens twitter link
    When user opens twitter link
    Then The Twitter Link is opened in new tab With Url "https://twitter.com/nopCommerce"

  Scenario: user opens rss link
    When user opens rss link
    Then The Rss Link is opened in new window With Url "https://demo.nopcommerce.com/new-online-store-is-open"

  Scenario: user opens youtube link
    When user opens youtube link
    Then The Youtube Link is opened in new tab With Url "https://www.youtube.com/user/nopCommerce"