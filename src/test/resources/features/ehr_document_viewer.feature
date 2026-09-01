Feature: FR-04 Secure Medical Document Viewer & Lab Result Download

  Scenario Outline: Patient Views and Downloads Lab Result PDF Securely
    Given Patient is logged in and navigates to the EHR Records module
    When Patient selects lab report "<reportName>"
    And Patient clicks the download PDF report button
    Then System securely serves the report PDF file "<fileName>"

    Examples:
      | reportName            | fileName              |
      | Blood_Panel_2026.pdf | Blood_Panel_2026.pdf  |
