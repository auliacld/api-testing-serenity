Feature: As a user i want to create new product

  @PostProduct
  Scenario: as user i input all valid data in post new product
    Given user has endpoint post new product
    When user send post new product
    Then user see status code 200