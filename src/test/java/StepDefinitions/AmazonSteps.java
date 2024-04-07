package StepDefinitions;

import Pages.AmazonPages;
import Util.DriverFac;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AmazonSteps {
    WebDriver driver = DriverFac.getDriver();
    AmazonPages amazonPages = new AmazonPages(driver);
    @Given("User is on homepage")
    public void userIsOnHomepage() {
        AmazonPages.HomePage();
    }

    @When("Click accept cookies")
    public void clickAcceptCookies() {
        AmazonPages.acceptCookies();
    }

    @When("Click to search box")
    public void clickToSearchBox() {
        AmazonPages.clickSearch();
    }

    @When("Write to product name")
    public void writeToProductName() {
        AmazonPages.writeProduct();
    }

    @When("Click to search button")
    public void clickToSearchButton() {
        AmazonPages.clickSearchButton();
    }

    @When("Filter for Shipped by Amazon")
    public void filterForShippedByAmazon() {
        AmazonPages.filterAmazon();
    }

    @When("Filter for Apple")
    public void filterForApple() {
        AmazonPages.filterApple();
    }

    @When("Click to first product")
    public void clickToFirstProduct() {
        AmazonPages.clickFirstProduct();
    }

    @When("Add to Basket")
    public void addToBasket() {
        AmazonPages.addBasket();
    }

    @When("Check at basket page")
    public void checkAtBasketPage() {
        AmazonPages.checkBasket();
    }
}
