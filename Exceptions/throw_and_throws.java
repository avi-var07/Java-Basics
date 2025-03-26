import java.util.*;
class throw_and_throws{
    static void checkbalance(int amnt){
        if(amnt<500) throw new ArithmeticException("Insufficient balance");
        else System.out.println("Balance is sufficient");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        int amnt = sc.nextInt();
        try{
            checkbalance(amnt);
        }
        catch(ArithmeticException e){
            System.out.println("Exception: "+e);
        }
        sc.close();
    }
}