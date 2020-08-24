$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/LoginOrange.feature");
formatter.feature({
  "name": "Login to OrangeHRM",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Test login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to OrangeHRM Page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "name": "User is navigated to Welcome Page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ]
    }
  ],
  "tags": [
    {
      "name": "@valid"
    }
  ]
});
formatter.scenario({
  "name": "Test login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@valid"
    }
  ]
});
formatter.step({
  "name": "User navigates to OrangeHRM Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginOrangeHRMDef.navigateToOrangeHRM()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Admin and admin123",
  "keyword": "When "
});
formatter.match({
  "location": "LoginOrangeHRMDef.enterUsernamePassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginOrangeHRMDef.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is navigated to Welcome Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginOrangeHRMDef.navigateToWelcome()"
});
formatter.result({
  "status": "passed"
});
});