package revature.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import revature.pages.LoginPage;

// The runner class "ties" the feature files with the step implementation classes that actually contain the automation
// code
@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = "revature.stepimplementations")

public class BasicRunner {
}
