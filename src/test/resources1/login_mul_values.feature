Feature: Login

Scenario Outline: Login with valid details
Given I am on homepage
When I click on Sign in link
Then AUTHENTICATION page should be loaded
Then I enter valid "<uname>" and "<pwd>"
Then I should  login successfully
Examples:
| uname|pwd|
|kavithatamma@hotmail.com|Govinda@0711|
