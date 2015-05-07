package net.epam.infrastructure.sut.controls;

import net.epam.infrastructure.sut.controls.interfaces.ComboBox;
import net.epam.infrastructure.sut.controls.interfaces.ICssValues;
import net.epam.infrastructure.sut.controls.uielements.HierarchicalControl;
import net.epam.infrastructure.sut.controls.uielements.expression.builder.ControlBuilder;
import net.epam.infrastructure.sut.controls.uielements.expression.builder.IControlBuilderStep3;

public final class ComboBoxWrapper implements ComboBox {

    private final HierarchicalControl control;

    private ComboBoxWrapper(HierarchicalControl control) {
        this.control = control;
    }

    private static ComboBox get(IControlBuilderStep3 controlBuilder) {
        return new ComboBoxWrapper(controlBuilder.setControlType(CheckBoxWrapper.class).buildHierarchicalControl());
    }

    public static ComboBox getClickableById(String id, String name) {
        return get(ControlBuilder.setById(id).setName(name).setClickable());
    }

    public static ComboBox getClickableByXpath(String xpathExpression, String description) {
        return get(ControlBuilder.setByXPath(xpathExpression).setName(description).setClickable());
    }

    public void set(String value) {
        control.selectByVisibleText(value);
    }

    public String getValue() {
        return control.getFirstSelectedOptionText();
    }

    public Integer getOptionsCount() {
        return control.getOptionsSize();
    }

    public boolean verifyOptionValueIsPresent(String searchedValue) {
        return control.isOptionValuePresent(searchedValue);
    }

    public boolean verifySelectedOptionValue(String value) {
        return getValue().equals(value);
    }

    public boolean isDisplayed() {
        return control.isDisplayed();
    }

    public String[] getOptionsText() {
        return control.getOptionsText();
    }

    public boolean isAbsent() {
        return control.isAbsent();
    }

    @Override
    public ICssValues getCssValues() {
        return control.getCssValues();
    }

    public String about() {
        return control.about();
    }
}
