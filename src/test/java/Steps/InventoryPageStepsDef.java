package Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.InventoryPage;
import static org.junit.Assert.*;

public class InventoryPageStepsDef {

    InventoryPage inventoryPage;

    public InventoryPageStepsDef() {
        inventoryPage = new InventoryPage();
    }

    @When("User clicks year filter button")
    public void userClicksYearFilterButton() {
        inventoryPage.userClicksFilter(InventoryPage.YEAR_FILTER);
        inventoryPage.waitUntilListLoaded();
    }

    @Then("list should be filtered by selected year")
    public void listShouldBeFilteredBySelectedYear() {
        assertTrue(inventoryPage.isFilterBoxDisplayed());
        assertTrue(inventoryPage.isFilteredValueDisplayed(InventoryPage.FILTER_VALUE_2014));
        assertTrue(inventoryPage.isCarNameDisplayed());
        assertTrue(inventoryPage.isListFilteredByYear());
    }

    @When("User clicks Body Type filter")
    public void userClicksBodyTypeFilter() {
        inventoryPage.userClicksFilter(InventoryPage.BODY_TYPE_FILTER);
    }

    @Then("list should be filtered by selected body type")
    public void listShouldBeFilteredBySelectedBodyType() {
        assertTrue(inventoryPage.isFilterBoxDisplayed());
        assertTrue(inventoryPage.isFilteredValueDisplayed(InventoryPage.FILTER_VALUE_SEDAN));
        assertTrue(inventoryPage.isCarNameDisplayed());
    }

    @When("User clicks Make filter")
    public void userClicksMakeFilter() {
        inventoryPage.clickElementByXpath(InventoryPage.MAKE_FILTER);
        inventoryPage.waitUntilListLoaded();
    }

    @Then("list should be filtered by selected Make type")
    public void listShouldBeFilteredBySelectedMakeType() {
        assertTrue(inventoryPage.isFilterBoxDisplayed());
        assertTrue(inventoryPage.isFilteredValueDisplayed(InventoryPage.FILTER_VALUE_HONDA));
        assertTrue(inventoryPage.isCarNameDisplayed());
        assertTrue(inventoryPage.isListFilteredByMake());
    }

    @When("User clicks Engine filter")
    public void userClicksEngineFilter() {
        inventoryPage.clickElementByXpath(InventoryPage.ENGINE_FILTER);
    }

    @Then("list should be filtered by selected Engine type")
    public void listShouldBeFilteredBySelectedEngineType() {
        assertTrue(inventoryPage.isFilterBoxDisplayed());
        assertTrue(inventoryPage.isFilteredValueDisplayed(InventoryPage.FILTER_VALUE_4CYLINDER));
        assertTrue(inventoryPage.isCarNameDisplayed());

    }

    @When("User clicks Year sort button")
    public void userClicksYearSortButton() {
        inventoryPage.clickSortButton(InventoryPage.YEAR_SORT_BUTTON);
    }

    @Then("list should be sorted by Year")
    public void listShouldBeSortedByYear() {
        inventoryPage.waitUntilListLoaded();
        assertTrue(inventoryPage.isSortedByYear());
    }

    @When("User clicks Price sort button")
    public void userClicksPriceSortButton() {
        inventoryPage.clickSortButton(InventoryPage.PRICE_SORT_BUTTON);
        inventoryPage.clickSortButton(InventoryPage.PRICE_SORT_BUTTON);
    }

    @Then("list should be sorted by Price")
    public void listShouldBeSortedByPrice() {
        inventoryPage.waitUntilListLoaded();
        assertTrue(inventoryPage.isSortedByPrice());

    }

    @When("User clicks Make sort button")
    public void userClicksMakeSortButton() {
        inventoryPage.clickSortButton(InventoryPage.MAKE_SORT_BUTTON);
    }

    @Then("list should be sorted by Make")
    public void listShouldBeSortedByMake() {
        inventoryPage.waitUntilListLoaded();
        assertTrue(inventoryPage.isSortedByMake());
    }

    @When("User clicks Mileage sort button")
    public void userClicksMileageSortButton() {
        inventoryPage.clickSortButton(InventoryPage.MILEAGE_SORT_BUTTON);
    }

    @Then("list should be sorted by Mileage")
    public void listShouldBeSortedByMileage() {
        inventoryPage.waitUntilListLoaded();
        assertTrue(inventoryPage.isSortedByMileage());

    }
}
