package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BasePage {
    protected WebDriver driver;
    public static final String BASE_URL =
            System.getProperty("selenium.url", "https://ancient-taiga-22967.herokuapp.com");

    public BasePage(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void visit(String url) {
        driver.get(url);
    }

    public WebElement find(By locator) {
        return driver.findElement(locator);
    }


    public WebElement find(String cssSelector) {

        return find(By.cssSelector(cssSelector));
    }
}
