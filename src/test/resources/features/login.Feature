Feature: login with different credentials

  //Background: te user is on the login page

  In order to login to the system
  as user I want to login
  using different valid credentials

  //Scenario Outline: login with authorized credentials
  Scenario: login with authorized credentials

    Given the user is on the Login page
    When the user enter valid credentials
    Then the user should be taken to the products page

#  Examples:
#  |username                 |password
#  |standard_user            |secret_sauce
#  |locked_out_user          |secret_sauce
#  |problem_user             |secret_sauce
#  |performance_glitch_user  |secret_sauce
#  |error_user               |secret_sauce
#  |visual_user              |secret_sauce