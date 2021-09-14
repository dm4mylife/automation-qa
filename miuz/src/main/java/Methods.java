import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.openqa.selenium.interactions.Actions;

public class Methods {


    WebDriver driver;
    Actions actions = new Actions(driver);
    String rootPage = "https://miuz.ru";

    public void goTo(String url) {
        driver.get(url);
    }

    public void click(String locator) {
        driver.findElement(By.cssSelector(locator)).click();
    }

    public void sendKeys(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }

    public String getText(String locator) {
        return driver.findElement(By.cssSelector(locator)).getText();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public boolean isElementsPresented(String locator) {
        return driver.findElements(By.cssSelector(locator)).size() > 0;
    }

    public void isElementHighlighted(String selector) {
        WebElement locator = driver.findElement(By.cssSelector(selector));
        
        actions.moveToElement(locator).build().perform();

    }

}
