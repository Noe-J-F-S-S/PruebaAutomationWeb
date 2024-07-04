package com.nttdata.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginShoppingPage {
    private WebDriver driver ;
    //private By botonALogin = By.xpath("//span[@class=\"hidden-sm-down\"]");
    public static By userInput = By.xpath("//input[@id='field-email']");
    public static By passInput = By.xpath("//input[@id='field-password']");
    public static By loginButton = By.xpath("//button[@id='submit-login']");
    //private WebDriverWait wait;

//    public LoginShoppingPage(WebDriver driver) {
//        this.driver = driver;
//        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//    }

//    public void login(String username, String password){
//        driver.findElement(userInput).sendKeys(username);
//        driver.findElement(passInput).sendKeys(password);
//        driver.findElement(loginButton).click();
//    }

//    public void clickEnSignIn() {
//        wait.until(ExpectedConditions.elementToBeClickable(pagebotonALogin));
//        WebElement clickbotonSignIN =  driver.findElement(botonALogin);
//        clickbotonSignIN.click();
//    }

}
