package net.epam.domain.uimaps;

import net.epam.infrastructure.sut.controls.interfaces.Button;
import net.epam.infrastructure.sut.controls.interfaces.TextLabel;

public class HeaderUiMap {
    //buttons under userName
    //currently need only one button
    public final Button favorite;
    public final Button setting;
    public final TextLabel userName;

    public HeaderUiMap() {
        favorite = CompositionRoot.getButtonStaticByXpath(XpathLocators.HEADER_FAVORITE_ICON, "favorites");
        setting = CompositionRoot.getButtonStaticByXpath(XpathLocators.HEADER_SETTING_ICON, "settings");
        userName = CompositionRoot.getTextLabelVisibleByXpath(XpathLocators.USER_NAME,"logged user");
    }
}
