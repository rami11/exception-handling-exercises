package exercise4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercise4 {

    private final static String DATE_FORMAT = "dd-MM-yyyy";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter start date: ");
            Date startDate = parseDate(scanner.nextLine(), DATE_FORMAT);

            System.out.println("Enter end date: ");
            Date endDate = parseDate(scanner.nextLine(), DATE_FORMAT);

            validateDateRange(startDate, endDate);
            System.out.println("Success!");
            System.out.println("Start date: " + startDate);
            System.out.println("End date: " + endDate);

        } catch (ParseException ex) {
            System.err.println(ex.getMessage());
        } catch (DateException ex) {
            System.err.println(ex.getMessage());
        }
    }

    private static Date parseDate(String date,  String datePattern) throws ParseException {
        try {
            SimpleDateFormat format = new SimpleDateFormat(datePattern);
            return format.parse(date);

        } catch (ParseException ex) {
            throw new ParseException("Invalid Date!", ex.getErrorOffset());
        }
    }

    private static void validateDateRange(Date startDate, Date endDate) throws DateException {
        if (startDate.compareTo(endDate) == 1) {
            throw new DateException("start date cannot be less than end date");
        }
    }

}
