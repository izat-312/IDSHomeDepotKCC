Feature: All Departments pop-up image

  Background:
    Given Home Depot web app is up

  @allDepartments
  Scenario Outline: Each department's name in All Deparments menu
  has to correspond the below table

    When user hover overs All Departments menu
    Then user sees "<All Departments item>" in the drop down list

    Examples:
      | All Departments item      |
      | Appliances                |
#      | Bath & Faucets            |
#      | Blinds & Window Treatment |
#      | Building Materials        |
#      | Decor & Furniture         |
#      | Doors & Windows           |
#      | Electrical                |
#      | Flooring & Area Rugs      |
#      | Hardware                  |
#      | Heating & Cooling         |
#      | Kitchen & Kitchenware     |
#      | Lawn & Garden             |
#      | Lighting & Ceiling Fans   |
#      | Outdoor Living            |
#      | Paint                     |
#      | Plumbing                  |
#      | Storage & Organization    |
#      | Tools                     |