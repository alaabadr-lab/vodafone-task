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
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(25));
    }

    public void openHome(String url) {
        driver.get(url);
    }
    public void clickWelcomeButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#home-button-1")));
        button.click();
    }
    public void closeCookiesBanner() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.onetrust-close-btn-handler[aria-label='Close']")));
        closeButton.click();
    }

    public void clickMobilesCategory() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        WebElement mobilesCategory = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='category-card' and @aria-label='Category: Mobiles']")));
        mobilesCategory.click();
    }

    public void searchProduct(String productName) {
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchInput']")));
        searchBox.clear();
        searchBox.sendKeys(productName);
    }
    public void selectProductFromSearch(String productName) {
        WebElement productItem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Infinix Hot 50i Bundle + Infinix XE23 True Wireless']")));
        productItem.click();
    }




}
