package net.epam.infrastructure.exceptions;

public class InterruptedTestException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InterruptedTestException() {
        super();
    }

    public InterruptedTestException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

    public InterruptedTestException(String arg0) {
        super(arg0);
    }

    public InterruptedTestException(Throwable arg0) {
        super(arg0);
    }
}
