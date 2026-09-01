Feature: FR-05 E-Prescription Transmission & Payment Gateway

  Scenario Outline: Patient Transmits E-Prescription and Pays Invoice
    Given Patient is logged in and navigates to the Billing & Pharmacy module
    When Patient selects partner pharmacy "<pharmacyName>" for e-prescription
    And Patient submits payment for invoice amount "<amount>"
    Then System confirms prescription transmission and payment status "<statusMessage>"

    Examples:
      | pharmacyName      | amount  | statusMessage                |
      | CVS Pharmacy #104 | $45.00  | Payment & Transmission Saved |
