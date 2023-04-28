Feature: As a user i want to create new category

  @PostCategories
  Scenario: as user i input all valid data in post new category
    Given user has endpoint post new category
    When user send post new category
    Then user see status code 200