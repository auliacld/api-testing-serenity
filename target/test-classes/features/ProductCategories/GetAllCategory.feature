Feature: As a user i want to get all detail category

  @GetAllCategory
  Scenario: as user i input all valid data in get all detail category
    Given user has endpoint to get detail category
    When user get all detail category
    Then user get category status code 200