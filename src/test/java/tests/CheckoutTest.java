package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.ProductPage;
import pages.SearchPage;

public class CheckoutTest extends BaseTest {

    @Test
    public void testProceedToCheckout() {
        // Search and add a product to cart
        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchProduct("iPhone 14");

        ProductPage productPage = new ProductPage(driver);
        productPage.selectFirstProduct();

        // Switch to new tab if needed
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        productPage.addToCart();

        // Proceed to checkout
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.goToCart();
        checkoutPage.proceedToCheckout();

        // Verify if checkout page is reached
        Assert.assertTrue(driver.getTitle().contains("Checkout"), "Failed to reach checkout page!");
    }
}
