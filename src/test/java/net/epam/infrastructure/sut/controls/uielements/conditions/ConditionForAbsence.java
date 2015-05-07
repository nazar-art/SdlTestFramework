package net.epam.infrastructure.sut.controls.uielements.conditions;


import net.epam.infrastructure.exceptions.ControlIsNotUnique;
import net.epam.infrastructure.sut.controls.uielements.ControlInfo;
import net.epam.infrastructure.sut.controls.uielements.ICondition;
import net.epam.infrastructure.sut.controls.uielements.WebDriverUtils;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public final class ConditionForAbsence implements ICondition {

    public static ICondition get() {
        return new ConditionForAbsence();
    }

    private ConditionForAbsence() {
    }

    public boolean is(ControlInfo controlInfo) {
        List<WebElement> webElementList;
        try {

            webElementList =
                    new WebDriverWait(WebDriverUtils.get(), WebDriverUtils.ABSENCE_TIMEOUT)
                            .until(ExpectedConditions.presenceOfAllElementsLocatedBy(controlInfo.getBy()));

        } catch (TimeoutException e) {

            return true;
        }

        if (webElementList.size() == 0) {
            return true;
        }

        if (webElementList.size() > 1) {
            WebDriverUtils.getScreenShot();
            throw new ControlIsNotUnique(controlInfo.getPath(), webElementList.size());
        }
        try {

            return (new WebDriverWait(WebDriverUtils.get(), 300)
                    //WebDriverUtils.implicitlyWaitTimeout)
                    .until(ExpectedConditions.visibilityOfElementLocated(controlInfo.getBy()))) == null;

        } catch (TimeoutException e) {

            return true;
        }
    }

}
