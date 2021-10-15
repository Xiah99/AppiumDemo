import Util.DriverWait;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.Objects;

/**
 * 通过进入微信群点击直播连接，进入直播间
 */

public class openLink {
    private AppiumDriver driver;
    private final String liveTitle = "客集集测试群";

    @BeforeClass
    public void setUp() throws MalformedURLException {
        driver = Init.getConnection();
    }
    @Test(description = "进入客集集测试群并点击直播连接", priority = 1)
    public void 点击直播连接() {
        // 显式等待
        // 进入客集集测试群
        WebElement element = null;
        try {
            element = DriverWait.ExplicitWaitByElement(driver, 20, By.xpath("//android.view.View[@text='客集集测试群']"));
        }catch (RuntimeException e){
            e.printStackTrace();
            Assert.fail("未定位到元素");
        }
        element.click();

        // 找到对应直播连接并点击进入
        while (true){
            // 尝试定位元素
            try {
                element = DriverWait.ExplicitWaitByElement(driver, 20, By.xpath("android.widget.TextView[@text='" + liveTitle + "']"));
            }catch (RuntimeException e){
                System.out.println("未找到元素");
                // 如果没有找到元素，设element为null
                element = null;
            }
            if (Objects.nonNull(element)){
                // 如果element不为null，说明成功定位到元素，跳出循环
                break;
            }
            // 如果没有找到元素，上滑屏幕
            driver
        }
    }
}
