package exercise5;

public class RangeException extends Exception {

    RangeException(String string, int min, int max) {
        super(String.format("%s must be in range [%d..%d]", string, min, max));
    }
}
