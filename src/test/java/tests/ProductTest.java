package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductPage;
import pages.SearchPage;

public class ProductTest extends BaseTest {

    @Test
    public void testAddProductToCart() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchProduct("iPhone 14");

        ProductPage productPage = new ProductPage(driver);
        productPage.selectFirstProduct();

        // Switch to the new tab if product opens in a new tab
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        productPage.addToCart();

        // Verify if product is added to cart
        Assert.assertTrue(driver.getPageSource().contains("Added to Cart"), "Product was not added to cart!");
    }
}
