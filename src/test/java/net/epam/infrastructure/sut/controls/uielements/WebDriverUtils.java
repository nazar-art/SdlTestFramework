package net.epam.infrastructure.sut.controls.uielements;


import net.epam.infrastructure.data.InputOutputUtils;
import net.epam.infrastructure.exceptions.BrowserIsNotSpecifiedException;
import net.epam.infrastructure.exceptions.ScreenShotCapturingException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public final class WebDriverUtils {

    private static RemoteWebDriver driver;

    public static final Integer ABSENCE_TIMEOUT = 5;
    public static long implicitlyWaitTimeout;
    public static String URL = "http://EMEA%5cMarozTat:Adidas2015-02@10.126.208.96:9090/en/web/adidas/?entity=range";

    private WebDriverUtils() {
    }

    public static synchronized RemoteWebDriver get() {
        if (driver == null) {
            BrowserTypes browser = readBrowserType();
            implicitlyWaitTimeout = browser.getImplicitlyWaitTimeout();
            driver = browser.start();
            //driver.get(URL);
            driver.manage().timeouts().implicitlyWait(browser.getImplicitlyWaitTimeout(), TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        return driver;
    }

    private static synchronized BrowserTypes readBrowserType() {
        {
            String browserTypeString = InputOutputUtils.getBrowserType();

            try {
                return BrowserTypes.valueOf(browserTypeString);
            } catch (Exception e) {
                throw new BrowserIsNotSpecifiedException(BrowserTypes.getAllAvailableBrowsers(), browserTypeString);
            }
        }
    }

    public static void stop() {
        if (driver != null) {
            driver.quit();
        }
        driver = null;
    }

    public static void load(String path) {
        get().get(path);
    }

    public static void refresh() {
        get().navigate().refresh();
    }


    public static void getScreenShot() {

        String strDirectory = "./target/screenshots/";
        File screenshot;

        InputOutputUtils.createDirIfNotExist(strDirectory);
        try {
            screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        } catch (Exception e) {
            throw new ScreenShotCapturingException(e);
        }

        InputOutputUtils.copy(screenshot, strDirectory + screenshot.getName());
        InputOutputUtils.delete(screenshot);
    }

}
