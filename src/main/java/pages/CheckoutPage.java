package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private WebDriver driver;

    // Locators
    private By cartButton = By.id("nav-cart");
    private By proceedToCheckoutButton = By.name("proceedToRetailCheckout");

    // Constructor
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void goToCart() {
        driver.findElement(cartButton).click();
    }

    public void proceedToCheckout() {
        driver.findElement(proceedToCheckoutButton).click();
    }
}
