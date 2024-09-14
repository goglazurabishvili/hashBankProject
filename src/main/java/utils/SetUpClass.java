package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class SetUpClass {

    public static AppiumDriver driver;
    public static WebDriverWait globalWait;

    public static void initializeWebDriverWait() {
        if (driver != null) {
            globalWait = new WebDriverWait(driver, Duration.ofSeconds(100));
        } else {
            throw new IllegalStateException("Driver is not initialized.");
        }
    }

    public static WebElement findElement(By element) {
        if (globalWait == null) {
            throw new IllegalStateException("WebDriverWait is not initialized.");
        }
        return globalWait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static List<WebElement> findElements(By element) {
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized.");
        }
        return driver.findElements(element);
    }

    public void androidDriverSetUp() {
        try {
            UiAutomator2Options caps = new UiAutomator2Options();
            caps.setCapability("platformName", "Android");
            caps.setCapability("automationName", "UIAutomator2");
            caps.setCapability("deviceName", "pixel:");
            caps.setCapability("app", "C:/Users/99557/IdeaProjects/hashBankProject/src/main/resources/android.wdio.native.app.v1.0.8.apk");
            caps.setCapability("autoGrantPermissions", true);
            caps.setCapability("noReset", false);
            caps.setCapability("disableIdLocatorAutocompletion", true);

            URL appiumServer = new URL("http://127.0.0.1:4723");

            driver = new AndroidDriver(appiumServer, caps);

            initializeWebDriverWait();

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public void iosDriverSetUp() {
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName", "iPhone 15 Pro");
            caps.setCapability("platformVersion", "17.2");
            caps.setCapability("bundleId", "ge.qwerty.hashbank");
            caps.setCapability("xcodeSigningId", "iPhone Developer");
            caps.setCapability("disableIdLocatorAutocompletion", true);
            caps.setCapability("automationName", "XCUITest");
            caps.setCapability("settings[snapshotMaxDepth]", 61);
            caps.setCapability("settings[customSnapshotTimeout]", 50000);
            caps.setCapability("forceSimulatorSoftwareKeyboardPresence", true);
            caps.setCapability("connectHardwareKeyboard", false);
            caps.setCapability("noReset", true);
            caps.setCapability("app", "არ მაქვს მაკი :/");

            URL appiumServer = new URL("http://127.0.0.1:4723");

            driver = new IOSDriver(appiumServer, caps);

            // Initialize WebDriverWait after driver setup
            initializeWebDriverWait();

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
