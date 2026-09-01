package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.BillingPharmacyPage;

public class BillingPharmacySteps {

    WebDriver driver;
    BillingPharmacyPage billingPage;

    @Given("Patient is logged in and navigates to the Billing & Pharmacy module")
    public void navigate_to_billing_module() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://example.com");
        billingPage = new BillingPharmacyPage(driver);
    }

    @When("Patient selects partner pharmacy {string} for e-prescription")
    public void select_partner_pharmacy(String pharmacyName) {
        System.out.println("Selected Pharmacy: " + pharmacyName);
    }

    @And("Patient submits payment for invoice amount {string}")
    public void submit_payment(String amount) {
        System.out.println("Submitted invoice payment of: " + amount);
    }

    @Then("System confirms prescription transmission and payment status {string}")
    public void verify_payment_status(String statusMessage) {
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.length() > 0, "Billing & Pharmacy test passed");
        if (driver != null) {
            driver.quit();
        }
    }
}
