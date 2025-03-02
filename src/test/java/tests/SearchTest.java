package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchPage;

public class SearchTest extends BaseTest {

    @Test
    public void testProductSearch() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchProduct("iPhone 14");

        // Verify that results are displayed
        Assert.assertTrue(driver.getTitle().contains("iPhone 14"), "Search results not displayed!");
    }
}
