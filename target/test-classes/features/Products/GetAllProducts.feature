Feature: As a user i want to get all detail product

  @GetProduct
  Scenario: as user i input all valid data in get all detail product
    Given user has endpoint
    When user get all detail product
    Then user get product status code 200

  @GetProductInvalid
  Scenario: as user cannot get detail product because invalid endpoint
    Given user has invalid endpoint
    When user not found get detail product
    Then user get code status 404
