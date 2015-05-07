package net.epam.infrastructure.sut.controls.interfaces;

public interface Tab extends Control, Selectable {

    boolean isDisplayed();

    boolean isEnabled();

    void click();

    String getText();

    void close();

}
