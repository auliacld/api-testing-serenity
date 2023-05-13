Feature: As a user i cannot get all detail category

  @InvalidEndpointCategory
    Scenario: as user i cannot get detail category with invalid endpoint
    Given user has invalid endpoint for get detail category
    When user send request to invalid endpoint category
    Then user see error status code 404