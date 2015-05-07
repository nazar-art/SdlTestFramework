package net.epam.domain.pages;

import net.epam.domain.uimaps.SettingUiMap;

public class Setting {

    private SettingUiMap controls;

    private Setting(){
        this.controls = new SettingUiMap();
    }

    public static Setting get(){
        return new Setting();
    }

    public Setting openUserPreference(){
        if (controls.userPreferencesShow.isDisplayed())
            controls.userPreferencesShow.click();
        return this;
    }

    public CodingAndProduction openCodingAndProduction(){
        controls.codingAndProductionItem.click();
        return CodingAndProduction.get();
    }

    public void closeSetting(){
        controls.closeSettingsIcon.click();
    }
}
