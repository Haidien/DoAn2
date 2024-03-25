package Testcases;

import Base.BaseSetup;
import Base.Helper;
import Pages.KhachHangPage;
import Pages.MatHangPage;
import Pages.SignInPage;
import Pages.TheLoaiHangPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class ThemTheLoaiHangTest extends BaseSetup {
    private WebDriver driver;
    private SignInPage signInPage;
    private TheLoaiHangPage theLoaiHangPage;
    private MatHangPage matHangPage;
    private Helper helper;
    @BeforeClass
    public void SetUp(){
        driver = getDriver();
    }
    @BeforeClass
    public void SignIn(){
        signInPage = new SignInPage(driver);
        theLoaiHangPage = new TheLoaiHangPage(driver);
        matHangPage = new MatHangPage(driver);
        helper = new Helper(driver);
        signInPage.SignIn("dien","123456789");
        Assert.assertEquals(driver.getCurrentUrl(),"https://localhost:44393/Admin/AdminHome?Areas=Admin");
    }

    @Test
    public void TTLH_01(){
        helper.clickElement(theLoaiHangPage.TheLoaiHangNav);
        WebElement DanhSachTLText = driver.findElement(theLoaiHangPage.DanhSachTLText);
        Assert.assertEquals(DanhSachTLText.getText(),"Danh Sách Loại Mặt Hàng");
        WebElement List = driver.findElement(theLoaiHangPage.List1);
        Assert.assertFalse(List.getText().contains("Ipad"));
        helper.clickElement(theLoaiHangPage.ThemTheLoai);
        WebElement ThemTheLoaiText = driver.findElement(theLoaiHangPage.ThemTheLoaiText);
        Assert.assertEquals(ThemTheLoaiText.getText(),"Tạo Một Mặt Hàng Mới");
        helper.setText(theLoaiHangPage.TenTheLoaiInput,"Ipad");
        helper.clickElement(theLoaiHangPage.Create);
        List = driver.findElement(theLoaiHangPage.List1);
        Assert.assertTrue(List.getText().contains("Ipad"));
        helper.clickElement(matHangPage.MatHangNav);
        WebElement DanhSachMHText = driver.findElement(matHangPage.DanhSachMHText);
        Assert.assertEquals(DanhSachMHText.getText(),"Danh Sách Mặt Hàng");
        helper.clickElement(matHangPage.ThemMH);
        WebElement ThemMHText = driver.findElement(matHangPage.ThemMHText);
        Assert.assertEquals(ThemMHText.getText(),"Tạo Một Mặt Hàng Mới");
        WebElement LoaiMH = driver.findElement(matHangPage.LoaiMH);
        Assert.assertTrue(LoaiMH.getText().contains("Ipad"));
        Select select = new Select(driver.findElement(matHangPage.LoaiMH));
        select.selectByVisibleText("Ipad");
    }
    @Test
    public void TTLH_02(){
        helper.clickElement(theLoaiHangPage.TheLoaiHangNav);
        WebElement DanhSachTLText = driver.findElement(theLoaiHangPage.DanhSachTLText);
        Assert.assertEquals(DanhSachTLText.getText(),"Danh Sách Loại Mặt Hàng");
        WebElement list1 = driver.findElement(theLoaiHangPage.List1);
        Assert.assertTrue(list1.getText().contains("Ipad"));
        helper.clickElement(theLoaiHangPage.ThemTheLoai);
        WebElement ThemTheLoaiText = driver.findElement(theLoaiHangPage.ThemTheLoaiText);
        Assert.assertEquals(ThemTheLoaiText.getText(),"Tạo Một Mặt Hàng Mới");
        helper.setText(theLoaiHangPage.TenTheLoaiInput,"Ipad");
        helper.clickElement(theLoaiHangPage.Create);
        List<WebElement> list2 = driver.findElements(theLoaiHangPage.List2);
        int count=0;
        for(int i=0; i<list2.size(); i++){
            if(list2.get(i).getText().contains("Ipad"))
                count+=1;
        }
        Assert.assertEquals(count,1,"Thể loại hàng đã bị thêm trùng");
    }
    @Test
    public void TTLH_03(){
        helper.clickElement(theLoaiHangPage.TheLoaiHangNav);
        WebElement DanhSachTLText = driver.findElement(theLoaiHangPage.DanhSachTLText);
        Assert.assertEquals(DanhSachTLText.getText(),"Danh Sách Loại Mặt Hàng");
        helper.clickElement(theLoaiHangPage.ThemTheLoai);
        WebElement ThemTheLoaiText = driver.findElement(theLoaiHangPage.ThemTheLoaiText);
        Assert.assertEquals(ThemTheLoaiText.getText(),"Tạo Một Mặt Hàng Mới");
        helper.setText(theLoaiHangPage.TenTheLoaiInput,"123456");
        helper.clickElement(theLoaiHangPage.Create);
        WebElement list1 = driver.findElement(theLoaiHangPage.List1);
        Assert.assertFalse(list1.getText().contains("123456"),"Thêm loại vẫn được thêm vào");
    }
    @Test
    public void TTLH_04(){
        helper.clickElement(theLoaiHangPage.TheLoaiHangNav);
        WebElement DanhSachTLText = driver.findElement(theLoaiHangPage.DanhSachTLText);
        Assert.assertEquals(DanhSachTLText.getText(),"Danh Sách Loại Mặt Hàng");
        helper.clickElement(theLoaiHangPage.ThemTheLoai);
        WebElement ThemTheLoaiText = driver.findElement(theLoaiHangPage.ThemTheLoaiText);
        Assert.assertEquals(ThemTheLoaiText.getText(),"Tạo Một Mặt Hàng Mới");
        helper.setText(theLoaiHangPage.TenTheLoaiInput,"!@#$");
        helper.clickElement(theLoaiHangPage.Create);
        WebElement list1 = driver.findElement(theLoaiHangPage.List1);
        Assert.assertFalse(list1.getText().contains("!@#$"),"Thêm loại vẫn được thêm vào");
    }
    @Test
    public void TTLH_05(){
        helper.clickElement(theLoaiHangPage.TheLoaiHangNav);
        WebElement DanhSachTLText = driver.findElement(theLoaiHangPage.DanhSachTLText);
        Assert.assertEquals(DanhSachTLText.getText(),"Danh Sách Loại Mặt Hàng");
        WebElement List = driver.findElement(theLoaiHangPage.List1);
        Assert.assertFalse(List.getText().contains("Máy tính"));
        helper.clickElement(theLoaiHangPage.ThemTheLoai);
        WebElement ThemTheLoaiText = driver.findElement(theLoaiHangPage.ThemTheLoaiText);
        Assert.assertEquals(ThemTheLoaiText.getText(),"Tạo Một Mặt Hàng Mới");
        helper.setText(theLoaiHangPage.TenTheLoaiInput,"Máy    tính");
        helper.clickElement(theLoaiHangPage.Create);
        List = driver.findElement(theLoaiHangPage.List1);
        Assert.assertTrue(List.getText().contains("Máy tính"),"Chưa xử lý khoảng trắng dư thừa");
        helper.clickElement(matHangPage.MatHangNav);
        WebElement DanhSachMHText = driver.findElement(matHangPage.DanhSachMHText);
        Assert.assertEquals(DanhSachMHText.getText(),"Danh Sách Mặt Hàng");
        helper.clickElement(matHangPage.ThemMH);
        WebElement ThemMHText = driver.findElement(matHangPage.ThemMHText);
        Assert.assertEquals(ThemMHText.getText(),"Tạo Một Mặt Hàng Mới");
        WebElement LoaiMH = driver.findElement(matHangPage.LoaiMH);
        Assert.assertTrue(LoaiMH.getText().contains("Máy tính"));
        Select select = new Select(driver.findElement(matHangPage.LoaiMH));
        select.selectByVisibleText("Máy tính");
    }
    @Test
    public void TTLH_06(){
        helper.clickElement(theLoaiHangPage.TheLoaiHangNav);
        WebElement DanhSachTLText = driver.findElement(theLoaiHangPage.DanhSachTLText);
        Assert.assertEquals(DanhSachTLText.getText(),"Danh Sách Loại Mặt Hàng");
        helper.clickElement(theLoaiHangPage.ThemTheLoai);
        WebElement ThemTheLoaiText = driver.findElement(theLoaiHangPage.ThemTheLoaiText);
        Assert.assertEquals(ThemTheLoaiText.getText(),"Tạo Một Mặt Hàng Mới");
        helper.clickElement(theLoaiHangPage.Create);
        WebElement Msg = driver.findElement(theLoaiHangPage.MsgTenTheLoai);
        Assert.assertEquals(Msg.getText(),"The TenLoaiMH field is required.");
    }

    @AfterClass
    public void Close() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
