$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/features/AllDepartments.feature");
formatter.feature({
  "name": "All Departments pop-up image",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Each department\u0027s name in All Deparments menu",
  "description": "  has to correspond the below table",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@allDepartments"
    }
  ]
});
formatter.step({
  "name": "user hover overs All Departments menu",
  "keyword": "When "
});
formatter.step({
  "name": "user sees \"\u003cAll Departments item\u003e\" in the drop down list",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "All Departments item"
      ]
    },
    {
      "cells": [
        "Appliances"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Home Depot web app is up",
  "keyword": "Given "
});
formatter.match({
  "location": "AllDepartmentSteps.home_Depot_web_app_is_up()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Each department\u0027s name in All Deparments menu",
  "description": "  has to correspond the below table",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@allDepartments"
    }
  ]
});
formatter.step({
  "name": "user hover overs All Departments menu",
  "keyword": "When "
});
formatter.match({
  "location": "AllDepartmentSteps.user_hover_overs_All_Departments_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sees \"Appliances\" in the drop down list",
  "keyword": "Then "
});
formatter.match({
  "location": "AllDepartmentSteps.user_sees_Appliances_in_the_drop_down_list(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});