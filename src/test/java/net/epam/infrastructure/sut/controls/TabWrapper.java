package net.epam.infrastructure.sut.controls;

import net.epam.infrastructure.sut.controls.interfaces.ICssValues;
import net.epam.infrastructure.sut.controls.interfaces.Tab;
import net.epam.infrastructure.sut.controls.uielements.HierarchicalControl;
import net.epam.infrastructure.sut.controls.uielements.Location;
import net.epam.infrastructure.sut.controls.uielements.expression.builder.ControlBuilder;
import net.epam.infrastructure.sut.controls.uielements.expression.builder.IControlBuilderStep3;

public final class TabWrapper implements Tab {

    public static Tab getClickableByIdWrapper(final String id, final String name) {
        return get(ControlBuilder.setById(id).setName(name).setClickable());
    }

    public static Tab getClickableByClassName(final String className, final String name) {
        return get(ControlBuilder.setByClassName(className).setName(name).setClickable());
    }

    private static Tab get(final IControlBuilderStep3 controlBuilder) {
        return new TabWrapper(controlBuilder.setControlType(TabWrapper.class).buildHierarchicalControl());
    }

    private final HierarchicalControl control;

    private TabWrapper(HierarchicalControl control) {
        this.control = control;
    }

    public boolean isEnabled() {
        return control.get().isEnabled();
    }

    public boolean isSelected() {
        return control.getClassAttribute().contains("selected");
    }

    public void click() {
        control.click();
    }

    public String getText() {
        return control.getChildText(Location.getByClassName("tabName"), "tabName");
    }

    public void close() {
        control.clickChild(Location.getByClassName("tab-close"), "tab-close");
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

}
