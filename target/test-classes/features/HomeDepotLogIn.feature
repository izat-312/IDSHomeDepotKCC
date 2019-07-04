Feature: Test Home Depot Log In scenario

  @logIn
  Scenario Outline: Test login with invalid credentials
    Given Open chrome and start application
    When i click my account button and sign in button
    Then i enter username <username> and password <password> and click log in
    And user should not be able to log in

Examples:
  |username                 |password          |
  |izatshakiroff@gmail.com  |bishkek312aaaa    |
