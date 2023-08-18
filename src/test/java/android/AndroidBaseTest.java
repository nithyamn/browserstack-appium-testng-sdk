package android;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.MutableCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AndroidBaseTest {
    public AndroidDriver driver;
    public String username = System.getenv("BROWSERSTACK_USERNAME");
    public String accesskey = System.getenv("BROWSERSTACK_ACCESS_KEY");
    @BeforeMethod
    public void setup() throws MalformedURLException {
        MutableCapabilities caps = new MutableCapabilities();
        driver = new AndroidDriver(new URL("https://"+username+":"+accesskey+"@hub-cloud.browserstack.com"),caps);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
