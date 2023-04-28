Feature: As a user i want to create new user register

  @PostRegister
  Scenario: as user i input all valid data in post new user register
    Given user has endpoint post new user register
    When user send post new user register
    Then user get status code 200