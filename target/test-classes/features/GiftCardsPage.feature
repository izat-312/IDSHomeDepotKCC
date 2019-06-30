Feature: Test HomeDepot GiftCard page

  @gifts
  Scenario: Check Gift Cards Page
    Given Open chrome and start application
    When click gift card button
    Then gift card page should be open