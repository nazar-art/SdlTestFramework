package net.epam.infrastructure.exceptions;

import net.epam.infrastructure.common.StringUtilities;

public class PropertyIsNotSpecifiedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private static final String PROPERTY_NOT_FOUND_EXCEPTION = "Specified property '%0$s' is not found, due to following reason: "
            + StringUtilities.NEW_LINE + " %1$s";

    private static final String PROPERTY_NOT_FOUND_IN_EXCEPTION = "Specified property '%0$s' is not found in '" + "%1$s"
            + "' due to following reason: " + StringUtilities.NEW_LINE + " %2$s";

    public PropertyIsNotSpecifiedException() {
        super();
    }

    public PropertyIsNotSpecifiedException(String propertyType, Throwable reason) {
        super(StringUtilities.appendStrings(PROPERTY_NOT_FOUND_EXCEPTION, propertyType, reason.getMessage()), reason);
    }

    public PropertyIsNotSpecifiedException(String source, String propertyType, Throwable reason) {
        super(StringUtilities.appendStrings(PROPERTY_NOT_FOUND_IN_EXCEPTION, propertyType, source, reason.getMessage()), reason);
    }

    public PropertyIsNotSpecifiedException(String propertyType) {
        super(StringUtilities.appendStrings(PROPERTY_NOT_FOUND_EXCEPTION, propertyType, ""));
    }

    public PropertyIsNotSpecifiedException(Throwable exceptionMessage) {
        super(exceptionMessage);
    }

}
