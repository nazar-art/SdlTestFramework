package net.epam.infrastructure.sut.controls;

import net.epam.infrastructure.exceptions.ControlNotFoundException;
import net.epam.infrastructure.sut.controls.interfaces.DropDown;
import net.epam.infrastructure.sut.controls.interfaces.ICssValues;
import net.epam.infrastructure.sut.controls.uielements.HierarchicalControl;
import net.epam.infrastructure.sut.controls.uielements.Location;
import net.epam.infrastructure.sut.controls.uielements.expression.builder.ControlBuilder;
import net.epam.infrastructure.sut.controls.uielements.expression.builder.IControlBuilderStep3;

public final class DropDownWrapper implements DropDown {

    private final HierarchicalControl control;

    private DropDownWrapper(HierarchicalControl control) {
        this.control = control;
    }

    private static DropDown get(final IControlBuilderStep3 controlBuilder) {
        return new DropDownWrapper(controlBuilder.setControlType(DropDownWrapper.class).buildHierarchicalControl());
    }

    public static DropDown getClickableByIdWrapper(final String id, final String name) {
        return get(ControlBuilder.setById(id).setName(name).setClickable());
    }

    public static DropDown getClickableByXpath(final String xpathExpression, final String description) {
        return get(ControlBuilder.setByXPath(xpathExpression).setName(description).setClickable());
    }

    public boolean isEnabled() {
        return control.getChildrenCount(Location.getByCssSelector("li a div.pulldown-carat"), "EnabledElements") > 0;
    }

    public String getSelectedOption() {
        return control.getSelectedOption("li a.dropdown-toggle.button span");
    }

    public void select(final String text) {
        if (getSelectedOption().equals(text)) {
            return;
        }

        if (isEnabled()) {
            control.getChild(Location.getByCssSelector("li a div.pulldown-carat"),
                    "EnabledOption").click();
            control.getChild(Location.getByXPath("li/ul/li/a/span[contains(text(), '" + text + "')]"),
                    "OptionToSelect").click();

        } else {
            throw new ControlNotFoundException("Drop-down isn't enabled to select: " + text);
        }
    }

    public void select(final int index) {
        final int optionsCount = getOptionsCount();
        if (optionsCount <= index) {
            select(getOptions()[index]);
        } else {
            throw new IndexOutOfBoundsException("Index: '" + index + ", Size: " + optionsCount);
        }
    }

    public boolean isDisplayed() {
        return control.isDisplayed();
    }

    public String[] getOptions() {
        if (isEnabled()) {
            return control.getInnerHTML(Location.getByCssSelector("li ul li a span"), "Options");
        } else {
            return new String[]{getSelectedOption()};
        }
    }

    public int getOptionsCount() {
        return control.getChildrenCount(Location.getByCssSelector("li ul li a span"), "Options");
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
