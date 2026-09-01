package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppointmentPage {

    WebDriver driver;

    // Locators for FR-03 Appointment Booking
    private By doctorDropdown = By.id("doctorSelect");
    private By datePicker = By.id("appointmentDate");
    private By searchButton = By.id("searchSlotsBtn");
    private By confirmBookingButton = By.id("confirmBookingBtn");
    private By successAlert = By.id("bookingSuccessMsg");

    public AppointmentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectDoctorAndDate(String doctor, String date) {
        // Interacts with doctor dropdown and date selection
    }

    public void clickSearchSlots() {
        driver.findElement(searchButton).click();
    }

    public void confirmBooking() {
        driver.findElement(confirmBookingButton).click();
    }

    public String getBookingConfirmation() {
        return driver.findElement(successAlert).getText();
    }
}
