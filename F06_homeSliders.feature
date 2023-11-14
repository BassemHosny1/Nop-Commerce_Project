@smoke
Feature: homeSliders Feature

  Scenario 1: first slider is clickable on home page
    Given Click on the first slider in the home page
    Then The url should be changed to new url containing the first slider

  Scenario 2: second slider is clickable on home page
    Given Click on the second slider in the home page
    Then The url should be changed to new url containing the second slider