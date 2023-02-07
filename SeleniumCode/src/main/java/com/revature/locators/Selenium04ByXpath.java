package com.revature.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium04ByXpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://127.0.0.1:5500/login/login.html");

        //WebElement userName=driver.findElement(By.xpath("//input[@type='text']"));
        //WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));
        WebElement userName=driver.findElement(By.xpath("/html/body/form/input[1]"));
        userName.sendKeys("somenameAgain");

        //WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
        WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
        pass.sendKeys("pass");

        Thread.sleep(10000);

        driver.close();

    }
}
