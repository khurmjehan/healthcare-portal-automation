Feature: NFR-01 & NFR-04 Healthcare EHR API Performance & Security

  Scenario Outline: Validate EHR Patient Records API Response Time and Security Headers
    Given EHR API service endpoint "<apiEndpoint>" is active
    When User sends a GET request for patient ID "<patientId>"
    Then Response status code should be 200
    And Response time should be under 2000 milliseconds
    And Response headers must include secure transport headers

    Examples:
      | apiEndpoint                        | patientId |
      | https://jsonplaceholder.typicode.com/posts/1 | 1001      |
