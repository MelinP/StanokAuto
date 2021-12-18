import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPageTest {

   public WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @After
    public void turnDown() {
        driver.quit();
    }

    @Test
    public void typeEmailTest(){

        LoginPage LoginPage = new LoginPage(driver);

        LoginPage.OpenLoginPage();
        LoginPage.typeEmail("gef.ossystem+5@gmail.com");
        LoginPage.typePassword("123456Bd!");
        LoginPage.submitForm();
    }

    @Test
    public void testTest() {
        driver.get("http://google.com");
    }
}
