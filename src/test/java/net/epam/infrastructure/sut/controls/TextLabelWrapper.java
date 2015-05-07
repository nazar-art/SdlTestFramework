package net.epam.infrastructure.sut.controls;

import net.epam.infrastructure.sut.controls.interfaces.ICssValues;
import net.epam.infrastructure.sut.controls.interfaces.TextLabel;
import net.epam.infrastructure.sut.controls.uielements.ControlWrapper;
import net.epam.infrastructure.sut.controls.uielements.expression.builder.ControlBuilder;
import net.epam.infrastructure.sut.controls.uielements.expression.builder.IControlBuilderStep3;

public final class TextLabelWrapper implements TextLabel {

    private final ControlWrapper control;

    private TextLabelWrapper(ControlWrapper control) {
        this.control = control;
    }

    private static TextLabel get(IControlBuilderStep3 controlBuilder) {
        return new TextLabelWrapper(controlBuilder.setControlType(TextLabelWrapper.class).build());
    }

    public static TextLabel getVisibleByXpathWrapper(String xpathExpression, String name) {
        return get(ControlBuilder.setByXPath(xpathExpression).setName(name).setVisible());
    }

    public static TextLabel getClickableByXpathWrapper(String id, String name) {
        return get(ControlBuilder.setByXPath(id).setName(name).setClickable());
    }

    public static TextLabel getClickableByCssSelectorWrapper(String selector, String name) {
        return get(ControlBuilder.setByCssSelector(selector).setName(name).setClickable());
    }

    public static TextLabel getClickableById(String id, String name) {
        return get(ControlBuilder.setById(id).setName(name).setClickable());
    }

    public String getValue() {
        return control.getText();
    }

    public boolean isDisabled() {
        return control.getDisabledAttribute().equals("disabled");
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
