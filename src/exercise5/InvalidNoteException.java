package exercise5;

public class InvalidNoteException extends RangeException {

    InvalidNoteException(String name, int minNote, int maxNote) {
        super(name + "'s note", minNote, maxNote);
    }
}
