package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    // Locators
    private By usernameInput = By.id("username");
    private By passwordInput = By.id("password");
    private By loginButton = By.id("loginBtn");
    private By otpInput = By.id("otpCode");
    private By verifyOtpButton = By.id("verifyBtn");
    private By dashboardHeader = By.id("dashboardHeading");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterCredentials(String username, String password) {
        driver.findElement(usernameInput).sendKeys(username);
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void enterOTP(String otp) {
        driver.findElement(otpInput).sendKeys(otp);
    }

    public void clickVerifyOTP() {
        driver.findElement(verifyOtpButton).click();
    }

    public String getDashboardTitle() {
        return driver.findElement(dashboardHeader).getText();
    }
}
