package ro.cni.javabasicmetrosystems.prepared.day3.exceptions;

public class OurOwnRuntimeException extends RuntimeException {

    public OurOwnRuntimeException(final Throwable e) {
        super("This is a custom message!", e);
    }
}
