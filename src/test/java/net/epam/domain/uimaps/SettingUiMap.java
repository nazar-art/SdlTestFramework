package net.epam.domain.uimaps;

import net.epam.infrastructure.sut.controls.interfaces.Button;

public class SettingUiMap {

    public final Button closeSettingsIcon;

    public final Button userPreferencesShow;
    public final Button userPreferencesHide;

    public final Button codingAndProductionItem;

    public SettingUiMap(){
        this.closeSettingsIcon = CompositionRoot.getButtonStaticByXpath("//div[@class='title']//span[contains(@class,'icon-close')]", "close icon");
        this.userPreferencesShow = CompositionRoot.getButtonStaticByXpath(XpathLocators.SETTING_USER_PREF_SHOW_ICON, "user pref icon show");
        this.userPreferencesHide = CompositionRoot.getButtonStaticByXpath(XpathLocators.SETTING_USER_PREF_HIDE_ICON, "user pref icon hide");
        this.codingAndProductionItem = CompositionRoot.getButtonStaticByXpath(XpathLocators.USER_PREF_CODING_AND_PRODUCTION_ITEM, "coding and production item");
    }

}
