package com.revature.locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTitle {
    // AAA
    // Arrange: setup whatever is necessary for you to perform the actions
    // Act: perform the actions to elicit a result
    // Assert: compare the result (actual) with what you expect
    public WebDriver driver;

    // The typical purpose of a method annotated with @BeforeMethod is to set up whatever is required for running the test case
    @BeforeMethod
    public void setUp(){
        // Arange
        driver=new ChromeDriver();
    }
    @AfterMethod
    // The typical purpose of a method annotated with @AfterMethod is to clean up whatever resources we were using for
    // the test case that was just executed
    public void quitOutOfWebDriver() {
        // Cleanup
        driver.quit();
    }

    @Test
    public void testPageTitle(){
        // Act
        driver.get("http://127.0.0.1:5500/login/login.html");
        String pageTitle=driver.getTitle();

        // Assert
        Assert.assertEquals("Login",pageTitle);
    }
}
