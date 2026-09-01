package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EHRDocumentPage {

    WebDriver driver;

    // Locators for FR-04 EHR Document Viewer
    private By recordList = By.className("lab-record-item");
    private By viewPdfButton = By.id("viewPdfBtn");
    private By downloadPdfButton = By.id("downloadPdfBtn");
    private By pdfViewerContainer = By.id("pdfViewer");

    public EHRDocumentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectLabReport() {
        // Interacts with lab report list
    }

    public void clickDownloadPDF() {
        driver.findElement(downloadPdfButton).click();
    }

    public boolean isPdfViewerDisplayed() {
        return driver.findElement(pdfViewerContainer).isDisplayed();
    }
}
