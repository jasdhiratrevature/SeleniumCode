package com.revature.runners;

import com.revature.pages.LoginPage;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

// The runner class "ties" the feature files with the step implementation classes that actually contain the automation
// code
@CucumberOptions(features = "classpath:features", glue = "com.revature.stepimplementations")
public class BasicRunner extends AbstractTestNGCucumberTests {

    public static WebDriver driver;
    public static LoginPage loginPage;

    @BeforeMethod // This method will run before each Cucumber scenario
    public void setup() {

        driver = new ChromeDriver();

        loginPage = new LoginPage(driver);
    }

    @AfterMethod // This method will run after each Cucumber scenario
    public void cleanup() {
        driver.quit();
    }
}
