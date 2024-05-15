Feature: Verifying LoginFunction with all possible testcase 

Background:
Given open browser and enter url

@postiveTest
Scenario: Verify login function With valid data
When user enter valid username
And User enter  valid password
When user click on loginButton
Then it should naviagate to Dashboardpage
Then close the broswer


@NegativeTesting
Scenario: Verify login function With invalid data
When user enter invalid username
When user enter invalid password
When user click on loginButton
Then it should throw error message as Invalid username and password

Scenario Outline: verify loginFunction with Multiple TestDatal
When user enter "<username>"
When user entered "<password>"
When user click on loginButton
Then it should display the result

Examples:
 |username |password|
 |kumar    |kumar1234|
 |sai      |sai1234  |
 |ram      |ram1234  |
 |admin@yourstore.com|admin  |
  





