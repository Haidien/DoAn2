package Testcases;

import Base.BaseSetup;
import Base.Helper;
import Pages.KhachHangPage;
import Pages.MatHangPage;
import Pages.SignInPage;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CapNhatSPTest extends BaseSetup {
    private WebDriver driver;
    private SignInPage signInPage;
    private MatHangPage matHangPage;
    private Helper helper;


    @BeforeClass
    public void SetUp(){
        driver = getDriver();
    }
    @BeforeClass
    public void SignIn(){
        signInPage = new SignInPage(driver);
        matHangPage = new MatHangPage(driver);
        helper = new Helper(driver);
        signInPage.SignIn("dien","123456789");
        Assert.assertEquals(driver.getCurrentUrl(),"https://localhost:44393/Admin/AdminHome?Areas=Admin");
    }
    @Test
    public void CNSP_01()  {
        helper.clickElement(matHangPage.MatHangNav);
        WebElement DanhSachText = driver.findElement(matHangPage.DanhSachMHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Mặt Hàng");
        WebElement TimMH = driver.findElement(matHangPage.TimMH);
        helper.setText(matHangPage.TimMH,"Dell XPS");
        TimMH.submit();
        helper.clickElementJS(matHangPage.CapNhatMH);
        helper.setText(matHangPage.TenMH,"Dell XP");
        helper.setText(matHangPage.NgayNhapHang,"12/5/2022");
        helper.clickElement(matHangPage.Save);
        helper.setText(matHangPage.TimMH,"Dell XP");
        TimMH = driver.findElement(matHangPage.TimMH);
        TimMH.submit();
        helper.clickElementJS(matHangPage.ThongTinMH);
        WebElement TenMH = driver.findElement(matHangPage.CTTenMH);
        Assert.assertTrue(TenMH.getText().contains("Dell XP"));
    }
    @Test
    public void CNSP_02()  {
        helper.clickElement(matHangPage.MatHangNav);
        WebElement DanhSachText = driver.findElement(matHangPage.DanhSachMHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Mặt Hàng");
        WebElement TimMH = driver.findElement(matHangPage.TimMH);
        helper.setText(matHangPage.TimMH,"Dell XP");
        TimMH.submit();
        helper.clickElementJS(matHangPage.CapNhatMH);
        Select select = new Select(driver.findElement(matHangPage.LoaiMH));
        select.selectByVisibleText("Màn hình");
        helper.setText(matHangPage.NgayNhapHang,"12/5/2022");
        helper.clickElement(matHangPage.Save);
        helper.setText(matHangPage.TimMH,"Dell XP");
        TimMH = driver.findElement(matHangPage.TimMH);
        TimMH.submit();
        helper.clickElementJS(matHangPage.ThongTinMH);
        WebElement LoaiMH = driver.findElement(matHangPage.CTLoaiMH);
        Assert.assertTrue(LoaiMH.getText().contains("Màn hình"));
    }
    @Test
    public void CNSP_03()  {
        helper.clickElement(matHangPage.MatHangNav);
        WebElement DanhSachText = driver.findElement(matHangPage.DanhSachMHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Mặt Hàng");
        WebElement TimMH = driver.findElement(matHangPage.TimMH);
        helper.setText(matHangPage.TimMH,"Dell XP");
        TimMH.submit();
        helper.clickElementJS(matHangPage.CapNhatMH);
        helper.setText(matHangPage.MoTa,"xyz");
        helper.setText(matHangPage.NgayNhapHang,"12/5/2022");
        helper.clickElement(matHangPage.Save);
        helper.setText(matHangPage.TimMH,"Dell XP");
        TimMH = driver.findElement(matHangPage.TimMH);
        TimMH.submit();
        helper.clickElementJS(matHangPage.ThongTinMH);
        WebElement MoTa = driver.findElement(matHangPage.CTMoTa);
        Assert.assertTrue(MoTa.getText().contains("xyz"));
    }
    @Test
    public void CNSP_04()  {
        helper.clickElement(matHangPage.MatHangNav);
        WebElement DanhSachText = driver.findElement(matHangPage.DanhSachMHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Mặt Hàng");
        WebElement TimMH = driver.findElement(matHangPage.TimMH);
        helper.setText(matHangPage.TimMH,"Dell XP");
        TimMH.submit();
        helper.clickElementJS(matHangPage.CapNhatMH);
        helper.setText(matHangPage.MoTaChiTiet,"xyz123");
        helper.setText(matHangPage.NgayNhapHang,"12/5/2022");
        helper.clickElement(matHangPage.Save);
        helper.setText(matHangPage.TimMH,"Dell XP");
        TimMH = driver.findElement(matHangPage.TimMH);
        TimMH.submit();
        helper.clickElementJS(matHangPage.ThongTinMH);
        WebElement MoTaChiTiet = driver.findElement(matHangPage.CTMoTaChiTiet);
        Assert.assertTrue(MoTaChiTiet.getText().contains("xyz123"));
    }
    @Test
    public void CNSP_05()  {
        helper.clickElement(matHangPage.MatHangNav);
        WebElement DanhSachText = driver.findElement(matHangPage.DanhSachMHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Mặt Hàng");
        WebElement TimMH = driver.findElement(matHangPage.TimMH);
        helper.setText(matHangPage.TimMH,"Dell XP");
        TimMH.submit();
        helper.clickElementJS(matHangPage.CapNhatMH);
        helper.setText(matHangPage.DonGia,"200");
        helper.setText(matHangPage.NgayNhapHang,"12/5/2022");
        helper.clickElement(matHangPage.Save);
        helper.setText(matHangPage.TimMH,"Dell XP");
        TimMH = driver.findElement(matHangPage.TimMH);
        TimMH.submit();
        helper.clickElementJS(matHangPage.ThongTinMH);
        WebElement DonGia = driver.findElement(matHangPage.CTDonGia);
        Assert.assertTrue(DonGia.getText().contains("200 VND"));
    }
    @Test
    public void CNSP_06()  {
        helper.clickElement(matHangPage.MatHangNav);
        WebElement DanhSachText = driver.findElement(matHangPage.DanhSachMHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Mặt Hàng");
        WebElement TimMH = driver.findElement(matHangPage.TimMH);
        helper.setText(matHangPage.TimMH,"Dell XP");
        TimMH.submit();
        helper.clickElementJS(matHangPage.CapNhatMH);
        helper.setText(matHangPage.DonGia,"-200");
        helper.setText(matHangPage.NgayNhapHang,"12/5/2022");
        helper.clickElement(matHangPage.Save);
        WebElement Msg = driver.findElement(matHangPage.MsgDonGia2);
        Assert.assertEquals(Msg.getText(),"The field DonGia must be between 0 and 2147483647.");
    }
    @Test
    public void CNSP_07()  {
        helper.clickElement(matHangPage.MatHangNav);
        WebElement DanhSachText = driver.findElement(matHangPage.DanhSachMHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Mặt Hàng");
        WebElement TimMH = driver.findElement(matHangPage.TimMH);
        helper.setText(matHangPage.TimMH,"Dell XP");
        TimMH.submit();
        helper.clickElementJS(matHangPage.CapNhatMH);
        helper.setText(matHangPage.NgayNhapHang,"10/5/2022");
        helper.clickElement(matHangPage.Save);
        helper.setText(matHangPage.TimMH,"Dell XP");
        TimMH = driver.findElement(matHangPage.TimMH);
        TimMH.submit();
        helper.clickElementJS(matHangPage.ThongTinMH);
        WebElement NgayNhapHang = driver.findElement(matHangPage.CTNgayNhapHang);
        Assert.assertTrue(NgayNhapHang.getText().contains("10/5/2022"));
    }
    @Test
    public void CNSP_08()  {
        helper.clickElement(matHangPage.MatHangNav);
        WebElement DanhSachText = driver.findElement(matHangPage.DanhSachMHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Mặt Hàng");
        WebElement TimMH = driver.findElement(matHangPage.TimMH);
        helper.setText(matHangPage.TimMH,"Dell XP");
        TimMH.submit();
        helper.clickElementJS(matHangPage.XoaMH);
        WebElement XoaMHText = driver.findElement(matHangPage.XoaMHText);
        Assert.assertEquals(XoaMHText.getText(),"Bạn Có Thực Sự Muốn Xóa Mặt Hàng Này Không!!!");
        WebElement CTTenMH = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]"));
        Assert.assertTrue(CTTenMH.getText().contains("Dell XP"));
        helper.clickElementJS(matHangPage.Delete);
        helper.setText(matHangPage.TimMH,"Dell XP");
        TimMH = driver.findElement(matHangPage.TimMH);
        TimMH.submit();
        WebElement List = driver.findElement(matHangPage.List);
        Assert.assertFalse(List.getText().contains("Dell XP"));
    }
    @AfterClass
    public void Close() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
