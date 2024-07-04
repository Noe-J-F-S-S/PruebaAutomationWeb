package com.nttdata.steps;

import com.nttdata.page.LoginShoppingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShoppingCartSteps {
    WebDriver driver;
//    LoginShoppingPage page;
    private WebDriverWait wait;
    private String url = "https://qalab.bensg.com/store/en/login";

    public ShoppingCartSteps(WebDriver driver){
        this.driver = driver;
//        page = new LoginShoppingPage(driver);
    }

    public void navegarA(){
        driver.get(url);
    }

//    public void navegarALogin(){
//        page.clickEnSignIn();
//    }
    public void typeUser (String user){
        WebElement userInputElement = driver.findElement(LoginShoppingPage.userInput);
        userInputElement.sendKeys(user);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginShoppingPage.loginButton));
    }
    public void typePassword(String password){
        this.driver.findElement(LoginShoppingPage.passInput).sendKeys(password);
    }

    public void login(){
        this.driver.findElement(LoginShoppingPage.loginButton).click();

    }
}
