package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ProductPage {
    private WebDriver driver;

    // Locators
    private By productResults = By.cssSelector(".s-main-slot .s-result-item"); // Selects all search results
    private By addToCartButton = By.id("add-to-cart-button");

    // Constructor
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void selectFirstProduct() {
        List<WebElement> products = driver.findElements(productResults);
        if (!products.isEmpty()) {
            products.get(0).click(); // Click on the first product
        }
    }

    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }
}
