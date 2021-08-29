import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigateRootPage {

@Test
    public void init() {

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\GitHub\\automation-qa\\drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://pikabu.ru");


   }








}
