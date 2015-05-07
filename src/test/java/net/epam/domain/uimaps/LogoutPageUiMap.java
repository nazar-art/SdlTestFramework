package net.epam.domain.uimaps;

import net.epam.infrastructure.sut.controls.interfaces.Link;

public final class LogoutPageUiMap {

    public final Link goToTheLoginPage;

    public LogoutPageUiMap() {
        goToTheLoginPage = CompositionRoot.getLinkClickableByCssSelector("a.textBlue", "Go to the Login Page");
    }

}
