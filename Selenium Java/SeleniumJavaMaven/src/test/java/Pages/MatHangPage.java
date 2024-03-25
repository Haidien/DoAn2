package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MatHangPage {
    WebDriver driver;
    public MatHangPage(WebDriver driver){
        this.driver = driver;
    }
    public By MatHangNav = By.xpath("//a[@href='/Admin/AdminMatHangs/Index']");
    public By DanhSachMHText = By.xpath("//h2[contains(text(),'Danh sách mặt hàng')]");
    public By ThemMH = By.xpath("//button[contains(text(),'Tạo một mặt hàng mới')]");
    public By TimMH = By.xpath("//input[@placeholder='Tìm kiếm theo tên mặt hàng hoặc tên thệ loại']");

    //Thêm mặt hàng
    public By ThemMHText = By.xpath("//h4[contains(text(),'Tạo một mặt hàng mới')]");
    public By TenMH = By.xpath("//input[@id='TenMH']");
    public By MsgTenMH = By.xpath("//span[normalize-space()='The TenMH field is required.']");
    public By LoaiMH = By.xpath("//select[@id='IDLoaiMH']");
    public By MoTa = By.xpath("//input[@id='MoTa']");
    public By MsgMoTa = By.xpath("//span[normalize-space()='The MoTa field is required.']");
    public By MoTaChiTiet = By.xpath("//input[@id='MoTaChiTiet']");
    public By MsgMoTaChiTiet = By.xpath("//span[normalize-space()='The MoTaChiTiet field is required.']");
    public By DonGia = By.xpath("//input[@id='DonGia']");
    public By MsgDonGia = By.xpath("//span[normalize-space()='The DonGia field is required.']");
    public By MsgDonGia2 = By.xpath("//span[normalize-space()='The field DonGia must be between 0 and 2147483647.']");
    public By NgayNhapHang = By.xpath("//input[@id='NgayNhapHang']");
    public By MsgNgayNhapHang = By.xpath("//span[normalize-space()='The NgayNhapHang field is required.']");
    public By SoLuong = By.xpath("//input[@id='SoLuong']");
    public By MsgSoLuong = By.xpath("//span[normalize-space()='The SoLuong field is required.']");
    public By MsgSoLuong2 = By.xpath("//span[contains(text(),'The field SoLuong must be between 0 and 2147483647')]");
    public By HinhAnh1 = By.xpath("//input[@name='UploadImage1']");
    public By HinhAnh2 = By.xpath("//input[@name='UploadImage2']");
    public By HinhAnh3 = By.xpath("//input[@name='UploadImage3']");
    public By HinhAnh4 = By.xpath("//input[@name='UploadImage4']");
    public By Create = By.xpath("//button[normalize-space()='Create']");
    //Cập nhật mặt hàng
    public By CapNhatMH = By.xpath("//button[normalize-space()='Edit']");
    public By Save = By.xpath("//button[normalize-space()='Save']");
    public By ThongTinMH = By.xpath("//button[normalize-space()='Details']");
    public By CTTenMH = By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]");
    public By CTLoaiMH = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]");
    public By CTMoTa = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]");
    public By CTMoTaChiTiet = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]");
    public By CTDonGia = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[6]/div[1]");
    public By CTNgayNhapHang = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]");
    //Xóa mặt hàng
    public By XoaMH = By.xpath("//button[normalize-space()='Delete']");
    public By XoaMHText = By.xpath("//h2[contains(text(),'Bạn có thực sự muốn xóa mặt hàng này không!!!')]");
    public By Delete = By.xpath("//button[normalize-space()='Delete']");
    public By List = By.xpath("//tbody");
}
