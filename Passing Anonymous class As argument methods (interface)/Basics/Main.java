import java.util.*;
interface paymentMethod{
    void procpayment(int amnt);
}
class PaymentProcessor{
    void procpayment(int amnt, paymentMethod pm){   // passing the object of the interface
        pm.procpayment(amnt);
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to be processed");
        int amnt = sc.nextInt();
        PaymentProcessor pp = new PaymentProcessor();
        pp.procpayment(amnt, new paymentMethod(){    // passing the object of the interface
            public void procpayment(int amnt){
                System.out.println("Payment of "+amnt+" processed");
            }
        });
        sc.close();
    }
}