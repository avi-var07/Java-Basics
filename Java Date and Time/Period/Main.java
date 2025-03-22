import java.time.*;
class Main {
    public static void main(String[] args) {
        Period p1 = Period.of(5,3,10);
        System.out.println(p1);
        System.out.println(p1.getDays());
        System.out.println(p1.getYears());

        LocalDate l1 = LocalDate.of(2025,5,15);
        LocalDate l2 = LocalDate.of(2025,10,15);
        Period pbet = Period.between(l1, l2);
        System.out.println(pbet);

        Duration d1 = Duration.ofHours(5);
        Duration d2 = Duration.ofHours(6).plusMinutes(45);
        System.out.println(d1);
        System.out.println(d2);
        
    }
    
}