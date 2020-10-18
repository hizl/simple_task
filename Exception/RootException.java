package Exception;

public class RootException extends RuntimeException{
    public RootException(String message) {
        super(message);
    }

    public RootException() {
        super();
    }
}
