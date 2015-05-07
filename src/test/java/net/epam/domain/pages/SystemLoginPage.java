package net.epam.domain.pages;

import net.epam.domain.uimaps.SystemLoginPageUiMap;

public class SystemLoginPage {

    private SystemLoginPageUiMap controls;

    private SystemLoginPage() {
        this.controls = new SystemLoginPageUiMap();
    }

    public static SystemLoginPage get() {
        return new SystemLoginPage();
    }

    public void load(String path) {
        controls.browser.load(path);
    }

    public SystemLoginPage enterScreenName(String screenName) {
        controls.screenName.clear();
        controls.screenName.sendText(screenName);
        return SystemLoginPage.get();
    }

    public SystemLoginPage enterPassword(String password) {
        controls.password.clear();
        controls.password.sendText(password);
        return SystemLoginPage.get();
    }

    public SystemLoginPage clickRememberMe() {
        controls.rememberMe.click();
        return SystemLoginPage.get();
    }

    public MainPage clickSignIn() {
        controls.signIn.click();
        return MainPage.get();
    }

    public SystemLoginPage logout() {
        controls.userDropDown.click();
        controls.signOut.click();
        return SystemLoginPage.get();
    }

    public void stop(){
        controls.browser.stop();
    }
}
