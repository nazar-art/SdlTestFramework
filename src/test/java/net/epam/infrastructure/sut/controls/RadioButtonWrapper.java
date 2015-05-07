package net.epam.infrastructure.sut.controls;

import net.epam.infrastructure.sut.controls.interfaces.ICssValues;
import net.epam.infrastructure.sut.controls.interfaces.RadioButton;
import net.epam.infrastructure.sut.controls.uielements.ControlWrapper;
import net.epam.infrastructure.sut.controls.uielements.expression.builder.ControlBuilder;
import net.epam.infrastructure.sut.controls.uielements.expression.builder.IControlBuilderStep3;

public final class RadioButtonWrapper implements RadioButton {

    public static RadioButton getClickableById(String id, String name) {
        return get(ControlBuilder.setById(id).setName(name).setClickable());
    }

    public static RadioButton getClickableByXpath(String xpathExpression, String name) {
        return get(ControlBuilder.setByXPath(xpathExpression).setName(name).setClickable());
    }

    public static RadioButton getClickableByCssSelector(String selector, String name) {
        return get(ControlBuilder.setByCssSelector(selector).setName(name).setClickable());
    }

    private static RadioButton get(IControlBuilderStep3 controlBuilder) {
        return new RadioButtonWrapper(controlBuilder.setControlType(RadioButtonWrapper.class).build());
    }

    private final ControlWrapper control;

    private RadioButtonWrapper(ControlWrapper control) {
        this.control = control;
    }

    public void click() {
        control.click();
    }

    public boolean isSelected() {
        return control.isSelected();
    }

    public boolean isEnabled() {
        return control.isEnabled();
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
