package net.epam.infrastructure.sut.controls.interfaces;

public interface ComboBox extends HasValue {

    void set(String text);

    boolean isDisplayed();

    Integer getOptionsCount();

    boolean verifyOptionValueIsPresent(String searchedValue);

    boolean verifySelectedOptionValue(String value);

    String[] getOptionsText();
}
