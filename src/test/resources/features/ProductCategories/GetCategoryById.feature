Feature: As a user i want to get category by id

  @GetCategoryByID
  Scenario: as user i input all valid data in get category by id
    Given user has endpoint get category api
    When user get category by id
    Then user get category status code 200