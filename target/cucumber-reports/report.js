$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("demo.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1550616891,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "USer should not be able to login with invalid credentials",
  "description": "",
  "id": "login;user-should-not-be-able-to-login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "The user has navigated to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "The user clicks login after entering invalid username \"invaliduser\" and password \"invalidpassword\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "The user should see the invalid username or password message as \"Your login is invalid. Please try again.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoStepDefinitions.the_user_has_navigated_to_the_ligin_page()"
});
formatter.result({
  "duration": 2535181529,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "invaliduser",
      "offset": 55
    },
    {
      "val": "invalidpassword",
      "offset": 82
    }
  ],
  "location": "DemoStepDefinitions.the_user_clicks_login_after_entering_invalid_username_and_password(String,String)"
});
formatter.result({
  "duration": 2113968009,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your login is invalid. Please try again.",
      "offset": 65
    }
  ],
  "location": "DemoStepDefinitions.the_user_should_see_the_invalid_username_or_password_message_as(String)"
});
formatter.result({
  "duration": 444937353,
  "status": "passed"
});
formatter.after({
  "duration": 104642130,
  "status": "passed"
});
});