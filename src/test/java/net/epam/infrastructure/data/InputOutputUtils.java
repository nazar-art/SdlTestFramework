package net.epam.infrastructure.data;

import net.epam.infrastructure.exceptions.CopyFileException;
import net.epam.infrastructure.exceptions.DeleteFileException;
import net.epam.infrastructure.exceptions.PropertyIsNotSpecifiedException;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public final class InputOutputUtils {

    private InputOutputUtils() {
    }

    private static String getProperty(final String propertyName) {
        final Properties properties = new Properties();

        try {
            properties.load(new FileInputStream("environment.properties"));
        } catch (Exception e) {
            throw new PropertyIsNotSpecifiedException("environment.properties", propertyName, e);
        }

        return properties.getProperty(propertyName);
    }

    public static String getFutureQA() {
        return InputOutputUtils.getProperty("future_qa");
    }

    public static String getSystemLoginPageURL() {
        return InputOutputUtils.getProperty("systemLoginURL");
    }

    public static String getUsername() {
        return InputOutputUtils.getProperty("userName");
    }

    public static String getPassword() {
        return InputOutputUtils.getProperty("userPass");
    }

    public static String getFullUserName(){return InputOutputUtils.getProperty("fullUserName");}

    public static void delete(File screenshot) {
        try {
            FileUtils.forceDelete(screenshot);
        } catch (Exception e) {
            throw new DeleteFileException(e);
        }
    }

    public static void copy(File screenshot, String path) {
        try {
            FileUtils.copyFile(screenshot, new File(path));
        } catch (Exception e) {
            throw new CopyFileException(path, e);
        }
    }

    public static void createDirIfNotExist(String strDirectory) {
        File file = new File(strDirectory);
        if (!(file.exists())) {
            file.mkdir();
        }
    }

    public static String getSystemProperty(String property) {
        String propertyString;
        try {
            propertyString = System.getProperty(property);
        } catch (Exception e) {
            throw new PropertyIsNotSpecifiedException(property, e);
        }
        return propertyString;
    }

    public static String getBrowserType() {
        return InputOutputUtils.getProperty("browser");
    }

    public static String getIEDriverServer(){
        return InputOutputUtils.getProperty("ieDriverServer");
    }

    public static String getFirefoxDriver(){
        return InputOutputUtils.getProperty("firefoxDriver");
    }
}
