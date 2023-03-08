import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

public class Runner extends Setup {
    @Test
    public void calculateemp(){
        Screen sc = new Screen(driver);
        sc.startButton.click();
        sc.calculateEmi("2000", "7.5","5","3","540");
    }
}
