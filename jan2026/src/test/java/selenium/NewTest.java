package selenium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.testng.annotations.*;

import java.io.File;
import java.net.URL;
import java.time.Duration;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class NewTest {

    private AndroidDriver driver;
    private ExtentReports extent;
    private ExtentTest test;
    private String projectPath;

    @BeforeMethod
    public void setupReport() {
        projectPath = System.getProperty("user.dir");

        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter(
                projectPath + File.separator + "Appium_YouTube_Report.html"
        );
        extent.attachReporter(spark);

        test = extent.createTest("YouTube Home Presence Test");
    }

    @AfterMethod
    public void tearDown() {
        try {
            if (driver != null) driver.quit();
        } finally {
            if (extent != null) extent.flush();  // ✅ Writes the HTML report
        }
    }

    @Test
    public void f() throws Exception {
        try {
            UiAutomator2Options options = new UiAutomator2Options();

            options.setPlatformName("Android");
            options.setAutomationName("UiAutomator2");
            options.setDeviceName("Android Emulator");
            options.setUdid("emulator-5554");

            // Optional - set only if you're sure. Otherwise remove.
            options.setPlatformVersion("16");

            // Helpful capabilities
            options.setAutoGrantPermissions(true);
            options.setNoReset(true);

            options.setAppPackage("com.google.android.youtube");
            options.setAppActivity("com.google.android.apps.youtube.app.WatchWhileActivity");
            options.setAppWaitActivity("com.google.android.apps.youtube.app.*");

            driver = new AndroidDriver(
                    new URL("http://127.0.0.1:4723/"),
                    options
            );
            System.out.println("App Started");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            test.log(Status.INFO, "YouTube App started");
            test.log(Status.INFO, "Current Activity: " + driver.currentActivity());
            test.addScreenCaptureFromPath(takeScreenshot("app_launched"));

            // ✅ Permission popup: handle safely
            By allowBtnLocator = By.id("com.android.permissioncontroller:id/permission_allow_button");
            List<WebElement> allowButtons = driver.findElements(allowBtnLocator);

            if (!allowButtons.isEmpty() && allowButtons.get(0).isDisplayed()) {
                allowButtons.get(0).click();
                test.log(Status.INFO, "Permission popup shown -> clicked Allow");
                test.addScreenCaptureFromPath(takeScreenshot("permission_allowed"));
                System.out.println("permission_allowed");
            } else {
                test.log(Status.INFO, "Permission popup not shown");
                System.out.println("Permission popup not shown");
            }

            // ✅ Now check Home
            WebElement home = driver.findElement(AppiumBy.accessibilityId("Home"));

            if (home.isDisplayed()) {
                test.log(Status.PASS, "Home is displayed");
                test.addScreenCaptureFromPath(takeScreenshot("home_displayed"));
            } else {
                test.log(Status.FAIL, "Home is NOT displayed");
                test.addScreenCaptureFromPath(takeScreenshot("home_not_displayed"));
            }

            test.pass("Test completed successfully ✅");

        } catch (Exception e) {
            // Capture screenshot on failure
            if (driver != null) {
                try {
                    test.addScreenCaptureFromPath(takeScreenshot("failure"));
                } catch (Exception ignore) {}
            }
            test.fail("Test failed: " + e.getMessage());
            throw e;
        }
        driver.quit();
    }

    private String takeScreenshot(String label) throws Exception {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        String dest = projectPath + File.separator + "Screenshots"
                + File.separator + "Appium_" + label + "_" + timestamp + ".png";

        File destFile = new File(dest);
        destFile.getParentFile().mkdirs();
        FileUtils.copyFile(src, destFile);

        return destFile.getAbsolutePath();
    }
}