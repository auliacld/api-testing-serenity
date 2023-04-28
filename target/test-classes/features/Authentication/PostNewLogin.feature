Feature: As a user i want to create new user login

  @PostLogin
  Scenario: as user i input all valid data in post new user login
    Given user has endpoint post new user login
    When user send post new user login
    Then login user get status code 200