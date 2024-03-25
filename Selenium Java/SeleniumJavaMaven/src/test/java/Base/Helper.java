package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {
    private WebDriver driver;
    private WebDriverWait wait;
    JavascriptExecutor js;

    public Helper(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
        js = (JavascriptExecutor) driver;
    }

    public void setText(By locator, String value){
        //Sendkeys 1 giá trị cho element truyền vào
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(value);
    }

    public void clickElement(By locator){
        //Click vào 1 phần tử element truyền vào
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();
//        Hoặc click bằng js
//        js.executeScript("arguments[0].click();", driver.findElement(locator));
    }
    public void clickElementJS(By locator){
        //Hoặc click bằng js
        js.executeScript("arguments[0].click();", driver.findElement(locator));
    }
}
