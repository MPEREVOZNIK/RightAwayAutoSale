package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static java.lang.Integer.parseInt;

public class DetailsPage extends BasePage {
    public final static String EMAIL_ERROR_MSG = "//div[contains(text(),'Email is not a valid email address')]";
    public final static String VIEW_DETAILS_BUTTON = "//a[@class = 'view-detail-btn ']";
    public final static String CAR_TITLE = "//*[@class='col-md-6 col-sm-6 col-xs-12 inventory-name-inner']";
    public final static String PRICE = "//div[@class='col-md-6 col-sm-6 col-xs-12 inventory-price-inner']";
    public final static String CAR_MAIN_IMAGE = "//a[@class='fancybox fancybox_listing_link']";
    public final static String VIN_NUMBER = "//*[contains(text(),'VIN #:')]";
    public final static String STOCK_NUMBER = "//*[contains(text(),'Stock #:')]";
    public final static String TRIM_NUMBER = "//*[contains(text(),'Trim #:')]";
    public final static String CONDITION = "//*[contains(text(),'Condition #:')]";
    public final static String CERTIFICATION = "//*[contains(text(),'Certification #:')]";
    public final static String ODOMETER = "//h2[contains(text(),'Odometer')]";
    public final static String EXTERIOR_COLOR = "//h2[contains(text(),'Exterior Color')]";
    public final static String INTERIOR_COLOR = "//h2[contains(text(),'Interior Color')]";
    public final static String BODY_TYPE = "//h2[contains(text(),'Body Type')]";
    public final static String FUEL_TYPE = "//h2[contains(text(),'Fuel Type')]";
    public final static String TRANSMISSION = "//h2[contains(text(),'Transmission')]";
    public final static String DRIVE_TRAIN = "//h2[contains(text(),'Drive Train')]";
    public final static String ENGINE_DATA = "//h2[contains(text(),'Engine Data')]";
    public final static String FUEL_ECONOMY = "//h2[contains(text(),'Fuel Economy')]";
    public final static String FINANCING = "//*[contains(text(),'FINANCING')]";
    public final static String FINANCE_APPLICATION = "//*[contains(text(),'FINANCE APPLICATION')]";
    public final static String VEHICLE_FEATURES = "//*[contains(text(),'VEHICLE FEATURES')]";
    public final static String VEHICLE_OPTIONS = "//*[contains(text(),'VEHICLE OPTIONS')]";
    public final static String NOTE = "//*[contains(text(),'NOTE')]";
    public final static String DETAILS = "//*[contains(text(),'DETAILS')]";
    public final static String FEATURES_OPTIONS = "//*[contains(text(),'Features & Options')]";
    public final static String FIRST_NAME_INPUT = "(//*[@name='Lead[first_name]'])[1]";
    public final static String LAST_NAME_INPUT = "(//*[@name='Lead[last_name]'])[1]";
    public final static String EMAIL_INPUT = "(//*[@name='Lead[email]'])[1]";
    public final static String PHONE_INPUT = "(//*[@name='Lead[cell_phone]'])[1]";
    public final static String SUBMIT_BUTTON = "(//button[@type='submit'])[1]";
    public final static String SUCCESS_MSG = "//*[contains(text(),'Form has been submitted')]";
    public final static String APPLY_FINANCING_BTN = "//*[@class='apply-finance']";
    public final static String TRADE_IN_BTN = "//*[@class='trade-appraisal']";
    public final static String CARFAX_BTN = "//img[@alt='Vehicle History Report']";
    public final static String CALCULATE_BTN = "//input[@value='Calculate']";
    public final static String APPLY_FINANCING_HEADER = "//h1[contains(text(),' Apply for Financing ')]";
    public final static String TRADE_IN_HEADER = "//h1[contains(text(),' Trade-In Appraisal ')]";
    public final static String CARFAX_HEADER = "//h3[@class='modal-title popup-heading']";
    public final static String MONTHLY_PAY_INPUT = "//*[@name='monthlyPayment']";
    public final static String DOWN_PAY_INPUT = "//*[@name='monthlyDownPayment']";
    public final static String TRADE_IN_INPUT = "//*[@name='monthlyTradeIn']";


    public void waitUntilPageLoaded() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CAR_TITLE)));
    }

    public void userClicksButton(String xpath) {
        clickElementByXpath(xpath);
    }

    public boolean isCarTitleVisible() {
        return isElementDisplayed(CAR_TITLE);
    }

    public boolean isCarPriceVisible() {
        return isElementDisplayed(PRICE);
    }

    public boolean isMainImageVisible() {
        return isElementDisplayed(CAR_MAIN_IMAGE);
    }

    public boolean isVinNumVisible() {
        return isElementDisplayed(VIN_NUMBER);
    }

    public boolean isStockVisible() {
        return isElementDisplayed(STOCK_NUMBER);
    }

    public boolean isTrimVisible() {
        return isElementDisplayed(TRIM_NUMBER);
    }

    public boolean isConditionVisible() {
        return isElementDisplayed(CONDITION);
    }

    public boolean isCertificationVisible() {
        return isElementDisplayed(CERTIFICATION);
    }

    public boolean isOdometerVisible() {
        return isElementDisplayed(ODOMETER);
    }

    public boolean isExtColorVisible() {
        return isElementDisplayed(EXTERIOR_COLOR);
    }

    public boolean isInterColorVisible() {
        return isElementDisplayed(INTERIOR_COLOR);
    }

    public boolean isBodyTypeVisible() {
        return isElementDisplayed(BODY_TYPE);
    }

    public boolean isFuelTypeVisible() {
        return isElementDisplayed(FUEL_TYPE);
    }

    public boolean isTransmissionVisible() {
        return isElementDisplayed(TRANSMISSION);
    }

    public boolean isDriveTrainVisible() {
        return isElementDisplayed(DRIVE_TRAIN);
    }

    public boolean isEngineDataVisible() {
        return isElementDisplayed(ENGINE_DATA);
    }

    public boolean isFuelEconomyVisible() {
        return isElementDisplayed(FUEL_ECONOMY);
    }

    public boolean isFinancingVisible() {
        return isElementDisplayed(FINANCING);
    }

    public boolean isFinanceApplicationVisible() {
        return isElementDisplayed(FINANCE_APPLICATION);
    }

    public boolean isVehicleFeaturesVisible() {
        return isElementDisplayed(VEHICLE_FEATURES);
    }

    public boolean isVehicleOptionsVisible() {
        return isElementDisplayed(VEHICLE_OPTIONS);
    }

    public boolean isNoteVisible() {
        return isElementDisplayed(NOTE);
    }

    public boolean isDetailsVisible() {
        return isElementDisplayed(DETAILS);
    }

    public boolean isFeaturesAndOptionsVisible() {
        return isElementDisplayed(FEATURES_OPTIONS);
    }

    public void populateFirstName(String text) {

        driver.findElement(By.xpath(FIRST_NAME_INPUT)).sendKeys(text);
    }

    public void populateLastName(String text) {

        driver.findElement(By.xpath(LAST_NAME_INPUT)).sendKeys(text);
    }

    public void populateEmail(String text) {

        driver.findElement(By.xpath(EMAIL_INPUT)).sendKeys(text);
    }

    public void populatePhone(String text) {

        driver.findElement(By.xpath(PHONE_INPUT)).sendKeys(text);
    }

    public void clickSubmitBtn() {

        clickElementByXpath(SUBMIT_BUTTON);
    }

    public void clickApplyForFinancingBtn() {
        clickElementByXpath(APPLY_FINANCING_BTN);
    }

    public boolean isApplyFinancingHeaderDisplayed() {
        return isElementDisplayed(APPLY_FINANCING_HEADER);
    }

    public void clickTradeInBtn() {
        clickElementByXpath(TRADE_IN_BTN);
    }

    public boolean isTradeInHeaderDisplayed() {
        return isElementDisplayed(TRADE_IN_HEADER);
    }

    public void clickCarfaxBtn() {
        clickElementByXpath(CARFAX_BTN);
    }

    public boolean isCarfaxHeaderDisplayed() {
        return isElementDisplayed(CARFAX_HEADER);
    }

    public void clickCalculateBtn() {
        clickElementByXpath(CALCULATE_BTN);

    }

    public void pause() {
        try {
            Thread.sleep(6000);
        } catch (Exception error) {
            System.out.println("Smth went wrong");
        }
    }

    public boolean isMonthlyPaymentDisplayed() {
        String value = driver.findElement(By.xpath(MONTHLY_PAY_INPUT)).getAttribute("value");
        System.out.println(value);
        return !value.isBlank() && !value.isEmpty();
    }

    public void userPopulatesLessDownPayment(String text) {
        driver.findElement(By.xpath(DOWN_PAY_INPUT)).clear();
        driver.findElement(By.xpath(DOWN_PAY_INPUT)).sendKeys(text);
    }

    public void userPopulatesTradeIn(String text) {
        driver.findElement(By.xpath(TRADE_IN_INPUT)).clear();
        driver.findElement(By.xpath(TRADE_IN_INPUT)).sendKeys(text);

    }

    public boolean isErrorDialogDisplayed() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException Ex) {
            return false;
        }
    }

}
