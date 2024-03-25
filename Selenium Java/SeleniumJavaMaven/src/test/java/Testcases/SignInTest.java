package Testcases;

import Base.BaseSetup;
import Base.Helper;
import Pages.SignInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignInTest extends BaseSetup {
    private WebDriver driver;
    private SignInPage signInPage;
    private Helper helper;
    @BeforeClass
    public void SetUp(){
        driver = getDriver();
    }
    @Test
    public void DN_01(){
        signInPage = new SignInPage(driver);
        helper = new Helper(driver);
        helper.clickElement(signInPage.Login);
        WebElement MsgUser = driver.findElement(signInPage.MsgUserName);
        Assert.assertEquals(MsgUser.getText(),"The UserName field is required.");
        WebElement MsgPass = driver.findElement(signInPage.MsgPassword);
        Assert.assertEquals(MsgPass.getText(),"The Password field is required.");
    }
    @Test
    public void DN_02(){
        signInPage = new SignInPage(driver);
        helper = new Helper(driver);
        helper.setText(signInPage.Password,"123456789");
        helper.clickElement(signInPage.Login);
        WebElement MsgUser = driver.findElement(signInPage.MsgUserName);
        Assert.assertEquals(MsgUser.getText(),"The UserName field is required.");
    }
    @Test
    public void DN_03(){
        signInPage = new SignInPage(driver);
        helper = new Helper(driver);
        helper.setText(signInPage.UserName,"dien");
        helper.clickElement(signInPage.Login);
        WebElement MsgPass = driver.findElement(signInPage.MsgPassword);
        Assert.assertEquals(MsgPass.getText(),"The Password field is required.");
    }
    @Test
    public void DN_04(){
        signInPage = new SignInPage(driver);
        helper = new Helper(driver);
        signInPage.SignIn("dien","123456789dd");
        WebElement MsgAcc = driver.findElement(signInPage.MsgAccount);
        Assert.assertEquals(MsgAcc.getText(),"Sai thông tin tài khoản");
    }
    @Test
    public void DN_05(){
        signInPage = new SignInPage(driver);
        helper = new Helper(driver);
        signInPage.SignIn("dien","123456789");
        Assert.assertEquals(driver.getCurrentUrl(),"https://localhost:44393/Admin/AdminHome?Areas=Admin");
    }
    @AfterClass
    public void Close() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
