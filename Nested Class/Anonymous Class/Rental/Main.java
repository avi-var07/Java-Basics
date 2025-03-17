import java.util.Scanner;
abstract class Rental{
    abstract void Calrent(int days);
}
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days: ");
        int days = sc.nextInt();
        var r =  new Rental(){
            void Calrent(int days){
                System.out.println("Rent is: "+days*100);
            }
        };
        r.Calrent(days);
        sc.close();
    }
}