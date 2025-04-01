//Checked Exceptions are inherited from the Exception class
//Unchecked Exceptions are inherited from the RuntimeException class
//The main difference between checked and unchecked exceptions is that checked exceptions are checked at compile-time, while unchecked exceptions are checked at runtime.
//Checked exceptions must be either caught or declared in the method signature, while unchecked exceptions do not have this requirement.
//Unchecked exceptions are usually the result of programming errors, such as logic errors or improper use of an API, while checked exceptions are typically used for conditions that a program should catch and handle.
//Checked exceptions are used for conditions that a program should catch and handle, while unchecked exceptions are used for programming errors that should not be caught. you 'must' use try-catch block to handle checked exceptions, while you 'can' use try-catch block to handle unchecked exceptions but it is not mandatory.
import java.util.*;
class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}
class Main{
    public static boolean isValidPassword(String password){
        if(password.length()<8) return false;

        for(char ch: password.toCharArray()){
            if(Character.isDigit(ch)) return true;
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = sc.nextLine();
        try{
            if(!isValidPassword(password)) throw new WeakPasswordException("Password must be at least 8 characters long and contain at least one digit.");

            else System.out.println("Password is valid.");
        }
        catch (WeakPasswordException e) {
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}