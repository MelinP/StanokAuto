import org.openqa.selenium.By;

public class LoginPage extends MainClass{
    public static final String LOGIN_URL = "https://stanok-qa.ossystem.ua/ru/login";

    By emailLocator = By.name("name");
    By passwordLocator = By.xpath("//input[@name='password']");
    By forgotPasswordLink = By.xpath("//a[text()='Забыли пароль?']");
    By submitButtonLocator = By.xpath("//button[@type='submit']");

    public void OpenLoginPage(){
        this.openPage(LOGIN_URL);
    }

    public void typeEmail(String value) {
        this.waitForElementAndSendKeys(emailLocator, value);
    }

    public void typePassword(String value) {
        this.waitForElementAndSendKeys(passwordLocator, value);
    }

    public void submitForm(){

        this.waitForElementPresentAndClick(submitButtonLocator);
    }
}
