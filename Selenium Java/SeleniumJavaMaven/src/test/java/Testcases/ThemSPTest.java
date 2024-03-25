package Testcases;

import Base.BaseSetup;
import Base.Helper;
import Pages.KhachHangPage;
import Pages.MatHangPage;
import Pages.SignInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ThemSPTest extends BaseSetup {
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
    public void TSP_01() {
        helper.clickElement(matHangPage.MatHangNav);
        WebElement DanhSachText = driver.findElement(matHangPage.DanhSachMHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Mặt Hàng");
        helper.clickElement(matHangPage.ThemMH);
        WebElement ThemMHText = driver.findElement(matHangPage.ThemMHText);
        Assert.assertEquals(ThemMHText.getText(),"Tạo Một Mặt Hàng Mới");
        helper.setText(matHangPage.TenMH,"Dell XPS");
        Select select = new Select(driver.findElement(matHangPage.LoaiMH));
        select.selectByVisibleText("Laptop");
        helper.setText(matHangPage.MoTa,"abc");
        helper.setText(matHangPage.MoTaChiTiet,"abc123");
        helper.setText(matHangPage.DonGia,"100");
        helper.setText(matHangPage.NgayNhapHang,"12/5/2022");
        helper.setText(matHangPage.SoLuong,"10");
        helper.setText(matHangPage.HinhAnh1,"D:\\Selenium Java\\Hinh.png");
        helper.setText(matHangPage.HinhAnh2,"D:\\Selenium Java\\Hinh.png");
        helper.setText(matHangPage.HinhAnh3,"D:\\Selenium Java\\Hinh.png");
        helper.setText(matHangPage.HinhAnh4,"D:\\Selenium Java\\Hinh.png");
        helper.clickElement(matHangPage.Create);
        WebElement TimMH = driver.findElement(matHangPage.TimMH);
        helper.setText(matHangPage.TimMH,"Dell XPS");
        TimMH.submit();
        WebElement Ten = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]"));
        Assert.assertEquals(Ten.getText(),"Dell XPS");
        WebElement LoaiMH = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]"));
        Assert.assertEquals(LoaiMH.getText(),"Laptop");
        WebElement DơnGia = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]"));
        Assert.assertEquals(DơnGia.getText(),"100 VND");
        WebElement SoLuong = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]"));
        Assert.assertEquals(SoLuong.getText(),"10");
        WebElement NgayNhapHang = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]"));
        Assert.assertEquals(NgayNhapHang.getText(),"12/5/2022");
    }
    @Test
    public void TSP_02() {
        helper.clickElement(matHangPage.MatHangNav);
        WebElement DanhSachText = driver.findElement(matHangPage.DanhSachMHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Mặt Hàng");
        helper.clickElement(matHangPage.ThemMH);
        WebElement ThemMHText = driver.findElement(matHangPage.ThemMHText);
        Assert.assertEquals(ThemMHText.getText(),"Tạo Một Mặt Hàng Mới");
        Select select = new Select(driver.findElement(matHangPage.LoaiMH));
        select.selectByVisibleText("Laptop");
        helper.setText(matHangPage.MoTa,"abc");
        helper.setText(matHangPage.MoTaChiTiet,"abc123");
        helper.setText(matHangPage.DonGia,"100");
        helper.setText(matHangPage.NgayNhapHang,"12/5/2022");
        helper.setText(matHangPage.SoLuong,"10");
        helper.setText(matHangPage.HinhAnh1,"D:\\Selenium Java\\Hinh.png");
        helper.setText(matHangPage.HinhAnh2,"D:\\Selenium Java\\Hinh.png");
        helper.setText(matHangPage.HinhAnh3,"D:\\Selenium Java\\Hinh.png");
        helper.setText(matHangPage.HinhAnh4,"D:\\Selenium Java\\Hinh.png");
        helper.clickElement(matHangPage.Create);
        WebElement Msg = driver.findElement(matHangPage.MsgTenMH);
        Assert.assertEquals(Msg.getText(),"The TenMH field is required.");
    }
    @Test
    public void TSP_03() {
        helper.clickElement(matHangPage.MatHangNav);
        WebElement DanhSachText = driver.findElement(matHangPage.DanhSachMHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Mặt Hàng");
        helper.clickElement(matHangPage.ThemMH);
        WebElement ThemMHText = driver.findElement(matHangPage.ThemMHText);
        Assert.assertEquals(ThemMHText.getText(),"Tạo Một Mặt Hàng Mới");
        helper.setText(matHangPage.TenMH,"Dell XPS");
        Select select = new Select(driver.findElement(matHangPage.LoaiMH));
        select.selectByVisibleText("Laptop");
        helper.setText(matHangPage.MoTaChiTiet,"abc123");
        helper.setText(matHangPage.DonGia,"100");
        helper.setText(matHangPage.NgayNhapHang,"12/5/2022");
        helper.setText(matHangPage.SoLuong,"10");
        helper.setText(matHangPage.HinhAnh1,"D:\\Selenium Java\\Hinh.png");
        helper.setText(matHangPage.HinhAnh2,"D:\\Selenium Java\\Hinh.png");
        helper.setText(matHangPage.HinhAnh3,"D:\\Selenium Java\\Hinh.png");
        helper.setText(matHangPage.HinhAnh4,"D:\\Selenium Java\\Hinh.png");
        helper.clickElement(matHangPage.Create);
        WebElement Msg = driver.findElement(matHangPage.MsgMoTa);
        Assert.assertEquals(Msg.getText(),"The MoTa field is required.");
    }
    @Test
    public void TSP_04() {
        helper.clickElement(matHangPage.MatHangNav);
        WebElement DanhSachText = driver.findElement(matHangPage.DanhSachMHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Mặt Hàng");
        helper.clickElement(matHangPage.ThemMH);
        WebElement ThemMHText = driver.findElement(matHangPage.ThemMHText);
        Assert.assertEquals(ThemMHText.getText(),"Tạo Một Mặt Hàng Mới");
        helper.setText(matHangPage.TenMH,"Dell XPS");
        Select select = new Select(driver.findElement(matHangPage.LoaiMH));
        select.selectByVisibleText("Laptop");
        helper.setText(matHangPage.MoTa,"abc");
        helper.setText(matHangPage.DonGia,"100");
        helper.setText(matHangPage.NgayNhapHang,"12/5/2022");
        helper.setText(matHangPage.SoLuong,"10");
        helper.setText(matHangPage.HinhAnh1,"D:\\Selenium Java\\Hinh.png");
        helper.setText(matHangPage.HinhAnh2,"D:\\Selenium Java\\Hinh.png");
        helper.setText(matHangPage.HinhAnh3,"D:\\Selenium Java\\Hinh.png");
        helper.setText(matHangPage.HinhAnh4,"D:\\Selenium Java\\Hinh.png");
        helper.clickElement(matHangPage.Create);
        WebElement Msg = driver.findElement(matHangPage.MsgMoTaChiTiet);
        Assert.assertEquals(Msg.getText(),"The MoTaChiTiet field is required.");
    }
    @Test
    public void TSP_05() {
        helper.clickElement(matHangPage.MatHangNav);
        WebElement DanhSachText = driver.findElement(matHangPage.DanhSachMHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Mặt Hàng");
        helper.clickElement(matHangPage.ThemMH);
        WebElement ThemMHText = driver.findElement(matHangPage.ThemMHText);
        Assert.assertEquals(ThemMHText.getText(),"Tạo Một Mặt Hàng Mới");
        helper.setText(matHangPage.TenMH,"Dell XPS");
        Select select = new Select(driver.findElement(matHangPage.LoaiMH));
        select.selectByVisibleText("Laptop");
        helper.setText(matHangPage.MoTa,"abc");
        helper.setText(matHangPage.MoTaChiTiet,"abc123");
        helper.setText(matHangPage.NgayNhapHang,"12/5/2022");
        helper.setText(matHangPage.SoLuong,"10");
        helper.setText(matHangPage.HinhAnh1,"D:\\Selenium Java\\Hinh.png");
        helper.setText(matHangPage.HinhAnh2,"D:\\Selenium Java\\Hinh.png");
        helper.setText(matHangPage.HinhAnh3,"D:\\Selenium Java\\Hinh.png");
        helper.setText(matHangPage.HinhAnh4,"D:\\Selenium Java\\Hinh.png");
        helper.clickElement(matHangPage.Create);
        WebElement Msg = driver.findElement(matHangPage.MsgDonGia);
        Assert.assertEquals(Msg.getText(),"The DonGia field is required.");
    }
    @Test
    public void TSP_06() {
        helper.clickElement(matHangPage.MatHangNav);
        WebElement DanhSachText = driver.findElement(matHangPage.DanhSachMHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Mặt Hàng");
        helper.clickElement(matHangPage.ThemMH);
        WebElement ThemMHText = driver.findElement(matHangPage.ThemMHText);
        Assert.assertEquals(ThemMHText.getText(),"Tạo Một Mặt Hàng Mới");
        helper.setText(matHangPage.TenMH,"Dell XPS");
        Select select = new Select(driver.findElement(matHangPage.LoaiMH));
        select.selectByVisibleText("Laptop");
        helper.setText(matHangPage.MoTa,"abc");
        helper.setText(matHangPage.MoTaChiTiet,"abc123");
        helper.setText(matHangPage.DonGia,"-100");
        helper.setText(matHangPage.NgayNhapHang,"12/5/2022");
        helper.setText(matHangPage.SoLuong,"10");
        helper.setText(matHangPage.HinhAnh1,"D:\\Selenium Java\\Hinh.png");
        helper.setText(matHangPage.HinhAnh2,"D:\\Selenium Java\\Hinh.png");
        helper.setText(matHangPage.HinhAnh3,"D:\\Selenium Java\\Hinh.png");
        helper.setText(matHangPage.HinhAnh4,"D:\\Selenium Java\\Hinh.png");
        helper.clickElement(matHangPage.Create);
        WebElement Msg = driver.findElement(matHangPage.MsgDonGia2);
        Assert.assertEquals(Msg.getText(),"The field DonGia must be between 0 and 2147483647.");
    }
    @Test
    public void TSP_07() {
        helper.clickElement(matHangPage.MatHangNav);
        WebElement DanhSachText = driver.findElement(matHangPage.DanhSachMHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Mặt Hàng");
        helper.clickElement(matHangPage.ThemMH);
        WebElement ThemMHText = driver.findElement(matHangPage.ThemMHText);
        Assert.assertEquals(ThemMHText.getText(),"Tạo Một Mặt Hàng Mới");
        helper.setText(matHangPage.TenMH,"Dell XPS");
        Select select = new Select(driver.findElement(matHangPage.LoaiMH));
        select.selectByVisibleText("Laptop");
        helper.setText(matHangPage.MoTa,"abc");
        helper.setText(matHangPage.MoTaChiTiet,"abc123");
        helper.setText(matHangPage.DonGia,"100");
        helper.setText(matHangPage.SoLuong,"10");
        helper.setText(matHangPage.HinhAnh1,"D:\\Selenium Java\\Hinh.png");
        helper.setText(matHangPage.HinhAnh2,"D:\\Selenium Java\\Hinh.png");
        helper.setText(matHangPage.HinhAnh3,"D:\\Selenium Java\\Hinh.png");
        helper.setText(matHangPage.HinhAnh4,"D:\\Selenium Java\\Hinh.png");
        helper.clickElement(matHangPage.Create);
        WebElement Msg = driver.findElement(matHangPage.MsgNgayNhapHang);
        Assert.assertEquals(Msg.getText(),"The NgayNhapHang field is required.");
    }
    @Test
    public void TSP_08() {
        helper.clickElement(matHangPage.MatHangNav);
        WebElement DanhSachText = driver.findElement(matHangPage.DanhSachMHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Mặt Hàng");
        helper.clickElement(matHangPage.ThemMH);
        WebElement ThemMHText = driver.findElement(matHangPage.ThemMHText);
        Assert.assertEquals(ThemMHText.getText(),"Tạo Một Mặt Hàng Mới");
        helper.setText(matHangPage.TenMH,"Dell XPS");
        Select select = new Select(driver.findElement(matHangPage.LoaiMH));
        select.selectByVisibleText("Laptop");
        helper.setText(matHangPage.MoTa,"abc");
        helper.setText(matHangPage.MoTaChiTiet,"abc123");
        helper.setText(matHangPage.DonGia,"100");
        helper.setText(matHangPage.NgayNhapHang,"12/5/2022");
        helper.setText(matHangPage.HinhAnh1,"D:\\Selenium Java\\Hinh.png");
        helper.setText(matHangPage.HinhAnh2,"D:\\Selenium Java\\Hinh.png");
        helper.setText(matHangPage.HinhAnh3,"D:\\Selenium Java\\Hinh.png");
        helper.setText(matHangPage.HinhAnh4,"D:\\Selenium Java\\Hinh.png");
        helper.clickElement(matHangPage.Create);
        WebElement Msg = driver.findElement(matHangPage.MsgSoLuong);
        Assert.assertEquals(Msg.getText(),"The SoLuong field is required.");
    }
    @Test
    public void TSP_09() {
        helper.clickElement(matHangPage.MatHangNav);
        WebElement DanhSachText = driver.findElement(matHangPage.DanhSachMHText);
        Assert.assertEquals(DanhSachText.getText(),"Danh Sách Mặt Hàng");
        helper.clickElement(matHangPage.ThemMH);
        WebElement ThemMHText = driver.findElement(matHangPage.ThemMHText);
        Assert.assertEquals(ThemMHText.getText(),"Tạo Một Mặt Hàng Mới");
        helper.setText(matHangPage.TenMH,"Dell XPS");
        Select select = new Select(driver.findElement(matHangPage.LoaiMH));
        select.selectByVisibleText("Laptop");
        helper.setText(matHangPage.MoTa,"abc");
        helper.setText(matHangPage.MoTaChiTiet,"abc123");
        helper.setText(matHangPage.DonGia,"100");
        helper.setText(matHangPage.NgayNhapHang,"12/5/2022");
        helper.setText(matHangPage.SoLuong,"-10");
        helper.setText(matHangPage.HinhAnh1,"D:\\Selenium Java\\Hinh.png");
        helper.setText(matHangPage.HinhAnh2,"D:\\Selenium Java\\Hinh.png");
        helper.setText(matHangPage.HinhAnh3,"D:\\Selenium Java\\Hinh.png");
        helper.setText(matHangPage.HinhAnh4,"D:\\Selenium Java\\Hinh.png");
        helper.clickElement(matHangPage.Create);
        WebElement Msg = driver.findElement(matHangPage.MsgSoLuong2);
        Assert.assertEquals(Msg.getText(),"The field SoLuong must be between 0 and 2147483647.");
    }
    @AfterClass
    public void Close() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
