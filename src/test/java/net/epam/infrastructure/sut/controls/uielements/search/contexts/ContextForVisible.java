package net.epam.infrastructure.sut.controls.uielements.search.contexts;


import net.epam.infrastructure.exceptions.ControlNotFoundException;
import net.epam.infrastructure.sut.controls.uielements.ControlInfo;
import net.epam.infrastructure.sut.controls.uielements.ISearchContext;
import net.epam.infrastructure.sut.controls.uielements.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class ContextForVisible implements ISearchContext {

    public static ISearchContext get() {
        return new ContextForVisible();
    }

    private ContextForVisible() {
    }

    public WebElement get(ControlInfo controlInfo) {
        WebElement webElement = new WebDriverWait(WebDriverUtils.get(), WebDriverUtils.implicitlyWaitTimeout)
                .until(ExpectedConditions
                        .visibilityOfElementLocated(controlInfo.getBy()));

        if (webElement == null) {
            WebDriverUtils.getScreenShot();
            throw new ControlNotFoundException(controlInfo.getName());
        }
        return webElement;
    }

}
