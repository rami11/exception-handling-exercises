package exercise3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Exercise3 {

    private final static String DATE_FORMAT = "dd-MM-yyyy";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Please, enter your birthday " + DATE_FORMAT.toLowerCase());
                String birthDate = scanner.nextLine();
                validateDate(birthDate, DATE_FORMAT);
                System.out.println("Your date of birth is " + birthDate);
                break;

            } catch (ParseException ex) {
                System.err.println(ex.getMessage());
                System.err.println("Try again!");
            }
        }
    }

    private static void validateDate(String date, String dateFormat) throws ParseException {
        try {
            DateFormat df = new SimpleDateFormat(dateFormat);
            df.setLenient(false);
            df.parse(date);

        } catch (ParseException e) {
            throw new ParseException("Invalid date!", e.getErrorOffset());
        }
    }
}
