package exercise5;

public class InvalidAgeException extends RangeException {

    InvalidAgeException(String name, int minAge, int maxAge) {
        super(name + "'s age", minAge, maxAge);
    }
}