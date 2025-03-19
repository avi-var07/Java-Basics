import java.util.*;
import java.util.Calendar;
import java.time.*;

class Main {
    public static void main(String[] args) {
        // Creating a Date object with the current date and time
        Date ob = new Date();
        System.out.println(ob);  // Prints current system date and time

        // Creating a Date object for a specific date (Deprecated method)
        Date ob1 = new Date(200, 10, 10);  // Year = 1900 + 200 = 2100, Month = 10 (November), Date = 10
        System.out.println(ob1);  // Prints: Sun Nov 10 00:00:00 IST 2100

        // Extracting and printing date components
        System.out.println(ob.getDate() + " " + (ob.getYear() + 1900) + " " + (ob.getMonth() + 1) + " " + ob.getTime());
        
        // Comparing Date objects
        System.out.println(ob.equals(ob1));  // false -> Dates are different
        System.out.println(ob1.after(ob));   // true -> ob1 is after ob (2100 > 2025)
        System.out.println(ob1.before(ob));  // false -> ob1 is not before ob
        System.out.println(ob1.compareTo(ob)); // Positive value -> ob1 is after ob

        // Using Calendar class to get current date and time
        // Calendar c1 = new Calendar();  // Error: Calendar is abstract; cannot be instantiated
        Calendar c1 = Calendar.getInstance();

        // Printing current date, month, and year
        System.out.println(c1.get(Calendar.DATE));   // Current day of the month
        System.out.println(c1.get(Calendar.MONTH));  // Current month (0-based index)
        System.out.println(c1.get(Calendar.YEAR));   // Current year

        // Printing current time details
        System.out.println(c1.get(Calendar.HOUR));   // Current hour
        System.out.println(c1.get(Calendar.MINUTE)); // Current minute
        System.out.println(c1.get(Calendar.SECOND)); // Current second

        // Printing different calendar attributes
        System.out.println(c1.get(Calendar.DAY_OF_WEEK));    // Day of the week (1 = Sunday, 7 = Saturday)
        System.out.println(c1.get(Calendar.DAY_OF_YEAR));    // Day number in the year
        System.out.println(c1.get(Calendar.WEEK_OF_MONTH));  // Current week in the month
        System.out.println(c1.get(Calendar.WEEK_OF_YEAR));   // Current week in the year
        System.out.println(c1.get(Calendar.DAY_OF_MONTH));   // Day of the month

        // Adding 2 months to the current date
        c1.add(Calendar.MONTH, 2);

        // Printing updated date after adding 2 months
        System.out.println("Updated Date: " + c1.get(Calendar.DATE) + "/" + (c1.get(Calendar.MONTH) + 1) + "/" + c1.get(Calendar.YEAR));

        LocalDate d = LocalDate.now();  // Getting current date
        System.out.println(d.getMonth());  // Current month
        System.out.println(d.getDayOfMonth());  // Current day of the month
        System.out.println(d.getYear());  // Current year
    }
}