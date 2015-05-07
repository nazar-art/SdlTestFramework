package net.epam.domain.uimaps;

import net.epam.infrastructure.sut.controls.interfaces.Button;
import net.epam.infrastructure.sut.controls.interfaces.TextInput;

public final class LoginPageUiMap {

    public final TextInput userName;
    public final TextInput password;
    public final Button enter;

    public LoginPageUiMap() {
        userName = CompositionRoot.getTextInputClickableByName("username", "User name");
        password = CompositionRoot.getTextInputClickableByName("password", "User password");
        enter = CompositionRoot.getButtonClickableById("login-submit", "Enter button on login screen");
    }

}
