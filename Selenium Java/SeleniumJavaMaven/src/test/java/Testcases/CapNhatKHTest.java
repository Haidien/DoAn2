package Testcases;

import Base.BaseSetup;
import Base.Helper;
import Pages.KhachHangPage;
import Pages.SignInPage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CapNhatKHTest extends BaseSetup {
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
    public void CNKH_01()  {
        helper.clickElement(khachHangPage.KhachHangNav);
        WebElement DanhSachText = driver.findElement(khachHangPage.DanhSachKHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Khách Hàng");
        WebElement TimKH = driver.findElement(khachHangPage.TimKH);
        helper.setText(khachHangPage.TimKH,"ThaiTuan");
        TimKH.submit();
        helper.clickElementJS(khachHangPage.CapNhatKH);
        helper.setText(khachHangPage.TenKH,"Tuan");
        helper.setText(khachHangPage.NgaySinh,"9/29/2001");
        helper.setText(khachHangPage.Password,"ahihituanne");
        helper.clickElement(khachHangPage.Save);
        helper.setText(khachHangPage.TimKH,"Tuan");
        TimKH = driver.findElement(khachHangPage.TimKH);
        TimKH.submit();
        helper.clickElementJS(khachHangPage.ThongTinKH);
        WebElement TenKH = driver.findElement(khachHangPage.CTTenKH);
        Assert.assertEquals(TenKH.getText(),"Tuan");
    }
    @Test
    public void CNKH_02()  {
        helper.clickElement(khachHangPage.KhachHangNav);
        WebElement DanhSachText = driver.findElement(khachHangPage.DanhSachKHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Khách Hàng");
        WebElement TimKH = driver.findElement(khachHangPage.TimKH);
        helper.setText(khachHangPage.TimKH,"Tuan");
        TimKH.submit();
        helper.clickElementJS(khachHangPage.CapNhatKH);
        helper.setText(khachHangPage.SDT,"0123456789");
        helper.setText(khachHangPage.NgaySinh,"9/29/2001");
        helper.setText(khachHangPage.Password,"ahihituanne");
        helper.clickElement(khachHangPage.Save);
        helper.setText(khachHangPage.TimKH,"Tuan");
        TimKH = driver.findElement(khachHangPage.TimKH);
        TimKH.submit();
        helper.clickElementJS(khachHangPage.ThongTinKH);
        WebElement SDT = driver.findElement(khachHangPage.CTSDT);
        Assert.assertEquals(SDT.getText(),"0123456789");
    }
    @Test
    public void CNKH_03()  {
        helper.clickElement(khachHangPage.KhachHangNav);
        WebElement DanhSachText = driver.findElement(khachHangPage.DanhSachKHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Khách Hàng");
        WebElement TimKH = driver.findElement(khachHangPage.TimKH);
        helper.setText(khachHangPage.TimKH,"Tuan");
        TimKH.submit();
        helper.clickElementJS(khachHangPage.CapNhatKH);
        helper.setText(khachHangPage.DiaChi1,"Lâm Đồng");
        helper.setText(khachHangPage.NgaySinh,"9/29/2001");
        helper.setText(khachHangPage.Password,"ahihituanne");
        helper.clickElement(khachHangPage.Save);
        helper.setText(khachHangPage.TimKH,"Tuan");
        TimKH = driver.findElement(khachHangPage.TimKH);
        TimKH.submit();
        helper.clickElementJS(khachHangPage.ThongTinKH);
        WebElement DiaChi1 = driver.findElement(khachHangPage.CTDiaChi1);
        Assert.assertEquals(DiaChi1.getText(),"Lâm Đồng");
    }
    @Test
    public void CNKH_04()  {
        helper.clickElement(khachHangPage.KhachHangNav);
        WebElement DanhSachText = driver.findElement(khachHangPage.DanhSachKHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Khách Hàng");
        WebElement TimKH = driver.findElement(khachHangPage.TimKH);
        helper.setText(khachHangPage.TimKH,"Tuan");
        TimKH.submit();
        helper.clickElementJS(khachHangPage.CapNhatKH);
        helper.setText(khachHangPage.DiaChi2,"HCM");
        helper.setText(khachHangPage.NgaySinh,"9/29/2001");
        helper.setText(khachHangPage.Password,"ahihituanne");
        helper.clickElement(khachHangPage.Save);
        helper.setText(khachHangPage.TimKH,"Tuan");
        TimKH = driver.findElement(khachHangPage.TimKH);
        TimKH.submit();
        helper.clickElementJS(khachHangPage.ThongTinKH);
        WebElement DiaChi2 = driver.findElement(khachHangPage.CTDiaChi2);
        Assert.assertEquals(DiaChi2.getText(),"HCM");
    }
    @Test
    public void CNKH_05()  {
        helper.clickElement(khachHangPage.KhachHangNav);
        WebElement DanhSachText = driver.findElement(khachHangPage.DanhSachKHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Khách Hàng");
        WebElement TimKH = driver.findElement(khachHangPage.TimKH);
        helper.setText(khachHangPage.TimKH,"Tuan");
        TimKH.submit();
        helper.clickElementJS(khachHangPage.CapNhatKH);
        helper.setText(khachHangPage.Email,"thaituan@123");
        helper.setText(khachHangPage.NgaySinh,"9/29/2001");
        helper.setText(khachHangPage.Password,"ahihituanne");
        helper.clickElement(khachHangPage.Save);
        helper.setText(khachHangPage.TimKH,"Tuan");
        TimKH = driver.findElement(khachHangPage.TimKH);
        TimKH.submit();
        helper.clickElementJS(khachHangPage.ThongTinKH);
        WebElement Email = driver.findElement(khachHangPage.CTEmail);
        Assert.assertEquals(Email.getText(),"thaituan@123");
    }
    @Test
    public void CNKH_06()  {
        helper.clickElement(khachHangPage.KhachHangNav);
        WebElement DanhSachText = driver.findElement(khachHangPage.DanhSachKHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Khách Hàng");
        WebElement TimKH = driver.findElement(khachHangPage.TimKH);
        helper.setText(khachHangPage.TimKH,"Tuan");
        TimKH.submit();
        helper.clickElementJS(khachHangPage.CapNhatKH);
        helper.setText(khachHangPage.NgaySinh,"10/29/2001");
        helper.setText(khachHangPage.Password,"ahihituanne");
        helper.clickElement(khachHangPage.Save);
        helper.setText(khachHangPage.TimKH,"Tuan");
        TimKH = driver.findElement(khachHangPage.TimKH);
        TimKH.submit();
        helper.clickElementJS(khachHangPage.ThongTinKH);
        WebElement NgaySinh = driver.findElement(khachHangPage.CTNgaySinh);
        Assert.assertEquals(NgaySinh.getText(),"10/29/2001");
    }
    @Test
    public void CNKH_07()  {
        helper.clickElement(khachHangPage.KhachHangNav);
        WebElement DanhSachText = driver.findElement(khachHangPage.DanhSachKHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Khách Hàng");
        WebElement TimKH = driver.findElement(khachHangPage.TimKH);
        helper.setText(khachHangPage.TimKH,"Tuan");
        TimKH.submit();
        helper.clickElementJS(khachHangPage.XoaKH);
        WebElement XoaMHText = driver.findElement(khachHangPage.XoaKHText);
        Assert.assertEquals(XoaMHText.getText(),"Bạn Có Thực Sự Muốn Xóa Khách Hàng Này Không!!!");
        WebElement CTTenKH = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]"));
        Assert.assertTrue(CTTenKH.getText().contains("Tuan"));
        helper.clickElementJS(khachHangPage.Delete);
        helper.setText(khachHangPage.TimKH,"Dell XP");
        TimKH = driver.findElement(khachHangPage.TimKH);
        TimKH.submit();
        WebElement List = driver.findElement(khachHangPage.List);
        Assert.assertFalse(List.getText().contains("Dell XP"));
    }
    @AfterClass
    public void Close() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
