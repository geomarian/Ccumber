$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/GEO/Selenium Sample/cucum/Features/statement.feature");
formatter.feature({
  "line": 1,
  "name": "In order to test Home Page of application",
  "description": "As a Registered user\r\nI want to specify the features of home page",
  "id": "in-order-to-test-home-page-of-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7705094300,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "Login with valid username and password with parameter",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "Enter URL \"https://s1.demo.opensourcecms.com/wordpress/wp-login.php\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Enter username \"opensourcecms\" and password \"opensourcecms\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User must successfully login to the application",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://s1.demo.opensourcecms.com/wordpress/wp-login.php",
      "offset": 11
    }
  ],
  "location": "loginCred.enter_URL(String)"
});
formatter.result({
  "duration": 2161946000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "opensourcecms",
      "offset": 16
    },
    {
      "val": "opensourcecms",
      "offset": 45
    }
  ],
  "location": "loginCred.enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 770424500,
  "status": "passed"
});
formatter.match({
  "location": "loginCred.click_on_login_button()"
});
formatter.result({
  "duration": 2919169100,
  "status": "passed"
});
formatter.match({
  "location": "loginCred.user_must_successfully_login_to_the_application()"
});
formatter.result({
  "duration": 12950200,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Existing User is Edited",
  "description": "",
  "id": "in-order-to-test-home-page-of-application;existing-user-is-edited",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@EditUser"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "On user list and select user to edit",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "Click on edit user",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User edited and updated successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "editUser.on_user_list_and_select_user_to_edit()"
});
formatter.result({
  "duration": 4477147000,
  "status": "passed"
});
formatter.match({
  "location": "editUser.click_on_edit_user()"
});
formatter.result({
  "duration": 13320119700,
  "status": "passed"
});
formatter.match({
  "location": "editUser.user_edited_and_updated_successfully()"
});
formatter.result({
  "duration": 981481200,
  "status": "passed"
});
formatter.after({
  "duration": 1095614400,
  "status": "passed"
});
});