package net.epam.infrastructure.exceptions;

import net.epam.infrastructure.common.StringUtilities;

public class DeleteFileException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private static final String DELETE_FILE_EXCEPTION = "Error while deleting a file from a location '%0$s'";

    public DeleteFileException(final String path, final Throwable cause) {
        super(StringUtilities.appendStrings(DELETE_FILE_EXCEPTION, path), cause);
    }

    public DeleteFileException(final Throwable cause) {
        super(cause);
    }
}
