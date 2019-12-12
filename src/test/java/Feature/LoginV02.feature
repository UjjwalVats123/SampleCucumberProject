Feature: Application LoginV02

# Scenario with Parameterization
@PameterizedTest
Scenario Outline: Homepage login using parameterization
Given User is on Netbanking landing page
When User login into application with <Username> and <Password>
Then Homepage is populated
And Cards displayed are "False"

Examples:
|Username	|	Password|
|Username8	|	Password8|