package exercise2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Please, enter an integer: ");
                int number = scanner.nextInt();

                System.out.println("You entered " + number);
                break;

            } catch (InputMismatchException ex) {
                System.err.println("Invalid entry!");
                System.err.println("Try again!");
                scanner.nextLine();
            }
        }
    }
}
