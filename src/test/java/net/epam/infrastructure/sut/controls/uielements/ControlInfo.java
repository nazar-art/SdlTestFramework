package net.epam.infrastructure.sut.controls.uielements;

import net.epam.infrastructure.common.StringUtilities;
import org.openqa.selenium.By;

import java.util.Arrays;

public final class ControlInfo implements IMetaInfo {
    private static final String CONTROL_INFO = StringUtilities.NEW_LINE + "ControlWrapper name: '%1$s'" + StringUtilities.NEW_LINE + "Type: '%3$s'" +
            StringUtilities.NEW_LINE + "Selector: '%2$s'" + StringUtilities.NEW_LINE + "Implements: %4$s" + StringUtilities.NEW_LINE;
    private final Location location;
    private final String name;
    private final Class controlClass;

    private ControlInfo(Location location, String name, Class controlClass) {
        this.location = location;
        this.name = name;
        this.controlClass = controlClass;
    }

    public static ControlInfo create(Location location, String name, Class controlClass) {
        return new ControlInfo(location, name, controlClass);
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return location.toString();
    }

    public String getControlClassName() {
        return controlClass.getSimpleName();
    }

    public String getControlInterfaces() {
        return Arrays.toString(controlClass.getInterfaces());
    }

    public By getBy() {
        return location.getBy();
    }

    @Override
    public String toString() {
        return StringUtilities.appendStrings(CONTROL_INFO, getName(), getPath(),
                getControlClassName(), getControlInterfaces());
    }

}
