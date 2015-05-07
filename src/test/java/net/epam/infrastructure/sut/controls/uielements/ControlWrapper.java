package net.epam.infrastructure.sut.controls.uielements;

import net.epam.infrastructure.sut.controls.interfaces.Control;
import net.epam.infrastructure.sut.controls.interfaces.ICssValues;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ControlWrapper implements Control {

    public final ControlInfo controlInfo;
    protected final ISearchContext searchContext;
    protected final ICondition elementIsAbsent;

    public ControlWrapper(ControlInfo controlInfo, ISearchContext searchContext, ICondition elementAbsent) {
        this.controlInfo = controlInfo;
        this.searchContext = searchContext;
        this.elementIsAbsent = elementAbsent;
    }

    public final WebElement get() {
        return searchContext.get(controlInfo);
    }

    public final void click() {
        get().click();
    }

    public final boolean isSelected() {
        return get().isSelected();
    }

    public final boolean isEnabled() {
        return get().isEnabled();
    }

    public final String getValueAttribute() {
        return get().getAttribute("value");
    }

    public final String getClassAttribute() {
        return get().getAttribute("class");
    }

    public final String getDisabledAttribute() {
        return get().getAttribute("disabled");
    }

    public final boolean isDisplayed() {
        return get().isDisplayed();
    }

    public final String about() {
        return controlInfo.toString();
    }

    public final boolean isAbsent() {
        return elementIsAbsent.is(controlInfo);
    }

    public final String sortOrder() {
        return get().getAttribute("aria-sort");
    }

    public final String getText() {
        return get().getText();
    }

    public final String getFirstSelectedOptionText() {
        return new Select(get()).getFirstSelectedOption().getText();
    }

    public final void selectByVisibleText(String value) {
        if (value != null) {
            new Select(get()).selectByVisibleText(value);
        }
    }


    public final ICssValues getCssValues() {
        return new CssValues.CssValuesBuilder().setFontFamily(get().getCssValue("font-family"))
                .setFontSize(get().getCssValue("font-size"))
                .setFontWeight(get().getCssValue("font-weight"))
                .setColor(get().getCssValue("color"))
                .setBackgroundColor(get().getCssValue("background-color"))
                .build();
    }

    public final ICssValues getCssValuesBackgroundImage() {
        return new CssValues.CssValuesBuilder()
                .setBackgroundImage(get().getCssValue("background-image")).build();
    }

}
