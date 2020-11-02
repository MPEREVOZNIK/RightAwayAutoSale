package pages;

import org.openqa.selenium.By;

public class MainPage extends BasePage {

    public final static String ABOUT_US = "//a[text()='About Us']";
    public final static String CONTACT_US = "//a[text()='Contact Us']";
    public final static String CONTACT_US_TITLE = "//h1[text()=' Contact Us  ']";
    public final static String ABOUT_US_TITLE = "//h1[text()=' About Us  ']";
    public final static String INVENTORY_BUTTON = "//a[text()='Inventory']";
    public final static String INVENTORY_TITLE = "//h1[text()=' View Inventory ']";

    public void navigateToMainPage(String url) {
        driver.get(url);

    }

    public boolean isTitleDisplayed(String pageTitle) {
        return isElementDisplayed(pageTitle);
    }

    public void userClicks(String button) {
        driver.findElement(By.xpath(button)).click();

    }
}
