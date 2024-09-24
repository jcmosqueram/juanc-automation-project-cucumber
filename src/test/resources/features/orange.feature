Feature: Create new user

  In order to create a new user
  as a system administrator I want to add new user's data
  to validate that user was created

Scenario: created new user


  Given the system administrator is logged with valid credentials
  When the system administrator creates a new user
  Then the system administrator should be taken to new user's personal detail page

