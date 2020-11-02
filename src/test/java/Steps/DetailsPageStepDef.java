package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DetailsPage;
import pages.InventoryPage;
import pages.MainPage;

import static org.junit.Assert.*;
import static pages.DetailsPage.CAR_MAIN_IMAGE;

public class DetailsPageStepDef {

    DetailsPage detailsPage;

    public DetailsPageStepDef() {
        detailsPage = new DetailsPage();
    }

    @When("User clicks Details button")
    public void userClicksDetailsButton() {
        detailsPage.userClicksButton(DetailsPage.VIEW_DETAILS_BUTTON);
    }

    @Then("title should be displayed")
    public void titleShouldBeDisplayed() {
        detailsPage.waitUntilPageLoaded();
        assertTrue(detailsPage.isCarTitleVisible());

    }

    @And("price should be displayed")
    public void priceShouldBeDisplayed() {
        assertTrue(detailsPage.isCarPriceVisible());
    }

    @And("image should be displayed")
    public void imageShouldBeDisplayed() {
        assertTrue(detailsPage.isMainImageVisible());
    }

    @Then("VIN number should be displayed")
    public void vinNumberShouldBeDisplayed() {
        assertTrue(detailsPage.isVinNumVisible());
    }

    @And("Stock should be displayed")
    public void stockShouldBeDisplayed() {
        assertTrue(detailsPage.isStockVisible());
    }

    @And("Trim should be displayed")
    public void trimShouldBeDisplayed() {
        assertTrue(detailsPage.isTrimVisible());
    }

    @And("Condition should be displayed")
    public void conditionShouldBeDisplayed() {
        assertTrue(detailsPage.isConditionVisible());
    }

    @And("Certification should be displayed")
    public void certificationShouldBeDisplayed() {
        assertTrue(detailsPage.isCertificationVisible());
    }

    @Then("Odometer should be displayed")
    public void odometerShouldBeDisplayed() {
        assertTrue(detailsPage.isOdometerVisible()); }

    @And("Exterior color should be displayed")
    public void exteriorColorShouldBeDisplayed() {
        assertTrue(detailsPage.isExtColorVisible());
    }

    @And("Interior color should be displayed")
    public void interiorColorShouldBeDisplayed() {
        assertTrue(detailsPage.isInterColorVisible());
    }

    @And("Body Type should be displayed")
    public void bodyTypeShouldBeDisplayed() {
        assertTrue(detailsPage.isBodyTypeVisible());
    }

    @And("Fuel Type should be displayed")
    public void fuelTypeShouldBeDisplayed() {
        assertTrue(detailsPage.isFuelTypeVisible());
    }

    @And("Transmission should be displayed")
    public void transmissionShouldBeDisplayed() {
        assertTrue(detailsPage.isTransmissionVisible());
    }

    @And("Drive Train should be displayed")
    public void driveTrainShouldBeDisplayed() {
        assertTrue(detailsPage.isDriveTrainVisible());
    }

    @And("Engine data should be displayed")
    public void engineDataShouldBeDisplayed() {
        assertTrue(detailsPage.isEngineDataVisible());
    }

    @And("Fuel Economy should be displayed")
    public void fuelEconomyShouldBeDisplayed() {
        assertTrue(detailsPage.isFuelEconomyVisible());
    }

    @Then("Finance should be displayed")
    public void financeShouldBeDisplayed() {
        assertTrue(detailsPage.isFinancingVisible());
    }

    @And("Finance application should be displayed")
    public void financeApplicationShouldBeDisplayed() {
        assertTrue(detailsPage.isFinanceApplicationVisible());
    }

    @And("Vehicle features should be displayed")
    public void vehicleFeaturesShouldBeDisplayed() {
        assertTrue(detailsPage.isVehicleFeaturesVisible());
    }

    @And("Vehicle options should be displayed")
    public void vehicleOptionsShouldBeDisplayed() {
        assertTrue(detailsPage.isVehicleOptionsVisible());
    }

    @And("Note should be displayed")
    public void noteShouldBeDisplayed() {
        assertTrue(detailsPage.isNoteVisible());
    }

    @And("Details should be displayed")
    public void detailsShouldBeDisplayed() {
        assertTrue(detailsPage.isDetailsVisible());
    }

    @And("Features and Options section should be displayed")
    public void featuresAndOptionsSectionShouldBeDisplayed() {
        assertTrue(detailsPage.isFeaturesAndOptionsVisible());
    }

    @When("User populates {string} text box")
    public void userPopulatesFirstNameTextBox(String text) {
        detailsPage.populateFirstName(text);
    }

    @And("User populates Last name text box")
    public void userPopulatesLastNameTextBox(String text) {
        detailsPage.populateLastName(text);
    }

    @And("User populates Email text box")
    public void userPopulatesEmailTextBox(String text) {
        detailsPage.populateEmail(text);
    }

    @And("User populates Phone text box")
    public void userPopulatesPhoneTextBox(String text) {
        detailsPage.populatePhone(text);
    }

    @And("User clicks Submit button")
    public void userClicksSubmitButton() {
        detailsPage.clickSubmitBtn();
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        assertTrue(detailsPage.isElementDisplayed(DetailsPage.SUCCESS_MSG));
    }

    @When("User populates {string} in the first name input box")
    public void userPopulatesInTheFirstNameInputBox(String txt) {
        detailsPage.populateFirstName(txt);
    }

    @And("User populates {string} in the last name input box")
    public void userPopulatesInTheLastNameInputBox(String txt) {
        detailsPage.populateLastName(txt);
    }

    @And("User populates {string} in the email input box")
    public void userPopulatesInTheEmailInputBox(String txt) {
        detailsPage.populateEmail(txt);
    }

    @And("User populates {string} in the phone input box")
    public void userPopulatesInThePhoneInputBox(String txt) {
        detailsPage.populatePhone(txt);
    }

    @Then("Email Error message should be displayed")
    public void emailErrorMessageShouldBeDisplayed() {
        assertTrue(detailsPage.isElementDisplayed(DetailsPage.EMAIL_ERROR_MSG));
    }

    @When("User clicks Apply for Financing button")
    public void userClicksApplyForFinancingButton() {
        detailsPage.clickApplyForFinancingBtn();

    }

    @Then("Apply for Financing page should be displayed")
    public void applyForFinancingPageShouldBeDisplayed() {
        assertTrue(detailsPage.isApplyFinancingHeaderDisplayed());
    }

    @When("User clicks Trade-in appraisal button")
    public void userClicksTradeInAppraisalButton() {
        detailsPage.clickTradeInBtn();

    }

    @Then("Trade-In Appraisal page should be displayed")
    public void tradeInAppraisalPageShouldBeDisplayed() {
        assertTrue(detailsPage.isTradeInHeaderDisplayed());
    }

    @When("User clicks Carfax button")
    public void userClicksCarfaxButton() {
        detailsPage.clickCarfaxBtn();
    }

    @Then("Vehicle History Report dialog should be displayed")
    public void vehicleHistoryReportDialogShouldBeDisplayed() {
        assertTrue(detailsPage.isCarfaxHeaderDisplayed());
    }

    @When("User clicks Calculate button on Estimate your monthly payment form")
    public void userClicksCalculateButtonOnEstimateYourMonthlyPaymentForm() {
        detailsPage.clickCalculateBtn();
        detailsPage.pause();
    }

    @Then("monthly payment input box should be populated")
    public void monthlyPaymentInputBoxShouldBePopulated() {
        assertTrue(detailsPage.isMonthlyPaymentDisplayed());
    }

    @When("User populates {string} in the less down payment input box")
    public void userPopulatesInTheLessDownPaymentInputBox(String txt) {
        detailsPage.userPopulatesLessDownPayment(txt);
    }

    @And("User populates {string} in the less trade-in input box")
    public void userPopulatesInTheLessTradeInInputBox(String txt) {
        detailsPage.userPopulatesTradeIn(txt);
    }

    @And("User clicks Calculate button")
    public void userClicksCalculateButton() {
        detailsPage.clickCalculateBtn();
    }

    @Then("monthly payment should be calculated")
    public void monthlyPaymentShouldBeCalculated() {
        assertTrue(detailsPage.isMonthlyPaymentDisplayed());
    }

    @Then("Error dialog should be displayed")
    public void errorDialogShouldBeDisplayed() {
        assertTrue(detailsPage.isErrorDialogDisplayed());
    }

    @And("Success message should not be displayed")
    public void successMessageShouldNotBeDisplayed() {
        assertFalse(detailsPage.isElementDisplayed(DetailsPage.SUCCESS_MSG));
    }
}
