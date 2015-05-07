package net.epam.infrastructure.sut.controls.interfaces;

public interface Link extends Control, HasValue {

    void click();

    Boolean isDisabled();

    boolean isDisplayed();
}
