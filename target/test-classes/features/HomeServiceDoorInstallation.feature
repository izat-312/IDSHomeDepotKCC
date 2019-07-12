Feature: Home service

  @homeservice
  Scenario: Click Home service Under "HOW DOERS GET MORE DONE"
  than open Door installation page

    Given User goes to the main Home Depot page
    When user scroll down click Home service
    And under services click Door Hardware Installation
    Then validate user on Door Hardware Installation page