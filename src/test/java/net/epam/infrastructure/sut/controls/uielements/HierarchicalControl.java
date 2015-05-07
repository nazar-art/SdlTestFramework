package net.epam.infrastructure.sut.controls.uielements;

import net.epam.infrastructure.exceptions.ControlNotFoundException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public final class HierarchicalControl extends ControlWrapper {

    public HierarchicalControl(ControlInfo controlInfo, ISearchContext searchContext, ICondition elementAbsent) {
        super(controlInfo, searchContext, elementAbsent);
    }

    public static String[] getText(WebElement[] elements) {
        final String[] options = new String[elements.length];
        for (int i = 0; i < elements.length; ++i) {
            options[i] = elements[i].getText();
        }
        return options;
    }

    public static boolean textFound(String searchedValue, WebElement[] options) {
        boolean result = false;
        for (WebElement option : options) {
            if (option.getText().equals(searchedValue)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public Integer getOptionsSize() {
        return new Select(get()).getOptions().size();
    }

    public boolean isOptionValuePresent(String searchedValue) {
        return textFound(searchedValue, new Select(get()).getOptions().toArray(new WebElement[0]));
    }

    public String[] getOptionsText() {
        return getText(new Select(get()).getOptions().toArray(new WebElement[0]));
    }

    public String getSelectedOption(String cssSelector) {
        return getChild(Location.getByCssSelector(cssSelector),
                "selectedOption").getText();
    }

    public WebElement getChild(Location location, String name) {
        try {
            return get().findElement(location.getBy());
        } catch (NoSuchElementException e) {
            WebDriverUtils.getScreenShot();
            throw new ControlNotFoundException(controlInfo.getName() + "\\" + name, e);
        }
    }

    public void clickChild(Location location, String name) {
        getChild(location, name).click();
    }

    public String getChildText(Location location, String name) {
        return getChild(location, name).getText();
    }

    public WebElement[] getChildren(Location location, String name) {
        try {
            return get().findElements(location.getBy()).toArray(new WebElement[0]);
        } catch (NoSuchElementException e) {
            WebDriverUtils.getScreenShot();
            throw new ControlNotFoundException(controlInfo.getName() + "\\" + name, e);
        }
    }

    public int getChildrenCount(Location location, String name) {
        return getChildren(location, name).length;
    }

    public String[] getChildrenText(Location location, String name) {
        return getText(getChildren(location, name));
    }

    public String[] getInnerHTML(Location location, String name) {
        WebElement[] elements = getChildren(location, name);
        List<String> options = new ArrayList<>();
        for (final WebElement element : elements) {
            options.add((String) WebDriverUtils.get().executeScript("return arguments[0].innerHTML;", element));
        }
        return options.toArray(new String[0]);
    }
}