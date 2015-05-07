package net.epam.infrastructure.sut.controls;

import net.epam.infrastructure.sut.controls.interfaces.ICssValues;
import net.epam.infrastructure.sut.controls.interfaces.TextInput;
import net.epam.infrastructure.sut.controls.uielements.ControlWrapper;
import net.epam.infrastructure.sut.controls.uielements.expression.builder.ControlBuilder;
import net.epam.infrastructure.sut.controls.uielements.expression.builder.IControlBuilderStep3;

public final class TextInputWrapper implements TextInput {

    private final ControlWrapper control;

    private TextInputWrapper(ControlWrapper control) {
        this.control = control;
    }

    private static TextInput get(IControlBuilderStep3 controlBuilder) {
        return new TextInputWrapper(controlBuilder.setControlType(TextInputWrapper.class).build());
    }

    public static TextInput getClickableByXpath(String xpathExpression, String name) {
        return get(ControlBuilder.setByXPath(xpathExpression).setName(name).setClickable());
    }

    public static TextInput getClickableById(String id, String name) {
        return get(ControlBuilder.setById(id).setName(name).setClickable());
    }

    public static TextInput getClickableByNameWrapper(String searchedName, String name) {
        return get(ControlBuilder.setByName(searchedName).setName(name).setClickable());
    }

    public void sendText(final String text) {
        control.get().sendKeys(text);
    }

    public void click() {
        control.click();
    }

    public void type(final String text) {
        if (text != null) {
            click();
            clear();
            sendText(text);
        }
    }

    public String getValue() {
        return control.getValueAttribute();
    }

    public void clear() {
        control.get().clear();
    }

    public boolean isDisabled() {
        return Boolean.parseBoolean(control.getDisabledAttribute());
    }

    public boolean isDisplayed() {
        return control.get().isDisplayed();
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
