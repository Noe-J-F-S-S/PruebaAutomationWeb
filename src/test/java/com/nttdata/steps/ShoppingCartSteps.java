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
    public void navegarCategoria(String categoria, String subcategoria){
        WebElement category = driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]"));
        category.click();
        WebElement subcategory = driver.findElement(By.xpath("//body/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]"));
        subcategory.click();
    }

    public void agregarProducto (int cantidad){
        WebElement elegirproducto = driver.findElement(By.xpath("//body/main[1]/section[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[3]/div[1]/div[1]/article[1]/div[1]/div[1]/a[1]/picture[1]/img[1]"));
        elegirproducto.click();
        WebElement agregarCarrito = driver.findElement(By.xpath("//body/main[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/button[1]"));
        agregarCarrito.click();

//        WebElement cantidadIntput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/main[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/span[3]/button[1]/i[1]\n")));
//        cantidadIntput.click();

    }
}
