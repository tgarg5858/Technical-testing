package selenium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
 
import java.net.URL;
import java.time.Duration;
 
public class NewTest{
 
    @Test
    public void f() throws Exception {
 
        UiAutomator2Options options = new UiAutomator2Options();
 
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setDeviceName("emulator-5554");
        options.setPlatformVersion("16");
        options.setAppPackage("com.google.android.youtube");
        options.setAppActivity("com.google.android.apps.youtube.app.WatchWhileActivity");
 
        AndroidDriver driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723"),
                options
        );
 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
        System.out.println("App started");
 
        WebElement home = driver.findElement(AppiumBy.accessibilityId("Home"));
 
        if (home.isDisplayed()) {
            System.out.println("Home is displayed");
        } else {
            System.out.println("Home is not displayed");
        }
 
        driver.quit();
    }
}
