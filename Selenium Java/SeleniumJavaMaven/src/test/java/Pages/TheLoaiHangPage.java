package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TheLoaiHangPage {
    WebDriver driver;

    public TheLoaiHangPage(WebDriver driver){
        this.driver = driver;
    }
    public By TheLoaiHangNav = By.xpath("//body/div[@class='container-scroller']/nav[@id='sidebar']/ul[@class='nav']/li[7]");
    public By DanhSachTLText = By.xpath("//h2[contains(text(),'Danh sách loại mặt hàng')]");

    //Thêm thể loại hàng
    public By ThemTheLoai = By.xpath("//button[contains(text(),'Tạo một loai mặt hàng mới')]");
    public By ThemTheLoaiText = By.xpath("//h4[contains(text(),'Tạo một mặt hàng mới')]");
    public By TenTheLoaiInput = By.xpath("//input[@id='TenLoaiMH']");
    public By MsgTenTheLoai = By.xpath("//span[@class='field-validation-error text-danger']");
    public By Create = By.xpath("//button[normalize-space()='Create']");
    public By TroVe = By.xpath("//button[contains(text(),'Trở về')]");
    public By List1 = By.xpath("//tbody");
    public By List2 = By.xpath("//table[@class='table table-striped']/tbody/tr");

    //Cập nhật thể loại hàng
    public By CapNhatTLH = By.xpath("//tbody/tr[1]/td[2]/a[2]/button[1]");
    public By Save = By.xpath("//button[normalize-space()='Save']");
    public By ThongTinTLH = By.xpath("//tbody/tr[1]/td[2]/a[1]/button[1]");
    public By CTTenMH = By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]");

}
