package net.epam.infrastructure.sut.controls.interfaces;

public interface Button extends Control {

    void click();

    String getText();

    boolean isDisplayed();

    boolean isActive();

}
