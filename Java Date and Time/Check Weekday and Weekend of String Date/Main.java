import java.time.*;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get date input from user
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        // Convert string to LocalDate
        LocalDate date = LocalDate.parse(inputDate);

        // Get day of the week
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        // Check if it's a weekend
        System.out.println((dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) 
            ? "The given date falls on a Weekend." 
            : "The given date falls on a Weekday.");

        scanner.close();
    }
}
 
//  Output 
//  Enter a date (yyyy-MM-dd): 2022-12-25