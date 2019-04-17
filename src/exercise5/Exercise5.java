package exercise5;

public class Exercise5 {

    public static void main(String[] args) {

        try {
            Student std1 = new Student("Steve", 100, 100);
            System.out.println(std1);

        } catch (InvalidAgeException | InvalidNoteException e) {
            e.printStackTrace();
        }

        try {
            Student std2 = new Student("Vincent", 26, 100);
            System.out.println(std2);

        } catch (InvalidAgeException | InvalidNoteException e) {
            e.printStackTrace();
        }

        try {
            Student std3 = new Student("Bruno", 26, 10);
            System.out.println(std3);

        } catch (InvalidAgeException | InvalidNoteException e) {
            e.printStackTrace();
        }
    }
}