package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Double.parseDouble;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

public class InventoryPage extends BasePage {
    public final static String YEAR_FILTER = "//a[text()='2014']";
    public final static String REFINE_SEARCH_TITLE = "//div[@class='hidden-xs b fn filter-heading']";
    public final static String FILTER_VALUE_2014 = "//span[text()='2014']";
    public final static String BODY_TYPE_FILTER = "//a[text()='Sedan']";
    public final static String FILTER_VALUE_SEDAN = "//span[text()='Sedan']";
    public final static String CAR_NAME = "//*[@class='eziVehicleName']";
    public final static String CAR_PRICE = "//*[@class='eziPriceValue']";
    public final static String MAKE_FILTER = "//a[text()='Honda']";
    public final static String FILTER_VALUE_HONDA = "//span[text()='Honda']";
    public final static String ENGINE_FILTER = "//a[text()='4 Cylinder Engine']";
    public final static String FILTER_VALUE_4CYLINDER = "//span[text()='4 Cylinder Engine']";
    public final static String YEAR_SORT_BUTTON = "(//*[@tabindex='-1'])[1]";
    public final static String PRICE_SORT_BUTTON = "(//*[@tabindex='-1'])[4]";
    public final static String MAKE_SORT_BUTTON = "(//*[@tabindex='-1'])[2]";
    public final static String MILEAGE_SORT_BUTTON = "(//*[@tabindex='-1'])[5]";
    public final static String CAR_MILEAGE = "//*[contains(text(),'Odometer')]//following-sibling::*[contains(text(),',')]";


    public void userClicksFilter(String filter) {
        clickElementByXpath(filter);

    }

    public boolean isFilterBoxDisplayed() {
        return isElementDisplayed(REFINE_SEARCH_TITLE);
    }

    public boolean isFilteredValueDisplayed(String fltrValue) {
        return isElementDisplayed(fltrValue);
    }

    public boolean isCarNameDisplayed() {
        return isElementDisplayed(CAR_NAME);
    }

    public boolean isListFilteredByYear() {
        String str = driver.findElement(By.xpath(CAR_NAME)).getText();
        String year1 = str.substring(0, 4);
            int y1 = parseInt(year1);
            if (y1 != 2014) {
                return false;
            }
        return true;
    }
    public boolean isListFilteredByMake() {
        String str = driver.findElement(By.xpath(CAR_NAME)).getText();
        String make = str.substring(5, 10);
        if (!make.equals("Honda")) {
            return false;
        }
        return true;
    }

    public void clickSortButton(String xpath) {
        clickElementByXpath(xpath);
    }

    public void waitUntilListLoaded() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CAR_NAME)));
    }

    public boolean isSortedByYear() {
        boolean isSorted = true;
        List<WebElement> titles = driver.findElements(By.xpath(CAR_NAME));

        for (int i = 0; i <= 3; i++) {
            String str = titles.get(i).getText();
            String year1 = str.substring(0, 4);
            int y1 = parseInt(year1);
            String str2 = titles.get(i + 1).getText();
            String year2 = str2.substring(0, 4);
            int y2 = parseInt(year2);
            if (y1 < y2) {
                return false;
            }
        }
        return isSorted;

    }

    public boolean isSortedByPrice() {
        List<WebElement> titles = driver.findElements(By.xpath(CAR_PRICE));
        for (int i = 0; i <= 3; i++) {
            String str = titles.get(i).getText();
            String price1 = str.substring(1, 6).replace(",", "");
            int y1 = parseInt(price1);
            String str2 = titles.get(i + 1).getText();
            String price2 = str2.substring(1, 6).replace(",", "");
            int y2 = parseInt(price2);
            System.out.println(y1 + "; " + y2);
            if (y1 < y2) {
                return false;
            }
        }
        return true;
    }

    public boolean isSortedByMake() {
        boolean isSorted = true;
        List<WebElement> titles = driver.findElements(By.xpath(CAR_NAME));

        for (int i = 0; i <= 3; i++) {
            String str = titles.get(i).getText();
            String make1 = str.substring(5, 9);
            String str2 = titles.get(i + 1).getText();
            String make2 = str2.substring(5, 9);
            System.out.println(make1 + "; " + make2);
            if (make1.compareTo(make2) > 0) {
                return false;
            }

        }
        return isSorted;
    }

    public boolean isSortedByMileage() {
        List<WebElement> titles = driver.findElements(By.xpath(CAR_MILEAGE));
        for (int i = 0; i <= 3; i++) {
            String str = titles.get(i).getText();
            String mil1 = str.substring(0, 6).replace(",", "");
            long y1 = parseLong(mil1);
            String str2 = titles.get(i + 1).getText();
            String mil2 = str2.substring(0, 6).replace(",", "");
            long y2 = parseLong(mil2);
            System.out.println(y1 + "; " + y2);
            if (y1 > y2) {
                return false;
            }
        }
        return true;
    }
}



