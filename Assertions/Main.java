//Assertions are enabled using -ea during program execution. Assertions are basically used during Software development phase one you want that this question should always satisfy.
//java -ea Main
//ye likhne k baad agar age 18 se km: 
//Exception in thread "main" java.lang.AssertionError: Age is invalid at Main.main(Main.java:9)
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age (greater than 18 for execution): ");
        int age = sc.nextInt();
        assert (age>18):"Age is invalid";
        sc.close();
    }
}