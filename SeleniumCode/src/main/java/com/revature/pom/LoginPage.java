package com.revature.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //@FindBy(id="username")
    // @FindBy(css = "input[id='username']")
    @FindBy(xpath = "/html/body/form/input[1]")
    WebElement userName;

    //@FindBy(id="password")
   //@FindBy(css="input#password")
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    public void logMeIn(String username,String pwd){
        userName.sendKeys(username);
        password.sendKeys(pwd);
    }
}
