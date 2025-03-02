package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("your-email@example.com", "your-password");

        // Assertion to verify login success
        String expectedUrl = "https://www.amazon.in/";  // Modify based on post-login URL
        Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl), "Login failed!");
    }
}
