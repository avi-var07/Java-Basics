import java.util.Scanner;

class Vehicle {
     void CalRent(int day)   {
       System.out.println("Calculating Rent, please wait"); 
    }
     
}
class Truck extends Vehicle{

    void CalRent(int day)   {
      System.out.println("Rent for Truck is: "+(80*day)); 
    }

    
}
class Car extends Vehicle{

    void CalRent(int day)   {
      System.out.println("Rent for Car is: "+(50*day)); 
    }

    
}
class VehicleRental {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter choice: Truck (t) or Car (c)? ");
    char ch=sc.next().charAt(0);
    System.out.println("For How many days? ");
    int days = sc.nextInt();
    Vehicle v;
    switch(ch){
      case 'c':
      v = new Car();
      v.CalRent(days);
      break;
      case 't':
      v = new Truck();
      v.CalRent(days);
      break;
      default:
      System.out.println("Invalid");
      break;
    }
    sc.close();
  }
}