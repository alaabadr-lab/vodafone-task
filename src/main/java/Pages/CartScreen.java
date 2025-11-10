package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CartScreen {

    WebDriver driver;
    WebDriverWait wait;


    By addToCartButtonFirst = By.xpath("//button[@class='cart' and @aria-label='Add iPhone 15 to cart']");
    By addToCartButtonSecond = By.xpath("//button[@class='cart' and @aria-label='Add Samsung Smart Phone A04 to cart']");


    public CartScreen(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(25));

    }

    public void clickAddToCartFirst() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(addToCartButtonFirst));
        button.click();
    }
    public void clickAddToCartSecond() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(addToCartButtonSecond));
        button.click();
    }
    public void clickCloseButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        WebElement closeButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.close-btn")));
        closeButton.click();

    }
    public void addSearchProductToCart() {
        WebElement cartBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Infinix Hot 50i')]")));
        cartBtn.click();
    }
}
