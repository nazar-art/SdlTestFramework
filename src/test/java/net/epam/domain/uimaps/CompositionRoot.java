package net.epam.domain.uimaps;

import net.epam.infrastructure.sut.controls.*;
import net.epam.infrastructure.sut.controls.interfaces.*;

public class CompositionRoot {

    // Buttons

    public static Button getButtonStaticByXpath(String xpath, String name) {
        return ButtonWrapper.getStaticByXpathWrapper(xpath, name);
    }

    public static Button getButtonClickableById(String id, String name) {
        return ButtonWrapper.getClickableByIdWrapper(id, name);
    }

    public static Button getButtonClickableByXpath(String xpath, String name) {
        return ButtonWrapper.getClickableByXpath(xpath, name);
    }

    // DropDown

    public static DropDown getDropDownClickableById(final String id, final String name) {
        return DropDownWrapper.getClickableByIdWrapper(id, name);
    }

    public static DropDown getDropDownClickableByXpath(final String xpath, final String name) {
        return DropDownWrapper.getClickableByXpath(xpath, name);
    }

    // Layout Text Label

    public static LayoutTextLabel getLayoutTextLabelClickableByCssSelector(String cssSelector, String name) {
        return LayoutTextLabelWrapper.getClickableByCssSelectorWrapper(cssSelector, name);
    }

    // Tabs

    public static Tab getTabClickableById(final String id, final String name) {
        return TabWrapper.getClickableByIdWrapper(id, name);
    }

    // TextInputs

    public static TextInput getTextInputClickableByName(String searchedName, String name) {
        return TextInputWrapper.getClickableByNameWrapper(searchedName, name);
    }

    public static TextInput getTextInputClickableByXpath(String searchedName, String name) {
        return TextInputWrapper.getClickableByXpath(searchedName, name);
    }

    // TextLabels

    public static TextLabel getTextLabelVisibleByXpath(String xpathExpression, String name) {
        return TextLabelWrapper.getVisibleByXpathWrapper(xpathExpression, name);
    }

    public static TextLabel getTextLabelClickableByXpath(String xpath, String name) {
        return TextLabelWrapper.getClickableByXpathWrapper(xpath, name);
    }

    public static TextLabel getTextLabelClickableByCssSelector(String selector, String name) {
        return TextLabelWrapper.getClickableByCssSelectorWrapper(selector, name);
    }

    // Links

    public static Link getLinkClickableByXpath(String xpathExpression, String name) {
        return LinkWrapper.getClickableByXpathWrapper(xpathExpression, name);
    }

    public static Link getLinkClickableById(String id, String name) {
        return LinkWrapper.getClickableByIdWrapper(id, name);
    }

    public static Link getLinkClickableByCssSelector(String selector, String name) {
        return LinkWrapper.getClickableByCssSelectorWrapper(selector, name);
    }

    // CheckBoxes

    public static CheckBox getCheckBoxClickableByXpath(String xpath, String name) {
        return CheckBoxWrapper.getClickableByXpath(xpath, name);
    }

    public static CheckBox getCheckBoxClickableById(String id, String name) {
        return CheckBoxWrapper.getClickableByIdWrapper(id, name);
    }

    public static CheckBox getCheckBoxClickableByCssSelector(String selector, String name) {
        return CheckBoxWrapper.getClickableByCssSelectorWrapper(selector, name);
    }
}
