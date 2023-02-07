package com.revature.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium01Basic {
    public static void main(String[] args) {
        // Step 1 : Set up the webdriver
       /* String driverPath="C:\\WebDrivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);*/

        /*
        With latest version 4.6, Selenium Manager will configure the required browser drivers
        for Chrome, Firefox, and Edge if they are not present on the PATH.
        Hence the above 2 lines of code is not needed
        */
        WebDriver driver = new ChromeDriver();

        // Step 2 : Open the web page on the Chrome browser
        driver.get("http://127.0.0.1:5500/login/login.html");

        // Step 3: Perform operations
        // Get the Page Title
        String pageTitle=driver.getTitle();
        System.out.println("Page Title is : "+pageTitle);

        // Get the URL
        String pageURL=driver.getCurrentUrl();
        System.out.println("Page Accessed from this URL : "+pageURL);

        //close() closes only the current window on which Selenium is running automated tests
        driver.close();

        //quit() method closes all browser windows and ends the WebDriver session
        //driver.quit();
    }
}
