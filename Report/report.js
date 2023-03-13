$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/amazon.feature");
formatter.feature({
  "name": "To Validate the account creation of Fb application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To create the new account",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To launch the browser and maximise the window",
  "keyword": "Given "
});
formatter.match({
  "location": "FbRegistration.to_launch_the_browser_and_maximise_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the url of fb application",
  "keyword": "When "
});
formatter.match({
  "location": "FbRegistration.to_launch_the_url_of_fb_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the create new account button",
  "keyword": "And "
});
formatter.match({
  "location": "FbRegistration.to_click_the_create_new_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass first name in firstname text box",
  "rows": [
    {
      "cells": [
        "nandini",
        "selenium",
        "java",
        "php"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "FbRegistration.to_pass_first_name_in_firstname_text_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass secondname in secondname text box",
  "keyword": "And "
});
formatter.match({
  "location": "FbRegistration.to_pass_secondname_in_secondname_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to pass mobileno or email in email text box",
  "rows": [
    {
      "cells": [
        "nandini@gmail.com",
        "54321784q5"
      ]
    },
    {
      "cells": [
        "nandy@gmail.com",
        "983534747"
      ]
    },
    {
      "cells": [
        "seleniuminmakes@gmail.com",
        "658789543"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "FbRegistration.to_pass_mobileno_or_email_in_email_text_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To create new password using new password text box",
  "keyword": "And "
});
formatter.match({
  "location": "FbRegistration.to_create_new_password_using_new_password_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the Chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FbRegistration.to_close_the_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
});