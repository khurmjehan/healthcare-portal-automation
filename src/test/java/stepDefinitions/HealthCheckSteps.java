package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HealthCheckSteps {

    WebDriver driver;

    @Given("I launch the Chrome browser")
    public void launchBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("I navigate to {string}")
    public void navigateToUrl(String url) {
        driver.get(url);
    }

    @Then("The page title should contain {string}")
    public void verifyTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle), "Title mismatch!");
    }

    @And("I close the browser")
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
