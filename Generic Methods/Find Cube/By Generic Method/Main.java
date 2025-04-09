import java.util.*;
class Main{
    static <T extends Number> void cube(T a){
        System.out.println("Cube of " + a + " is: " + (a.doubleValue() * a.doubleValue() * a.doubleValue()));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();
        cube(num);
        sc.close();
    }
}