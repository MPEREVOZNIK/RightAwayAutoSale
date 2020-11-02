package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DetailsPage;
import pages.InventoryPage;
import pages.MainPage;

import static org.junit.Assert.assertTrue;

public class MainPageStepsDef {

    private MainPage mainPage;
    private InventoryPage inventoryPage;
    private DetailsPage detailsPage;

    public MainPageStepsDef(){
        mainPage= new MainPage();
    }

    @Given("User navigates to {string} page")
    public void userNavigatesToMainPage(String url) {
        mainPage.navigateToMainPage(url);

    }
    @When("User clicks About Us button")
    public void userClicksAboutUsButton() {
        mainPage.userClicks(MainPage.ABOUT_US);
    }

    @Then("About Us page should be displayed")
    public void aboutUsPageShouldBeDisplayed() {
        assertTrue(mainPage.isTitleDisplayed(MainPage.ABOUT_US_TITLE));
    }

    @When("User clicks Contact Us button")
    public void userClicksContactUsButton() {
        mainPage.userClicks(MainPage.CONTACT_US);
    }

    @Then("Contact Us page should be displayed")
    public void contactUsPageShouldBeDisplayed() {
        assertTrue(mainPage.isTitleDisplayed(MainPage.CONTACT_US_TITLE));
    }

    @When("User clicks Inventory button")
    public void userClicksInventoryButton() {
        mainPage.userClicks(MainPage.INVENTORY_BUTTON);
    }

    @Then("Inventory page should be displayed")
    public void inventoryPageShouldBeDisplayed() {
        assertTrue(mainPage.isTitleDisplayed(MainPage.INVENTORY_TITLE));
    }

}
