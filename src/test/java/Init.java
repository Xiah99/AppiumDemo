// 初始化与设备的连接

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class Init{
    private static final String url = "http://127.0.0.1:4723/wd/hub";
    private static AppiumDriver driver;

    public static AppiumDriver getConnection() throws MalformedURLException {
        //配置启动参数
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "6.0.1");
        capabilities.setCapability("appPackage", "com.tencent.mm");
        capabilities.setCapability("appActivity", "com.tencent.mm.ui.LauncherUI");
        capabilities.setCapability("noReset", "true");
        return driver = new AppiumDriver(new URL(url), capabilities);
    }
}
