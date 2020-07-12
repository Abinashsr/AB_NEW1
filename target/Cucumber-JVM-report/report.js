$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginApplicationFirst.feature");
formatter.feature({
  "line": 2,
  "name": "Login with First Url",
  "description": "",
  "id": "login-with-first-url",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Testing First Url",
  "description": "",
  "id": "login-with-first-url;testing-first-url",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on homepage using first url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter username \"\u003cUserName\u003e\" and User enter password \"\u003cPassword\u003e\" for first url",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user navigates to Login Page using first url",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Close the first url browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "login-with-first-url;testing-first-url;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 11,
      "id": "login-with-first-url;testing-first-url;;1"
    },
    {
      "cells": [
        "AB1",
        "12345"
      ],
      "line": 12,
      "id": "login-with-first-url;testing-first-url;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Testing First Url",
  "description": "",
  "id": "login-with-first-url;testing-first-url;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on homepage using first url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter username \"AB1\" and User enter password \"12345\" for first url",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user navigates to Login Page using first url",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Close the first url browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginApplicationFirst.user_is_on_homepage_using_first_url()"
});
formatter.result({
  "duration": 7860363900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AB1",
      "offset": 21
    },
    {
      "val": "12345",
      "offset": 51
    }
  ],
  "location": "LoginApplicationFirst.user_enter_username_and_User_enter_password_for_first_url(String,String)"
});
formatter.result({
  "duration": 512179400,
  "status": "passed"
});
formatter.match({
  "location": "LoginApplicationFirst.user_navigates_to_Login_Page_using_first_url()"
});
formatter.result({
  "duration": 1291170900,
  "status": "passed"
});
formatter.match({
  "location": "LoginApplicationFirst.close_the_first_url_browser()"
});
formatter.result({
  "duration": 2753500,
  "status": "passed"
});
});