package net.epam.infrastructure.sut.controls.uielements.search.contexts;

import net.epam.infrastructure.exceptions.ControlNotFoundException;
import net.epam.infrastructure.sut.controls.uielements.ControlInfo;
import net.epam.infrastructure.sut.controls.uielements.ISearchContext;
import net.epam.infrastructure.sut.controls.uielements.WebDriverUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public final class ContextForExistent implements ISearchContext {

    private WebElement webElement = null;

    public static ISearchContext get() {
        return new ContextForExistent();
    }

    private ContextForExistent() {
    }

    public WebElement get(ControlInfo controlInfo) {

        try {
            if (webElement == null) {
                webElement = WebDriverUtils.get().findElement(controlInfo.getBy());
            }
            return webElement;
        } catch (NoSuchElementException e) {
            WebDriverUtils.getScreenShot();
            throw new ControlNotFoundException(controlInfo.getName(), e);
        }

    }

}
