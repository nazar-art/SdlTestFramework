package net.epam.infrastructure.exceptions;

import net.epam.infrastructure.common.StringUtilities;

public class CopyFileException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private static final String COPY_FILE_EXCEPTION = "Error while copying a file to a location '%0$s':" + StringUtilities.NEW_LINE + " %1$s";

    public CopyFileException(final String path, final Throwable cause) {
        super(StringUtilities.appendStrings(COPY_FILE_EXCEPTION, path), cause);
    }
}
