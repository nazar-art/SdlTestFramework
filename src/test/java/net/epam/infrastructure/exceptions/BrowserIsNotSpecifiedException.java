package net.epam.infrastructure.exceptions;

import net.epam.infrastructure.common.StringUtilities;

public class BrowserIsNotSpecifiedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private static final String BROWSER_NOT_FOUND_EXCEPTION = "Specified WebDriverUtils %1$s is not supported by tests: "
            + StringUtilities.NEW_LINE + " Please, use one of standard browser descriptors: %2$s";

    public BrowserIsNotSpecifiedException(String expectedBrowserType, String browserType) {
        super(StringUtilities.appendStrings(BROWSER_NOT_FOUND_EXCEPTION, browserType, expectedBrowserType));
    }

}
