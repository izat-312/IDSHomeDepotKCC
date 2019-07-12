Feature: Test Search functionality

  @search
  Scenario Outline: check search functionality result
    Given Open chrome and start application
    When i input <item> to the search text box and click Enter
    Then i should be able to see list of searched items

    Examples:
    |item|
    |Brush|