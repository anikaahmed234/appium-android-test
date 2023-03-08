import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Setup {
    public AndroidDriver driver;

    @BeforeTest
    public AndroidDriver SetUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("deviceName","MyDevice");
//        caps.setCapability("uuid","bf057607");
//        caps.setCapability("platformName","Android");
//        caps.setCapability("platformVersion","MyDevice");
        caps.setCapability("appPackage","com.continuum.emi.calculator");
        caps.setCapability("appActivity","com.finance.emicalci.activity.Splash_screnn");
        caps.setCapability("app",System.getProperty("user.dir")+"/src/test/resources/emi-calc.apk");
        caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,"true");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver(url,caps);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        return driver;
    }
//    @AfterTest
//    public void close(){
//        driver.quit();
//    }
}
