package Testcases;

import Base.BaseSetup;
import Base.Helper;
import Pages.KhachHangPage;
import Pages.MatHangPage;
import Pages.SignInPage;
import Pages.TheLoaiHangPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.*;

public class ThemKHTest extends BaseSetup {
    private WebDriver driver;
    private SignInPage signInPage;
    private KhachHangPage khachHangPage;
    private Helper helper;


    @BeforeClass
    public void SetUp(){
        driver = getDriver();
    }
    @BeforeClass
    public void SignIn(){
        signInPage = new SignInPage(driver);
        khachHangPage = new KhachHangPage(driver);
        helper = new Helper(driver);
        signInPage.SignIn("dien","123456789");
        Assert.assertEquals(driver.getCurrentUrl(),"https://localhost:44393/Admin/AdminHome?Areas=Admin");
    }

    @Test
    public void TKH_01(){
        helper.clickElement(khachHangPage.KhachHangNav);
        WebElement DanhSachText = driver.findElement(khachHangPage.DanhSachKHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Khách Hàng");
        helper.clickElement(khachHangPage.ThemKH);
        WebElement ThemKHText = driver.findElement(khachHangPage.ThemKHText);
        Assert.assertEquals(ThemKHText.getText(),"Thêm thông tin một khách hàng mới");
        helper.setText(khachHangPage.TenKH,"ThaiTuan");
        helper.setText(khachHangPage.SDT,"12345678900");
        helper.setText(khachHangPage.DiaChi1,"abc");
        helper.setText(khachHangPage.DiaChi2,"abc123");
        helper.setText(khachHangPage.Email,"thaituan@123");
        helper.setText(khachHangPage.NgaySinh,"9/29/2001");
        helper.setText(khachHangPage.UserName,"tuankute");
        helper.setText(khachHangPage.Password,"ahihituanne");
        helper.clickElement(khachHangPage.Create);
        WebElement TimKH = driver.findElement(khachHangPage.TimKH);
        helper.setText(khachHangPage.TimKH,"ThaiTuan");
        TimKH.submit();
        WebElement Ten = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]"));
        Assert.assertEquals(Ten.getText(),"ThaiTuan");
        WebElement SDT = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]"));
        Assert.assertEquals(SDT.getText(),"12345678900");
        WebElement DiaChi = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]"));
        Assert.assertEquals(DiaChi.getText(),"abc");
        WebElement Email = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/a[1]"));
        Assert.assertEquals(Email.getText(),"thaituan@123");
    }
    @Test
    public void TKH_02(){
        helper.clickElement(khachHangPage.KhachHangNav);
        WebElement DanhSachText = driver.findElement(khachHangPage.DanhSachKHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Khách Hàng");
        helper.clickElement(khachHangPage.ThemKH);
        WebElement ThemKHText = driver.findElement(khachHangPage.ThemKHText);
        Assert.assertEquals(ThemKHText.getText(),"Thêm thông tin một khách hàng mới");
        helper.setText(khachHangPage.SDT,"12345678900");
        helper.setText(khachHangPage.DiaChi1,"abc");
        helper.setText(khachHangPage.DiaChi2,"abc123");
        helper.setText(khachHangPage.Email,"thaituan@123");
        helper.setText(khachHangPage.NgaySinh,"9/29/2001");
        helper.setText(khachHangPage.UserName,"tuankute");
        helper.setText(khachHangPage.Password,"ahihituanne");
        helper.clickElement(khachHangPage.Create);
        WebElement MsgTenKH = driver.findElement(khachHangPage.MsgTenKH);
        Assert.assertEquals(MsgTenKH.getText(),"The TenKH field is required.");
    }
    @Test
    public void TKH_03(){
        helper.clickElement(khachHangPage.KhachHangNav);
        WebElement DanhSachText = driver.findElement(khachHangPage.DanhSachKHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Khách Hàng");
        helper.clickElement(khachHangPage.ThemKH);
        WebElement ThemKHText = driver.findElement(khachHangPage.ThemKHText);
        Assert.assertEquals(ThemKHText.getText(),"Thêm thông tin một khách hàng mới");
        helper.setText(khachHangPage.TenKH,"ThaiTuan");
        helper.setText(khachHangPage.DiaChi1,"abc");
        helper.setText(khachHangPage.DiaChi2,"abc123");
        helper.setText(khachHangPage.Email,"thaituan@123");
        helper.setText(khachHangPage.NgaySinh,"9/29/2001");
        helper.setText(khachHangPage.UserName,"tuankute");
        helper.setText(khachHangPage.Password,"ahihituanne");
        helper.clickElement(khachHangPage.Create);
        WebElement MsgSDT = driver.findElement(khachHangPage.MsgSDT);
        Assert.assertEquals(MsgSDT.getText(),"The SDT field is required.");
    }
    @Test
    public void TKH_04(){
        helper.clickElement(khachHangPage.KhachHangNav);
        WebElement DanhSachText = driver.findElement(khachHangPage.DanhSachKHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Khách Hàng");
        helper.clickElement(khachHangPage.ThemKH);
        WebElement ThemKHText = driver.findElement(khachHangPage.ThemKHText);
        Assert.assertEquals(ThemKHText.getText(),"Thêm thông tin một khách hàng mới");
        helper.setText(khachHangPage.TenKH,"ThaiTuan");
        helper.setText(khachHangPage.SDT,"12345678900");
        helper.setText(khachHangPage.DiaChi2,"abc123");
        helper.setText(khachHangPage.Email,"thaituan@123");
        helper.setText(khachHangPage.NgaySinh,"9/29/2001");
        helper.setText(khachHangPage.UserName,"tuankute");
        helper.setText(khachHangPage.Password,"ahihituanne");
        helper.clickElement(khachHangPage.Create);
        WebElement MsgDiaChi1 = driver.findElement(khachHangPage.MsgDiaChi1);
        Assert.assertEquals(MsgDiaChi1.getText(),"The DiaChiGiaoHang1 field is required.");
    }
    @Test
    public void TKH_05(){
        helper.clickElement(khachHangPage.KhachHangNav);
        WebElement DanhSachText = driver.findElement(khachHangPage.DanhSachKHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Khách Hàng");
        helper.clickElement(khachHangPage.ThemKH);
        WebElement ThemKHText = driver.findElement(khachHangPage.ThemKHText);
        Assert.assertEquals(ThemKHText.getText(),"Thêm thông tin một khách hàng mới");
        helper.setText(khachHangPage.TenKH,"ThaiTuan");
        helper.setText(khachHangPage.SDT,"12345678900");
        helper.setText(khachHangPage.DiaChi1,"abc");
        helper.setText(khachHangPage.Email,"thaituan@123");
        helper.setText(khachHangPage.NgaySinh,"9/29/2001");
        helper.setText(khachHangPage.UserName,"tuankute");
        helper.setText(khachHangPage.Password,"ahihituanne");
        helper.clickElement(khachHangPage.Create);
        WebElement MsgDiaChi2 = driver.findElement(khachHangPage.MsgDiaChi2);
        Assert.assertEquals(MsgDiaChi2.getText(),"The DiaChiGiaoHang2 field is required.");
    }
    @Test
    public void TKH_06(){
        helper.clickElement(khachHangPage.KhachHangNav);
        WebElement DanhSachText = driver.findElement(khachHangPage.DanhSachKHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Khách Hàng");
        helper.clickElement(khachHangPage.ThemKH);
        WebElement ThemKHText = driver.findElement(khachHangPage.ThemKHText);
        Assert.assertEquals(ThemKHText.getText(),"Thêm thông tin một khách hàng mới");
        helper.setText(khachHangPage.TenKH,"ThaiTuan");
        helper.setText(khachHangPage.SDT,"12345678900");
        helper.setText(khachHangPage.DiaChi1,"abc");
        helper.setText(khachHangPage.DiaChi2,"abc123");
        helper.setText(khachHangPage.NgaySinh,"9/29/2001");
        helper.setText(khachHangPage.UserName,"tuankute");
        helper.setText(khachHangPage.Password,"ahihituanne");
        helper.clickElement(khachHangPage.Create);
        WebElement MsgEmail = driver.findElement(khachHangPage.MsgEmail);
        Assert.assertEquals(MsgEmail.getText(),"The Email field is required.");
    }
    @Test
    public void TKH_07(){
        helper.clickElement(khachHangPage.KhachHangNav);
        WebElement DanhSachText = driver.findElement(khachHangPage.DanhSachKHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Khách Hàng");
        helper.clickElement(khachHangPage.ThemKH);
        WebElement ThemKHText = driver.findElement(khachHangPage.ThemKHText);
        Assert.assertEquals(ThemKHText.getText(),"Thêm thông tin một khách hàng mới");
        helper.setText(khachHangPage.TenKH,"ThaiTuan");
        helper.setText(khachHangPage.SDT,"12345678900");
        helper.setText(khachHangPage.DiaChi1,"abc");
        helper.setText(khachHangPage.DiaChi2,"abc123");
        helper.setText(khachHangPage.Email,"thaituan@123");
        helper.setText(khachHangPage.UserName,"tuankute");
        helper.setText(khachHangPage.Password,"ahihituanne");
        helper.clickElement(khachHangPage.Create);
        WebElement MsgNgaySinh = driver.findElement(khachHangPage.MsgNgaySinh);
        Assert.assertEquals(MsgNgaySinh.getText(),"The NgaySinh field is required.");
    }
    @Test
    public void TKH_08(){
        helper.clickElement(khachHangPage.KhachHangNav);
        WebElement DanhSachText = driver.findElement(khachHangPage.DanhSachKHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Khách Hàng");
        helper.clickElement(khachHangPage.ThemKH);
        WebElement ThemKHText = driver.findElement(khachHangPage.ThemKHText);
        Assert.assertEquals(ThemKHText.getText(),"Thêm thông tin một khách hàng mới");
        helper.setText(khachHangPage.TenKH,"ThaiTuan");
        helper.setText(khachHangPage.SDT,"12345678900");
        helper.setText(khachHangPage.DiaChi1,"abc");
        helper.setText(khachHangPage.DiaChi2,"abc123");
        helper.setText(khachHangPage.Email,"thaituan@123");
        helper.setText(khachHangPage.Password,"ahihituanne");
        helper.clickElement(khachHangPage.Create);
        WebElement MsgUser = driver.findElement(khachHangPage.MsgUserName);
        Assert.assertEquals(MsgUser.getText(),"The UserName field is required.");
    }
    @Test
    public void TKH_09(){
        helper.clickElement(khachHangPage.KhachHangNav);
        WebElement DanhSachText = driver.findElement(khachHangPage.DanhSachKHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Khách Hàng");
        helper.clickElement(khachHangPage.ThemKH);
        WebElement ThemKHText = driver.findElement(khachHangPage.ThemKHText);
        Assert.assertEquals(ThemKHText.getText(),"Thêm thông tin một khách hàng mới");
        helper.setText(khachHangPage.TenKH,"ThaiTuan");
        helper.setText(khachHangPage.SDT,"12345678");
        helper.setText(khachHangPage.DiaChi1,"abc");
        helper.setText(khachHangPage.DiaChi2,"abc123");
        helper.setText(khachHangPage.Email,"thaituan@123");
        helper.setText(khachHangPage.NgaySinh,"9/29/2001");
        helper.setText(khachHangPage.UserName,"tuankute");
        helper.clickElement(khachHangPage.Create);
        WebElement MsgPass = driver.findElement(khachHangPage.MsgPassword);
        Assert.assertEquals(MsgPass.getText(),"The Password field is required.");
    }
    @Test
    public void TKH_10(){
        helper.clickElement(khachHangPage.KhachHangNav);
        WebElement DanhSachText = driver.findElement(khachHangPage.DanhSachKHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Khách Hàng");
        helper.clickElement(khachHangPage.ThemKH);
        WebElement ThemKHText = driver.findElement(khachHangPage.ThemKHText);
        Assert.assertEquals(ThemKHText.getText(),"Thêm thông tin một khách hàng mới");
        helper.setText(khachHangPage.TenKH,"ThaiTuan1");
        helper.setText(khachHangPage.SDT,"12345678900");
        helper.setText(khachHangPage.DiaChi1,"abc");
        helper.setText(khachHangPage.DiaChi2,"abc123");
        helper.setText(khachHangPage.Email,"thaituan@123");
        helper.setText(khachHangPage.NgaySinh,"9/29/2001");
        helper.setText(khachHangPage.UserName,"tuankute1");
        helper.setText(khachHangPage.Password,"12345678");
        helper.clickElement(khachHangPage.Create);
        WebElement TimKH = driver.findElement(khachHangPage.TimKH);
        helper.setText(khachHangPage.TimKH,"ThaiTuan1");
        TimKH.submit();
        WebElement Ten = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]"));
        Assert.assertEquals(Ten.getText(),"ThaiTuan1");
        WebElement SDT = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]"));
        Assert.assertEquals(SDT.getText(),"12345678900");
        WebElement DiaChi = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]"));
        Assert.assertEquals(DiaChi.getText(),"abc");
        WebElement Email = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/a[1]"));
        Assert.assertEquals(Email.getText(),"thaituan@123");
    }
    @Test
    public void TKH_11(){
        helper.clickElement(khachHangPage.KhachHangNav);
        WebElement DanhSachText = driver.findElement(khachHangPage.DanhSachKHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Khách Hàng");
        helper.clickElement(khachHangPage.ThemKH);
        WebElement ThemKHText = driver.findElement(khachHangPage.ThemKHText);
        Assert.assertEquals(ThemKHText.getText(),"Thêm thông tin một khách hàng mới");
        helper.setText(khachHangPage.TenKH,"ThaiTuan2");
        helper.setText(khachHangPage.SDT,"12345678900");
        helper.setText(khachHangPage.DiaChi1,"abc");
        helper.setText(khachHangPage.DiaChi2,"abc123");
        helper.setText(khachHangPage.Email,"thaituan@123");
        helper.setText(khachHangPage.NgaySinh,"9/29/2001");
        helper.setText(khachHangPage.UserName,"tuankute1");
        helper.setText(khachHangPage.Password,"ahihituanne12345");
        helper.clickElement(khachHangPage.Create);
        WebElement TimKH = driver.findElement(khachHangPage.TimKH);
        helper.setText(khachHangPage.TimKH,"ThaiTuan2");
        TimKH.submit();
        WebElement Ten = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]"));
        Assert.assertEquals(Ten.getText(),"ThaiTuan2");
        WebElement SDT = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]"));
        Assert.assertEquals(SDT.getText(),"12345678900");
        WebElement DiaChi = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]"));
        Assert.assertEquals(DiaChi.getText(),"abc");
        WebElement Email = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/a[1]"));
        Assert.assertEquals(Email.getText(),"thaituan@123");
    }
    @Test
    public void TKH_12(){
        helper.clickElement(khachHangPage.KhachHangNav);
        WebElement DanhSachText = driver.findElement(khachHangPage.DanhSachKHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Khách Hàng");
        helper.clickElement(khachHangPage.ThemKH);
        WebElement ThemKHText = driver.findElement(khachHangPage.ThemKHText);
        Assert.assertEquals(ThemKHText.getText(),"Thêm thông tin một khách hàng mới");
        helper.setText(khachHangPage.TenKH,"ThaiTuan");
        helper.setText(khachHangPage.SDT,"12345678900");
        helper.setText(khachHangPage.DiaChi1,"abc");
        helper.setText(khachHangPage.DiaChi2,"abc123");
        helper.setText(khachHangPage.Email,"thaituan@123");
        helper.setText(khachHangPage.NgaySinh,"9/29/2001");
        helper.setText(khachHangPage.UserName,"tuankute1");
        helper.setText(khachHangPage.Password,"1234567");
        helper.clickElement(khachHangPage.Create);
        WebElement MsgDoDaiPass = driver.findElement(khachHangPage.MsgDoDaiPassword);
        Assert.assertEquals(MsgDoDaiPass.getText(),"The field Password must be a string or array type with a minimum length of '8'.");
    }
    @Test
    public void TKH_13(){
        helper.clickElement(khachHangPage.KhachHangNav);
        WebElement DanhSachText = driver.findElement(khachHangPage.DanhSachKHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Khách Hàng");
        helper.clickElement(khachHangPage.ThemKH);
        WebElement ThemKHText = driver.findElement(khachHangPage.ThemKHText);
        Assert.assertEquals(ThemKHText.getText(),"Thêm thông tin một khách hàng mới");
        helper.setText(khachHangPage.TenKH,"ThaiTuan");
        helper.setText(khachHangPage.SDT,"12345678900");
        helper.setText(khachHangPage.DiaChi1,"abc");
        helper.setText(khachHangPage.DiaChi2,"abc123");
        helper.setText(khachHangPage.Email,"thaituan@123");
        helper.setText(khachHangPage.NgaySinh,"9/29/2001");
        helper.setText(khachHangPage.UserName,"tuankute1");
        helper.setText(khachHangPage.Password,"ahihituanne123456");
        helper.clickElement(khachHangPage.Create);
        WebElement MsgDoDaiPass = driver.findElement(khachHangPage.MsgDoDaiPassword);
        Assert.assertEquals(MsgDoDaiPass.getText(),"The field Password must be a string or array type with a maximum length of '16'.");
    }
    @AfterClass
    public void Close() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
