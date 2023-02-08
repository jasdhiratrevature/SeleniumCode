package com.revature.locators;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTitle {
    // AAA
    // Arrange: setup whatever is necessary for you to perform the actions
    // Act: perform the actions to elicit a result
    // Assert: compare the result (actual) with what you expect
    public WebDriver driver;

    // The typical purpose of a method annotated with @BeforeMethod is to set up whatever is required for running the test case
    @BeforeEach
    public void setUp(){
        // Arange
        driver=new ChromeDriver();
    }
    @AfterEach
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
        Assertions.assertEquals("Login",pageTitle);
    }
}
