import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.time.Duration;


public class Tests {


    private final Methods baseActions = new Methods();



    // -----------------@Tests-----------------

    @Test
    public void isTelephoneHighlighted() {

    baseActions.isElementHighlighted("a[href=\'tel:88001001920\']");


    }







    @Test
    public void isSiteAlive() {

        baseActions.goTo(baseActions.rootPage);
        Assert.assertEquals(baseActions.getCurrentUrl(), baseActions.rootPage);


    }


    @Test
    public void authorizationUser() {

        baseActions.click("a[href='/auth/']");
        baseActions.sendKeys(".enter__field [name='USER_LOGIN']","n.biryukov@studiofact.ru");
        baseActions.sendKeys(".enter__field [name='USER_PASSWORD']","250491");
        baseActions.click("[name='form_auth'] button._red");
        String heading = baseActions.getText("h1");
        Assert.assertEquals(heading,"Вы зарегистрированы и успешно авторизовались");

    }
    @Test
    public void search() {

        baseActions.sendKeys("#search_textbox_input_top","кольцо" + Keys.ENTER);
        Assert.assertEquals(baseActions.isElementsPresented("a.product"),true);

    }












    








// ---------------@BeforeMethod------------------------

    @BeforeMethod
    public void setUp() {

        System.setProperty("webdriver.chrome.driver","C:\\work\\automation-qa\\drivers\\chromedriver.exe");
        baseActions.driver = new ChromeDriver();
        baseActions.goTo(baseActions.rootPage);
        baseActions.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        baseActions.driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        baseActions.driver.quit();
    }


    public Methods getBaseActions() {
        return baseActions;
    }
}
