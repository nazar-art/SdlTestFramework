package net.epam.infrastructure.sut.controls.uielements;

import net.epam.infrastructure.data.InputOutputUtils;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.io.File;
import java.util.Arrays;

public enum BrowserTypes {
    IE(120) {
        RemoteWebDriver start() {
            String ieDriverServerPath = InputOutputUtils.getIEDriverServer();
            File file = new File(ieDriverServerPath);
            System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
            DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
            capabilities.setCapability("unexpectedAlertBehaviour", "accept");
            return new InternetExplorerDriver(capabilities);
        }
    },
    FIREFOX(20) {
        RemoteWebDriver start() {
//            FirefoxProfile profile = new FirefoxProfile();
            /*File autoAuth = new File("autoauth-2.1-fx+fn.xpi");
            String autoAuthExtension = "extensions.autoAuth.";
            String passwordValue = "{\"Enter username and password for http://10.126.208.96:9090\":1423579013}";
            ProfilesIni profile = new ProfilesIni();
            FirefoxProfile myprofile = profile.getProfile("autotester");
            myprofile.setPreference("app.update.enabled", false);
            try {
                myprofile.addExtension(autoAuth);
                //myprofile.setPreference(autoAuthExtension+"lastAuthJSON", passwordValue);
            } catch (IOException e) {
                System.out.println("Error while loading extension files");
                System.out.println(e.getStackTrace());
            }


            myprofile.setAcceptUntrustedCertificates(true);*/
//            return new FirefoxDriver();

            String firefoxDriverPath = InputOutputUtils.getFirefoxDriver();
            FirefoxBinary binary = new FirefoxBinary(new File(firefoxDriverPath));
            FirefoxProfile profile = new FirefoxProfile();
            return new FirefoxDriver(binary, profile);
        }
    },
    CHROME(20) {
        RemoteWebDriver start() {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--ignore-certificate-errors");
            return new ChromeDriver(options);
        }
    },
    SAFARY(120) {
        @Override
        RemoteWebDriver start() {
            SafariOptions options = new SafariOptions();
            options.setUseCleanSession(true); //if you wish safari to forget session everytime
            return new SafariDriver(options);
        }
    };

    abstract RemoteWebDriver start();

    private final long implicitlyWaitTimeout;

    BrowserTypes(long implicitlyWaitTimeout) {
        this.implicitlyWaitTimeout = implicitlyWaitTimeout;
    }

    public long getImplicitlyWaitTimeout() {
        return implicitlyWaitTimeout;
    }

    public static String getAllAvailableBrowsers() {
        return Arrays.toString(BrowserTypes.values());
    }

}

