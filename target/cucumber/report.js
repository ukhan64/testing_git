$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TF_LOGIN.feature");
formatter.feature({
  "line": 1,
  "name": "Techfios login functionality validation",
  "description": "",
  "id": "techfios-login-functionality-validation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4840953500,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#Background:"
    },
    {
      "line": 4,
      "value": "#Given user is on Techfios login page"
    }
  ],
  "line": 6,
  "name": "User should be able to login with valid credentials",
  "description": "",
  "id": "techfios-login-functionality-validation;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is on the Techfios login page",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 8,
      "value": "#\tWhen User enters username as \"demo@techfios.com\""
    },
    {
      "line": 9,
      "value": "#\tWhen User enters password as \"abc123\""
    }
  ],
  "line": 10,
  "name": "User enters \"username\" from mysql database",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User enters \"password\" from mysql database",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User clicks on signin button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_the_Techfios_login_page()"
});
formatter.result({
  "duration": 1271953300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.User_enters_from_mysql_database(String)"
});
formatter.result({
  "duration": 593606400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.User_enters_from_mysql_database(String)"
});
formatter.result({
  "duration": 202733600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.when_user_clicks_on_signin_button()"
});
formatter.result({
  "duration": 4687942200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.then_User_should_land_on_Dashboard_page()"
});
formatter.result({
  "duration": 314235700,
  "status": "passed"
});
formatter.after({
  "duration": 933784600,
  "status": "passed"
});
});