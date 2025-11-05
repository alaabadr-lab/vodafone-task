package org.example;
import Pages.CartScreen;
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
        String previousUrl = "https://example.com/previous-page";

        String productName = "Infinix Hot 50i";


        Home homePage = new Home(driver);
        CartScreen screen = new CartScreen(driver);
        homePage.openHome("https://eshop.vodafone.com.eg/shop/home");
        homePage.clickWelcomeButton();

        homePage.closeCookiesBanner();

        homePage.clickMobilesCategory();

        screen.clickAddToCartFirst();

        screen.clickCloseButton();

        screen.clickAddToCartSecond();

        screen.clickCloseButton();

        homePage.searchProduct(productName);

        homePage.selectProductFromSearch(productName);

        screen.addSearchProductToCart();

        screen.clickCloseButton();


        // driver.quit();

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}