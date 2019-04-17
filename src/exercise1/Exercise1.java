package exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please, enter an integer: ");
            int number = scanner.nextInt();

            System.out.println("You entered " + number);

        } catch (InputMismatchException ex) {
            System.err.println("Invalid entry!");
            scanner.nextLine();
        }
    }
}
