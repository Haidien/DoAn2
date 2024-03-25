package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KhachHangPage {
    WebDriver driver;
    public KhachHangPage(WebDriver driver){
        this.driver = driver;
    }
    public By KhachHangNav = By.xpath("//a[@href='/Admin/AdminKhachHangs/Index']");
    public By DanhSachKHText = By.xpath("//h2[contains(text(),'Danh sách khách hàng')]");
    public By ThemKH = By.xpath("//button[contains(text(),'Tạo một khách hàng mới')]");
    public By TimKH = By.xpath("//input[@placeholder='Tìm kiếm theo tên khách hàng']");

    //Thêm KH
    public By ThemKHText = By.xpath("//h2[contains(text(),'Thêm thông tin một khách hàng mới')]");
    public By TenKH = By.xpath("//input[@id='TenKH']");
    public By MsgTenKH = By.xpath("//span[normalize-space()='The TenKH field is required.']");
    public By SDT = By.xpath("//input[@id='SDT']");
    public By MsgSDT = By.xpath("//span[normalize-space()='The SDT field is required.']");
    public By DiaChi1 = By.xpath("//input[@id='DiaChiGiaoHang1']");
    public By MsgDiaChi1 = By.xpath("//span[normalize-space()='The DiaChiGiaoHang1 field is required.']");
    public By DiaChi2 = By.xpath("//input[@id='DiaChiGiaoHang2']");
    public By MsgDiaChi2 = By.xpath("//span[normalize-space()='The DiaChiGiaoHang2 field is required.']");
    public By Email = By.xpath("//input[@id='Email']");
    public By MsgEmail = By.xpath("//span[normalize-space()='The Email field is required.']");
    public By NgaySinh = By.xpath("//input[@id='NgaySinh']");
    public By MsgNgaySinh = By.xpath("//span[normalize-space()='The NgaySinh field is required.']");
    public By UserName = By.xpath("//input[@id='UserName']");
    public By MsgUserName = By.xpath("//span[normalize-space()='The UserName field is required.']");
    public By Password = By.xpath("//input[@id='Password']");
    public By MsgPassword = By.xpath("//span[normalize-space()='The Password field is required.']");
    public By MsgDoDaiPassword = By.xpath("//span[contains(text(),'The field Password must be a string or array type ')]");
    public By Create = By.xpath("//button[normalize-space()='Create']");
    public By TroVe = By.xpath("//button[contains(text(),'Trở về')]");
    //Cập nhật KH
    public By CapNhatKH = By.xpath("//tbody/tr[1]/td[8]/a[2]/button[1]");
    public By Save = By.xpath("//button[normalize-space()='Save']");
    public By ThongTinKH = By.xpath("//tbody/tr[1]/td[8]/a[1]/button[1]");
    public By CTTenKH = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]");
    public By CTSDT = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]");
    public By CTDiaChi1 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]");
    public By CTDiaChi2 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]");
    public By CTEmail = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[6]/div[1]/a[1]");
    public By CTNgaySinh = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]");
    //Xóa khách hàng
    public By XoaKH = By.xpath("//tbody/tr[1]/td[8]/a[3]/button[1]");
    public By XoaKHText = By.xpath("//h2[contains(text(),'Bạn có thực sự muốn xóa khách hàng này không!!!')]");
    public By Delete = By.xpath("//button[normalize-space()='Delete']");
    public By List = By.xpath("//tbody");
}
