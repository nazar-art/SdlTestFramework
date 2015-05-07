package net.epam.infrastructure.sut.controls;

import net.epam.infrastructure.sut.controls.interfaces.ICssValues;
import net.epam.infrastructure.sut.controls.interfaces.LayoutTextLabel;
import net.epam.infrastructure.sut.controls.uielements.ControlWrapper;
import net.epam.infrastructure.sut.controls.uielements.expression.builder.ControlBuilder;
import net.epam.infrastructure.sut.controls.uielements.expression.builder.IControlBuilderStep3;

public final class LayoutTextLabelWrapper implements LayoutTextLabel {

    private final ControlWrapper control;

    private LayoutTextLabelWrapper(ControlWrapper control) {
        this.control = control;
    }

    private static LayoutTextLabel get(IControlBuilderStep3 controlBuilder) {
        return new LayoutTextLabelWrapper(controlBuilder.setControlType(LayoutTextLabelWrapper.class).build());
    }

    public static LayoutTextLabel getVisibleByXpath(String xpathExpression, String name) {
        return get(ControlBuilder.setByXPath(xpathExpression).setName(name).setVisible());
    }

    public static LayoutTextLabel getClickableByXpath(String id, String name) {
        return get(ControlBuilder.setByXPath(id).setName(name).setClickable());
    }

    public static LayoutTextLabel getClickableByCssSelectorWrapper(String selector, String name) {
        return get(ControlBuilder.setByCssSelector(selector).setName(name).setClickable());
    }

    public static LayoutTextLabel getClickableById(String id, String name) {
        return get(ControlBuilder.setById(id).setName(name).setClickable());
    }

    public String getValue() {
        return control.getText();
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
