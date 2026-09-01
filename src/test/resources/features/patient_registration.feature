Feature: FR-02 Patient Registration & Intake Validation

  Scenario Outline: Register New Patient with Valid Intake Information
    Given User is on the Healthcare Portal patient intake registration page
    When User fills in first name "<firstName>", last name "<lastName>", and email "<email>"
    And User submits the intake form
    Then System displays registration confirmation "<confirmationMessage>"

    Examples:
      | firstName | lastName | email            | confirmationMessage          |
      | Sarah     | Connor   | sarah@health.com | Profile Intake Complete      |
