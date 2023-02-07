package com.revature.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium03ByCSS {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://127.0.0.1:5500/login/login.html");

        WebElement userName=driver.findElement(By.cssSelector("input[id='username']"));
        userName.sendKeys("jasdhir");
        WebElement pass=driver.findElement(By.cssSelector("input#password"));
        pass.sendKeys("singh");

        Thread.sleep(10000);

        driver.close();
    }
}
