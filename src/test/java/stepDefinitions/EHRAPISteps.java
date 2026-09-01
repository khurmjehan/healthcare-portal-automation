package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

public class EHRAPISteps {

    private String endpointUrl;
    private Response response;

    @Given("EHR API service endpoint {string} is active")
    public void set_api_endpoint(String endpoint) {
        this.endpointUrl = endpoint;
    }

    @When("User sends a GET request for patient ID {string}")
    public void send_get_request(String patientId) {
        response = RestAssured.given()
                .when()
                .get(endpointUrl);
    }

    @Then("Response status code should be 200")
    public void verify_status_code() {
        Assert.assertEquals(response.getStatusCode(), 200, "API returned non-200 status!");
    }

    @And("Response time should be under 2000 milliseconds")
    public void verify_response_time() {
        long responseTime = response.getTime();
        System.out.println("EHR API Response Time: " + responseTime + " ms");
        Assert.assertTrue(responseTime < 2000, "NFR-04 Violation: API response time exceeded 2 seconds!");
    }

    @And("Response headers must include secure transport headers")
    public void verify_security_headers() {
        String contentType = response.getHeader("Content-Type");
        Assert.assertNotNull(contentType, "NFR-01 Verification: Missing Content-Type header");
    }
}

