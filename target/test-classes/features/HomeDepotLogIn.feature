Feature: Test Home Depot smoke scenario

  Scenario: Test login with invalid credentials
    Given Open chrome and start application
    When i click my account button than sign in button
    Then i enter invalid username password and click log in
    And user should not be able to log in