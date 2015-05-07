package net.epam.infrastructure.exceptions;

import net.epam.infrastructure.common.StringUtilities;

public class ScreenShotCapturingException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private static final String SCREENSHOT_CAPTURE_EXCEPTION = "Error while capturing and saving screenshot";

    public ScreenShotCapturingException() {
    }

    public ScreenShotCapturingException(final Throwable cause) {
        super(StringUtilities.appendStrings(SCREENSHOT_CAPTURE_EXCEPTION), cause);
    }
}
