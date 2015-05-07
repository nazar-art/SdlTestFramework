package net.epam.domain.pages;

import net.epam.domain.uimaps.ApplicationUiMap;


public final class ApplicationPage {

    public static ApplicationPage get() {
        return new ApplicationPage();
    }

    private final ApplicationUiMap controls;

    private ApplicationPage() {
        this.controls = new ApplicationUiMap();
    }

    public void stop() {
        controls.browser.stop();
    }

    public void load(String path) {
        controls.browser.load(path);
    }

    public void refresh() {
        controls.browser.refresh();
    }


    public void getScreenShot() {
        controls.browser.getScreenShot();
    }

}
