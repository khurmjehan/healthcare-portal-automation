Feature: FR-01 Multi-Factor Authentication & Access Control

  Scenario Outline: Patient Successful Login with MFA Verification
    Given User is on the Healthcare Portal login page
    When User enters username "<username>" and password "<password>"
    And User clicks the login button
    Then System prompts for MFA OTP code
    When User enters OTP "<otp>" and verifies
    Then User is redirected to patient dashboard with title "<dashboardTitle>"

    Examples:
      | username       | password     | otp    | dashboardTitle    |
      | patient_john   | Pass123!     | 123456 | Patient Dashboard |
