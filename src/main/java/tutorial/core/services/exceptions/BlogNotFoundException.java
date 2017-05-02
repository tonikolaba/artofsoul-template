package tutorial.core.services.exceptions;

/**
 * Created by artofsoul on 4/28/17.
 */
public class BlogNotFoundException extends RuntimeException {
    public BlogNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public BlogNotFoundException(String message) {
        super(message);
    }

    public BlogNotFoundException() {
    }
}
