$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login_mul_values.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login with valid details",
  "description": "",
  "id": "login;login-with-valid-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on Sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "AUTHENTICATION page should be loaded",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I enter valid \"\u003cuname\u003e\" and \"\u003cpwd\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I should  login successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "login;login-with-valid-details;",
  "rows": [
    {
      "cells": [
        "uname",
        "pwd"
      ],
      "line": 10,
      "id": "login;login-with-valid-details;;1"
    },
    {
      "cells": [
        "kavithatamma@hotmail.com",
        "Govinda@0711"
      ],
      "line": 11,
      "id": "login;login-with-valid-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 25844604900,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Login with valid details",
  "description": "",
  "id": "login;login-with-valid-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on Sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "AUTHENTICATION page should be loaded",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I enter valid \"kavithatamma@hotmail.com\" and \"Govinda@0711\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I should  login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.i_am_on_homepage()"
});
formatter.result({
  "duration": 727067700,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.i_click_on_Sign_in_link()"
});
formatter.result({
  "duration": 2749474900,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.authentication_page_should_be_loaded()"
});
formatter.result({
  "duration": 137505400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kavithatamma@hotmail.com",
      "offset": 15
    },
    {
      "val": "Govinda@0711",
      "offset": 46
    }
  ],
  "location": "StepDef.i_enter_valid_and(String,String)"
});
formatter.result({
  "duration": 2243434700,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.i_should_login_successfully()"
});
formatter.result({
  "duration": 134091000,
  "status": "passed"
});
formatter.after({
  "duration": 33900,
  "status": "passed"
});
});