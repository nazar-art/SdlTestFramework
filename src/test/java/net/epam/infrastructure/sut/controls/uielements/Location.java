package net.epam.infrastructure.sut.controls.uielements;

import net.epam.infrastructure.common.StringUtilities;
import org.openqa.selenium.By;

public final class Location {

    public static Location getById(String id) {
        return new Location(Type.ById, id);
    }

    public static Location getByTagName(String tagname) {
        return new Location(Type.ByTagName, tagname);
    }

    public static Location getByName(String searchName) {
        return new Location(Type.ByName, searchName);
    }

    public static Location getByXPath(String xpathExpression) {
        return new Location(Type.ByXPath, xpathExpression);
    }

    public static Location getByCssSelector(String selector) {
        return new Location(Type.ByCssSelector, selector);
    }

    public static Location getByClassName(String className) {
        return new Location(Type.ByClassName, className);
    }

    private enum Type {

        ById {
            By getBy(String id) {
                return new By.ById(id);
            }
        },
        ByTagName {
            By getBy(String tagName) {
                return new By.ByTagName(tagName);
            }
        },
        ByName {
            By getBy(String searchName) {
                return new By.ByName(searchName);
            }
        },
        ByXPath {
            By getBy(String xpathExpression) {
                return new By.ByXPath(xpathExpression);
            }
        },
        ByCssSelector {
            By getBy(String selector) {
                return new By.ByCssSelector(selector);
            }
        },
        ByClassName {
            By getBy(String className) {
                return new By.ByClassName(className);
            }
        };

        abstract By getBy(String path);
    }

    private final String value;

    public String getValue() {
        return value;
    }

    public String getLocationType() {
        return locationType.name();
    }

    private final Type locationType;

    private Location(Type locationType, String value) {
        this.value = value;
        this.locationType = locationType;
    }

    public By getBy() {
        return locationType.getBy(value);
    }

    @Override
    public String toString() {
        return StringUtilities.appendStrings("Location %1$s : %2$s", locationType.name(), value);
    }
}
