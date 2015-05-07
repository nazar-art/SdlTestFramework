package net.epam.domain.uimaps;

import net.epam.infrastructure.sut.controls.interfaces.Link;
import net.epam.infrastructure.sut.controls.interfaces.TextLabel;

public class NotificationMessageUiMap {

    public final TextLabel information;
    public final Link success;
    public final Link cancel;

    public NotificationMessageUiMap() {
        this.information = CompositionRoot.getTextLabelClickableByXpath(XpathLocators.NOTIFICATION_MESSAGE_ROOT + "//span[contains(@class,'content')]", "content");
        this.success = CompositionRoot.getLinkClickableByXpath(XpathLocators.NOTIFICATION_MESSAGE_ROOT + "//span[contains(@class,'success')]", "success");
        this.cancel = CompositionRoot.getLinkClickableByXpath(XpathLocators.NOTIFICATION_MESSAGE_ROOT + "//span[contains(@class,'cancel')]", "cancel");
    }
}
