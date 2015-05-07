package net.epam.infrastructure.sut.controls.interfaces;

public interface DropDown extends Control {

    String getSelectedOption();

    void select(final String text);

    void select(final int index);

    boolean isDisplayed();

    String[] getOptions();

    int getOptionsCount();

    boolean isEnabled();

}
