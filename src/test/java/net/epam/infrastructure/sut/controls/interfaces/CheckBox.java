package net.epam.infrastructure.sut.controls.interfaces;

public interface CheckBox extends Control, Selectable {

    void click();

    void set(Boolean value);

    boolean isDisabled();

    boolean isEnabled();
}
