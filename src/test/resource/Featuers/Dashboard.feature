Feature: verifying Dashboard page completely


@postiveTest
Scenario: verify products page
Given open browser and enter url
When user enter valid username
And User enter  valid password
When user click on loginButton
Then it should naviagate to Dashboardpage
When user click on catalog
And User click on Product link
Then it should naviagte to Productpage and title product nop commerces


@NegativeTesting
Scenario: verify something page1
When click some thing
