package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By accept = By.id("sp-cc-accept");
    static By search = By.id("twotabsearchtextbox");
    static By searchButton = By.id("nav-search-submit-button");
    static By clickFilter = By.xpath("//*[@id=\"p_98/21345978031\"]/span/a/div/label/i");
    static By appleFilter = By.xpath("//*[@id=\"p_123/110955\"]/span/a/span");
    static By firstProduct = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/span/div/div/div[2]/span/a/div/img");
    static By basket = By.xpath("//*[@id=\"add-to-cart-button\"]");
    static By checkBasket = By.cssSelector("#nav-cart");


    public AmazonPages(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);

    }


    public static void HomePage() {

    }

    public static void acceptCookies() {
        elementHelper.click(accept);
    }

    public static void clickSearch() {
        elementHelper.click(search);
    }

    public static void writeProduct() {
        elementHelper.findElement(search).sendKeys("airpods");
    }

    public static void clickSearchButton() {
        elementHelper.click(searchButton);
    }

    public static void filterAmazon() {
        elementHelper.click(clickFilter);
    }

    public static void filterApple() {
        elementHelper.click(appleFilter);
    }

    public static void clickFirstProduct() {
        elementHelper.click(firstProduct);
    }

    public static void addBasket() {
        elementHelper.click(basket);
    }

    public static void checkBasket() {
        elementHelper.click(checkBasket);
    }
}
