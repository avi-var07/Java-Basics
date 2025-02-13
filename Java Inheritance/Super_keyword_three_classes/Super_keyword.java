import java.util.Scanner;

class Vehicle {
    String Model, Color;
    int Vid;

    // Vehicle(String Model, String Color, int Vid) {
    //     this.Model = Model;
    //     this.Color = Color;
    //     this.Vid = Vid;
    // }

    void getdetails(Scanner sc) {
        System.out.print("Enter Model: ");
        Model = sc.nextLine();
        
        System.out.print("Enter Color: ");
        Color = sc.nextLine();
        
        System.out.print("Enter Vehicle ID: ");
        Vid = sc.nextInt();
    }

    void display() {
        System.out.println("Model: " + Model);
        System.out.println("Color: " + Color);
        System.out.println("Vid: " + Vid);
    }
}

class Car extends Vehicle {
    int doors;
    double speed;

    Car(String Model, String Color, int Vid, int doors, double speed) {
        // super(Model, Color, Vid); ye bhi correct hai lekin tab jab Vehicle ka constructor hai
        super.Model=Model;
        super.Color=Color;
        super.Vid=Vid;
        this.doors = doors;
        this.speed = speed;
    }

    void getdetails(Scanner sc) {
        super.getdetails(sc);
        System.out.print("Enter number of doors: ");
        doors = sc.nextInt();
        System.out.print("Enter speed: ");
        speed = sc.nextDouble();
    }

    void display() {
        super.display();
        System.out.println("Doors in Car: " + doors);
        System.out.println("Speed of Car: " + speed);
    }
}

class Ecar extends Car {
    int ChargingDuration;

    Ecar(String Model, String Color, int Vid, int doors, double speed, int ChargingDuration) {
        super(Model, Color, Vid, doors, speed);
        this.ChargingDuration = ChargingDuration;
    }

    void getdetails(Scanner sc) {
        super.getdetails(sc);
        System.out.print("Enter charging duration: ");
        ChargingDuration = sc.nextInt();
    }

    void display() {
        super.display();
        System.out.println("Charging Duration in Ecar: " + ChargingDuration);
    }
}

class Super_keyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ecar ob = new Ecar("", "", 0, 0, 0.0, 0);
        ob.getdetails(sc);
        ob.display();

        sc.close();
    }
}
