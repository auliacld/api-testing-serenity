Feature: As a user i want to get detail product by id

  @GetProductByID
  Scenario: as user i input all valid data in get detail product by id
    Given user has endpoint get api
    When user get detail by id
    Then user get product status code 200