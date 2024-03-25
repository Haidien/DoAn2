package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BaseSetup {
    private WebDriver driver;

    static String driverPath = "resources\\driver\\";

    public WebDriver getDriver() {
        return driver;
    }

    //Hàm này để tùy chọn Browser. Cho chạy trước khi gọi class này (BeforeClass)
    private void setDriver(String browserType, String appURL) {
        switch (browserType) {
            case "chrome":
                driver = initChromeDriver(appURL);
                break;
            case "edge":
                driver = initEdgeDriver(appURL);
                break;
            default:
                System.out.println("Browser: " + browserType + " is invalid, Launching Chrome as browser of choice...");
                driver = initChromeDriver(appURL);
        }
    }


    //Khởi tạo cấu hình của các Browser để đưa vào Switch Case
    private static WebDriver initChromeDriver(String appURL) {
        System.out.println("Launching Chrome browser...");
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(appURL);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }
    private static WebDriver initEdgeDriver(String appURL) {
        System.out.println("Launching Edge browser...");
        WebDriverManager.edgedriver().setup();
        //System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(appURL);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }

    // Chạy hàm initializeTestBaseSetup trước hết khi class này được gọi
    @Parameters({ "browserType", "URL" })
    @BeforeClass
    public void initializeTestBaseSetup(String browserType, String URL) {
        try {
            // Khởi tạo driver và browser
            setDriver(browserType, URL);
        } catch (Exception e) {
            System.out.println("Error..." + e.getStackTrace());
        }
    }

    @AfterClass
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
