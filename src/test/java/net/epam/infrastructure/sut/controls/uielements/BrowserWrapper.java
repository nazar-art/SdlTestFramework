package net.epam.infrastructure.sut.controls.uielements;

import net.epam.infrastructure.sut.controls.interfaces.Browser;

public final class BrowserWrapper implements Browser {

    public static Browser get() {
        return new BrowserWrapper();
    }

    private BrowserWrapper() {
    }

    @Override
    public void stop() {
        WebDriverUtils.stop();
    }

    @Override
    public void load(String path) {
        WebDriverUtils.get().get(path);
    }

    @Override
    public void refresh() {
        WebDriverUtils.get().navigate().refresh();
    }

    @Override
    public void getScreenShot() {
        WebDriverUtils.getScreenShot();
    }

}
