import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class LoginPage extends MainClass{
//    public static final String LOGIN_URL = "https://stanok-qa.ossystem.ua/ru/login";
//
//    By emailLocator = By.name("email");
//    By passwordLocator = By.xpath("//input[@name='password']");
//    By forgotPasswordLink = By.xpath("//a[text()='Забыли пароль?']");
//    By submitButtonLocator = By.xpath("//button[@type='submit']");
//
//    public LoginPage(WebDriver driver){
//        super(driver);
//    }
//
//    public LoginPage OpenLoginPage(){
//        this.openPage(LOGIN_URL);
//        return this;
//    }
//
//    public LoginPage typeEmail(String value) {
//        this.waitForElementAndSendKeys(emailLocator, value);
//        return this;
//    }
//
//    public LoginPage typePassword(String value) {
//        this.waitForElementAndSendKeys(passwordLocator, value);
//        return this;
//    }
//
//    public LoginPage submitForm(){
//        this.waitForElementPresentAndClick(submitButtonLocator);
//        return this;
//    }
//    public void validAuth(String emailValue, String passwordValue) {
//        this.typeEmail(emailValue);
//        this.typePassword(passwordValue);
//        this.submitForm();
//    }
//}
