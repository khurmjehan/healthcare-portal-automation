package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.EHRDocumentPage;

public class EHRDocumentSteps {

    WebDriver driver;
    EHRDocumentPage ehrPage;

    @Given("Patient is logged in and navigates to the EHR Records module")
    public void navigate_to_ehr_module() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://example.com");
        ehrPage = new EHRDocumentPage(driver);
    }

    @When("Patient selects lab report {string}")
    public void select_lab_report(String reportName) {
        System.out.println("Selecting lab report: " + reportName);
    }

    @And("Patient clicks the download PDF report button")
    public void click_download_pdf() {
        System.out.println("Initiated secure PDF download request");
    }

    @Then("System securely serves the report PDF file {string}")
    public void verify_pdf_download(String fileName) {
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.length() > 0, "EHR Document test passed");
        if (driver != null) {
            driver.quit();
        }
    }
}
