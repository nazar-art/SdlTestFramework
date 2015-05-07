package net.epam.domain.uimaps;

import net.epam.infrastructure.sut.controls.interfaces.Browser;
import net.epam.infrastructure.sut.controls.uielements.BrowserWrapper;

public class ApplicationUiMap {

    public final Browser browser;

    public ApplicationUiMap() {
        browser = BrowserWrapper.get();
    }
}
