package net.epam.infrastructure.exceptions;

import net.epam.infrastructure.common.StringUtilities;

public class ControlIsNotUnique extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private static final String CONTROL_IS_NOT_UNIQUE_EXCEPTION = "Element: " + "%0$s" + " is not not determined uniquely on page "
            + StringUtilities.NEW_LINE + "There are %1$d that conforms control search conditions";

    public ControlIsNotUnique(String controlDescription, int numberOfFoundElements) {
        super(StringUtilities.appendStrings(CONTROL_IS_NOT_UNIQUE_EXCEPTION, controlDescription, numberOfFoundElements));
    }

}
