package net.epam.domain.pages;

import net.epam.domain.uimaps.NotificationMessageUiMap;
import net.epam.domain.uimaps.XpathLocators;
import net.epam.infrastructure.sut.controls.uielements.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class NotificationMessage {

    private NotificationMessageUiMap controls;

    private NotificationMessage(){
        this.controls = new NotificationMessageUiMap();
    }

    public static NotificationMessage get(){
        return new NotificationMessage();
    }

    public String getMessage(){
        return controls.information.getValue();
    }

    private WebDriver getDriver() {
        return WebDriverUtils.get();
    }

    public void acceptMessage(){
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", getDriver().findElement(By.xpath(XpathLocators.NOTIFICATION_MESSAGE_ROOT)));
        controls.success.click();
    }

    public void declineMessage(){
        controls.cancel.click();
    }
}
