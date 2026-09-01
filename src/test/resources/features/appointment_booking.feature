Feature: FR-03 Appointment Slot Search & Booking

  Scenario Outline: Search and Book Real-Time Appointment
    Given Patient is logged in and navigates to the appointment booking module
    When Patient selects doctor "<doctorName>" and date "<appointmentDate>"
    And Patient confirms the available slot booking
    Then System displays booking confirmation "<confirmationText>"

    Examples:
      | doctorName     | appointmentDate | confirmationText             |
      | Dr. Smith      | 2026-09-15       | Appointment Successfully Booked |
