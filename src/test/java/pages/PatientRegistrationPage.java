package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PatientRegistrationPage {

    WebDriver driver;

    // Locators for FR-02 Patient Intake
    private By firstNameInput = By.id("firstName");
    private By lastNameInput = By.id("lastName");
    private By emailInput = By.id("email");
    private By submitButton = By.id("submitRegistrationBtn");
    private By successMessage = By.id("registrationSuccessAlert");

    public PatientRegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillRegistrationDetails(String firstName, String lastName, String email) {
        driver.findElement(firstNameInput).sendKeys(firstName);
        driver.findElement(lastNameInput).sendKeys(lastName);
        driver.findElement(emailInput).sendKeys(email);
    }

    public void clickSubmit() {
        driver.findElement(submitButton).click();
    }

    public String getConfirmationText() {
        return driver.findElement(successMessage).getText();
    }
}

