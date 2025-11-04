package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.WebDriver;

public class Home {

    WebDriver driver;
    WebDriverWait wait;

    public Home(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void openHome(String url) {
        driver.get(url);
    }
    public void clickWelcomeButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#home-button-2")));
        button.click();
    }

    public void clickFirstProduct() {
        WebElement firstProduct = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@class='cart' and @aria-label='Add Samsung Galaxy A26 5G Smart Phone (6/128) to cart']")));
        firstProduct.click();
    }
    public void clickSecondProduct() {
        WebElement secondProduct = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//button[@class='cart' and @type='button' and contains(@aria-label,'Samsung Galaxy A36')]")));
        secondProduct.click();



    }




}
