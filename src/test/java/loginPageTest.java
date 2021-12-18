import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPageTest {

    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void typeEmailTest(){


        LoginPage LoginPage = new LoginPage();

        LoginPage.OpenLoginPage();
        LoginPage.typeEmail("test@email.com");
        LoginPage.typePassword("1234556");
        LoginPage.submitForm();
    }

    @Test
    public void testTest() {
        driver.get("http://google.com");
    }
}
