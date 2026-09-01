package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BillingPharmacyPage {

    WebDriver driver;

    // Locators for FR-05 Billing & Pharmacy
    private By prescriptionItem = By.className("prescription-item");
    private By pharmacySelect = By.id("pharmacyDropdown");
    private By payInvoiceBtn = By.id("payInvoiceBtn");
    private By paymentStatusAlert = By.id("paymentSuccessAlert");

    public BillingPharmacyPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectPharmacy(String pharmacyName) {
        // Dropdown selection logic
    }

    public void clickPayInvoice() {
        driver.findElement(payInvoiceBtn).click();
    }

    public String getPaymentStatus() {
        return driver.findElement(paymentStatusAlert).getText();
    }
}
