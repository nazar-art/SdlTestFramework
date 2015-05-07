package net.epam.infrastructure.sut.controls;

import net.epam.infrastructure.sut.controls.interfaces.CheckBox;
import net.epam.infrastructure.sut.controls.interfaces.ICssValues;
import net.epam.infrastructure.sut.controls.uielements.ControlWrapper;
import net.epam.infrastructure.sut.controls.uielements.expression.builder.ControlBuilder;
import net.epam.infrastructure.sut.controls.uielements.expression.builder.IControlBuilderStep3;

public final class CheckBoxWrapper implements CheckBox {

    private final ControlWrapper control;

    private CheckBoxWrapper(ControlWrapper control) {
        this.control = control;
    }

    private static CheckBox get(IControlBuilderStep3 controlBuilder) {
        return new CheckBoxWrapper(controlBuilder.setControlType(CheckBoxWrapper.class).build());
    }

    public static CheckBox getClickableByXpath(String xpathExpression, String name) {
        return get(ControlBuilder.setByXPath(xpathExpression).setName(name).setClickable());
    }

    public static CheckBox getClickableByIdWrapper(String id, String name) {
        return get(ControlBuilder.setById(id).setName(name).setClickable());
    }

    public static CheckBox getClickableByCssSelectorWrapper(String selector, String name) {
        return get(ControlBuilder.setByCssSelector(selector).setName(name).setClickable());
    }

    public void click() {
        control.click();
    }

    public void set(Boolean value) {
        if (value != null && value != isSelected()) {
            control.click();
        }
    }

    public boolean isSelected() {
        return control.isSelected();
    }

    public boolean isNotSelected() {
        return !(control.isSelected());
    }

    public boolean isEnabled() {
        return control.isEnabled();
    }

    public boolean isDisabled() {
        return !(control.isEnabled());
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
