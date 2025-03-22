import java.time.*;
class LibraryDueDate {
    public static void main(String[] args) {
    
        LocalDate issueDate = LocalDate.of(2025, 3, 14);
        
        LocalDate dueDate = issueDate.plusDays(14);
        LocalDate currentDate = LocalDate.now();

        
        if (currentDate.isAfter(dueDate)) {
            Period overduePeriod = Period.between(dueDate, currentDate);
            System.out.println("The book is overdue by " 
                + overduePeriod.getDays() + " days.");
        } else {
            Period remainingPeriod = Period.between(currentDate, dueDate);
            System.out.println("The book is due in " 
                + remainingPeriod.getDays() + " days.");
        }
    }
}
