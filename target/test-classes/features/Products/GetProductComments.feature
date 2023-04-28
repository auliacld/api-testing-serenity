Feature: As a user i want to get product comments

  @GetProductComments
  Scenario: as user i input all valid data in get product comments
    Given user has endpoint get product comments
    When user get product comments
    Then user get product comments status code 200