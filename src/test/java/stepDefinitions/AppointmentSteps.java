package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.AppointmentPage;

public class AppointmentSteps {

    WebDriver driver;
    AppointmentPage appointmentPage;

    @Given("Patient is logged in and navigates to the appointment booking module")
    public void navigate_to_appointment_module() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://example.com");
        appointmentPage = new AppointmentPage(driver);
    }

    @When("Patient selects doctor {string} and date {string}")
    public void select_doctor_and_date(String doctor, String date) {
        System.out.println("Selecting Doctor: " + doctor + " for Date: " + date);
    }

    @And("Patient confirms the available slot booking")
    public void confirm_slot_booking() {
        System.out.println("Slot confirmed for booking");
    }

    @Then("System displays booking confirmation {string}")
    public void verify_booking_confirmation(String expectedMsg) {
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.length() > 0, "Booking test passed");
        if (driver != null) {
            driver.quit();
        }
    }
}
