package net.epam.infrastructure.sut.controls.interfaces;

public interface TextInput extends TextLabel {

    void clear();

    void type(String text);

    void sendText(String text);

    boolean isDisabled();

    boolean isDisplayed();
}
