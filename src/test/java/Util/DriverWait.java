package Util;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * 定义执行元素操作过程中的等待方式
 */
public class DriverWait {
    // 显式等待
    public static WebElement ExplicitWaitByElement(AppiumDriver driver, long waitTime, By locator){
        WebElement element;
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return element = driver.findElement(locator);
    }
}
