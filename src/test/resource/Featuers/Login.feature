Feature: Verifying LoginFunction with all possible testcase 


@postiveTest
Scenario: Verify login function With valid data
Given open browser and enter url
When user enter valid username
And User enter  valid password
When user click on loginButton
Then it should naviagate to Dashboardpage
Then close the browser


@NegativeTesting
Scenario: Verify login function With invalid data
Given open browser and enter url
When user enter invalid username
When user enter invalid password
When user click on loginButton
Then it should throw error message as Invalid username and password
Then close the browser

Scenario Outline: verify loginFunction with Multiple TestDatal
Given open browser and enter url
When user enter "<username>"
When user entered "<password>"
When user click on loginButton
Then it should display the result
Then close the browser

Examples:
 |username |password|
 |kumar    |kumar1234|
 |sai      |sai1234  |
 |ram      |ram1234  |
 |admin@yourstore.com|admin  |
  





