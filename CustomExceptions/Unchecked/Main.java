//Unchecked Exceptions inherited from RuntimeException, they are compiled successfully but give error/exception at runtime, they can be logical errors such as divide by zero.
//ye cli se ache se smjh aayega, chalo waha chalte hai...
//class sahi se compile hojayega, runtime pe exception aayega
import java.util.*;
class WeakPasswordException extends RuntimeException{
    public WeakPasswordException(String s){
        super(s);
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = sc.nextLine();
        if(password.length() < 8) throw new WeakPasswordException("Password is too weak, it should be at least 8 characters long.");
        else System.out.println("Password is strong enough.");
        sc.close();
    }
}