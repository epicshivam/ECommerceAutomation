package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    private WebDriver driver;

    // Locators
    private By searchBox = By.id("twotabsearchtextbox"); // Amazon search box ID
    private By searchButton = By.id("nav-search-submit-button"); // Amazon search button ID

    // Constructor
    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void searchProduct(String productName) {
        WebElement searchInput = driver.findElement(searchBox);
        searchInput.clear();
        searchInput.sendKeys(productName);
        driver.findElement(searchButton).click();
    }
}
