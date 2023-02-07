package com.revature.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginMain {
    static WebDriver driver;
    public static void main(String[] args) {
    driver=new ChromeDriver();
    driver.get("http://127.0.0.1:5500/login/login.html");

    // Create object of Login Page
        LoginPage loginPage= PageFactory.initElements(driver,LoginPage.class);

        loginPage.logMeIn("jasdhirxpath","singh");

        //driver.close();
    }
}
