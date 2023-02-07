package com.revature.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium02ById {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.get("http://127.0.0.1:5500/login/login.html");

        WebElement userName=driver.findElement(By.id("username"));
        WebElement password=driver.findElement(By.id("password"));
        userName.sendKeys("username");
        password.sendKeys("password");

        WebElement submitButton=driver.findElement(By.tagName("button"));
        submitButton.click();

        //Thread.sleep(10000);

       driver.close();

    }
}
