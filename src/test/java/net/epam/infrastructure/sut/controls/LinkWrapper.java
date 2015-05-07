package net.epam.infrastructure.sut.controls;

import net.epam.infrastructure.sut.controls.interfaces.ICssValues;
import net.epam.infrastructure.sut.controls.interfaces.Link;
import net.epam.infrastructure.sut.controls.uielements.ControlWrapper;
import net.epam.infrastructure.sut.controls.uielements.expression.builder.ControlBuilder;
import net.epam.infrastructure.sut.controls.uielements.expression.builder.IControlBuilderStep3;

public final class LinkWrapper implements Link {

    private final ControlWrapper control;

    private LinkWrapper(ControlWrapper control) {
        this.control = control;
    }

    private static Link get(IControlBuilderStep3 controlBuilder) {
        return new LinkWrapper(controlBuilder.setControlType(LinkWrapper.class).build());
    }

    public static Link getClickableByXpathWrapper(String xpathExpression, String name) {
        return get(ControlBuilder.setByXPath(xpathExpression).setName(name).setClickable());
    }

    public static Link getClickableByIdWrapper(String id, String name) {
        return get(ControlBuilder.setById(id).setName(name).setClickable());
    }

    public static Link getClickableByCssSelectorWrapper(String selector, String name) {
        return get(ControlBuilder.setByCssSelector(selector).setName(name).setClickable());
    }

    public void click() {
        control.get().click();
    }

    public Boolean isDisabled() {
        return control.getClassAttribute().contains("dimmed");
    }

    public String getValue() {
        return control.getText();
    }

    public Boolean verifyAlarmSignIsPresent() {
        return control.getCssValuesBackgroundImage().getBackgroundImage().contains("filter_alert.gif");
    }

    public Boolean verifyAlarmSignIsNotPresent() {
        return control.getCssValuesBackgroundImage().getBackgroundImage().equals("none");
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

    public String about() {
        return control.about();
    }
}
