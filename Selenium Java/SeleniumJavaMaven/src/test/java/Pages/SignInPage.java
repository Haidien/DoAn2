package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    WebDriver driver;
    public SignInPage(WebDriver driver){
        this.driver = driver;
    }
    public By UserName = By.xpath("//input[@id='UserName']");
    public By MsgUserName = By.xpath("//span[normalize-space()='The UserName field is required.']");
    public By Password = By.xpath("//input[@id='Password']");
    public By MsgPassword = By.xpath("//span[normalize-space()='The Password field is required.']");
    public By MsgAccount = By.xpath("//p[@class='text-danger']");
    public By Login = By.xpath("//input[@value='Login']");
    public void SignIn(String userValue, String passValue){
        driver.findElement(UserName).sendKeys(userValue);
        driver.findElement(Password).sendKeys(passValue);
        driver.findElement(Login).click();
    }
}
