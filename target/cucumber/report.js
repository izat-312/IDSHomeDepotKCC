$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/features/HomeDepotLogIn.feature");
formatter.feature({
  "name": "Test Home Depot smoke scenario",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test login with invalid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Open chrome and start application",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeDepotSteps.open_chrome_and_start_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i click my account button than sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "HomeDepotSteps.i_click_my_account_button_than_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i enter invalid username password and click log in",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeDepotSteps.i_enter_invalid_username_password_and_click_log_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should not be able to log in",
  "keyword": "And "
});
formatter.match({
  "location": "HomeDepotSteps.user_should_not_be_able_to_log_in()"
});
formatter.result({
  "status": "passed"
});
});