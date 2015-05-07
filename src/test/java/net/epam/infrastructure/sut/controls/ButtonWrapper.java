package net.epam.infrastructure.sut.controls;

import net.epam.infrastructure.sut.controls.interfaces.Button;
import net.epam.infrastructure.sut.controls.interfaces.ICssValues;
import net.epam.infrastructure.sut.controls.uielements.ControlWrapper;
import net.epam.infrastructure.sut.controls.uielements.expression.builder.ControlBuilder;
import net.epam.infrastructure.sut.controls.uielements.expression.builder.IControlBuilderStep3;

public final class ButtonWrapper implements Button {

    private final ControlWrapper control;

    private ButtonWrapper(ControlWrapper control) {
        this.control = control;
    }

    public static Button get(IControlBuilderStep3 controlBuilder) {
        return new ButtonWrapper(controlBuilder.setControlType(ButtonWrapper.class).build());
    }

    public static Button getStaticByXpathWrapper(String xpathExpression, String name) {
        return get(ControlBuilder.setByXPath(xpathExpression).setName(name).setStatic());
    }

    public static Button getClickableByIdWrapper(String id, String name) {
        return get(ControlBuilder.setById(id).setName(name).setClickable());
    }

    public static Button getClickableByXpath(String xpathExpression, String name) {
        return get(ControlBuilder.setByXPath(xpathExpression).setName(name).setClickable());
    }

    public void click() {
        control.click();
    }

    public String getText() {
        return control.getValueAttribute();
    }

    public String about() {
        return control.about();
    }

    public boolean isDisplayed() {
        return control.isDisplayed();
    }

    public boolean isAbsent() {
        return control.isAbsent();
    }

    @Override
    public ICssValues getCssValues() {
        return control.getCssValues();
    }

    public boolean isActive() {
        return control.getClassAttribute().equals("active");
    }

}
