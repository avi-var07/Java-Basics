import java.util.Scanner;
abstract class Rent{
    int days;
    Rent(int days){
        this.days=days;
    }
    abstract void CalRent();
}
class Car extends Rent{
    Car(int days){
        super(days);
    }
    void CalRent(){
        System.out.println("Car Rent is: "+(50*days));
    }
}
class Truck extends Rent{
    Truck(int days){
        super(days);
    }
    void CalRent(){
        System.out.println("Truck Rent is: "+(80*days));
    }
}
class Vehicle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter days: ");
        int days = sc.nextInt();
        System.out.println("Enter c for Car and t for Truck");
        char ch = sc.next().charAt(0);
        Rent ob;
        switch (ch) {
            case 'c':
                ob = new Car(days);
                ob.CalRent();
                break;
                case 't':
                ob = new Truck(days);
                ob.CalRent();
                break;
                
                default: System.out.println("Invalid");
                break;
        }
        sc.close();
    }
}