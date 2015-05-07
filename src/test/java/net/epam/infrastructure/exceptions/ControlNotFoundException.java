package net.epam.infrastructure.exceptions;

import net.epam.infrastructure.common.StringUtilities;

public class ControlNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private static final String CONTROL_NOT_FOUND_EXCEPTION = "Element: " + "%0$s" + " is not available on page:"
            + StringUtilities.NEW_LINE + " %1$s";

    public ControlNotFoundException() {
        super();
    }

    public ControlNotFoundException(String controlDescription, Throwable reason) {
        super(StringUtilities.appendStrings(CONTROL_NOT_FOUND_EXCEPTION, controlDescription, reason.getMessage()), reason);
    }

    public ControlNotFoundException(String controlDescription) {
        super(StringUtilities.appendStrings(CONTROL_NOT_FOUND_EXCEPTION, controlDescription));
    }

    public ControlNotFoundException(Throwable exceptionMessage) {
        super(exceptionMessage);
    }

}
