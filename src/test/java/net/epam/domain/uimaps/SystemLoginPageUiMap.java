package net.epam.domain.uimaps;


import net.epam.infrastructure.sut.controls.interfaces.Browser;
import net.epam.infrastructure.sut.controls.interfaces.Button;
import net.epam.infrastructure.sut.controls.interfaces.CheckBox;
import net.epam.infrastructure.sut.controls.interfaces.TextInput;
import net.epam.infrastructure.sut.controls.uielements.BrowserWrapper;

public class SystemLoginPageUiMap {

    public final Browser browser;
    public Button signIn;
    public TextInput screenName;
    public TextInput password;
    public CheckBox rememberMe;
    public Button userDropDown;
    public Button signOut;

    public SystemLoginPageUiMap() {
        browser = BrowserWrapper.get();
        signIn = CompositionRoot.getButtonStaticByXpath(XpathLocators.SIGN_IN_BUTTON, "signInButton");
        screenName = CompositionRoot.getTextInputClickableByXpath(XpathLocators.SCREEN_NAME_INPUT_FIELD, "screenNameInputField");
        password = CompositionRoot.getTextInputClickableByXpath(XpathLocators.PASSWORD_INPUT_FIELD, "passwordField");
        rememberMe = CompositionRoot.getCheckBoxClickableByXpath(XpathLocators.REMEMBER_ME_CHECKBOX, "rememberMeCheckBox");
        userDropDown = CompositionRoot.getButtonClickableByXpath(XpathLocators.USER_DROPDOWN_BUTTON, "dropdownButton");
        signOut = CompositionRoot.getButtonClickableByXpath(XpathLocators.USER_SIGNOUT_BUTTON, "signOutButton");
    }
}
