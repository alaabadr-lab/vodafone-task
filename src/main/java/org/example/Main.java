package org.example;
import Pages.CartScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.Home;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        Home homePage = new Home(driver);
        CartScreen screen = new CartScreen(driver);
        homePage.openHome("https://eshop.vodafone.com.eg/shop/home");
        homePage.clickWelcomeButton();
        homePage.clickFirstProduct();
        screen.clickAddToCart();
        driver.navigate().back();
        homePage.clickSecondProduct();
        screen.clickAddToCart();
        driver.quit();





        // CartScreen cartScreen = new CartScreen(driver);
       // cartScreen.clickAddToCart();
       // homePage.clickSecondProduct();
       // cartScreen.clickAddToCart();




        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}