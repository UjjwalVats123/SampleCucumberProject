Feature: Application Login

#This is Background keyword in Cucumber
#This piece of code will be executed before each test case present in this class
Background: Initializing Webdriver and some prerequisites
Given Driver is present
When Browser is triggered
Then Check if browser is started

Scenario: Home page login
Given User is on Netbanking landing page
When User login into application with username and password
Then Homepage is populated
And Cards displayed are "True"

# Scenario with Regular Expressions
Scenario: Home page login using defined credentials
Given User is on Netbanking landing page
When User login into application with "Username1" and "Password1"
Then Homepage is populated
And Cards displayed are "True"

# Scenario with Regular Expressions
Scenario: Home page login using defined credentials
Given User is on Netbanking landing page
When User login into application with "Username2" and "Password2"
Then Homepage is populated
And Cards displayed are "False"

# Scenario with Parameterization
@PameterizedTest
Scenario Outline: Homepage login using parameterization
Given User is on Netbanking landing page
When User login into application with <Username> and <Password>
Then Homepage is populated
And Cards displayed are "False"

Examples:
|Username	|	Password|
|Username3	|	Password3|
|Username4	|	Password4|
|Username5	|	Password5|
|Username6	|	Password6|
|Username7	|	Password7|

# Scenario with Datatable concept
@SignupTest
Scenario: Home page signup
Given User is on Netbanking landing page
When User signup with the following details
|Ujjwal|Vats|24|TechMahindra|Pune|Maharashtra|8899796633|
Then Homepage is populated
And Cards displayed are "True"
