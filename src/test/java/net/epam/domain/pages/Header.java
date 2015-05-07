package net.epam.domain.pages;

import net.epam.domain.uimaps.HeaderUiMap;
import net.epam.infrastructure.data.InputOutputUtils;
import org.testng.Assert;

public class Header {

    private HeaderUiMap controls;
    public String user;

    private Header() {
        this.controls = new HeaderUiMap();
    }

    public static Header get() {
        return new Header();
    }

    public Favorite openFavorites() {
        controls.favorite.click();
        return Favorite.get();
    }

    public Setting openSettings() {
        controls.setting.click();
        return Setting.get();
    }

    public void verifyLoggedUserName() {
        Assert.assertEquals(controls.userName.getValue().toLowerCase(), InputOutputUtils.getFullUserName());
    }

    public void closeSettings() {
        Setting.get().closeSetting();
    }
}
